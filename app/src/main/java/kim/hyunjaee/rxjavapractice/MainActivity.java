package kim.hyunjaee.rxjavapractice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import kim.hyunjaee.rxjavapractice.model.ReactiveModel;

public class MainActivity extends AppCompatActivity {

    private ReactiveModel mReactiveModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mReactiveModel = new ReactiveModel();
        doTest();
    }

    private void doTest() {

        mReactiveModel.doOperatorFrom();
        mReactiveModel.doOperatorCreate();
        mReactiveModel.doOperatorJust();
        mReactiveModel.doOperatorRange();
        mReactiveModel.doOperatorRepeat();
        mReactiveModel.doOperatorTimer();
    }
}
