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

public class EmployeeUser2 {

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
		     driver.findElement(By.xpath("//input[@type='email'][@id='email']")).sendKeys("two@mailinator.com");//login Email Address 
		     Thread.sleep(500);
	         driver.findElement(By.xpath("//input[@type='password'][@id='exampleInputPassword1']")).sendKeys("Sipl@12345");//Login Password
		     Thread.sleep(500);
	       	 driver.findElement(By.xpath("//button[text()='LOG IN']")).click();//Log In button
			 Thread.sleep(4000);     		
	
				
//1. Dashboard Page 		
				 
     
                SK.executeScript("window.scrollBy(0,450);");
                Thread.sleep(1500);
                driver.findElement(By.xpath("//a[text()='View all']")).click(); //View all  Button of Coaches  	
                Thread.sleep(1500);
                driver.navigate().back();
                Thread.sleep(1500);
            
                SK.executeScript("window.scrollBy(0,650);");
                Thread.sleep(1500);
                driver.findElement(By.xpath("/html/body/app-root/app-individual-base/div/div[2]/div/app-individual-dashboard/div/div[2]/div[1]/div[4]/div/div[2]/div/div/div[1]/app-coaches-card/div/div/div/div/div[2]/a")).click(); //View Profile Button of Coaches for Your Help
                Thread.sleep(1500);
                driver.navigate().back();
                Thread.sleep(1000);  
                
               //driver.findElement(By.xpath("//div[@class='ng-star-inserted']//a[@class='btn btn-primary']")).click(); //Expenditure Report Hover Button
               //Not working
                
                
                
//2. Coaches               
                driver.findElement(By.xpath("//span[text()='Coaches']")).click(); //Coaches header	
                Thread.sleep(500);  
                
                WebElement inputField1 = driver.findElement(By.xpath("//input[@type='text'][@placeholder='Type here something..']"));//search filed clearance variable
                driver.findElement(By.xpath("//input[@type='text'][@placeholder='Type here something..']")).sendKeys("Test"); //search text	
                Thread.sleep(500);
                inputField1.clear();//clear the search field 
                Thread.sleep(500);
                driver.findElement(By.xpath("//span[text()='Coaches']")).click(); //Refresh the Coaches page
                
                
                driver.findElement(By.xpath("//text()[contains(.,'FILTER')]/ancestor::a[1]")).click(); //Filter Icon click	
                Thread.sleep(1500);
                driver.findElement(By.xpath("//button[contains(text(),'Category')]")).click(); //Category
                Thread.sleep(1000);
                driver.findElement(By.xpath("//button[contains(text(),'Consultation Mode')]")).click(); //Consultation Mode
                Thread.sleep(1000);
                driver.findElement(By.xpath("//button[contains(text(),'Location')]")).click(); //Location
                Thread.sleep(1000);
                driver.findElement(By.xpath("//button[contains(text(),'Rating')]")).click(); //Rating
                Thread.sleep(1500);
                

                
                driver.findElement(By.xpath("//button[contains(text(),'Category')]")).click(); //Category tab open 
                Thread.sleep(1000);
                
                WebElement checkbox1 = driver.findElement(By.xpath("//input[@type='checkbox'][@id='category10']"));//Mental Wellness
                Thread.sleep(550);
                checkbox1.click();
                Thread.sleep(500);
                checkbox1.click();
                Thread.sleep(1000);
                
                WebElement checkbox2 = driver.findElement(By.xpath("//input[@type='checkbox'][@id='category11']"));//Psychologist
                Thread.sleep(550);
                checkbox2.click();
                Thread.sleep(500);
                checkbox2.click();
                Thread.sleep(1000);
                
                WebElement checkbox3 = driver.findElement(By.xpath("//input[@type='checkbox'][@id='category12']"));//Psychiatrist
                Thread.sleep(550);
                checkbox3.click();
                Thread.sleep(500);
                checkbox3.click();
                Thread.sleep(1000);
                
                WebElement checkbox4 = driver.findElement(By.xpath("//input[@type='checkbox'][@id='category19']"));//Counselors
                Thread.sleep(550);
                checkbox4.click();
                Thread.sleep(500);
                checkbox4.click();
                Thread.sleep(1000);
                
