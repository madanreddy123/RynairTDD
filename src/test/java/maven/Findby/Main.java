package maven.Findby;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.ryanair.Checkout_page;
import Pages.ryanair.Destination_Page;
import Pages.ryanair.Login_page;
import Pages.ryanair.Passenger_Detail_Page;
import Pages.ryanair.Seat_selection_Page;
import Pages.ryanair.Select_Fare_Page;

public class Main{

	private WebDriver driver;

	  @BeforeMethod()
	  public void beforeMethod()

	  {
	  	
	  	System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
	  	
	  	driver = new ChromeDriver();
	  	
	  	driver.manage().window().maximize();
	  	driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	  	
	  	driver.get("https://www.ryanair.com/ie/en");
	  	driver.getCurrentUrl();
	  	
	  
	}

@Test
public void Homepage() throws InterruptedException 

{
	Login_page login = new Login_page(driver);
	login.offerdialog();
	login.one_way();
	login.login();
	login.username();
	login.password();
	login.login_button();
	Thread.sleep(3000);
	

	Destination_Page Destination = new Destination_Page(driver);
	
	Destination.desitination();
  
	
	Destination.search();
	
	
	Destination.choosedate();
	
	
	Destination.choose();
	 
	Destination.search();
	Thread.sleep(3000);
	
	Select_Fare_Page Select_Fare = new Select_Fare_Page(driver);
	
	Select_Fare.duration();
	
	
	
	Select_Fare.regular123();
	
	Select_Fare.mr();
	
	Select_Fare.mr_1();
	
	Select_Fare.first_name();
	
	Select_Fare.last_name();
	Thread.sleep(1000);
	Select_Fare.last_continue();
	
	Thread.sleep(3000);
	
	Seat_selection_Page	Seat_selection = new Seat_selection_Page(driver);
	
	Seat_selection.select_seat();
	
	Seat_selection.seat_continue();
	Seat_selection.exception();
	Seat_selection.bagselection();
	Seat_selection.exception_1();
	
	Seat_selection.exceptioncont();
	
	Thread.sleep(2000);
	
	 Checkout_page Checkout = new Checkout_page(driver);
		
		Checkout.checkout();
		
		Checkout.checkout_1();
		
		Thread.sleep(3000);
Passenger_Detail_Page Passenger_dtl = new Passenger_Detail_Page(driver);
		
		Passenger_dtl.contactnumber();

		Passenger_dtl.insurance();
		
		Passenger_dtl.cardnumber();

		Passenger_dtl.expiry_date();
		
		Passenger_dtl.expiry_date1();
		
		Passenger_dtl.expiry_year();
		
		Passenger_dtl.expiry_year1();
		
		Passenger_dtl.cvv();
		

		Passenger_dtl.card_holder_name();
		
		Passenger_dtl.address_1();
		
		Passenger_dtl.city();
		
		
		Passenger_dtl.country();
		
		Passenger_dtl.postal_code();
		
		Passenger_dtl.Euro();
		
		Passenger_dtl.click_now();
		

		Passenger_dtl.pay_now();
	
	
		
}

@AfterClass
public void tearDown () throws Exception {
  driver.quit();
}



}
