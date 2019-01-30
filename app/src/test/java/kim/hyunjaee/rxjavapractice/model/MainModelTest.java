package kim.hyunjaee.rxjavapractice.model;

import org.junit.Before;
import org.junit.Test;

public class MainModelTest {

    private MainModel mMainModel;

    @Before
    public void setup() {
        mMainModel = new MainModel();
    }

    @Test
    public void should_ShowNNumbers_WhenSubscribeIsHappen() {
        mMainModel.doOperatorCreate();
    }
}