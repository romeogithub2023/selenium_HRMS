set projectLocation=G:\Programing\Selenium\Selenium-Auto-Test\HRMS_FS002
cd %projectLocation%
set classpath=%projectLocation%\bin;%projectLocation%\lib\*
java org.testng.TestNG %projectLocation%\testng.xml