                SK.executeScript("window.scrollBy(0,-550);");
                Thread.sleep(1000);                  
                driver.findElement(By.xpath("//button[contains(text(),'Category')]")).click(); //Category tab close
                Thread.sleep(1000);
                
                
                
                driver.findElement(By.xpath("//button[contains(text(),'Consultation Mode')]")).click(); //Consultation Mode Tab Open
                Thread.sleep(1000);
                
                WebElement checkbox5 = driver.findElement(By.xpath("//input[@type='checkbox'][@id='consultationMode1']"));//Virtual
                Thread.sleep(500);
                checkbox5.click();
                Thread.sleep(500);
                checkbox5.click();
                Thread.sleep(1000);
                
                WebElement checkbox6= driver.findElement(By.xpath("//input[@type='checkbox'][@id='consultationMode2']"));//In Person
                Thread.sleep(550);
                checkbox6.click();
                Thread.sleep(500);
                checkbox6.click();
                Thread.sleep(1000);
                
                SK.executeScript("window.scrollBy(0,-550);");
                Thread.sleep(1000); 
                driver.findElement(By.xpath("//button[contains(text(),'Consultation Mode')]")).click(); //Consultation Mode Tab close
                Thread.sleep(1000);
                
                
                
                driver.findElement(By.xpath("//button[contains(text(),'Location')]")).click(); //Location Tab Open
                Thread.sleep(1000);
                
                WebElement checkbox7= driver.findElement(By.xpath("//*[@id=\"location14\"]"));//Indore Location
                Thread.sleep(550);
                checkbox7.click();
                Thread.sleep(500);
                checkbox7.click();
                Thread.sleep(1000);
                
                WebElement checkbox8= driver.findElement(By.xpath("//*[@id=\"location52\"]")); //India Location
                Thread.sleep(550);
                checkbox8.click();
                Thread.sleep(500);
                checkbox8.click();
                Thread.sleep(1000);

                WebElement checkbox9= driver.findElement(By.xpath("//*[@id=\"location53\"]")); //Nepal Location
                Thread.sleep(550);
                checkbox9.click();
                Thread.sleep(500);
                checkbox9.click();
                Thread.sleep(1000);
                
                SK.executeScript("window.scrollBy(0,-550);");
                Thread.sleep(1000); 
                driver.findElement(By.xpath("//button[contains(text(),'Location')]")).click(); //Location Tab Close
                Thread.sleep(1000);
                
                
                
                driver.findElement(By.xpath("//button[contains(text(),'Rating')]")).click(); //Rating Tab Open 
                Thread.sleep(1500);
                WebElement checkbox10= driver.findElement(By.xpath("//*[@id=\"rating5\"]")); //5star rating 
                Thread.sleep(550);
                checkbox10.click();
                Thread.sleep(500);
                checkbox10.click();
                Thread.sleep(1000);
                
                WebElement checkbox11= driver.findElement(By.xpath("//*[@id=\"rating1\"]")); //1 star rating 
                Thread.sleep(550);
                checkbox11.click();
                Thread.sleep(500);
                checkbox11.click();
                Thread.sleep(3000);
                
                SK.executeScript("window.scrollBy(0,-550);");
                Thread.sleep(1000); 
                driver.findElement(By.xpath("//button[contains(text(),'Rating')]")).click(); //Rating Tab Close
                Thread.sleep(1000);
                
                SK.executeScript("window.scrollBy(0,-550);");
                Thread.sleep(1000); 
                driver.findElement(By.xpath("//text()[contains(.,'FILTER')]/ancestor::a[1]")).click(); //Filter Icon close	
                Thread.sleep(1500);
                SK.executeScript("window.scrollBy(0,530);");
                Thread.sleep(1000); 
                
