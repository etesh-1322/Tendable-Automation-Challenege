Description and Strategy ------

1. I have used Java, Selenium and TestNG mainly to create this UI Automation framework.
2. I have created a standard UI Automation Framework using Page Object Model( POM ) design pattern where the idea is to keep the reusable and driver initialization functions in base class under src-> test -> java -> Base
   -> Baseclass.java these functions will be used everytime a test method runs.
3. I have created different locators repo which contains classes for storing the locators of the application page wise like homepage, marketingf form page etc..
4. I have cretaed functions repo which contains classes for the actual logic having multiple functions in HomePage.java , MarketingForm.java that will be used in the test class to run the test and validate the results.
5. I have created TestCases repo which have the actual test cases that will be executed as a part of the assignment and will invoke the logics and functions added in functions classes and vlaidate the results.
6. I have created a TestRunner file named TestCasesRun.xml to run all the test cases in single click.

How To Run ----------

1. You need to first clone this project into your local machine and open the project in any of the IDE's like Intellij, Eclipse.
2. Go to the  TestCasesRun.xml file under test -> resources and add the configuration to run the runner file.
3. The test cases will start running in headless mode, since I have added the configuration in base class to run test in headles mode.


-----------------------------------------------------------------------------------------------------------------------------                                      
