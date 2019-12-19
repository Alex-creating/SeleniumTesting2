package seleniumTestingShopping;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {
	
	@FindBy (xpath = "/html/body/div/div[2]/div/div[3]/div[2]/ul/li[1]/div/div[2]/h5/a")
	private WebElement productName;
	
	private WebDriver driver;
	

	
	public SearchPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,  this);
	}

	public String searchedText() {
		return productName.getText();
	}
}