                driver.findElement(By.xpath("/html/body/app-root/app-individual-base/div/div[2]/div/app-coaches/div/div[3]/div[2]/app-coaches-card/div/div/div/div/div[2]/a")).click(); //View Profile button of Coach Aashi Hardy	
                Thread.sleep(1000);
                SK.executeScript("window.scrollBy(0,450);");
                Thread.sleep(2000);                
                driver.findElement(By.xpath("//button[text()='Rate This Coach']")).click();// Rate the coach Profile button
                Thread.sleep(1000);
                driver.findElement(By.xpath("//button[text()='Cancel']")).click();// Cancel the coach Popup
                Thread.sleep(1000);
                
                
                driver.findElement(By.xpath("//button[text()='Rate This Coach']")).click();// Re-click the "Rate the coach Profile" button
                Thread.sleep(1000);
                driver.findElement(By.xpath("/html/body/ngb-modal-window/div/div/app-coach-rating/div[2]/form/div[1]/p-rating/div/span[5]")).click();// Rate the coach Popup
                Thread.sleep(1000);
                driver.findElement(By.xpath("//textarea[@id='description']")).sendKeys("Testing the couches profile is QA purpose");// Rate the coach Popup
                Thread.sleep(1000);
                driver.findElement(By.xpath("//button[text()='Submit']")).click();// Submit the coach Popup
                Thread.sleep(1000);
                
                driver.findElement(By.xpath("//button[text()='Book Session']")).click();//Book the session at the coach profile
                Thread.sleep(1000);
                SK.executeScript("window.scrollBy(0,350);");
                Thread.sleep(500);
                
                
 //Below code should be updated every time because only unique appointments will be created always               
              //change date  
//              driver.findElement(By.xpath("//tbody/tr[3]/td[7]/span[1]")).click();//Select the date for Booking the session at the coach profile
//              Thread.sleep(2000);
//                                    
//              driver.findElement(By.xpath("//body/app-root[1]/app-individual-base[1]/div[1]/div[2]/div[1]/app-book-session[1]/div[1]/div[3]/app-coach-availability[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]")).click();//Select the Time for Booking the session at the coach profile
//              Thread.sleep(1000);
//              
//              driver.findElement(By.xpath("/html/body/ngb-modal-window/div/div/div[3]/form/div/div/div[1]/div/div/div[2]/div[1]/div/fieldset/p-dropdown/div/div[2]")).click();//Select the Session Duration at session at session booking popup
//              Thread.sleep(2000); 
//              driver.findElement(By.xpath("//text()[.='60 Min']/ancestor::li[1]")).click();//Select the 60 mins 
//              Thread.sleep(2000); 
//              
//              driver.findElement(By.xpath("/html/body/ngb-modal-window/div/div/div[3]/form/div/div/div[1]/div/div/div[2]/div[2]/div/div[1]/p-dropdown/div/div[2]")).click();//Start Time*
//              Thread.sleep(2000); 
//              driver.findElement(By.xpath("//*[@id=\"pr_id_7_list\"]/p-dropdownitem[1]/li")).click();//Select the 6 hour 
//              Thread.sleep(2000); 
//              driver.findElement(By.xpath("/html/body/ngb-modal-window/div/div/div[3]/form/div/div/div[1]/div/div/div[2]/div[2]/div/div[2]/p-dropdown/div/div[2]")).click();//Select the mins
//              Thread.sleep(2000);  
//              driver.findElement(By.xpath("//*[@id=\"pr_id_8_list\"]/p-dropdownitem[1]/li")).click();// 00 mins 
//              Thread.sleep(2000); 
//            
//              SK.executeScript("window.scrollBy(0,450);");
//              Thread.sleep(1000);
//              driver.findElement(By.xpath("//button[contains(text(),'Confirm')]")).click();//Confirm button
//              Thread.sleep(2000); 
              

              driver.findElement(By.xpath("//body/app-root[1]/app-individual-base[1]/div[1]/div[2]/div[1]/app-book-session[1]/div[1]/div[3]/app-coach-availability[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]")).click();//Again Select the Time for Booking the session at the coach profile
              SK.executeScript("window.scrollBy(0,450);");
              Thread.sleep(1000);
              driver.findElement(By.xpath("//button[text()='Cancel']")).click();//Cancel button

               SK.executeScript("window.scrollBy(0,-450);");
               Thread.sleep(1000);
               driver.findElement(By.xpath("//a[contains(text(),'Back to Coach Profile')]")).click();//Back To Coach Profile button
               Thread.sleep(500);
               driver.findElement(By.xpath("//a[contains(text(),'Back to All Coaches')]")).click();//Back To All Coaches button
               Thread.sleep(1500);
               
               
               
              
//3.Clinical Practitioners
               
