package kim.hyunjaee.rxjavapractice.model;

import android.util.Log;

import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

public class FilterModel {

    private static final String TAG = "FilterModel";

    // ditinct 구별되는 거니까 동일하지 않은 것만 배출한다고 볼수있따.
    public void doDistinct() {
        Observable.just(10, 20, 20, 10, 30, 40, 70, 60, 70)
                .distinct()
                .subscribe(new Observer<Integer>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(Integer integer) {
                        Log.d(TAG, "onNext() : " + integer);
                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }


}
