package kim.hyunjaee.rxjavapractice.model;


import android.support.test.runner.AndroidJUnit4;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class ReactiveModelTest {

    private ReactiveModel mReactiveModel;

    @Before
    public void setup() {
        mReactiveModel = new ReactiveModel();
    }

    @Test
    public void should_ShowNNumbers_WhenSubscribeIsHappen() {
        mReactiveModel.doOperatorCreate();
    }
}