               driver.findElement(By.xpath("//text()[.='Clinical Practitioners']/ancestor::li[1]")).click();//Clinical Practitioner header
               Thread.sleep(500);
               
               WebElement inputField2 = driver.findElement(By.xpath("//input[@placeholder='Type here something..']"));//search filed clearance variable

               driver.findElement(By.xpath("//input[@placeholder='Type here something..']")).sendKeys("Test"); //search text	
               Thread.sleep(1000);
               inputField2.clear();//clear the search field 
               Thread.sleep(1000);
               driver.findElement(By.xpath("//text()[.='Clinical Practitioners']/ancestor::li[1]")).click(); //Refresh the Clinical Practitioner page	
               
               driver.findElement(By.xpath("//text()[contains(.,'FILTER')]/ancestor::a[1]")).click(); //Filter Icon click	
               Thread.sleep(1500);
               driver.findElement(By.xpath("//button[contains(text(),'Category')]")).click(); //Category
               Thread.sleep(1000);
               driver.findElement(By.xpath("//button[contains(text(),'Consultation Mode')]")).click(); //Consultation Mode
               Thread.sleep(1000);
               driver.findElement(By.xpath("//button[contains(text(),'Location')]")).click(); //Location
               Thread.sleep(1000);
               driver.findElement(By.xpath("//button[contains(text(),'Rating')]")).click(); //Rating
               Thread.sleep(1500);
               
               driver.findElement(By.xpath("//button[contains(text(),'Category')]")).click(); //Category tab open 
               Thread.sleep(1000);
               
               WebElement checkbox12 = driver.findElement(By.xpath("//input[@type='checkbox'][@id='category10']"));//Mental Wellness
               Thread.sleep(550);
               checkbox12.click();
               Thread.sleep(500);
               checkbox12.click();
               Thread.sleep(1000);
               
               WebElement checkbox13 = driver.findElement(By.xpath("//input[@type='checkbox'][@id='category11']"));//Psychologist
               Thread.sleep(550);
               checkbox13.click();
               Thread.sleep(500);
               checkbox13.click();
               Thread.sleep(1000);
               
               WebElement checkbox14 = driver.findElement(By.xpath("//input[@type='checkbox'][@id='category12']"));//Psychiatrist
               Thread.sleep(550);
               checkbox14.click();
               Thread.sleep(500);
               checkbox14.click();
               Thread.sleep(1000);
               
               WebElement checkbox15 = driver.findElement(By.xpath("//input[@type='checkbox'][@id='category19']"));//Counselors
               Thread.sleep(550);
               checkbox15.click();
               Thread.sleep(500);
               checkbox15.click();
               Thread.sleep(1000);
               
               SK.executeScript("window.scrollBy(0,-550);");
               Thread.sleep(1000);                  
               driver.findElement(By.xpath("//button[contains(text(),'Category')]")).click(); //Category tab close
               Thread.sleep(1000);
               
               
               
               
               driver.findElement(By.xpath("//button[contains(text(),'Consultation Mode')]")).click(); //Consultation Mode Tab Open
               Thread.sleep(1000);
               
               WebElement checkbox16 = driver.findElement(By.xpath("//input[@type='checkbox'][@id='consultationMode1']"));//Virtual
               Thread.sleep(500);
               checkbox16.click();
               Thread.sleep(500);
               checkbox16.click();
               Thread.sleep(1000);
               
               WebElement checkbox17= driver.findElement(By.xpath("//input[@type='checkbox'][@id='consultationMode2']"));//In Person
               Thread.sleep(550);
               checkbox17.click();
               Thread.sleep(500);
               checkbox17.click();
               Thread.sleep(1000);
               
               SK.executeScript("window.scrollBy(0,-550);");
               Thread.sleep(1000); 
               driver.findElement(By.xpath("//button[contains(text(),'Consultation Mode')]")).click(); //Consultation Mode Tab close
               Thread.sleep(1000);
               
               
               
               
               driver.findElement(By.xpath("//button[contains(text(),'Location')]")).click(); //Location Tab Open
               Thread.sleep(1000);
               
