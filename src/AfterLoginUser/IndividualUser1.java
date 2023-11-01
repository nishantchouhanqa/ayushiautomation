package AfterLoginUser;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class IndividualUser1 {

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

		
// Login		
				driver.findElement(By.xpath("//input[@type='email'][@id='email']")).sendKeys("Automation.useraayushi@mailinator.com");//login Email Address 
				Thread.sleep(500);
			    driver.findElement(By.xpath("//input[@type='password'][@id='exampleInputPassword1']")).sendKeys("Sipl@12345");//Login Password
				Thread.sleep(500);
				driver.findElement(By.xpath("//button[text()='LOG IN']")).click();//Log In button
				Thread.sleep(4000);     		
	
				
//1. Dashboard Page 		
				 
             		    
				driver.findElement(By.xpath("//button[text()='Add Amount']")).click(); //Add Amount Button
				driver.findElement(By.xpath("/html/body")).sendKeys("15000"); //Enter amount
				Thread.sleep(1000);
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

                
                
                SK.executeScript("window.scrollBy(0,350);");
                Thread.sleep(1000);
                driver.findElement(By.xpath("//a[text()='View all']")).click(); //View all  Button of Coaches  	
                Thread.sleep(1500);
                driver.navigate().back();
                Thread.sleep(1500);
            
                SK.executeScript("window.scrollBy(0,550);");
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
        
                
                
	}

}
