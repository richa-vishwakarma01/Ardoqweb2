package PageActions.SignUpPage;

import CommonUtils.CommonFunctions;
import CustomeReports.CustomeReporter;
import com.sun.xml.internal.bind.v2.runtime.unmarshaller.TagName;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.ResourceBundle;

public class SignUpPageActions {


    WebDriver driver ;
    ResourceBundle resourceBundle;
    public SignUpPageActions(WebDriver driver){
        this.driver=driver;
        String packageName= getClass().getPackage().getName().replace("Actions","_OR");;
        String resourceName= getClass().getSimpleName().replace("Actions","_OR");
        resourceBundle= ResourceBundle.getBundle(packageName+"."+resourceName);

    }

    public static SignUpPageActions getInstance(WebDriver driver){
      return new SignUpPageActions(driver);
    }
    public void enterName(String LinkName ){
        String linkLocator= resourceBundle.getString(LinkName);
        Assert.assertTrue(CommonFunctions.getInstance(driver).isPresent(linkLocator));
    }
    public void enterFirstName(String fname){
        String fnameLocator= resourceBundle.getString("addrsfname");
        CommonFunctions.getInstance(driver).sendKeys(fnameLocator, fname);

}
    public void enterSecondName(String lname){
        String lnameLocator= resourceBundle.getString("addrslname");
        CommonFunctions.getInstance(driver).sendKeys(lnameLocator, lname);

    }
    public void entertitle(String title){
        String titleLocator= resourceBundle.getString("title");
        CommonFunctions.getInstance(driver).getElement(titleLocator).submit();

    }

    public void enterPassword(String password){
        String passwordLocator= resourceBundle.getString("password");
        CommonFunctions.getInstance(driver).sendKeys(passwordLocator,password);

    }
    public void enterDob(String dob ){
        CommonFunctions.getInstance(driver).sendKeys(resourceBundle.getString("days"),"12");
        CommonFunctions.getInstance(driver).sendKeys(resourceBundle.getString("months"),"12");
        CommonFunctions.getInstance(driver).sendKeys(resourceBundle.getString("years"),"2022");

    }
    public void enterAddress(String addressMap ){
        CommonFunctions.getInstance(driver).sendKeys(resourceBundle.getString("address1"),"12 Lotus Boulevard");
        CommonFunctions.getInstance(driver).sendKeys(resourceBundle.getString("country"),"India");
        CommonFunctions.getInstance(driver).sendKeys(resourceBundle.getString("city"),"Jabalpur");
        CommonFunctions.getInstance(driver).sendKeys(resourceBundle.getString("state"),"Madhya Pradesh");
        CommonFunctions.getInstance(driver).sendKeys(resourceBundle.getString("zipcode"),"482002");

    }
    public void enterMobile(String mobileNumber ){

        CommonFunctions.getInstance(driver).sendKeys(resourceBundle.getString("mobile_number"),"12 Lotus Boulevard");

    }
    public void clickCreateAcc(){
        CustomeReporter.report_Status_Fail("UserName and Password not entered ");

        CommonFunctions.getInstance(driver).click(resourceBundle.getString("createAcc"));

    }


}
