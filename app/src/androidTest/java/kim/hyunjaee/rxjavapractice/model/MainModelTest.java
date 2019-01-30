package kim.hyunjaee.rxjavapractice.model;


import android.content.Context;
import android.support.test.InstrumentationRegistry;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MainModelTest {

    private MainModel mMainModel;

    @Before
    public void setup() {
        Context appContext = InstrumentationRegistry.getTargetContext();
        mMainModel = new MainModel();
    }

    @Test
    public void should_ShowNNumbers_WhenSubscribeIsHappen() {
        mMainModel.doOperatorCreate();
    }
}