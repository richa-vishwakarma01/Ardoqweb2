//package TestCases;
//
//import CustomeReports.CustomeReporter;
//import Executor.BaseTest;
//import Executor.TestDataReader;
//import PageActions.LoginPage.LoginPageActions;
//import org.testng.annotations.Test;
//
//public class Validate_SignUp extends BaseTest {
//
//
//    @Test
//    public void Validate_SignUp(){
//
//        String usr= TestDataReader.getTestData("validate_broken_links_on_Home_Page", "userName");
//        LoginPageActions.getInstance(driver).enterSignUserName(usr);
//        String email= TestDataReader.getTestData("validate_broken_links_on_Home_Page", "email");
//        LoginPageActions.getInstance(driver).enterSignUserName(email);
//        String fname= TestDataReader.getTestData("validate_broken_links_on_Home_Page", "email");
//        LoginPageActions.getInstance(driver).enterSignUserName(email);
//        String email= TestDataReader.getTestData("validate_broken_links_on_Home_Page", "email");
//        LoginPageActions.getInstance(driver).enterSignUserName(email);
//        CustomeReporter.report_Status_Pass("Sign up Links is  Validated Sucessfully");
//
//    }
//
//
//
//}
