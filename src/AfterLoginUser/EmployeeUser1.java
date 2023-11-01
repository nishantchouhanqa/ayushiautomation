package AfterLoginUser;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EmployeeUser1 {

	public static void main(String[] args) throws InterruptedException {

		
		WebDriverManager.chromedriver().setup();

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);

		driver.get("https://staging-fe.maximizeu.life/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		JavascriptExecutor DK = (JavascriptExecutor) driver;
	
		driver.findElement(By.xpath("//button[contains(text(),'LOGIN/REGISTER')]")).click();
		Thread.sleep(3000);
        DK.executeScript("window.scrollBy(0,550);");
		Thread.sleep(500);

		
// Login		
				driver.findElement(By.xpath("//input[@type='email'][@id='email']")).sendKeys("two@mailinator.com");//login Email Address 
				Thread.sleep(500);
			    driver.findElement(By.xpath("//input[@type='password'][@id='exampleInputPassword1']")).sendKeys("Sipl@12345");//Login Password
				Thread.sleep(500);
				driver.findElement(By.xpath("//button[text()='LOG IN']")).click();//Log In button
				Thread.sleep(4000);    		
		
				driver.findElement(By.xpath("//text()[.='Notification']/ancestor::button[1]")).click();//Notification bell 
				Thread.sleep(2500); 

//Courses
				
				driver.findElement(By.xpath("//button[contains(text(),'COURSES')]")).click();//Courses Tab 
				Thread.sleep(3000); 
				DK.executeScript("window.scrollBy(0,550);");
				Thread.sleep(1500);
				
				driver.findElement(By.xpath("//div[contains(text(),'Fundamentals of leading a balanced life')]")).click(); //Fundamentals of leading a balanced life
			    System.out.println("chala kya ?");
				Thread.sleep(1500);
			    
			    driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-public-base[1]/app-courses[1]/div[1]/div[1]/div[1]/div[1]")).click();//All Button
				Thread.sleep(1500);	    
			    
			    driver.findElement(By.xpath("//div[contains(text(),'Health & Wellness')]")).click();//Health and Wellness 
				Thread.sleep(1000);
			   
				driver.findElement(By.xpath("//div[contains(text(),'HR & Workplace Safety')]")).click();// HR & Workplace Safety
				Thread.sleep(1000);
			    
				driver.findElement(By.xpath("//div[contains(text(),'K-12 & EDUCATION COURSES')]")).click();//K-12 & EDUCATION COURSES
				Thread.sleep(1000);

				driver.findElement(By.xpath("//div[contains(text(),'LEADERSHIP & TEAM MANAGEMENT')]")).click();//LEADERSHIP & TEAM MANAGEMENT
				Thread.sleep(1000);
				
				driver.findElement(By.xpath("//div[contains(text(),'Sales And Negotiation')]")).click();//Sales And Negotiation
				Thread.sleep(1500);
				
				driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-public-base[1]/app-courses[1]/div[1]/div[1]/div[1]/div[1]")).click();//All Button
				Thread.sleep(2500);	   
				
				DK.executeScript("window.scrollBy(0,350);");
		        Thread.sleep(4000);

		        //if the below  course is already purchased by the user please update the above code for new product 
		        driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-public-base[1]/app-courses[1]/div[1]/div[1]/div[2]/div[6]/div[1]/button[1]")).click();//Card
				Thread.sleep(1500);
				
				driver.findElement(By.xpath("//a[text()='Course overview video']")).click();//Courses Overview Video Link 
				Thread.sleep(1500);
				driver.navigate().back();
				Thread.sleep(3000);
				
				DK.executeScript("window.scrollBy(0,-750);");
		        Thread.sleep(9000);
		        
		        DK.executeScript("window.scrollBy(0,290);");
		        Thread.sleep(3000);
				
		        driver.findElement(By.xpath("//li[2]//button[1]")).click();//Curriculum button
				Thread.sleep(1000);
				
				driver.findElement(By.xpath("//button[text()='Create Urgency']")).click();// Accordion button 1
				Thread.sleep(1500);
				
				driver.findElement(By.xpath("//button[text()=concat('If you don',\"'\",'t take care of your client, your competitor will')]")).click();// Accordion button 2
				Thread.sleep(2000);
		        
				driver.findElement(By.xpath("//button[text()='Instructor']")).click();//Instructor
			    Thread.sleep(2000);
					
		        driver.findElement(By.xpath("//button[text()='Buy Now']")).click();//Buy Now Button
		      	Thread.sleep(3000);
		      	
		      	DK.executeScript("window.scrollBy(0,-700);");
		        Thread.sleep(2500);
		        DK.executeScript("window.scrollBy(0,290);");
		        Thread.sleep(2500);       
		        //if the above  course is already purchased by the user please update the above code for new product 
		        		        
		        
		        
		        driver.findElement(By.xpath("/html/body/app-root/app-public-base/app-checkout/div/form/div/div[1]/div/div[1]/div[1]/input")).sendKeys("Aayushi");//First NameField 
		      	Thread.sleep(2000);	
		      	driver.findElement(By.xpath("/html/body/app-root/app-public-base/app-checkout/div/form/div/div[1]/div/div[1]/div[2]/input")).sendKeys("Automation");//Last NameField 
			    Thread.sleep(2000);			  
		        driver.findElement(By.xpath("//input[@type='text'][@placeholder='Company Name']")).sendKeys("Test Automation is purpose");//Company Name (optional) Field 
		      	Thread.sleep(4000);	      	
				
		        driver.findElement(By.xpath("/html/body/app-root/app-public-base/app-checkout/div/form/div/div[1]/div/div[3]/div[1]/select")).click();//Country / Region *
		      	Thread.sleep(1000);
                driver.findElement(By.xpath("/html/body/app-root/app-public-base/app-checkout/div/form/div/div[1]/div/div[3]/div[1]/select/option[2]")).click();//Country selected Afghanistan 
		      	Thread.sleep(1000);
		      	driver.findElement(By.xpath("/html/body/app-root/app-public-base/app-checkout/div/form/div/div[1]/div/div[3]/div[2]/fieldset/select")).click();//State 
		      	Thread.sleep(1000);
		      	driver.findElement(By.xpath("/html/body/app-root/app-public-base/app-checkout/div/form/div/div[1]/div/div[3]/div[2]/fieldset/select/option[2]")).click();//Select the State 
		      	Thread.sleep(1000);
		      	
		      	driver.findElement(By.xpath("/html/body/app-root/app-public-base/app-checkout/div/form/div/div[1]/div/div[4]/div[1]/fieldset/select")).click();//City *
		      	Thread.sleep(1000);
		      	driver.findElement(By.xpath("/html/body/app-root/app-public-base/app-checkout/div/form/div/div[1]/div/div[4]/div[1]/fieldset/select/option[2]")).click();//Select the City *
		      	Thread.sleep(1000);
		      	
		      	
//		        driver.findElement(By.xpath("//input[@type='text'][@placeholder='ZIP Code']")).sendKeys("452001");//Zip Code 
//		      	Thread.sleep(1000);
//		        driver.findElement(By.xpath("//input[@type='text'][@placeholder='Billing Address']")).sendKeys("QA street Tester City Of Afghanistan");//Billing Address
//		      	Thread.sleep(1000);
//		      	driver.findElement(By.xpath("//input[@type='email'][@placeholder='Email Address']")).sendKeys("aayushi@mailinator.com");//Email Address
//		      	Thread.sleep(1000);
//		        driver.findElement(By.xpath("//*[@placeholder='Phone']	")).sendKeys("4522122112");// Phone
//		      	Thread.sleep(1000);
		      	
		      	
		        DK.executeScript("window.scrollBy(0,450);");
		        Thread.sleep(3000);
		      	
		      	 DK.executeScript("window.scrollBy(0,-750);");
			     Thread.sleep(2500);
			     DK.executeScript("window.scrollBy(0,370);");
			     Thread.sleep(2500);
		      	
		      	driver.findElement(By.xpath("//*[@id=\"payment\"]/p-accordion/div/p-accordiontab[1]")).click();//Pay Via Wallet
		      	Thread.sleep(3000);
		      	
		      	driver.findElement(By.xpath("//*[@id=\"payment\"]/p-accordion/div/p-accordiontab[1]")).click();//Pay Via Wallet
		      	Thread.sleep(2000);

			    DK.executeScript("window.scrollBy(0,450);");
			    Thread.sleep(2500);
		      	driver.findElement(By.xpath("//input[@type='checkbox'][@id='terms']")).click();//Terms NAd Condition check-box
		      	Thread.sleep(1800);	
		      	
		    	driver.findElement(By.xpath("//button[text()='Pay Via Wallet']")).click();//Pay Via Wallet
		      	Thread.sleep(2500);
			      	
		      	
//View The placed orders at the Orders Page 
//		      	
//		    	driver.findElement(By.xpath("//*[@id=\"pr_id_3-table\"]/tbody/tr[1]/td[5]/p-button/button/span")).click();//View Button
//		      	Thread.sleep(1500);
//				
//		       	driver.findElement(By.xpath("//button[@class='p-ripple p-element ng-tns-c79-4 p-dialog-header-icon p-dialog-header-maximize p-link ng-star-inserted']")).click();//Full-View mode Button
//		      	Thread.sleep(1500);
//				
//		    	driver.findElement(By.xpath("//button[@class='p-ripple p-element ng-tns-c79-4 p-dialog-header-icon p-dialog-header-close p-link ng-star-inserted']")).click();//Cross Button
//		      	Thread.sleep(1500);     	
		      	
		      	
		      	
//PODCAST		      	
     	      	driver.findElement(By.xpath("//button[contains(text(),'PODCAST')]")).click();//PODCAST Tab 
				Thread.sleep(3000); 
				DK.executeScript("window.scrollBy(0,600);");
				Thread.sleep(1500);
				
				driver.findElement(By.xpath("//a[@class='btn btn-primary mr-5']")).click();//Buy Podcast Bundle
			    Thread.sleep(2000); 
			    
			    DK.executeScript("window.scrollBy(0,-750);");
			    Thread.sleep(1800);
			    
			    DK.executeScript("window.scrollBy(0,350);");
			    Thread.sleep(2000);
			    
				
				
			    driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Aayushihardia");
				driver.findElement(By.xpath("//input[@type='email']")).sendKeys("Automation.useraayushi@mailinator.com");
				driver.findElement(By.xpath("//span[4]//staricon[1]//*[name()='svg']")).click();//rating
				driver.findElement(By.xpath("//textarea[@class='form-control ng-untouched ng-pristine ng-invalid']")).sendKeys("Test is doing for testing purpose, Thank You for the Support.");
			    Thread.sleep(1000); 
			    
			    DK.executeScript("window.scrollBy(0,750)", "");
			    Thread.sleep(500);
				driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();//Submit button
			    
				JavascriptExecutor js = (JavascriptExecutor) driver;

		        // Scroll to the top of the page
		        js.executeScript("window.scrollTo(0,-750);");
			    Thread.sleep(2000);

				DK.executeScript("window.scrollBy(0,400)", "");
				Thread.sleep(2000);
				
				driver.findElement(By.xpath("//text()[contains(.,'Add to cart')]/ancestor::button[1]")).click();//Add To Cart button
				Thread.sleep(1000);

				driver.findElement(By.xpath("//button[contains(text(),'Proceed to checkout')]")).click();//Proceed to checkout button
		        Thread.sleep(1000);
				
		        driver.findElement(By.xpath("/html/body/app-root/app-public-base/app-checkout/div/form/div/div[1]/div/div[1]/div[1]/input")).sendKeys("Aayushi");//First NameField 
		      	Thread.sleep(2000);	
		      	driver.findElement(By.xpath("/html/body/app-root/app-public-base/app-checkout/div/form/div/div[1]/div/div[1]/div[2]/input")).sendKeys("Automation");//Last NameField 
			    Thread.sleep(2000);	
		        driver.findElement(By.xpath("//input[@type='text'][@placeholder='Company Name']")).sendKeys("Test Automation is purpose");//Company Name (optional) Field 
		      	Thread.sleep(4000);	      	
				
		        driver.findElement(By.xpath("/html/body/app-root/app-public-base/app-checkout/div/form/div/div[1]/div/div[3]/div[1]/select")).click();//Country / Region *
		      	Thread.sleep(1000);
                driver.findElement(By.xpath("/html/body/app-root/app-public-base/app-checkout/div/form/div/div[1]/div/div[3]/div[1]/select/option[2]")).click();//Country selected Afghanistan 
		      	Thread.sleep(1000);
		      	driver.findElement(By.xpath("/html/body/app-root/app-public-base/app-checkout/div/form/div/div[1]/div/div[3]/div[2]/fieldset/select")).click();//State 
		      	Thread.sleep(1000);
		      	driver.findElement(By.xpath("/html/body/app-root/app-public-base/app-checkout/div/form/div/div[1]/div/div[3]/div[2]/fieldset/select/option[2]")).click();//Select the State 
		      	Thread.sleep(1000);
		      	
		      	driver.findElement(By.xpath("/html/body/app-root/app-public-base/app-checkout/div/form/div/div[1]/div/div[4]/div[1]/fieldset/select")).click();//City *
		      	Thread.sleep(1000);
		      	driver.findElement(By.xpath("/html/body/app-root/app-public-base/app-checkout/div/form/div/div[1]/div/div[4]/div[1]/fieldset/select/option[2]")).click();//Select the City *
		      	Thread.sleep(1000);
		      	
		      	
//		        driver.findElement(By.xpath("//input[@type='text'][@placeholder='ZIP Code']")).sendKeys("452001");//Zip Code 
//		      	Thread.sleep(1000);
//		        driver.findElement(By.xpath("//input[@type='text'][@placeholder='Billing Address']")).sendKeys("QA street Tester City Of Afghanistan");//Address
//		      	Thread.sleep(1000);
//		      	driver.findElement(By.xpath("//input[@type='email'][@placeholder='Email Address']")).sendKeys("aayushi@mailinator.com");//Email Address
//	         	Thread.sleep(1000);
//		        driver.findElement(By.xpath("//*[@placeholder='Phone']	")).sendKeys("4522122112");//Phone Number
//		      	Thread.sleep(1000);
     
		        DK.executeScript("window.scrollBy(0,480);");
		        Thread.sleep(2500);
		     
		      	
		      	 DK.executeScript("window.scrollBy(0,-750);");
			     Thread.sleep(2500);
			     DK.executeScript("window.scrollBy(0,370);");
			     Thread.sleep(2500);
		      	
		      	driver.findElement(By.xpath("//*[@id=\"payment\"]/p-accordion/div/p-accordiontab[1]")).click();//Pay Via Wallet
		      	Thread.sleep(3000);
		      	
		     	driver.findElement(By.xpath("//*[@id=\"payment\"]/p-accordion/div/p-accordiontab[1]")).click();//Re-click Pay Via Wallet
		      	Thread.sleep(1800);

			    DK.executeScript("window.scrollBy(0,450);");
			    Thread.sleep(2800);
		      	driver.findElement(By.xpath("//input[@type='checkbox'][@id='terms']")).click();//Terms NAd Condition check-box
		      	Thread.sleep(2000);	

		    	driver.findElement(By.xpath("//button[text()='Pay Via Wallet']")).click();//Pay Via Wallet+Payment Button
		      	Thread.sleep(2500);
		      			      	
//Videos 
		      	
		      	driver.findElement(By.xpath("//button[contains(text(),'VIDEOS')]")).click();//PODCAST Tab 
				Thread.sleep(3500); 
				DK.executeScript("window.scrollBy(0,-750);");
				Thread.sleep(3000); 
				DK.executeScript("window.scrollBy(0,2050);");
				Thread.sleep(7000); 	
				
				driver.findElement(By.xpath("/html/body/app-root/app-public-base/app-videos/div/div[3]/div[2]/div/a")).click();// Video Bundle Button
				Thread.sleep(1000);                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     

			
				DK.executeScript("window.scrollBy(0,-750);");
				Thread.sleep(2500);
				
				DK.executeScript("window.scrollBy(0,550);");
				Thread.sleep(3000);
					
	            driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Aayushihardia");
				driver.findElement(By.xpath("//input[@type='email']")).sendKeys("Automation.useraayushi@mailinator.com");
				driver.findElement(By.xpath("//body//app-root//span[4]")).click();//rating
				driver.findElement(By.xpath("//textarea[@id='description']")).sendKeys("Test is doing for testing purpose, Thank You for the Support.");
				Thread.sleep(2000);

				    
				DK.executeScript("window.scrollBy(0,750)", "");
				Thread.sleep(500);
			    driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();//Submit button
				    
				JavascriptExecutor js1 = (JavascriptExecutor) driver;
	
			    // Scroll to the top of the page
			    js1.executeScript("window.scrollTo(0,-750);");
			    Thread.sleep(2000);
				DK.executeScript("window.scrollBy(0,400)", "");
				Thread.sleep(2000);
					
				driver.findElement(By.xpath("//text()[contains(.,'Add to cart')]/ancestor::button[1]")).click();//Add To Cart button
				Thread.sleep(1000);
				
				driver.findElement(By.xpath("//button[@class='checkout-button btn btn-primary alt ng-star-inserted']")).click();//Proceed to checkout button
			    Thread.sleep(500);
		
			    driver.findElement(By.xpath("/html/body/app-root/app-public-base/app-checkout/div/form/div/div[1]/div/div[1]/div[1]/input")).sendKeys("Aayushi");//First NameField 
		      	Thread.sleep(2000);	
		      	driver.findElement(By.xpath("/html/body/app-root/app-public-base/app-checkout/div/form/div/div[1]/div/div[1]/div[2]/input")).sendKeys("Automation");//Last NameField 
			    Thread.sleep(2000);	
			    driver.findElement(By.xpath("//input[@type='text'][@placeholder='Company Name']")).sendKeys("Test Automation is purpose");//Company Name (optional) Field 
		      	Thread.sleep(4000);	      	
				
		        driver.findElement(By.xpath("/html/body/app-root/app-public-base/app-checkout/div/form/div/div[1]/div/div[3]/div[1]/select")).click();//Country / Region *
		      	Thread.sleep(1000);
                driver.findElement(By.xpath("/html/body/app-root/app-public-base/app-checkout/div/form/div/div[1]/div/div[3]/div[1]/select/option[2]")).click();//Country selected Afghanistan 
		      	Thread.sleep(1000);
		      	driver.findElement(By.xpath("/html/body/app-root/app-public-base/app-checkout/div/form/div/div[1]/div/div[3]/div[2]/fieldset/select")).click();//State 
		      	Thread.sleep(1000);
		      	driver.findElement(By.xpath("/html/body/app-root/app-public-base/app-checkout/div/form/div/div[1]/div/div[3]/div[2]/fieldset/select/option[2]")).click();//Select the State 
		      	Thread.sleep(1000);
		      	
		      	driver.findElement(By.xpath("/html/body/app-root/app-public-base/app-checkout/div/form/div/div[1]/div/div[4]/div[1]/fieldset/select")).click();//City *
		      	Thread.sleep(1000);
		      	driver.findElement(By.xpath("/html/body/app-root/app-public-base/app-checkout/div/form/div/div[1]/div/div[4]/div[1]/fieldset/select/option[2]")).click();//Select the City *
		      	Thread.sleep(1000);
		      	
		      	
//		        driver.findElement(By.xpath("//input[@type='text'][@placeholder='ZIP Code']")).sendKeys("452001");//Zip Code 
//		      	Thread.sleep(1000);
//		        driver.findElement(By.xpath("//input[@type='text'][@placeholder='Billing Address']")).sendKeys("QA street Tester City Of Afghanistan");//Address
//		      	Thread.sleep(1000);
//		      	driver.findElement(By.xpath("//input[@type='email'][@placeholder='Email Address']")).sendKeys("aayushi@mailinator.com");//Email Address
//		      	Thread.sleep(1000);
//		        driver.findElement(By.xpath("//*[@placeholder='Phone']	")).sendKeys("4522122112");//Phone Number
//		      	Thread.sleep(1000);
     
		        DK.executeScript("window.scrollBy(0,480);");
		        Thread.sleep(2500);
		      	
		    
		      	
		      	DK.executeScript("window.scrollBy(0,-750);");
			    Thread.sleep(2500);
			    DK.executeScript("window.scrollBy(0,370);");
			    Thread.sleep(2500);
		      	
		      	driver.findElement(By.xpath("//*[@id=\"payment\"]/p-accordion/div/p-accordiontab[1]")).click();//Pay Via Wallet
		      	Thread.sleep(2000);
		     	driver.findElement(By.xpath("//*[@id=\"payment\"]/p-accordion/div/p-accordiontab[1]")).click();//Pay Via Wallet
		      	Thread.sleep(1800);

			    DK.executeScript("window.scrollBy(0,450);");
			    Thread.sleep(2500);
		      	driver.findElement(By.xpath("//input[@type='checkbox'][@id='terms']")).click();//Terms NAd Condition check-box
		      	Thread.sleep(1800);	

		    	driver.findElement(By.xpath("//button[text()='Pay Via Wallet']")).click();//Pay Via Wallet+Payment Button
		      	Thread.sleep(3000);
		
		      	
//Products 
		      	
		      	driver.findElement(By.xpath("//button[contains(text(),'PRODUCTS')]")).click(); // Product button
				Thread.sleep(1000);
				 
				DK.executeScript("window.scrollBy(0,350);");
				Thread.sleep(500);
				
				driver.findElement(By.xpath("/html/body/app-root/app-public-base/app-product-component/div/div/div/div[2]/div[2]/div[3]/div/img")).click(); // product review
				Thread.sleep(3000);
				
				DK.executeScript("window.scrollBy(0,-750);");
				Thread.sleep(4000);
				DK.executeScript("window.scrollBy(0,1750);");
				Thread.sleep(4000);
				driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Aayushihardia");
				driver.findElement(By.xpath("//input[@type='email']")).sendKeys("Automation.useraayushi@mailinator.com");
				driver.findElement(By.xpath("//*[@class='p-icon p-rating-icon']")).click();//rating
				driver.findElement(By.xpath("//textarea[@id='description']")).sendKeys("Test is doing for testing purpose, Thank You for the Support.");
				Thread.sleep(2000);
				Thread.sleep(500);
			    driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();//Submit button
			    Thread.sleep(2000);

			 
			  //Scroll to the top of the page
			    DK.executeScript("window.scrollTo(0,-750);");
			    Thread.sleep(2000);
				DK.executeScript("window.scrollBy(0,1250)", "");
				Thread.sleep(3000);
					
				driver.findElement(By.xpath("//text()[contains(.,'Add to cart')]/ancestor::button[1]")).click();//Add To Cart button
				Thread.sleep(1000);				
				driver.findElement(By.xpath("//button[@class='checkout-button btn btn-primary alt ng-star-inserted']")).click();//Proceed to checkout button
			    Thread.sleep(500);
			    
			    
			    
			    driver.findElement(By.xpath("/html/body/app-root/app-public-base/app-checkout/div/form/div/div[1]/div/div[1]/div[1]/input")).sendKeys("Aayushi");//First NameField 
		      	Thread.sleep(2000);	
		      	driver.findElement(By.xpath("/html/body/app-root/app-public-base/app-checkout/div/form/div/div[1]/div/div[1]/div[2]/input")).sendKeys("Automation");//Last NameField 
			    Thread.sleep(2000);	
			    driver.findElement(By.xpath("//input[@type='text'][@placeholder='Company Name']")).sendKeys("Test Automation is purpose");//Company Name (optional) Field 
		      	Thread.sleep(4000);	      	
				
		        driver.findElement(By.xpath("/html/body/app-root/app-public-base/app-checkout/div/form/div/div[1]/div/div[3]/div[1]/select")).click();//Country / Region *
		      	Thread.sleep(1000);
                driver.findElement(By.xpath("/html/body/app-root/app-public-base/app-checkout/div/form/div/div[1]/div/div[3]/div[1]/select/option[2]")).click();//Country selected Afghanistan 
		      	Thread.sleep(1000);
		      	driver.findElement(By.xpath("/html/body/app-root/app-public-base/app-checkout/div/form/div/div[1]/div/div[3]/div[2]/fieldset/select")).click();//State 
		      	Thread.sleep(1000);
		      	driver.findElement(By.xpath("/html/body/app-root/app-public-base/app-checkout/div/form/div/div[1]/div/div[3]/div[2]/fieldset/select/option[2]")).click();//Select the State 
		      	Thread.sleep(1000);
		      	
		      	driver.findElement(By.xpath("/html/body/app-root/app-public-base/app-checkout/div/form/div/div[1]/div/div[4]/div[1]/fieldset/select")).click();//City *
		      	Thread.sleep(1000);
		      	driver.findElement(By.xpath("/html/body/app-root/app-public-base/app-checkout/div/form/div/div[1]/div/div[4]/div[1]/fieldset/select/option[2]")).click();//Select the City *
		      	Thread.sleep(1000);		      	
		      	
		      	
		      	
//		        driver.findElement(By.xpath("//input[@type='text'][@placeholder='ZIP Code']")).sendKeys("452001");//Zip Code 
//		      	Thread.sleep(1000);
//		        driver.findElement(By.xpath("//input[@type='text'][@placeholder='Billing Address']")).sendKeys("QA street Tester City Of Afghanistan");//Address
//		      	Thread.sleep(1000);
//		      	driver.findElement(By.xpath("//input[@type='email'][@placeholder='Email Address']")).sendKeys("aayushi@mailinator.com");//Email Address
//		      	Thread.sleep(1000);
//		        driver.findElement(By.xpath("//*[@placeholder='Phone']	")).sendKeys("4522122112");//Phone Number
//		      	Thread.sleep(1000);
		      	
     
		        DK.executeScript("window.scrollBy(0,480);");
		        Thread.sleep(2500);
		      			      	
		      	DK.executeScript("window.scrollBy(0,-750);");
			    Thread.sleep(2500);
			    DK.executeScript("window.scrollBy(0,370);");
			    Thread.sleep(2500);
		      	
		      	driver.findElement(By.xpath("//*[@id=\"payment\"]/p-accordion/div/p-accordiontab[1]")).click();//Pay Via Wallet
		      	Thread.sleep(2500);
		      	
		     	driver.findElement(By.xpath("//*[@id=\"payment\"]/p-accordion/div/p-accordiontab[1]")).click();//Pay Via Wallet
		      	Thread.sleep(1800);

			    DK.executeScript("window.scrollBy(0,450);");
			    Thread.sleep(2500);
		      	driver.findElement(By.xpath("//input[@type='checkbox'][@id='terms']")).click();//Terms NAd Condition check-box
		      	Thread.sleep(1800);	

		    	driver.findElement(By.xpath("//button[text()='Pay Via Wallet']")).click();//Pay Via Wallet+Payment Button
		      	Thread.sleep(3000);
		  
		      	DK.executeScript("window.scrollBy(0,-750);");
			    Thread.sleep(3500);

				driver.findElement(By.xpath("//*[@class='bi bi-person']")).click();// Profile Icon 
				Thread.sleep(1000);
				driver.findElement(By.xpath("//text()[contains(.,'Logout')]/ancestor::button[1]")).click();// Logout Icon 
				Thread.sleep(1000);
		         		
		
		
	}

}
