package conceptRefreshNaveen;

import org.testng.annotations.Test;

public class InvocationCountTest {

    private int count = 0;

    @Test(invocationCount = 10)
    public void invocationTest(){
        count++;
        System.out.println(count);
    }
}
