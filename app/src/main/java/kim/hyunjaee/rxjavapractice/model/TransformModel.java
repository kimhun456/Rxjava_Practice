package kim.hyunjaee.rxjavapractice.model;

import android.util.Log;

import java.util.Arrays;
import java.util.List;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;

public class TransformModel {
    private static final String TAG = "TransformModel";

    public void doFlatMap() {
        getOriginalObservable()
                .flatMap((Function<Integer, Observable<Integer>>) this::getModifiedObservable)
                .subscribeOn(Schedulers.io())
                .subscribe(new Observer<Integer>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(Integer integer) {
                        Log.d(TAG, "onNext : " + integer);
                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onComplete() {

                    }
                });

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void doBuffer() {
        Observable.just("A", "B", "C", "D", "E", "F").buffer(2).subscribe(new Observer<List<String>>() {
            @Override
            public void onSubscribe(Disposable d) {

            }

            @Override
            public void onNext(List<String> strings) {
                Log.d(TAG, "onNext()");
                for (String str : strings) {
                    Log.d(TAG, str);
                }
            }

            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onComplete() {

            }
        });
    }

    public void doMap() {
        getOriginalObservable()
                .map(integer -> (integer * 2))
                .subscribeOn(Schedulers.io())
                .subscribe(new Observer<Integer>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(Integer integer) {
                        Log.d(TAG, "onNext: " + integer);
                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }


    private Observable getModifiedObservable(Integer integer) {
        return Observable.create(emitter -> {
            emitter.onNext(integer * 2);
            emitter.onComplete();
        }).subscribeOn(Schedulers.io());
    }


    private Observable<Integer> getOriginalObservable() {
        final List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6);
        return Observable
                .create(emitter -> {
                    for (Integer integer : integers) {

                        if (!emitter.isDisposed()) {
                            emitter.onNext(integer);
                        }
                    }

                    if (!emitter.isDisposed()) {
                        emitter.onComplete();
                    }
                });
    }
}
