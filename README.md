# EQCareTestAutomationFramework
Selenium Automation Framework

This project contains the hybrid test automation framework and test cases related to Eqcare application


Prepare your environment
Install jdk

To run a test
mvn test -DxmlFiles=testng.xml -DBrowser=Chrome -DAppURL={Application URL} -DEmail={Email} -DPassword={Password} -DProjectRun=eq -DTestExecution=aws

Report:
EqCare-TestAutomation/test-output/index.html
