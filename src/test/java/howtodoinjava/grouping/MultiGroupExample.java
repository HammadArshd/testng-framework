package howtodoinjava.grouping;

import org.testng.annotations.Test;

public class MultiGroupExample {
    @Test(groups = {"group-one"})
    public void testMethodOne() {
        System.out.println("Test method one belonging to group.");
    }

    @Test(groups = {"group-one", "group-two"})
    public void testMethodTwo() {
        System.out.println("Test method two belonging to both group.");
    }

    @Test(groups = {"group-two"})
    public void testMethodThree() {
        System.out.println("Test method three belonging to group.");
    }
}