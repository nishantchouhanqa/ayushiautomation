package AfterLoginUser;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class IndividualUser2 {

	public static void main(String[] args) throws InterruptedException, AWTException {
	

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

		
// Login		
				driver.findElement(By.xpath("//input[@type='email'][@id='email']")).sendKeys("Automation.useraayushi@mailinator.com");//login Email Address 
				Thread.sleep(500);
			    driver.findElement(By.xpath("//input[@type='password'][@id='exampleInputPassword1']")).sendKeys("Sipl@12345");//Login Password
				Thread.sleep(500);
				driver.findElement(By.xpath("//button[text()='LOG IN']")).click();//Log In button
				Thread.sleep(4000);     		
	
//My Courses	
				
				driver.findElement(By.xpath("//text()[.='My Courses']/ancestor::li[1]")).click();//My Courses Tab
				Thread.sleep(2500);  
				driver.findElement(By.xpath("//a[contains(text(),'All Courses')]")).click();//All Courses
				Thread.sleep(1000);    
				driver.findElement(By.xpath("//a[contains(text(),'In Progress')]")).click();//In Progress
				Thread.sleep(1000);
				driver.findElement(By.xpath("//a[contains(text(),'Finished')]")).click();//Finished
				Thread.sleep(1000);
				
//Wallet History 
				driver.findElement(By.xpath("//text()[.='Wallet History']/ancestor::li[1]")).click();//Wallet History Tab
				Thread.sleep(2500);
				
				
				driver.findElement(By.xpath("//button[text()='Add Amount to Wallet']")).click();//Add amount in wallet button
                Thread.sleep(2000);  
                driver.findElement(By.xpath("//input[@type='text'][@placeholder='Selected value displays here']")).sendKeys("20000");//Add amount in wallet button
                Thread.sleep(2000);

				driver.findElement(By.xpath("//button[text()='Proceed to Add']")).click(); //Proceed To Add  Button	
				Thread.sleep(1000);
									
//				WebElement inputField = driver.findElement(By.xpath("//*[@id=\"root\"]/form/div/div[2]/span[1]/span[2]/div/div[2]/span/input")); //Card Number
//			    inputField.clear();
//			    inputField.sendKeys("4916 7170 0206 9510");
//			           
//		        driver.findElement(By.xpath("//input[@type='text'][@name='exp-date']")).sendKeys("1226"); //Card Expire date
//				Thread.sleep(1000);
//				driver.findElement(By.xpath("//input[@type='text'][@name='cvc']")).sendKeys("955"); //Card CVC date
//				Thread.sleep(1000);
//		        driver.findElement(By.xpath("//button[text()='Proceed to Add']")).click(); //Proceed To Add  Button
//				Thread.sleep(1000);
				
				 driver.findElement(By.xpath("//*[@class='bi bi-x-circle cross']")).click(); //Cancel Button
				 Thread.sleep(1000);

				

					driver.findElement(By.xpath("/html/body/app-root/app-individual-base/div/div[2]/div/app-organization-wallet-history/div/form/div[2]/div[2]/app-date-filter/div[1]/div[2]/input")).click(); // Expenditure Report Filter by Year
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
			        
			        SK.executeScript("window.scrollBy(0,750);");
					Thread.sleep(1000);
					driver.findElement(By.xpath("/html/body/app-root/app-individual-base/div/div[2]/div/app-organization-wallet-history/div/form/div[3]/div[2]/div[1]/app-date-filter/div[1]/div[2]/input")).click(); //Expenditure History Filter by Year
					Thread.sleep(2000);
					SK.executeScript("window.scrollBy(0,-750);");
				    Thread.sleep(1000);

			       

					driver.findElement(By.xpath("/html/body/app-root/app-individual-base/div/div[2]/div/app-organization-wallet-history/div/form/div[2]/div[2]/app-date-filter/div[1]/div[3]/input")).click();// Custom Filter (Start-End Date)
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
					
					 SK.executeScript("window.scrollBy(0,450);");
					Thread.sleep(1000);
					driver.findElement(By.xpath("/html/body/app-root/app-individual-base/div/div[2]/div/app-organization-wallet-history/div/form/div[3]/div[2]/div[1]/app-date-filter/div[1]/div[3]/input")).click(); //Expenditure History  Custom Filter (Start-End Date)
					Thread.sleep(2000);
					SK.executeScript("window.scrollBy(0,-750);");
					Thread.sleep(1000);
					
					
					driver.findElement(By.xpath("/html/body/app-root/app-individual-base/div/div[2]/div/app-organization-wallet-history/div/form/div[2]/div[2]/app-date-filter/div[1]/div[1]/input")).click();//Filter by Month
					Thread.sleep(2000);
					//Select the year of month calendar 
					driver.findElement(By.xpath("//input[@type='text'][@id='pickmonth']")).click();// Select month calendar
					Thread.sleep(2000);	 		 
					driver.findElement(By.xpath("//span[contains(text(),'Sep')]")).click();// select month
					Thread.sleep(1000);
				
					 SK.executeScript("window.scrollBy(0,450);");
				     Thread.sleep(1000);
					 driver.findElement(By.xpath("/html/body/app-root/app-individual-base/div/div[2]/div/app-organization-wallet-history/div/form/div[3]/div[2]/div[1]/app-date-filter/div[1]/div[1]/input")).click(); //Filter by Month
					 Thread.sleep(2000);
					 SK.executeScript("window.scrollBy(0,-750);");
					 Thread.sleep(1000);
				
//Orders 
					driver.findElement(By.xpath("//text()[.='Orders']/ancestor::li[1]")).click();//Orders Tab
					Thread.sleep(5000);		
						
//Ebook 						
					driver.findElement(By.xpath("//text()[.='Ebook']/ancestor::li[1]")).click();//Ebook Tab
					Thread.sleep(5000);				
					
//Subscription 						
				   driver.findElement(By.xpath("//text()[.='Subscription']/ancestor::li[1]")).click();//Subscription Tab
				   Thread.sleep(5000);		
				   
				    driver.findElement(By.xpath("//span[text()='YEARLY']")).click();// Yearly Button
					Thread.sleep(1000);
					SK.executeScript("window.scrollBy(0,600);");
					Thread.sleep(1000);
					driver.findElement(By.xpath("/html/body/app-root/app-individual-base/div/div[2]/div/app-assign-plan/div/div[2]/div/div/div[2]/div/div[2]/div[2]/div/div/div/ul/li[6]/div/button")).click();// Golden Button
					Thread.sleep(1000);
					SK.executeScript("window.scrollBy(0,550);");
					Thread.sleep(4000);
					SK.executeScript("window.scrollBy(0,-550);");
					Thread.sleep(3000);
					
					 //driver.findElement(By.xpath("//body/app-root[1]/app-organization-base[1]/div[1]/div[1]/div[2]/div[1]/app-payment-subscription[1]/div[1]/div[1]/div[2]/div[2]/div[1]/stripe-card[1]")).sendKeys("4916 7170 0206 9510"); //Card Number
					 //Thread.sleep(1000);
				     //	driver.findElement(By.xpath("//input[@type='text'][@name='cardnumber']")).click();
					SK.executeScript("window.scrollBy(0,550);");
					Thread.sleep(2000);
					driver.findElement(By.xpath("//button[text()='Pay Now']")).click();//Pay Now Button
					Thread.sleep(2000);
					driver.findElement(By.xpath("//button[text()='Cancel']")).click();// Cancel Button
					System.out.print(true);
				   
					
					SK.executeScript("window.scrollBy(0,-550);");
					Thread.sleep(3000);
					driver.findElement(By.xpath("//span[text()='MONTHLY']")).click();// Monthly  Button
					Thread.sleep(1000);
					SK.executeScript("window.scrollBy(0,600);");
					Thread.sleep(1000);
					driver.findElement(By.xpath("//li[6]//div[1]//button[1]")).click();// Golden Button
					Thread.sleep(1000);
					SK.executeScript("window.scrollBy(0,550);");
					Thread.sleep(4000);
					SK.executeScript("window.scrollBy(0,-550);");
					Thread.sleep(3000);
					 //driver.findElement(By.xpath("//body/app-root[1]/app-organization-base[1]/div[1]/div[1]/div[2]/div[1]/app-payment-subscription[1]/div[1]/div[1]/div[2]/div[2]/div[1]/stripe-card[1]")).sendKeys("4916 7170 0206 9510"); //Card Number
					 //Thread.sleep(1000);
				     //	driver.findElement(By.xpath("//input[@type='text'][@name='cardnumber']")).click();
					SK.executeScript("window.scrollBy(0,550);");
					Thread.sleep(2000);
					driver.findElement(By.xpath("//button[text()='Pay Now']")).click();//Pay Now Button
					Thread.sleep(2000);
					// driver.findElement(By.xpath("//a[text()='Go to My Subscription']")).click();//Go to My Subscription click after successfully subscription of the product 
					//Thread.sleep(2000);

						
					Thread.sleep(2000);
					driver.findElement(By.xpath("//button[text()='Cancel']")).click();// Cancel Button
					System.out.print(true);
					SK.executeScript("window.scrollBy(0,-750);");
					Thread.sleep(3000);
				   
				   
//Profile Icon	
					
					driver.findElement(By.xpath("//text()[.='My Account']/ancestor::button[1]")).click();// Profile Icon 
					Thread.sleep(1000);
					driver.findElement(By.xpath("//text()[contains(.,'My Dashboard')]/ancestor::button[1]")).click();// Dash-board Icon 
					Thread.sleep(1000);
					driver.findElement(By.xpath("//*[@class='bi bi-person']")).click();// Profile Icon 
					Thread.sleep(1000);
					
					driver.findElement(By.xpath("//text()[contains(.,'My Subscription')]/ancestor::button[1]")).click();// Subscription Icon 
					Thread.sleep(1000);
					
//					driver.findElement(By.xpath("//button[contains(text(),'Upgrade')]")).click();// Upgrade Button 
//					Thread.sleep(1000);
//					driver.findElement(By.xpath("//*[@class='bi bi-x-circle cross']")).click();// Subscription Upgrade Cancellation Button 
//					Thread.sleep(1000);
//					driver.findElement(By.xpath("//button[contains(text(),'Cancel')]")).click();//Cancel Button 
//					Thread.sleep(1000);
//					driver.findElement(By.xpath("//button[text()='Discard']")).click();// Cancel Discard Button 
//					Thread.sleep(1000);
//					driver.findElement(By.xpath("//button[contains(text(),'Cancel')]")).click();//Re-click Cancel Button 
//					Thread.sleep(1000);
//					driver.findElement(By.xpath("//button[text()='OK']")).click();// Cancel's Confirmation Ok Button 
//					Thread.sleep(1000);
//					driver.findElement(By.xpath("//button[contains(text(),'Back to Plans')]")).click();// Back to Plans Button 
//					Thread.sleep(1000);
									   
				   
 
					
//The below code is not working
//				
//              String statusToFind = "Active";
//		        // Construct the XPath to locate the row with "Active" status and the "Upgrade" button
//		        String rowXPath = "//table//tr[td[contains(text(), '" + statusToFind + "')]]";
//		        String upgradeButtonXPath = rowXPath + "/td//button[contains(text(), 'Upgrade')]";
// 
//		        // Locate the "Upgrade" button within the "Active" row and click it
//		        WebElement upgradeButton = driver.findElement(By.xpath(upgradeButtonXPath));
//		        upgradeButton.click();
//                driver.quit();
					
				driver.findElement(By.xpath("//text()[.='My Account']/ancestor::button[1]")).click();// Profile Icon 
				Thread.sleep(1000);		
				driver.findElement(By.xpath("//text()[contains(.,'My course')]/ancestor::button[1]")).click();// My course tab 
				Thread.sleep(1000);	
				driver.findElement(By.xpath("//text()[.='My Account']/ancestor::button[1]")).click();// Profile Icon 
				Thread.sleep(1000);
				driver.findElement(By.xpath("//text()[contains(.,'Orders')]/ancestor::button[1]")).click();// My course tab 
				Thread.sleep(1000);	
				driver.findElement(By.xpath("//text()[.='My Account']/ancestor::button[1]")).click();// Profile Icon 
				Thread.sleep(1000);
				driver.findElement(By.xpath("//text()[contains(.,'Profile')]/ancestor::button[1]")).click();// My Profile Tab 
				Thread.sleep(1000);
				
				
                 //Update Profile
			     
			     
			     WebElement usernameField = driver.findElement(By.xpath("//input[@type='text'][@placeholder='First Name']"));//First name 
			     usernameField.clear();
			     usernameField.sendKeys("UserAutomation");			  
			     
			     WebElement UserLastName= driver.findElement(By.xpath("//input[@type='text'][@placeholder='Last Name']	"));//Last Name
			     UserLastName.clear();
			     UserLastName.sendKeys("HardiaAayushi");
			     
			     WebElement NumberFiled = driver.findElement(By.xpath("//input[@type='text'][@placeholder='Display Name']"));//Display Name
			     NumberFiled.clear();
			     NumberFiled.sendKeys("Automation.useraayushi");
			     
			     WebElement EmailFiled = driver.findElement(By.xpath("//input[@type='email'][@placeholder='Email Address']"));//Email Address
			     EmailFiled.clear();
			     EmailFiled.sendKeys("automation.useraayushi@mailinator.com");
			   
			     driver.findElement(By.xpath("/html/body/app-root/app-individual-base/div/div[2]/div/app-individual-profile/div/div/app-general/div/form/div[5]/div[2]/textarea")).sendKeys("Testing is purpose and QA street city tester Update");//Biographical Info
			     
			     
			     SK.executeScript("window.scrollBy(0,500);");
		         Thread.sleep(500);	 
			     driver.findElement(By.xpath("//button[text()='Save Changes']")).click();//Save Changes button
                 Thread.sleep(2000);
                 
             
			     SK.executeScript("window.scrollBy(0,200);");
		         Thread.sleep(4500);

		         WebElement fileInput1 = driver.findElement (By.xpath("//button[contains(text(),'ADD')]"));//Add Button
		         fileInput1.click();
		         String localFilePath1 = "C:\\Users\\aayushi.hardia\\Desktop\\automation.png";
		         Thread.sleep(2000);
		         setClipboardData(localFilePath1);
		         Thread.sleep(2000);
		         
		        
		         Robot robot1 = new Robot();
		         robot1.keyPress(KeyEvent.VK_CONTROL);
		         robot1.keyPress(KeyEvent.VK_V);
		         robot1.keyRelease(KeyEvent.VK_V);
		         robot1.keyRelease(KeyEvent.VK_CONTROL);
		         
		         // Press Enter to confirm the selection
		         robot1.keyPress(KeyEvent.VK_ENTER);
		         robot1.keyRelease(KeyEvent.VK_ENTER);

		         driver.findElement(By.xpath("//button[text()='Save & Next']")).click();//save any next button of company Avtar page
		         Thread.sleep(2500);
		         
		        
		         
		        driver.findElement(By.xpath("//input[@type='password'][@placeholder='Old Password']")).sendKeys("Sipl@12345");// Old Password *
				Thread.sleep(1000);
				driver.findElement(By.xpath("//input[@type='password'][@placeholder='New Password']")).sendKeys("Sipl@12345");// New Password *
				Thread.sleep(1000);
				driver.findElement(By.xpath("//input[@type='password'][@placeholder='Confirm Password']")).sendKeys("Sipl@12345");// Confirm Password *
				Thread.sleep(1000); 
				driver.findElement(By.xpath("//text()[.='Update Password']/ancestor::div[1]")).click();//Update Password button
		        Thread.sleep(3500);
		        
		        SK.executeScript("window.scrollBy(0,-700);");
		        Thread.sleep(2000);
		
				driver.findElement(By.xpath("//*[@class='bi bi-person']")).click();// Profile Icon 
				Thread.sleep(1000);
				driver.findElement(By.xpath("//text()[contains(.,'Logout')]/ancestor::button[1]")).click();// Logout Icon 
				Thread.sleep(1000);
		         
		         
                
			    }
	
	private static void setClipboardData(String data) {
        StringSelection stringSelection = new StringSelection(data);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(stringSelection, null);


	}
	
}
