package AfterLoginUser;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CorporateUser2 {

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
		
//Clinical Practitioners 
        
        driver.findElement(By.xpath("//span[contains(text(),'Clinical Practitioners')]")).click();//Clinical Practitioner header
        Thread.sleep(500);
        
        WebElement inputField2 = driver.findElement(By.xpath("//input[@placeholder='Type here something..']"));//search filed clearance variable

        driver.findElement(By.xpath("//input[@placeholder='Type here something..']")).sendKeys("Test"); //search text	
        Thread.sleep(1000);
        inputField2.clear();//clear the search field 
        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[contains(text(),'Clinical Practitioners')]")).click(); //Refresh the Clinical Practitioner page	
     
        WebElement checkbox12 = driver.findElement(By.xpath("//*[@id=\"category10\"]"));//Mental Wellness
        Thread.sleep(1000);
        checkbox12.click();
        Thread.sleep(500);
        checkbox12.click();
        Thread.sleep(1000);


       WebElement checkbox13 = driver.findElement(By.xpath("//*[@id=\"category11\"]"));//Psychologist
       Thread.sleep(500);
       checkbox13.click();
       Thread.sleep(500);
       checkbox13.click();
       Thread.sleep(1000);
       
       WebElement checkbox14 = driver.findElement(By.xpath("//*[@id=\"category12\"]"));//Psychiatrist
       Thread.sleep(1000);
       checkbox14.click();
       Thread.sleep(500);
       checkbox14.click();
       Thread.sleep(1000);
                     
       WebElement checkbox15 = driver.findElement(By.xpath("//*[@id=\"category19\"]"));//Counselors
       Thread.sleep(1000);
       checkbox15.click();
       Thread.sleep(500);
       checkbox15.click();
       Thread.sleep(1000);

       SK.executeScript("window.scrollBy(0,300);");
       Thread.sleep(500);
       
       driver.findElement(By.xpath("//*[@id=\"static-2\"]/div/form/div/mat-slider/input[2]")).click();// Slider Filter 
       Thread.sleep(2500); 
       
       WebElement checkbox16= driver.findElement(By.xpath("//*[@id=\"location14\"]"));//Indore Location
       Thread.sleep(500);
       checkbox16.click();
       Thread.sleep(500);
       checkbox16.click();
       Thread.sleep(1000);
       
       WebElement checkbox17= driver.findElement(By.xpath("//*[@id=\"location52\"]")); //India Location
       Thread.sleep(500);
       checkbox17.click();
       Thread.sleep(500);
       checkbox17.click();
       Thread.sleep(1000);

       WebElement checkbox18= driver.findElement(By.xpath("//*[@id=\"location53\"]")); //Nepal Location
       Thread.sleep(550);
       checkbox18.click();
       Thread.sleep(500);
       checkbox18.click();
       Thread.sleep(1000);
        
       SK.executeScript("window.scrollBy(0,400);");
       Thread.sleep(500);   		
     		
       WebElement checkbox19= driver.findElement(By.xpath("//*[@id=\"rating5\"]")); //5star rating 
       Thread.sleep(350);
       checkbox19.click();
       Thread.sleep(500);
       checkbox19.click();
       Thread.sleep(1000);
       
       WebElement checkbox20= driver.findElement(By.xpath("//*[@id=\"rating1\"]")); //1 star rating 
       Thread.sleep(350);
       checkbox20.click();
       Thread.sleep(500);
       checkbox20.click();
       Thread.sleep(3000);
       
       SK.executeScript("window.scrollBy(0,-750);");
       Thread.sleep(2000);
       
       driver.findElement(By.xpath("//span[normalize-space()='Employees']")).click();//Employee header
       Thread.sleep(1000);
       driver.findElement(By.xpath("//span[contains(text(),'Clinical Practitioners')]")).click();//Clinical Practitioner header
       Thread.sleep(1000);
       
       driver.findElement(By.xpath("/html/body/app-root/app-organization-base/div/div/div[2]/div/app-organization-clinical-practitioners/div/div/div[2]/div/div/div[2]/div[2]/app-coaches-card/div/div/div/div/div[2]/a")).click();// View Profile1 button
       Thread.sleep(800);
       driver.navigate().back();
       Thread.sleep(1000);

       driver.findElement(By.xpath("/html/body/app-root/app-organization-base/div/div/div[2]/div/app-organization-clinical-practitioners/div/div/div[2]/div/div/div[2]/div[1]/app-coaches-card/div/div/div/div/div[2]/a")).click();// View Profile2 button
       Thread.sleep(1000);
       SK.executeScript("window.scrollBy(0,450);");
       Thread.sleep(2000);
       driver.findElement(By.xpath("/html/body/app-root/app-organization-base/div/div/div[2]/div/app-organization-coaches-details/div/form/div[4]/div[2]/div[2]/button")).click();// Rate the Practitioner Profile button
       Thread.sleep(1000);
       driver.findElement(By.xpath("//button[@class='btn btn-secondary mx-2']")).click();// Cancel the Rate Popup
       Thread.sleep(1000);
       
       driver.findElement(By.xpath("/html/body/app-root/app-organization-base/div/div/div[2]/div/app-organization-coaches-details/div/form/div[4]/div[2]/div[2]/button")).click();// Rate the Practitioner Profile button
       Thread.sleep(1000);
       driver.findElement(By.xpath("//span[4]//staricon[1]//*[name()='svg']")).click();// Rate the coach Popup
       Thread.sleep(1000);
       driver.findElement(By.xpath("//textarea[@class='form-control ng-untouched ng-pristine ng-invalid']")).sendKeys("Testing the couches profile is QA purpose");// Rate the Practitioner Popup
       Thread.sleep(1000);
       driver.findElement(By.xpath("//button[@type='submit']")).click();// Submit the Practitioner Popup
       Thread.sleep(1000);
     
       
       driver.findElement(By.xpath("//div[@class='text-center']//button[@class='btn btn-primary']")).click();//Book the session at the Practitioner profile
       Thread.sleep(1000);
       SK.executeScript("window.scrollBy(0,350);");
       Thread.sleep(500);
       
       driver.findElement(By.xpath("/html/body/app-root/app-organization-base/div/div/div[2]/div/app-book-session/div/div[3]/app-coach-availability/div/div/div[2]/div/div/p-calendar/span/div/div/div/div[2]/table/tbody/tr[2]/td[5]/span")).click();//Select the date for Booking the session at the coach profile
       Thread.sleep(4000);
       
//Below code should be updated every time because only unique appointments will be created always
//change date  
   
       driver.findElement(By.xpath("//div[@class='row ng-star-inserted']//div[1]//div[1]//div[1]")).click();//Select the Time for Booking the session at the Practitioner profile
       Thread.sleep(2000);
       
       //Session Popup
       driver.findElement(By.xpath("//fieldset//div[@class='virtual pl-3']//input[@type='radio']")).click();//Select the Session Type=Group at session at session booking Practitioner popup
       Thread.sleep(2000);
       
       driver.findElement(By.xpath("/html/body/ngb-modal-window/div/div/div[3]/form/div/div/div[1]/div/div/div[1]/div[2]/div/div/div/p-multiselect/div/div[2]/div")).click(); //select employee dropdown
       Thread.sleep(2000);              
       driver.findElement(By.xpath("//div[@role='checkbox']")).click();//Dropdown value selection
       Thread.sleep(2000);
       driver.findElement(By.xpath("/html/body/ngb-modal-window/div/div/div[3]/form/div/div/div[1]/div/div/div[1]/div[2]/div/div/div/p-multiselect/div/div[2]/div")).click(); //close the dropdown
       Thread.sleep(2000); 
       driver.findElement(By.xpath("//span[text()='Select']")).click();//Start Time* selection
       
//change the Time
       driver.findElement(By.xpath("//span[text()='06 AM']")).click();
       
       driver.findElement(By.xpath("/html/body/ngb-modal-window/div/div/div[3]/form/div/div/div[1]/div/div/div[2]/div[2]/div/div[2]/p-dropdown/div/div[2]")).click();
          
//Change minutes of time dropdown    
       driver.findElement(By.xpath("//text()[.='30']/ancestor::li[1]")).click();

       SK.executeScript("window.scrollBy(0,450);");
       Thread.sleep(1000);
       driver.findElement(By.xpath("//button[contains(text(),'Confirm')]")).click();//Confirm button
       Thread.sleep(1000);

       driver.findElement(By.xpath("/html/body/app-root/app-organization-base/div/div/div[2]/div/app-book-session/div/div[3]/app-coach-availability/div/div/div[3]/div/div/div[2]/div/div[3]/div/div")).click();//Again Select the Time for Booking the session at the coach profile
       SK.executeScript("window.scrollBy(0,550);");
       Thread.sleep(1000);
       driver.findElement(By.xpath("//button[text()='Cancel']")).click();//Cancel button
       Thread.sleep(500);

        SK.executeScript("window.scrollBy(0,-450);");
        Thread.sleep(1000);
        
        driver.findElement(By.xpath("//a[contains(text(),'Back to Coach Profile')]")).click();//Back To Coach Profile button
        Thread.sleep(500);
        driver.findElement(By.xpath("//a[contains(text(),'Back to All Clinical Practitioners')]	")).click();//Back To All Practitioner button
        Thread.sleep(1000);
		
		
		
		

	}

}
