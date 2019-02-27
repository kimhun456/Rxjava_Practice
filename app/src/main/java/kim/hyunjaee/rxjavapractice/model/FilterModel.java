package kim.hyunjaee.rxjavapractice.model;

import android.util.Log;

import java.util.concurrent.TimeUnit;

import io.reactivex.CompletableObserver;
import io.reactivex.MaybeObserver;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

public class FilterModel {

  private static final String TAG = "FilterModel";

  public void doTakeAndTakeLast() {
    Observable.range(1, 10).take(4).subscribe(new Observer<Integer>() {
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

    Observable.range(1, 10).takeLast(4).subscribe(new Observer<Integer>() {
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

  public void doSkipAndSkipLast() {
    Observable.just("A", "B", "C", "D", "E", "F", "G", "H", "I", "J")
        .skip(3)
        .subscribe(new Observer<String>() {
          @Override
          public void onSubscribe(Disposable d) {

          }

          @Override
          public void onNext(String s) {
            Log.d(TAG, "onNext() : " + s);
          }

          @Override
          public void onError(Throwable e) {

          }

          @Override
          public void onComplete() {

          }
        });

    Observable.just("A", "B", "C", "D", "E", "F", "G", "H", "I", "J")
        .skipLast(3)
        .subscribe(new Observer<String>() {
          @Override
          public void onSubscribe(Disposable d) {

          }

          @Override
          public void onNext(String s) {
            Log.d(TAG, "onNext() : " + s);
          }

          @Override
          public void onError(Throwable e) {

          }

          @Override
          public void onComplete() {

          }
        });


  }

  public void doSampling() {
    Observable timedObservable = Observable
        .just(1, 2, 3, 4, 5, 6)
        .zipWith(Observable.interval(
            0, 1, TimeUnit.SECONDS), (item, time) -> item);

    timedObservable
        .sample(2, TimeUnit.SECONDS)
        .subscribe(new Observer() {
          @Override
          public void onSubscribe(Disposable d) {

          }

          @Override
          public void onNext(Object o) {
            Log.d(TAG, "onNext() " + o);
          }

          @Override
          public void onError(Throwable e) {

          }

          @Override
          public void onComplete() {

          }
        });
  }

  public void doIgnoreElemensts() {
    Observable.range(1, 10)
        .ignoreElements().subscribe(new CompletableObserver() {
      @Override
      public void onSubscribe(Disposable d) {
        Log.d(TAG, "onSubscribe()");
      }

      @Override
      public void onComplete() {
        Log.d(TAG, "onComplete()");
      }

      @Override
      public void onError(Throwable e) {

      }
    });
  }

  public void doFilter() {
    Observable.just(1, 2, 3, 4, 5, 6).filter(integer -> integer % 2 == 0)
        .subscribe(new Observer<Integer>() {
          @Override
          public void onSubscribe(Disposable d) {

          }

          @Override
          public void onNext(Integer integer) {
            Log.d(TAG, "onNext() :" + integer);
          }

          @Override
          public void onError(Throwable e) {

          }

          @Override
          public void onComplete() {

          }
        });
  }

  // distinct 구별되는 거니까 동일하지 않은 것만 배출한다고 볼수있따.
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

  public void doElementAt() {
    Observable.just(10, 20, 30).elementAt(2).subscribe(new MaybeObserver<Integer>() {
      @Override
      public void onSubscribe(Disposable d) {

      }

      @Override
      public void onSuccess(Integer integer) {
        Log.d(TAG, "onSuccess : " + integer);
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
