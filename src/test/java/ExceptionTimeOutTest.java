import org.testng.annotations.Test;

public class ExceptionTimeOutTest {


    @Test(timeOut = 500)
    public void infiniteLoopTest(){
        while (true){
            System.out.println("True");
        }
    }

    @Test(expectedExceptions = ArrayIndexOutOfBoundsException.class)
    public void exceptionTest(){
        int[] myList = {1};
        System.out.println(myList[1]);

    }
}
