package AfterLoginUser;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CorporateUser4 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);

		driver.get("https://staging-fe.maximizeu.life/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(1000);

		JavascriptExecutor SK = (JavascriptExecutor) driver;

		driver.findElement(By.xpath("//button[contains(text(),'LOGIN/REGISTER')]")).click();
		Thread.sleep(3000);
		SK.executeScript("window.scrollBy(0,550);");
		Thread.sleep(500);

//Before login , please create corporate account from admin portal and also create some employee user		

		// Login
		driver.findElement(By.xpath("//input[@type='email'][@id='email']"))
				.sendKeys("Automation.useraayushi2@mailinator.com");// login Email Address
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@type='password'][@id='exampleInputPassword1']")).sendKeys("Toivyz34");// Login
																													// Password
		Thread.sleep(500);
		driver.findElement(By.xpath("//button[text()='LOG IN']")).click();// Log In button
		Thread.sleep(2000);

//My Sessions 

		driver.findElement(By.xpath("//text()[contains(.,'Sessions')]/ancestor::a[1]")).click();// Session Tab
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Completed Sessions')]")).click();// Completed sessions button
		Thread.sleep(2000);
		driver.findElement(By.xpath("//text()[contains(.,'Sessions')]/ancestor::a[1]")).click();// Session Tab
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='19']")).click();// Calendar button
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Upcoming Sessions')]")).click();// Upcoming sessions button
		Thread.sleep(2000);
		SK.executeScript("window.scrollBy(0,250);");
		Thread.sleep(500);
		driver.findElement(By.xpath("//button[text()='Book a Session']")).click();// Upcoming sessions button
		Thread.sleep(2000);

//Wallet History	

		SK.executeScript("window.scrollBy(0,-750);");
		Thread.sleep(500);
		driver.findElement(By.xpath("//span[contains(text(),'Wallet History')]")).click();// Wallet History Tab
		Thread.sleep(2000);
		
				driver.findElement(By.xpath("//button[text()='Add Amount to Wallet']")).click();//Add amount in wallet button
				Thread.sleep(2000);  
				driver.findElement(By.xpath("//input[@type='text'][@placeholder='Selected value displays here']")).sendKeys("20000");//Add amount in wallet button
				Thread.sleep(2000);

				driver.findElement(By.xpath("//button[text()='Proceed to Add']")).click(); //Proceed To Add  Button	
				Thread.sleep(1000);
						
//			    WebElement inputField = driver.findElement(By.xpath("//*[@id=\"root\"]/form/div/div[2]/span[1]/span[2]/div/div[2]/span/input")); //Card Number
//	            inputField.clear();
//	            inputField.sendKeys("4916 7170 0206 9510");   
//              driver.findElement(By.xpath("//input[@type='text'][@name='exp-date']")).sendKeys("1226"); //Card Expire date
//				Thread.sleep(1000);
//				driver.findElement(By.xpath("//input[@type='text'][@name='cvc']")).sendKeys("955"); //Card CVC date
//				Thread.sleep(1000);
//              driver.findElement(By.xpath("//button[text()='Proceed to Add']")).click(); //Proceed To Add  Button
		
    	        driver.findElement(By.xpath("//*[@class='bi bi-x-circle cross']")).click(); //Cancel Button
		        Thread.sleep(1000);
		


		driver.findElement(By.xpath("/html/body/app-root/app-organization-base/div/div/div[2]/div/app-organization-wallet-history/div/form/div[2]/div[2]/app-date-filter/div[1]/div[2]/input")).click(); // Filter by Year
		Thread.sleep(2000);
		// select the year from the calendar
		driver.findElement(By.xpath("//input[@type='text'][@id='pickYear']")).click();// year
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[contains(text(),'2021')]")).click();// year 2021
		Thread.sleep(2000);	 		 
		driver.findElement(By.xpath("//input[@type='text'][@id='pickYear']")).click();// year
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[contains(text(),'2023')]")).click();// year 2023
		Thread.sleep(4000);
        System.out.print(true);
			


		driver.findElement(By.xpath("/html/body/app-root/app-organization-base/div/div/div[2]/div/app-organization-wallet-history/div/form/div[2]/div[2]/app-date-filter/div[1]/div[3]/input")).click();// Custom Filter (Start-End Date)
		Thread.sleep(2000);
		// Select the start and end date
		driver.findElement(By.xpath("//input[@type='text'][@placeholder='Start Date']")).click();// Start Date Select button
        Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='1']")).click();// Select Start Date
		Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@type='text'][@placeholder='End Date']")).click();// End Date Select button
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='15']")).click();// Select End Date
		Thread.sleep(1000);
		
		
		driver.findElement(By.xpath("/html/body/app-root/app-organization-base/div/div/div[2]/div/app-organization-wallet-history/div/form/div[2]/div[2]/app-date-filter/div[1]/div[1]/input")).click();//Filter by Month
		Thread.sleep(2000);
		//Select the year of month calendar 
		driver.findElement(By.xpath("//input[@type='text'][@id='pickmonth']")).click();// Select month calendar
		Thread.sleep(2000);	 		 
		driver.findElement(By.xpath("//span[contains(text(),'Sep')]")).click();// select month
		Thread.sleep(1000);
	
