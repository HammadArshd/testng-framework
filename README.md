# TestNG-Maven
Sample project using:
- TestNg
- Maven

Active Profiles

These profiles run classes, methods, and tests in parallel or in multi-threaded mode.
- mvn clean verify -PrunMethodsInParallel
- mvn clean verify -PrunClassesInParallel
- mvn clean verify -PrunSuitesInParallel

TestNG also provides the flexibility to configure a test method to be run in a multi-threaded environment.
- mvn clean verify -PrunSingleMethodInParallel

Passing Parameters Through testng.xml and @Parameters annotation
- mvn clean verify -PrunParameterTest

Passing “Optional” Parameters Through testng.xml and @Parameters annotation
- mvn clean verify -PrunOptionalParameterTest

Using @DataProvider and Test in Same Class
- run from IDE by Right Click on SameClassDataProvider.java

Using @DataProvider and Test in Different Class
- run from IDE by Right Click on DataProviderTestClass.java

TestNG – Expected Exception and Expected Message
- run from IDE by Right Click on
-> ExceptionTestDemo.java and
-> ExpectedExceptionTestwithVerifyingMessage.java

Difference between @Factory and @DataProvider
Below is the main difference between @Factory and @DataProvider functionalities on TestNG.

DataProvider: A test method that uses DataProvider will be executed a multiple number of times based on the data provided by the DataProvider. The test method will be executed using the same instance of the test class to which the test method belongs.
Factory: A factory will execute all the test methods present inside a test class using a separate instance of the respective class.

Grouping Examples
- mvn clean verify -PrunGroupingExample
- mvn clean verify -PrunMultiGroupingExample
- mvn clean verify -PrunIncludeExcludeGroupExample
- mvn clean verify -PrunRegularExpressionBasedIncludeExcludeGroupTest
- mvn clean verify -PrunDefaultGroupExample
- mvn clean verify -PrunMetaGroupExample

MetaGroups
- This feature is helpful in creating specific groups for regression, sanity, and module-wise testing.
-> mvn clean verify -PrunMetaGroupExample


Credit Goes to:
- https://howtodoinjava.com/testng
- https://www.swtestacademy.com/allure-testng/
- https://www.youtube.com/channel/UCXJKOPxx4O1f63nnfsoiEug

