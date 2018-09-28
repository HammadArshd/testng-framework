package howtodoinjava.grouping;

import org.testng.annotations.Test;

@Test(groups = {"default-group"})
public class AssigningDefaultGroupExample {
    public void testMethodOne() {
        System.out.println("Test method one.");
    }

    public void testMethodTwo() {
        System.out.println("Test method two.");
    }

    @Test(groups = {"test-group"})
    public void testMethodThree() {
        System.out.println("Test method three.");
    }
}

