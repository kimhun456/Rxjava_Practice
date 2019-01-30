package kim.hyunjaee.rxjavapractice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import kim.hyunjaee.rxjavapractice.model.MainModel;

public class MainActivity extends AppCompatActivity {

    private MainModel mMainModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mMainModel = new MainModel();
        doTest();
    }

    private void doTest() {

        mMainModel.doOperatorFrom();
        mMainModel.doOperatorCreate();
        mMainModel.doOperatorJust();
        mMainModel.doOperatorRange();
    }
}
