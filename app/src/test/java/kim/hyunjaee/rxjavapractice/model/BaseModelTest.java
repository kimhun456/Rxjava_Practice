package kim.hyunjaee.rxjavapractice.model;

import org.junit.Before;
import org.junit.Test;

public class BaseModelTest {

    private BaseModel mReactiveModel;

    @Before
    public void setup() {
        mReactiveModel = new BaseModel();
    }

    @Test
    public void should_ShowNNumbers_WhenSubscribeIsHappen() {
        mReactiveModel.doOperatorCreate();
    }
}