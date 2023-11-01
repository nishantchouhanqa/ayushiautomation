package BeforeLoginWithotUser;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SignUpLoginForgotPassword {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

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

//Account Creation 		
		SK.executeScript("window.scrollBy(0,550);");
		Thread.sleep(1000);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//input[@type='text'][@placeholder='First Name']")).sendKeys("Automation User");
		driver.findElement(By.xpath("//input[@type='text'][@placeholder='Last Name']")).sendKeys("Aayushihardia");
		driver.findElement(By.xpath("//input[@type='email'][@id='exampleInputEmail1']")).sendKeys("Automation.useraayushi@mailinator.com");
		Thread.sleep(500);
		driver.findElement(By.xpath("(//input[@placeholder='Enter Password'])[2]")).sendKeys("Sipl@12345");
		
		driver.findElement(By.xpath("//button[text()='REGISTER']")).click();
		Thread.sleep(2500);

	    
//Forgot Password 	 
		
        SK.executeScript("window.scrollBy(0,550);");
        Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Forgot Password?']")).click(); // Forgot Password Link
        Thread.sleep(1000);
        
		driver.findElement(By.xpath("//input[@type='email'][@name='email']")).sendKeys("Automation.useraayushi@mailinator.com");//Forgot password Email Address 
        Thread.sleep(1000);
		driver.findElement(By.xpath("//button[contains(text(),'Reset Password')]")).click(); // Reset Password Button
        Thread.sleep(1000);

		//reset password email verification 
		
				String parenttab = driver.getWindowHandle(); //parent tab
			     driver.switchTo().newWindow(WindowType.TAB);
			     
			     // Step 1: Open Mailinator and enter the email address

			     driver.get("https://www.mailinator.com/");
			     Thread.sleep(2000);
			     WebElement emailInput = driver.findElement(By.xpath("//input[@id='search']"));
			     emailInput.sendKeys("Automation.useraayushi@mailinator.com");
			     
		         driver.findElement(By.xpath("//button[text()='GO']")).click();// Click "Go" button to access the inbox
				 Thread.sleep(500);

			     // Step 2: Locate and click on the email containing the OTP
			     WebElement otpEmail = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/main[1]/div[2]/div[3]/div[1]/div[4]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[3]")); // Replace with the actual subject of the OTP email
			     otpEmail.click();
			     Thread.sleep(2000);
			 
			     WebElement iframe = driver.findElement(By.xpath("//iframe[@id='html_msg_body']"));
			     driver.switchTo().frame(iframe);
			     
			         
			    driver.findElement(By.xpath("//div[@class='reset-link']//a")).click();//Reset Link
		        Thread.sleep(2000);
		        
		        // getting windows handles
				Set<String> windows = driver.getWindowHandles();
				// getting parent and child window handles and iterating it
				Iterator<String> it = windows.iterator();
				String parentid = it.next();
				String childid = it.next();
				String childID1=it.next();
			    System.out.println(windows);
			    
				// Switching to child window.
				Thread.sleep(500);
		        driver.switchTo().window(childID1);

		        
				 //Password reset screen
				Thread.sleep(500);
		        SK.executeScript("window.scrollBy(0,550);");
		        Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Sipl@123456");//New Password *
		        Thread.sleep(500);
				driver.findElement(By.xpath("//input[@type='password'][@name='confirm_password']")).sendKeys("Sipl@123456"); //Confirm Password *
		        Thread.sleep(500);
			    driver.findElement(By.xpath("//button[text()='Update']")).click();//Update Button
                Thread.sleep(2000);
          
		        driver.switchTo().window(parentid);
                Thread.sleep(1000);

                
// Login		

		driver.findElement(By.xpath("//input[@type='email'][@id='email']")).sendKeys("Automation.useraayushi@mailinator.com");//login Email Address 
		Thread.sleep(500);
	    driver.findElement(By.xpath("//input[@type='password'][@id='exampleInputPassword1']")).sendKeys("Sipl@123456");//Login Password
		Thread.sleep(500);
		driver.findElement(By.xpath("//button[text()='LOG IN']")).click();//Log In button
		Thread.sleep(2500);     

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