//Subscription 		
		
		driver.findElement(By.xpath("//span[contains(text(),'Subscription')]")).click();//Subscription Tab 
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='YEARLY']")).click();// Yearly Button
		Thread.sleep(1000);
		SK.executeScript("window.scrollBy(0,550);");
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/app-root/app-organization-base/div/div/div[2]/div/app-assign-plan/div/div[2]/div/div/div[2]/div/div[2]/div[1]/div/div/div/ul/li[9]/div/button")).click();// Golden Button
		Thread.sleep(1000);
		SK.executeScript("window.scrollBy(0,550);");
		Thread.sleep(1000);
		 //driver.findElement(By.xpath("//body/app-root[1]/app-organization-base[1]/div[1]/div[1]/div[2]/div[1]/app-payment-subscription[1]/div[1]/div[1]/div[2]/div[2]/div[1]/stripe-card[1]")).sendKeys("4916 7170 0206 9510"); //Card Number
		 //Thread.sleep(1000);
	     //	driver.findElement(By.xpath("//input[@type='text'][@name='cardnumber']")).click();
		 // Assuming there's a label element with the text "Card Number"
		driver.findElement(By.xpath("/html/body/div/form/div/div[2]/span[1]/span[2]/div/div[2]/span/input")).click();
		Thread.sleep(1000);
		// driver.findElement(By.xpath("//a[text()='Go to My Subscription']")).click();//Go to My Subscription click after successfully subscription of the product 
		//Thread.sleep(2000);

		System.out.print(true);

		
//Profile Icon	
		
		driver.findElement(By.xpath("//*[@class='bi bi-person']")).click();// Profile Icon 
		Thread.sleep(1000);
		driver.findElement(By.xpath("//text()[contains(.,'My Dashboard')]/ancestor::button[1]")).click();// Dash-board Icon 
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@class='bi bi-person']")).click();// Profile Icon 
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//text()[contains(.,'My Subscription')]/ancestor::button[1]")).click();// Subscription Icon 
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[contains(text(),'Upgrade')]")).click();// Upgrade Button 
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@class='bi bi-x-circle cross']")).click();// Subscription Upgrade Cancellation Button 
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[contains(text(),'Cancel')]")).click();//Cancel Button 
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Discard']")).click();// Cancel Discard Button 
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[contains(text(),'Cancel')]")).click();//Re-click Cancel Button 
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='OK']")).click();// Cancel's Confirmation Ok Button 
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[contains(text(),'Back to Plans')]")).click();// Back to Plans Button 
		Thread.sleep(1000);
		
	
			
