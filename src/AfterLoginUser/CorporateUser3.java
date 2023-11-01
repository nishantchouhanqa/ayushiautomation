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

public class CorporateUser3 {

	public static void main(String[] args) throws InterruptedException, AWTException  {

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
						
//Employees
				        
				driver.findElement(By.xpath("//span[normalize-space()='Employees']")).click();//Employee header
				Thread.sleep(1000);	
				WebElement inputField2 = driver.findElement(By.xpath("//input[@placeholder='Type here something..']"));//search filed clearance variable

		        driver.findElement(By.xpath("//input[@placeholder='Type here something..']")).sendKeys("Test"); //search text	
		        Thread.sleep(1000);
		        inputField2.clear();//clear the search field 
		        Thread.sleep(1000);
				driver.findElement(By.xpath("//span[normalize-space()='Employees']")).click();//Employee header

				 WebElement checkbox21 = driver.findElement(By.xpath("//input[@type='checkbox'][@id='department1']"));//Marketing
			     Thread.sleep(1000);
			     checkbox21.click();
			     Thread.sleep(500);
			     checkbox21.click();
			     Thread.sleep(1000);
			     
			     WebElement checkbox22 = driver.findElement(By.xpath("//input[@type='checkbox'][@id='department2']"));//Sales
			     Thread.sleep(1000);
			     checkbox22.click();
			     Thread.sleep(500);
			     checkbox22.click();
			     Thread.sleep(1000);
			     
			     WebElement checkbox23 = driver.findElement(By.xpath("//input[@type='checkbox'][@id='department3']"));//Human Resource
			     Thread.sleep(1000);
			     checkbox23.click();
			     Thread.sleep(500);
			     checkbox23.click();
			     Thread.sleep(1000);
			     
			     WebElement checkbox24 = driver.findElement(By.xpath("//input[@type='checkbox'][@id='department4']"));//Human Resource
			     Thread.sleep(1000);
			     checkbox24.click();
			     Thread.sleep(500);
			     checkbox24.click();
			     Thread.sleep(1000);
			     
			     WebElement checkbox25 = driver.findElement(By.xpath("//label[contains(text(),'Finance')]"));//Finance
			     Thread.sleep(1000);
			     checkbox25.click();
			     Thread.sleep(500);
			     checkbox25.click();
			     Thread.sleep(1000);
			     
                 WebElement checkbox26 = driver.findElement(By.xpath("//input[@type='checkbox'][@id='department8']"));//Other
			     Thread.sleep(1000);
			     checkbox26.click();
			     Thread.sleep(500);
			     checkbox26.click();
			     Thread.sleep(1000);
			     
			     
			     WebElement checkbox27 = driver.findElement(By.xpath("//input[@type='checkbox'][@id='account_status1']"));//Active
			     Thread.sleep(1000);
			     checkbox27.click();
			     Thread.sleep(500);
			     checkbox27.click();
			     Thread.sleep(1000);
			     
			     WebElement checkbox28 = driver.findElement(By.xpath("//input[@type='checkbox'][@id='account_status0']"));//Inactive
			     Thread.sleep(1000);
			     checkbox28.click();
			     Thread.sleep(500);
			     checkbox28.click();
			     Thread.sleep(2000);
			     
			     SK.executeScript("window.scrollBy(0,-750);");
			     Thread.sleep(2000);
				
			     driver.findElement(By.xpath("//*[@class='btn']")).click(); //Grid View icon 
			     Thread.sleep(4000);
				
			     driver.findElement(By.xpath("//*[@class='btn active']")).click(); //List View icon 
			     Thread.sleep(4000);
			     
   //Personal Information page , Note : Before execution of below code , please update the below details to create new account 
			     
//               driver.findElement(By.xpath("//button[text()='Create Employee Account']")).click(); //create employee account button 
//			     Thread.sleep(3000);
			     
//			     driver.findElement(By.xpath("//input[@type='text'][@id='first_name']")).sendKeys("Test11");//First name 
//			     driver.findElement(By.xpath("//input[@type='text'][@id='last_name']")).sendKeys("Employee16");//Last Name
//			     driver.findElement(By.xpath("//input[@type='text'][@id='contact_number']")).sendKeys("2320008255");//contact number 
//			     driver.findElement(By.xpath("//input[@type='email'][@id='email']")).sendKeys("aayushi16@mailinator.com");//Email
//			     driver.findElement(By.xpath("//input[@type='text'][@id='full_address']")).sendKeys("QA street city tester");//Address
//
//			     SK.executeScript("window.scrollBy(0,500);");
//			     Thread.sleep(500);
//			     driver.findElement(By.xpath("//select[@id='department']")).click();//Department * select button
//			     Thread.sleep(1000);
//			     driver.findElement(By.xpath("//*[@id=\"department\"]/option[3]")).click();//Department * value selection
//			     Thread.sleep(500);
//			     driver.findElement(By.xpath("//textarea[@id='biographical_information']")).sendKeys("Fake4");//Biographical Info 
//			     driver.findElement(By.xpath("//input[@type='text'][@id='facebook']")).sendKeys("www.facebook.com");//FB Info 
//			     driver.findElement(By.xpath("//input[@type='text'][@id='twitter']")).sendKeys("www.twitter.com");//Twitter Profile 
//			     driver.findElement(By.xpath("//input[@type='text'][@id='youtube']")).sendKeys("www.youtube.com");//Youtube Profile 
//			     driver.findElement(By.xpath("//input[@type='text'][@id='linkedin']")).sendKeys("www.linkedin.com");//Linkedin Profile 
//			     driver.findElement(By.xpath("//button[text()='Create Account']")).click(); //Account Create Button
//			     Thread.sleep(7000);
//			     
//			     SK.executeScript("window.scrollBy(0,200);");
//				 Thread.sleep(4000);
//			     
//		//		 driver.findElement(By.xpath("//a[contains(text(),'View Employee Profile')]")).click();//View Employee Profile Button
//				 
//				 driver.findElement(By.xpath("//button[contains(text(),'Continue to Profile Completion')]")).click();// Click the Continue to Profile Completion button 
//				 Thread.sleep(2000);
//				 
//				 System.out.println("please update profile picture");
//			     
//			     WebElement fileInput = driver.findElement (By.xpath("//button[contains(text(),'ADD')]"));
//		         fileInput.click();
//		         String localFilePath = "C:\\Users\\aayushi.hardia\\Desktop\\automation.png";
//		         Thread.sleep(2000);
//		         setClipboardData(localFilePath);
//		         Thread.sleep(2000);
//		         
//		        
//		         Robot robot = new Robot();
//		         robot.keyPress(KeyEvent.VK_CONTROL);
//		         robot.keyPress(KeyEvent.VK_V);
//		         robot.keyRelease(KeyEvent.VK_V);
//		         robot.keyRelease(KeyEvent.VK_CONTROL);
//		         
//		         // Press Enter to confirm the selection
//		         robot.keyPress(KeyEvent.VK_ENTER);
//		         robot.keyRelease(KeyEvent.VK_ENTER);
//
//		         
//		         driver.findElement(By.xpath("/html/body/app-root/app-organization-base/div/div/div[2]/div/app-organization-employee-create/div/div[2]/div/div/app-indiv-org-avatar/div/div/div[3]/div[2]/button")).click();//save any next button of company logo page
//		         Thread.sleep(2000);
//		         driver.findElement(By.xpath("/html/body/app-root/app-organization-base/div/div/div[2]/div/app-organization-employee-create/div/div[2]/div/div/app-assgin-credits/div/div/form/div/div[2]/div/input")).sendKeys("50");//Assign Credits to Employee *
//		         Thread.sleep(2000);
//		         driver.findElement(By.xpath("/html/body/app-root/app-organization-base/div/div/div[2]/div/app-organization-employee-create/div/div[2]/div/div/app-assgin-credits/div/div/form/div/div[3]/div[2]/button")).click();//save any next button of credit score assign page
//		         Thread.sleep(3000);
				 
				 
			     driver.findElement(By.xpath("//button[text()='Create Employee Account']")).click(); //re-click the create employee account button 
			     Thread.sleep(3000);
			     driver.findElement(By.xpath("//a[@class='btn btn-primary']")).click(); //Back to all employee  button 
			     Thread.sleep(2000);
			  	
//Update Profile
			     
			    driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-organization-base[1]/div[1]/div[1]/div[2]/div[1]/app-organization-employee[1]/div[1]/div[1]/div[2]/div[3]/div[1]/app-employee-card[1]/div[1]")).click();//select any employee profile to upadate
			    Thread.sleep(500);
			    
			     driver.findElement(By.xpath("//*[@class='bi bi-pencil-fill mr-2']")).click();//Edit Icon
			     WebElement usernameField = driver.findElement(By.xpath("//input[@type='text'][@id='first_name']"));//First name 
			     usernameField.clear();
			     usernameField.sendKeys("Dev");
			     
			     WebElement UserLastName= driver.findElement(By.xpath("//input[@type='text'][@id='last_name']"));//Last Name
			     UserLastName.clear();
			     UserLastName.sendKeys("Employee");
			     
			     WebElement NumberFiled = driver.findElement(By.xpath("//input[@type='text'][@id='contact_number']"));//contact number 
			     NumberFiled.clear();
			     NumberFiled.sendKeys("5655058100");
			     
			     WebElement EmailFiled = driver.findElement(By.xpath("//input[@type='email'][@id='email']"));//Email
			     EmailFiled.clear();
			     EmailFiled.sendKeys("aayushi9@mailinator.com");
			   
			     WebElement AddressFiled =driver.findElement(By.xpath("//input[@type='text'][@id='full_address']"));//Address
			     AddressFiled.clear();
			     AddressFiled.sendKeys("QA street city tester Update");
			     
			      SK.executeScript("window.scrollBy(0,500);");
		         Thread.sleep(500);
		         
			     driver.findElement(By.xpath("//select[@id='department']")).click();//Department * select button
			     Thread.sleep(1000);
			     driver.findElement(By.xpath("//*[@id=\"department\"]/option[3]")).click();//Department * value selection
			     Thread.sleep(5000);
			     SK.executeScript("window.scrollBy(0,200);");
				 Thread.sleep(1500);
			     driver.findElement(By.xpath("//button[text()='Update Account']")).click();//Update button
                 Thread.sleep(2000);
                 
                // driver.findElement(By.xpath("//a[contains(text(),'View Employee Profile')]")).click();//View Employee profile button
                 //Thread.sleep(2000);

                 driver.findElement(By.xpath("/html/body/ngb-modal-window/div/div/app-success/div/div/div/div[5]/button")).click();//Continue the update the profile button
                 Thread.sleep(2000);
			     SK.executeScript("window.scrollBy(0,200);");
		         Thread.sleep(4500);

		         WebElement fileInput1 = driver.findElement (By.xpath("//button[contains(text(),'ADD')]"));
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

		         driver.findElement(By.xpath("//button[text()='Save & Next']")).click();//save any next button of company logo page
		         Thread.sleep(2500);
		         driver.findElement(By.xpath("//input[@type='text'][@placeholder='Enter value to assign']")).sendKeys("5");//Assign Credits to Employee *
		         Thread.sleep(3000);
		         driver.findElement(By.xpath("//button[text()='Assign & Save']")).click();//save any next button of credit score assign page
		         Thread.sleep(10000);
		        
		        
		         JavascriptExecutor js = (JavascriptExecutor) driver;
		         js.executeScript("window.scrollTo(0,0);");

		         
		         driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-organization-base[1]/div[1]/div[1]/div[2]/div[1]/app-organization-employee[1]/div[1]/div[1]/div[2]/div[3]/div[1]/app-employee-card[1]/div[1]")).click();//select any employee profile to update
				 Thread.sleep(500);
				 System.out.print(true); 
			  
			     driver.findElement(By.xpath("//button[contains(text(),'More Option')]")).click();//more option button
			     Thread.sleep(500);
			     driver.findElement(By.xpath("//a[text()='Update Status']")).click();//Update Status Button
			     Thread.sleep(500);
			     driver.findElement(By.xpath("//button[text()='Update Status']")).click();//Main Update Status Button
			     Thread.sleep(500);
			     
			     SK.executeScript("window.scrollBy(0,300);");
				 Thread.sleep(1500);
				 driver.findElement(By.xpath("//button[text()='View Dashboard']")).click();//Dashboard Button
				 Thread.sleep(500);
				 driver.findElement(By.xpath("//text()[.='My Courses']/ancestor::li[1]")).click();//My courses tab
				 Thread.sleep(500);
				 driver.findElement(By.xpath("//a[contains(text(),'All Courses')]")).click();//All Course Sub Tab
				 Thread.sleep(500);
				 driver.findElement(By.xpath("//a[contains(text(),'In Progress')]")).click();//In-Progress Course Sub Tab
				 Thread.sleep(500);
				 driver.findElement(By.xpath("//a[contains(text(),'Finished')]")).click();//Finished Course Sub Tab
				 Thread.sleep(500);
				 driver.findElement(By.xpath("//span[text()='Wallet History']")).click();//Wallet History Sub Tab
				 Thread.sleep(1000);
				 driver.findElement(By.xpath("//text()[.='Orders']/ancestor::li[1]")).click();// Order Sub Tab
				 Thread.sleep(1000);
				 driver.findElement(By.xpath("//span[text()='Dashboard']")).click();// Dashboard Sub Tab
				 Thread.sleep(1000);
			     driver.navigate().back();
			     
			     SK.executeScript("window.scrollBy(0,300);");
				 Thread.sleep(1500);
				 driver.findElement(By.xpath("//button[contains(text(),'Allocate Credits')]	")).click();// Allocate Credits Tab
				 Thread.sleep(500);
				 driver.findElement(By.xpath("//input[@type='text'][@id='recipient-name']")).click();// Credit Field
				 Thread.sleep(500);
				 driver.findElement(By.xpath("//button[text()='Assign Credits']")).click();// Assign Credit
				 Thread.sleep(500);
				 driver.findElement(By.xpath("//button[contains(text(),'Assign Plan')]")).click();// Assign Plan Credit
				 Thread.sleep(500);
				 driver.findElement(By.xpath("//*[@class='bi bi-x-circle cross']")).click();// Cross Button
				 Thread.sleep(500);
				 
				 
	}
	
	private static void setClipboardData(String data) {
        StringSelection stringSelection = new StringSelection(data);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(stringSelection, null);
       
    }
}
