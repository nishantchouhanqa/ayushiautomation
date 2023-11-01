package AfterLoginUser;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CorporateUser1 {

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
				driver.findElement(By.xpath("//input[@type='email'][@id='email']")).sendKeys("Automation.useraayushi2@mailinator.com");//login Email Address 
				Thread.sleep(500);
			    driver.findElement(By.xpath("//input[@type='password'][@id='exampleInputPassword1']")).sendKeys("Toivyz34");//Login Password
				Thread.sleep(500);
				driver.findElement(By.xpath("//button[text()='LOG IN']")).click();//Log In button
				Thread.sleep(2000);     	

				
//Dashboard
				
				//1.			    
				driver.findElement(By.xpath("//button[text()='Add Amount']")).click(); //Add Amount Button
				driver.findElement(By.xpath("/html/body")).sendKeys("15000"); //Enter amount
				Thread.sleep(500);
			    driver.findElement(By.xpath("//button[contains(text(),'+$2500.0')]")).click(); //Selected Amount Button
				driver.findElement(By.xpath("//button[text()='Proceed to Add']")).click(); //Proceed To Add  Button	
				Thread.sleep(1000);//enter the below entries manually 
				
			    //WebElement inputField = driver.findElement(By.xpath("//input[@type='text'][@name='card number']")); //Card Number
	            // inputField.clear();
	            //inputField.sendKeys("4916 7170 0206 9510");
                //driver.findElement(By.xpath("//input[@type='text'][@name='exp-date']")).sendKeys("1226"); //Card Expire date
				//Thread.sleep(1000);
				//driver.findElement(By.xpath("//input[@type='text'][@name='cvc']")).sendKeys("955"); //Card CVC date
				//Thread.sleep(1000);
                //driver.findElement(By.xpath("//button[text()='Proceed to Add']")).click(); //Proceed To Add  Button

                driver.findElement(By.xpath("//*[@class='bi bi-x-circle cross']")).click(); //Cancel  Button	
                Thread.sleep(500);

				//2.
                driver.findElement(By.xpath("//div[@class='ng-star-inserted']//a[@class='btn btn-primary']")).click(); //View all  Button of Active Employees	
                Thread.sleep(500);
                driver.navigate().back();
                Thread.sleep(500);
                SK.executeScript("window.scrollBy(0,250);");
                Thread.sleep(1000);

                
                //driver.findElement(By.xpath("//div[@class='ng-star-inserted']//a[@class='btn btn-primary']")).click(); //Expenditure Report Hover Button
                //Not working
                driver.findElement(By.xpath("//div[@class='coaches-row']//div[@class='card p-0 bg-light-green']//div[@class='card-header bg-card-header-color d-flex justify-content-between align-items-center']//div//a[@class='btn btn-primary']")).click(); //View all  Button of Coaches for Your Help
                Thread.sleep(1000);
                driver.navigate().back();
                Thread.sleep(1500);
                
                SK.executeScript("window.scrollBy(0,700);");
                Thread.sleep(1000);

                driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-organization-base[1]/div[1]/div[1]/div[2]/div[1]/app-organization-dashboard[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/app-coaches-card[1]/div[1]/div[1]/div[1]/div[1]/div[2]/a[1]")).click(); //View Profile  Button of coaches
                Thread.sleep(1000);
                driver.navigate().back();
                Thread.sleep(1000);
                
                SK.executeScript("window.scrollBy(0,450);");
                Thread.sleep(1000);
                
                driver.findElement(By.xpath("//div[@class='today-sessions-section']//div[@class='card p-0 bg-light-green']//div[@class='card-header bg-card-header-color d-flex justify-content-between align-items-center']//div//a[@class='btn btn-primary']")).click(); //View all  Button of Sessions For Today 	
                Thread.sleep(1000);
                driver.navigate().back();
                Thread.sleep(500);
                
                SK.executeScript("window.scrollBy(0,0);");
                Thread.sleep(1000);
                
 //Coaches            
                
                driver.findElement(By.xpath("//a[@href='/organization/coaches']")).click(); //Coaches header	
                Thread.sleep(500);
                
                WebElement inputField = driver.findElement(By.xpath("//input[@placeholder='Type here something..']"));//search filed clearance variable
                
                driver.findElement(By.xpath("//input[@placeholder='Type here something..']")).sendKeys("Test"); //search text	
                Thread.sleep(500);
                inputField.clear();//clear the search field 
                Thread.sleep(500);
                driver.findElement(By.xpath("//a[@href='/organization/coaches']")).click(); //Refresh the Coaches page	

                
                WebElement checkbox1 = driver.findElement(By.xpath("//input[@type='checkbox'][@id='category10']"));//Mental Wellness
                Thread.sleep(350);
                checkbox1.click();
                Thread.sleep(500);
                checkbox1.click();
                Thread.sleep(1000);


               WebElement checkbox2 = driver.findElement(By.xpath("//*[@id=\"category11\"]"));//Psychologist
               Thread.sleep(350);
               checkbox2.click();
               Thread.sleep(500);
               checkbox2.click();
               Thread.sleep(1000);
               
               WebElement checkbox3 = driver.findElement(By.xpath("//*[@id=\"category12\"]"));//Psychiatrist
               Thread.sleep(350);
               checkbox3.click();
               Thread.sleep(500);
               checkbox3.click();
               Thread.sleep(1000);
               
               
               WebElement checkbox4 = driver.findElement(By.xpath("//*[@id=\"category19\"]"));//Counselors
               Thread.sleep(350);
               checkbox4.click();
               Thread.sleep(500);
               checkbox4.click();
               Thread.sleep(1000);
                
               WebElement checkbox5 = driver.findElement(By.xpath("//*[@id=\"consultationMode1\"]"));//Virtual
               Thread.sleep(500);
               checkbox5.click();
               Thread.sleep(500);
               checkbox5.click();
               Thread.sleep(1000);
               
               WebElement checkbox6= driver.findElement(By.xpath("//*[@id=\"consultationMode2\"]"));//In Person
               Thread.sleep(350);
               checkbox6.click();
               Thread.sleep(500);
               checkbox6.click();
               Thread.sleep(1000);
               
               SK.executeScript("window.scrollBy(0,400);");
               Thread.sleep(500);
               
               WebElement checkbox7= driver.findElement(By.xpath("//*[@id=\"location14\"]"));//Indore Location
               Thread.sleep(350);
               checkbox7.click();
               Thread.sleep(500);
               checkbox7.click();
               Thread.sleep(1000);
               
               WebElement checkbox8= driver.findElement(By.xpath("//*[@id=\"location52\"]")); //India Location
               Thread.sleep(350);
               checkbox8.click();
               Thread.sleep(500);
               checkbox8.click();
               Thread.sleep(1000);

               WebElement checkbox9= driver.findElement(By.xpath("//*[@id=\"location53\"]")); //Nepal Location
               Thread.sleep(350);
               checkbox9.click();
               Thread.sleep(500);
               checkbox9.click();
               Thread.sleep(1000);
                
               SK.executeScript("window.scrollBy(0,450);");
               Thread.sleep(500); 
               WebElement checkbox10= driver.findElement(By.xpath("//*[@id=\"rating5\"]")); //5star rating 
               Thread.sleep(350);
               checkbox10.click();
               Thread.sleep(500);
               checkbox10.click();
               Thread.sleep(1000);
               
               WebElement checkbox11= driver.findElement(By.xpath("//*[@id=\"rating1\"]")); //1 star rating 
               Thread.sleep(350);
               checkbox11.click();
               Thread.sleep(500);
               checkbox11.click();
               Thread.sleep(3000);
               
               SK.executeScript("window.scrollBy(0,-450);");
               Thread.sleep(2000);
               
               driver.findElement(By.xpath("/html/body/app-root/app-organization-base/div/div/div[2]/div/app-organization-coaches/div/div/div[2]/div/div/div[2]/div[1]/app-coaches-card/div/div/div/div/div[2]/a")).click();// View Profile button
               Thread.sleep(800);
               driver.navigate().back();
               Thread.sleep(1000);

               driver.findElement(By.xpath("/html/body/app-root/app-organization-base/div/div/div[2]/div/app-organization-coaches/div/div/div[2]/div/div/div[2]/div[2]/app-coaches-card/div/div/div/div/div[2]/a")).click();// View Profile button of Coach Aashi Hardy
               Thread.sleep(1000);
               SK.executeScript("window.scrollBy(0,450);");
               Thread.sleep(2000);
               driver.findElement(By.xpath("/html/body/app-root/app-organization-base/div/div/div[2]/div/app-organization-coaches-details/div/form/div[4]/div[2]/div[2]/button")).click();// Rate the coach Profile button
               Thread.sleep(1000);
               driver.findElement(By.xpath("//button[@class='btn btn-secondary mx-2']")).click();// Cancel the coach Popup
               Thread.sleep(1000);
               
               driver.findElement(By.xpath("/html/body/app-root/app-organization-base/div/div/div[2]/div/app-organization-coaches-details/div/form/div[4]/div[2]/div[2]/button")).click();// Rate the coach Profile button
               Thread.sleep(1000);
               driver.findElement(By.xpath("//span[4]//staricon[1]//*[name()='svg']")).click();// Rate the coach Popup
               Thread.sleep(1000);
               driver.findElement(By.xpath("//textarea[@class='form-control ng-untouched ng-pristine ng-invalid']")).sendKeys("Testing the couches profile is QA purpose");// Rate the coach Popup
               Thread.sleep(1000);
               driver.findElement(By.xpath("//button[@type='submit']")).click();// Submit the coach Popup
               Thread.sleep(1000);
             
               
               driver.findElement(By.xpath("//div[@class='text-center']//button[@class='btn btn-primary']")).click();//Book the session at the coach profile
               Thread.sleep(1000);
               SK.executeScript("window.scrollBy(0,350);");
               Thread.sleep(500);
               
//Below code should be updated every time because only unique appointments will be created always               
//change date  
               driver.findElement(By.xpath("/html/body/app-root/app-organization-base/div/div/div[2]/div/app-book-session/div/div[3]/app-coach-availability/div/div/div[2]/div/div/p-calendar/span/div/div/div/div[2]/table/tbody/tr[2]/td[5]/span")).click();//Select the date for Booking the session at the coach profile
               Thread.sleep(2000);
               
             
               driver.findElement(By.xpath("/html/body/app-root/app-organization-base/div/div/div[2]/div/app-book-session/div/div[3]/app-coach-availability/div/div/div[3]/div/div/div[2]/div/div[7]/div/div")).click();//Select the Time for Booking the session at the coach profile
               Thread.sleep(1000);
               //Session Popup
               driver.findElement(By.xpath("//fieldset//div[@class='virtual pl-3']//input[@type='radio']")).click();//Select the Session Type at session at session booking popup
               Thread.sleep(2000);
               driver.findElement(By.xpath("/html/body/ngb-modal-window/div/div/div[3]/form/div/div/div[1]/div/div/div[1]/div[2]/div/div/div/p-multiselect/div/div[2]/div")).click(); //select employee dropdown
               Thread.sleep(2000);              
               driver.findElement(By.xpath("//div[@role='checkbox']")).click();//Dropdown value selection
               Thread.sleep(2000);
               driver.findElement(By.xpath("/html/body/ngb-modal-window/div/div/div[3]/form/div/div/div[1]/div/div/div[1]/div[2]/div/div/div/p-multiselect/div/div[2]/div")).click(); //close the dropdown
               Thread.sleep(2000); 
               driver.findElement(By.xpath("//span[text()='Select']")).click();//Start Time* selection
               
 //change the Time
               driver.findElement(By.xpath("//text()[.='04 PM']/ancestor::li[1]")).click();
               
               driver.findElement(By.xpath("/html/body/ngb-modal-window/div/div/div[3]/form/div/div/div[1]/div/div/div[2]/div[2]/div/div[2]/p-dropdown/div/div[2]")).click();
//Change minutes of time dropdown                
               driver.findElement(By.xpath("//text()[.='15']/ancestor::li[1]")).click();
               
               SK.executeScript("window.scrollBy(0,450);");
               Thread.sleep(1000);
               driver.findElement(By.xpath("//button[contains(text(),'Confirm')]")).click();//Confirm button

               driver.findElement(By.xpath("//div[@class='row ng-star-inserted']//div[1]//div[1]//div[1]")).click();//Again Select the Time for Booking the session at the coach profile
               SK.executeScript("window.scrollBy(0,450);");
               Thread.sleep(1000);
               driver.findElement(By.xpath("//button[text()='Cancel']")).click();//Cancel button

                SK.executeScript("window.scrollBy(0,-450);");
                Thread.sleep(500);
                driver.findElement(By.xpath("//a[contains(text(),'Back to Coach Profile')]")).click();//Back To Coach Profile button
                Thread.sleep(500);
                driver.findElement(By.xpath("//a[contains(text(),'Back to All Coaches')]")).click();//Back To All Coaches button
                Thread.sleep(1000);
                

                
	}

}
