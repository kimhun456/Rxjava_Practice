package kim.hyunjaee.rxjavapractice.model;

import org.junit.Before;
import org.junit.Test;

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