package ProjectCar.Goibibo_Car_Vertical;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Goibibo_Car_Vertical {
	
	 WebDriver driver ;
	
	 WebDriver car;
	
	String icon = "//*[@id=\"header\"]/div[1]/ul/li[6]/a/i";
	
	String source_station = "//p[@id='sourceText']", enter_location = "//input[@id='gosuggest_inputL']";
	
	String destination_station = "//p[@id='destText']", Enter_location = "//input[@id='gosuggest_inputL']";
	
	String search_cabs = "//button[@class='searchBtn']", popup_window = "//button[@class='btn small blue width50 ico17']";
	
	String Add_contact_details = "//*[@id=\"root\"]/div[2]/section/div/section[1]/section/div[2]/div/div/div[2]/section[2]";
	
	String title = "//*[@id=\"root\"]/div[2]/section/div/section[1]/section/div[1]/section/section[2]/div/section[1]/div[2]/div/label[1]";
	
	String name = "//input[@placeholder='Name']", mobile = "//input[@placeholder='Mobile']",email = "//input[@placeholder='E-mail']";
	
	String continue_button = "//*[@id=\"root\"]/div[2]/section/div/section[1]/section/div[1]/section/section[2]/div/section[2]/div[5]/p/button";
	
	String pay_button = "//button[@id='callBlock']";
	
	String netbanking = "//div[@id='tab_nb']", bank_selection = "//div[@id='banksRadio']//div[2]//div[1]", pay_button1 = "//*[@id=\"nbPayNow\"]/div/button";
	
	
  @Test(priority=0)
  public void icon() {
	  
	  driver.findElement(By.xpath(icon)).click();
  }
  
  @Test(priority=1)
  public void car_hompage() throws InterruptedException {
	  
	  driver.findElement(By.xpath(source_station)).click();
	  
	  driver.findElement(By.xpath(enter_location)).sendKeys("Dwarka new");
	  
		driver.findElement(By.id("react-autosuggest-1-suggestion--0")).click();

	  
	  driver.findElement(By.xpath(destination_station)).click();
	  
	  driver.findElement(By.xpath(Enter_location)).sendKeys("agra");
	  
		driver.findElement(By.id("react-autosuggest-1-suggestion--0")).click();

		driver.findElement(By.xpath(search_cabs)).click();
		
     if(driver.findElement(By.xpath(popup_window)).isDisplayed()) {
    	 
    	 driver.findElement(By.xpath(popup_window)).click();
    	 
     }
     
     else {
    	 
    	 driver.findElement(By.xpath(popup_window)).click();
     }

     
}
  
  @Test(priority=2)
  
  public void car_review_page() {
	  
	  driver.findElement(By.xpath(Add_contact_details)).click();
	  
	  driver.findElement(By.xpath(title)).click();
	  
	  driver.findElement(By.xpath(name)).sendKeys("Testcar");
	  
	  driver.findElement(By.xpath(mobile)).sendKeys("9999999999");
	  
	  driver.findElement(By.xpath(email)).sendKeys("testnoc009@gmail.com");
	  
	  driver.findElement(By.xpath(continue_button)).click();
	
	  driver.findElement(By.xpath(pay_button)).click();
		
  }

  @Test(priority=3)
  
  public void payment_page() throws InterruptedException {
	  
	  driver.findElement(By.xpath(netbanking)).click();
	  
	  driver.findElement(By.xpath(bank_selection)).click();
	  
	  driver.findElement(By.xpath(pay_button1)).click();
	  
	  Thread.sleep(4000);
  }
  
  @BeforeClass
  public void beforeClass()  {
  	  
  	  System.setProperty("webdriver.chrome.driver", "D:\\Eclips backup\\Jar Files for use in selenium\\chromedriver.exe");
  	  driver = new ChromeDriver();
  	  driver.manage().deleteAllCookies();
  	  
  	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  	
  	driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
  	


  	
  	  driver.navigate().to("https://www.goibibo.com");
  	  
  	  driver.manage().window().maximize();

  }

  @AfterClass
  public void afterClass() {
  	  
  	  driver.quit();
  }
  
}