               WebElement checkbox18= driver.findElement(By.xpath("//*[@id=\"location14\"]"));//Indore Location
               Thread.sleep(550);
               checkbox18.click();
               Thread.sleep(500);
               checkbox18.click();
               Thread.sleep(1000);
               
               WebElement checkbox19= driver.findElement(By.xpath("//*[@id=\"location52\"]")); //India Location
               Thread.sleep(550);
               checkbox19.click();
               Thread.sleep(500);
               checkbox19.click();
               Thread.sleep(1000);

               WebElement checkbox20= driver.findElement(By.xpath("//*[@id=\"location53\"]")); //Nepal Location
               Thread.sleep(550);
               checkbox20.click();
               Thread.sleep(500);
               checkbox20.click();
               Thread.sleep(1000);
               
               SK.executeScript("window.scrollBy(0,-550);");
               Thread.sleep(1000); 
               driver.findElement(By.xpath("//button[contains(text(),'Location')]")).click(); //Location Tab Close
               Thread.sleep(1000);
               
               
               
               driver.findElement(By.xpath("//button[contains(text(),'Rating')]")).click(); //Rating Tab Open 
               Thread.sleep(1500);
               WebElement checkbox21= driver.findElement(By.xpath("//*[@id=\"rating5\"]")); //5star rating 
               Thread.sleep(550);
               checkbox21.click();
               Thread.sleep(500);
               checkbox21.click();
               Thread.sleep(1000);
               
               WebElement checkbox22= driver.findElement(By.xpath("//*[@id=\"rating1\"]")); //1 star rating 
               Thread.sleep(550);
               checkbox22.click();
               Thread.sleep(500);
               checkbox22.click();
               Thread.sleep(3000);
               
               SK.executeScript("window.scrollBy(0,-550);");
               Thread.sleep(1000); 
               driver.findElement(By.xpath("//button[contains(text(),'Rating')]")).click(); //Rating Tab Close
               Thread.sleep(1000);
               
               
               
               SK.executeScript("window.scrollBy(0,-550);");
               Thread.sleep(1000); 
               driver.findElement(By.xpath("//text()[contains(.,'FILTER')]/ancestor::a[1]")).click(); //Filter Icon close	
               Thread.sleep(1500);
               SK.executeScript("window.scrollBy(0,530);");
               Thread.sleep(1000); 
               
               driver.findElement(By.xpath("/html/body/app-root/app-individual-base/div/div[2]/div/app-clinical-practitioners/div/div[3]/div[1]/app-coaches-card/div/div/div/div/div[2]/a")).click(); //View Profile button of Coach Aashi Hardy	
               Thread.sleep(1000);
               SK.executeScript("window.scrollBy(0,450);");
               Thread.sleep(2000);                
               driver.findElement(By.xpath("//button[text()='Rate This Coach']")).click();// Rate the coach Profile button
               Thread.sleep(1000);
               driver.findElement(By.xpath("//button[text()='Cancel']")).click();// Cancel the coach Popup
               Thread.sleep(1000);
              
               
               driver.findElement(By.xpath("//button[text()='Rate This Coach']")).click();// Re-click the "Rate the coach Profile" button
               Thread.sleep(1000);
               driver.findElement(By.xpath("/html/body/ngb-modal-window/div/div/app-coach-rating/div[2]/form/div[1]/p-rating/div/span[5]")).click();// Rate the coach Popup
               Thread.sleep(1000);
               driver.findElement(By.xpath("//textarea[@id='description']")).sendKeys("Testing the couches profile is QA purpose");// Rate the coach Popup
               Thread.sleep(1000);
               driver.findElement(By.xpath("//button[text()='Submit']")).click();// Submit the coach Popup
               Thread.sleep(1000);
               
