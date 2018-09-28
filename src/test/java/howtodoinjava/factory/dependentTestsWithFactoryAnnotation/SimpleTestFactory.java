package howtodoinjava.factory.dependentTestsWithFactoryAnnotation;

import org.testng.annotations.Factory;

public class SimpleTestFactory
{
    @Factory
    public Object[] factoryMethod()
    {
        return new Object[] { new DependencyTest(1), new DependencyTest(2) };
    }
}
