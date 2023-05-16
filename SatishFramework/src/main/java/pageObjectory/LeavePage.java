package pageObjectory;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseclass.declarations;

public class LeavePage extends declarations {
	
public LeavePage (WebDriver driver) {
		
		declarations.driver= driver;
		PageFactory.initElements(driver,this);
		
		}

@FindBy(xpath = "//ul[@class='oxd-main-menu']//li[3]")
private WebElement LEAVETab;

public void LEAVETab() {
	LEAVETab.click();
}

@FindBy(xpath ="(//input['@placeholder=yyyy-mm-dd'])[2]")
private WebElement FrmDate;

public void Username(String value) {
	FrmDate.sendKeys(value);
} 

@FindBy(xpath ="(//input['@placeholder=yyyy-mm-dd'])[3]")
private WebElement ToDate;

public void ToDate(String value) {
	ToDate.sendKeys(value);
}

@FindBy(xpath ="(//*[@class='oxd-select-text--after'])[1]")
private  List<WebElement> ToDateValue;

public  List<WebElement> ToDateValue() {
	     return ToDateValue;
}

@FindBy(xpath ="(//*[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[2]")
private  List<WebElement> LeaveType;

public  List<WebElement> LeaveType() {
	     return LeaveType;
}


}
