package kim.hyunjaee.rxjavapractice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import kim.hyunjaee.rxjavapractice.model.BaseModel;
import kim.hyunjaee.rxjavapractice.model.FilterModel;
import kim.hyunjaee.rxjavapractice.model.TransformModel;

public class MainActivity extends AppCompatActivity {

  private BaseModel mReactiveModel;
  private TransformModel mTransformModel;
  private FilterModel mFilterModel;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    mReactiveModel = new BaseModel();
    mTransformModel = new TransformModel();
    mFilterModel = new FilterModel();

    doFilterTest();

//        doTransformTest();
//        doBaseTest();
  }

  private void doFilterTest() {
    mFilterModel.doDistinct();
    mFilterModel.doElementAt();
    mFilterModel.doFilter();
    mFilterModel.doIgnoreElemensts();
    mFilterModel.doSampling();
    mFilterModel.doSkipAndSkipLast();
    mFilterModel.doTakeAndTakeLast();
  }

  private void doTransformTest() {
    mTransformModel.doBuffer();
    mTransformModel.doMap();
    mTransformModel.doFlatMap();
  }

  private void doBaseTest() {
    mReactiveModel.doOperatorInterval();
    mReactiveModel.doOperatorFrom();
    mReactiveModel.doOperatorCreate();
    mReactiveModel.doOperatorJust();
    mReactiveModel.doOperatorRange();
    mReactiveModel.doOperatorRepeat();
    mReactiveModel.doOperatorTimer();
  }
}
