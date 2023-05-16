package utilities;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import baseclass.declarations;

public class util extends declarations {
	
	public util(WebDriver driver) {
		
		declarations.driver= driver;
		PageFactory.initElements(driver,this);
		
		}
	
	public void selectdropdownvalue(List<WebElement> ele, String value) {
		List<WebElement> data= ele;
		int count =data.size();
		for(int i=0;i<count;i++) {
			String valuesdropdown= data.get(i).getText();
			System.out.println(valuesdropdown);
			if(valuesdropdown.equals(value)) {
				data.get(i).click();
				break;
			}
		}
	}
}
