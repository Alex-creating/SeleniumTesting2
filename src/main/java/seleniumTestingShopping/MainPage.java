package seleniumTestingShopping;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {
	
	public static final String shoppingURL = "http://automationpractice.com/index.php";
	
	@FindBy(id = "search_query_top")
	private WebElement searchbar;
	
	private WebDriver driver;
	
	public MainPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,  this);
	}
	
	public void search(String searchText) {
		searchbar.sendKeys(searchText);
		searchbar.submit();
	}

}
