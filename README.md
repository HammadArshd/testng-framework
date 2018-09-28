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