//Settings 	
		
		driver.findElement(By.xpath("//text()[contains(.,'My Subscription')]/ancestor::button[1]")).click();// Subscription Icon 
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[contains(text(),'Organization Information')]")).click();// Organization Information Tab 
		Thread.sleep(1000);
		WebElement organizationname = driver.findElement(By.xpath("nput[@type='text'][@placeholder='Organization Name']"));//Organization Name Update
		organizationname.clear();
		organizationname.sendKeys("Automation Tester Corparation");
		Thread.sleep(500);
		SK.executeScript("window.scrollBy(0,350);");
		Thread.sleep(500);
		driver.findElement(By.xpath("//button[text()='Save Changes']")).click();// Save Organization Information  
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[contains(text(),'Organization Information')]")).click();// Organization Information Tab 
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Next']")).click();// Next Button of Organization Information  
		Thread.sleep(500);
		
		
		driver.findElement(By.xpath("//a[contains(text(),'Personal Information')]")).click();// Personal Information Tab 
		Thread.sleep(1000);
		WebElement biographicalinfo = driver.findElement(By.xpath("//textarea[@placeholder='Biographical Info']"));//Personal Info Biographical Info Update
		biographicalinfo.clear();
		biographicalinfo.sendKeys("Automation Tester Corparation");
		Thread.sleep(500);
		SK.executeScript("window.scrollBy(0,450);");
		Thread.sleep(500);
		driver.findElement(By.xpath("//button[text()='Save Changes']")).click();// Save Personal Information  
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[contains(text(),'Personal Information')]")).click();// Personal Information Tab 
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Next']")).click();// Next Button of Personal Information  
		Thread.sleep(500);
		
		driver.findElement(By.xpath("//a[contains(text(),'Personal Information')]")).click();// Personal Information Tab 
		Thread.sleep(1000);
		WebElement biographicalinfo1 = driver.findElement(By.xpath("//textarea[@placeholder='Biographical Info']"));//Personal Info Biographical Info Update
		biographicalinfo1.clear();
		biographicalinfo1.sendKeys("Automation Tester Corparation");
		Thread.sleep(500);
		SK.executeScript("window.scrollBy(0,450);");
		Thread.sleep(500);
		driver.findElement(By.xpath("//button[text()='Save Changes']")).click();// Save Personal Information  
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[contains(text(),'Personal Information')]")).click();// Personal Information Tab 
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Next']")).click();// Next Button of Personal Information  
		Thread.sleep(500);
		
		
		driver.findElement(By.xpath("//a[contains(text(),'Password')]")).click();// Password Tab 
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@type='text'][@placeholder='Old Password']")).sendKeys("Toivyz34");//Old Password Field 
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@type='password'][@placeholder='New Password']")).sendKeys("Toivyz34");//New Password Field 
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@type='password'][@placeholder='Confirm Password']")).sendKeys("Toivyz34");//Confirm Password Field 
		Thread.sleep(500);
		driver.findElement(By.xpath("//button[text()='Update Password']")).click();//Confirm Password Field 
		Thread.sleep(500);
		
		driver.findElement(By.xpath("//a[contains(text(),'Company Logo')]")).click();//Company Logo Tab 
		Thread.sleep(500);
		driver.findElement(By.xpath("//button[text()='REMOVE']")).click();// Company Logo Remove button 
		Thread.sleep(500);
		driver.findElement(By.xpath("//button[contains(text(),'ADD')]")).click();// ADD Company Logo button 
		Thread.sleep(500);
		
		SK.executeScript("window.scrollBy(0,-700);");
	    Thread.sleep(4500);
		driver.findElement(By.xpath("//text()[.='Notification']/ancestor::button[1]")).click();//Notification bell 

		driver.findElement(By.xpath("//*[@class='bi bi-person']")).click();// Profile Icon 
		Thread.sleep(1000);
		driver.findElement(By.xpath("//text()[contains(.,'Logout')]/ancestor::button[1]")).click();// Logout Icon 
		Thread.sleep(1000);
		
		
		
		
	}

}