               driver.findElement(By.xpath("//button[text()='Book Session']")).click();//Book the session at the coach profile
               Thread.sleep(1000);
               SK.executeScript("window.scrollBy(0,350);");
               Thread.sleep(500); 
               
               
//Below code should be updated every time because only unique appointments will be created always               
       //change date 
               
//               driver.findElement(By.xpath("//tbody/tr[3]/td[7]/span[1]")).click();//Select the date for Booking the session at the coach profile
//               Thread.sleep(2000);
//                                     
//               driver.findElement(By.xpath("//body/app-root[1]/app-individual-base[1]/div[1]/div[2]/div[1]/app-book-session[1]/div[1]/div[3]/app-coach-availability[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]")).click();//Select the Time for Booking the session at the coach profile
//               Thread.sleep(1000);
//               
//               driver.findElement(By.xpath("/html/body/ngb-modal-window/div/div/div[3]/form/div/div/div[1]/div/div/div[2]/div[1]/div/fieldset/p-dropdown/div/div[2]")).click();//Select the Session Duration at session at session booking popup
//               Thread.sleep(2000); 
//               driver.findElement(By.xpath("//text()[.='60 Min']/ancestor::li[1]")).click();//Select the 60 mins 
//               Thread.sleep(2000); 
//               
//               driver.findElement(By.xpath("/html/body/ngb-modal-window/div/div/div[3]/form/div/div/div[1]/div/div/div[2]/div[2]/div/div[1]/p-dropdown/div/div[2]")).click();//Start Time*
//               Thread.sleep(2000); 
//               driver.findElement(By.xpath("//text()[.='07 AM']/ancestor::li[1]")).click();//Select the 6 hour 
//               Thread.sleep(2000); 
//               driver.findElement(By.xpath("/html/body/ngb-modal-window/div/div/div[3]/form/div/div/div[1]/div/div/div[2]/div[2]/div/div[2]/p-dropdown/div/div[2]")).click();//Select the mins
//               Thread.sleep(2000);  
//               driver.findElement(By.xpath("//text()[.='30']/ancestor::li[1]")).click();// 00 mins 
//               Thread.sleep(2000); 
//             
//               SK.executeScript("window.scrollBy(0,450);");
//               Thread.sleep(1000);
//               driver.findElement(By.xpath("//button[contains(text(),'Confirm')]")).click();//Confirm button
//               Thread.sleep(2000); 
//                     
          
               driver.findElement(By.xpath("//body/app-root[1]/app-individual-base[1]/div[1]/div[2]/div[1]/app-book-session[1]/div[1]/div[3]/app-coach-availability[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]")).click();//Again Select the Time for Booking the session at the coach profile
               SK.executeScript("window.scrollBy(0,450);");
               Thread.sleep(1000);
               driver.findElement(By.xpath("//button[text()='Cancel']")).click();//Cancel button

                SK.executeScript("window.scrollBy(0,-450);");
                Thread.sleep(1000);
                driver.findElement(By.xpath("//a[contains(text(),'Back to Coach Profile')]")).click();//Back To Coach Profile button
                Thread.sleep(1500);
                driver.findElement(By.xpath("//a[contains(text(),'Back to All Clinical Practitioners')]")).click();//Back to All Clinical Practitioners button
                Thread.sleep(2000);
               
                
  //4.My Sessions             

        		driver.findElement(By.xpath("//text()[.='My Sessions']/ancestor::li[1]")).click();// Session Tab
        		Thread.sleep(2000);
        		driver.findElement(By.xpath("//a[contains(text(),'Completed Sessions')]")).click();// Completed sessions button
        		Thread.sleep(2000);
        		driver.findElement(By.xpath("//text()[.='My Sessions']/ancestor::li[1]")).click();// Session Tab
        		Thread.sleep(2000);
        		driver.findElement(By.xpath("//text()[.='20']/ancestor::td[1]")).click();// Calendar button
        		Thread.sleep(2000);
        		driver.findElement(By.xpath("//a[contains(text(),'Upcoming Sessions')]")).click();// Upcoming sessions button
        		Thread.sleep(2000);
        		SK.executeScript("window.scrollBy(0,250);");
        		Thread.sleep(500);
        		driver.findElement(By.xpath("//button[text()='Book a Session']")).click();// Book a Session button
        		Thread.sleep(2000);        
                driver.navigate().back();
        		Thread.sleep(2000);        
		
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
					driver.findElement(By.xpath("//span[text()='1']")).click();// Select End Date
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
		         
		         
		         

		         WebElement fileInput1 = driver.findElement (By.xpath("//button[contains(text(),'REPLACE')]"));//REPLACE Button
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
