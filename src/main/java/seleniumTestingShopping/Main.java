package seleniumTestingShopping;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

	
	WebDriver driver;
	
	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@After
	public void tearDown() {
		driver.quit();
	}
	
	@Test
	public void testTheShop() throws InterruptedException {
		String whatImSearchingFor = "Dress";
		String whatImSearchingFor2 = "Printed Summer Dress";
		
		driver.manage().window().maximize();
		driver.get(MainPage.shoppingURL);
		
		MainPage mainPage = new MainPage(driver);
		mainPage.search(whatImSearchingFor);
		Thread.sleep(2000);
		
		SearchPage searchPage = new SearchPage(driver);
		
		String searchedFor = searchPage.searchedText();
		assertTrue(whatImSearchingFor, searchedFor.contains("Dress"));
		assertEquals(whatImSearchingFor2, searchedFor);
		
	}
	
}
