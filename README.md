STEPS TO RUN THE TEST CASE

- Download the ZIP file by going to my repository using the url https://github.com/yousuf20/QaTest.git

- Extract the zip file and import the project 'QaTest-main' into the Eclipse-> Package Explorer-> RightClick and select the import option.

- After Importing the Project-> You will see below directoy structure

-- src/main/java  -> This consist of necessary/supporting files like PageObjects(Landing Page Objects and Profile Page Objects code) and resources package consist of Base File(Web        
                     driver initilization code),Chrome Driver executable file for windows and data property file having Test related data in the form of parameters.

-src/test/java   
-- pom.xml file  (Consist of all maven dependencies required for project to run)
-- testng.xml file 

Expand src/test/java -> Expand package 'Qrious.QaTest' and run the Test Case "QaTest.Java" (You can see the Test Case code in the right) -> Right Click and Select RUN AS-> Test NG Test or Run As Java application 

OR

Select testng.xml file-> right click and Run As -> TestNG Suite

Test Case will start its execution in the chrome browser and once completed it displays 'QaTest PASSED message' in the console along with the Validation messages which gets printed in the console output.







