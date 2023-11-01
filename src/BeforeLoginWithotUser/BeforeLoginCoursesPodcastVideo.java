package BeforeLoginWithotUser;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BeforeLoginCoursesPodcastVideo {

	public static void main(String[] args) throws InterruptedException 
	
	{
		WebDriverManager.chromedriver().setup();

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);

		driver.get("https://staging-fe.maximizeu.life/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(1000);

//1. Courses Page functionalities 
		driver.findElement(By.xpath("//button[contains(text(),'COURSES')]")).click();//course button
		Thread.sleep(2000);
		
		JavascriptExecutor aboutusdown = (JavascriptExecutor) driver; 
		aboutusdown.executeScript("window.scrollBy(0,450);");
        Thread.sleep(3000); 
		
		driver.findElement(By.xpath("//div[contains(text(),'Fundamentals of leading a balanced life')]")).click(); //Fundamentals of leading a balanced life
	    System.out.println("chala kya ?");
	    
	    driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-public-base[1]/app-courses[1]/div[1]/div[1]/div[1]/div[1]")).click();//All Button
		Thread.sleep(1000);
		
        Thread.sleep(5000);
	    System.out.println("agaya me fund. page par bhai");
	    
	    driver.findElement(By.xpath("//div[contains(text(),'Health & Wellness')]")).click();//Health and Wellness 
		Thread.sleep(1000);
	   
		driver.findElement(By.xpath("//div[contains(text(),'HR & Workplace Safety')]")).click();// HR & Workplace Safety
		Thread.sleep(1000);
	    
		driver.findElement(By.xpath("//div[contains(text(),'K-12 & EDUCATION COURSES')]")).click();//K-12 & EDUCATION COURSES
		Thread.sleep(1000);

		driver.findElement(By.xpath("//div[contains(text(),'LEADERSHIP & TEAM MANAGEMENT')]")).click();//LEADERSHIP & TEAM MANAGEMENT
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div[contains(text(),'Sales And Negotiation')]")).click();//Sales And Negotiation
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-public-base[1]/app-courses[1]/div[1]/div[1]/div[1]/div[1]")).click();//All Button
		Thread.sleep(1000);
		
		aboutusdown.executeScript("window.scrollBy(0,450);");
        Thread.sleep(3000);
        
        driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-public-base[1]/app-courses[1]/div[1]/div[1]/div[2]/div[3]/div[1]/button[1]")).click();//Card
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[text()='Course overview video']")).click();//Courses Overview Video Link 
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(3000);
		
		aboutusdown.executeScript("window.scrollBy(0,-250);");
        Thread.sleep(20000);
//		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
//		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[id='ngb-nav-13']")));
//		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("overLay")));
		
		driver.findElement(By.xpath("//li[2]//button[1]")).click();//Curriculm button
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[text()='Create Urgency']")).click();// Accordion button 1
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[text()=concat('If you don',\"'\",'t take care of your client, your competitor will')]")).click();// Accordion button 2
		Thread.sleep(2000);
        
		driver.findElement(By.xpath("//li[3]//button[1]")).click();//Instructor
	    Thread.sleep(2000);
			
        driver.findElement(By.xpath("//button[text()='Buy Now']")).click();//Buy Now Button
      	Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//li[3]//button[1]")).click();//Instructor
	    Thread.sleep(2000);
			
	    aboutusdown.executeScript("window.scrollBy(0,-250)", "");
	    Thread.sleep(5000);
	   // WebDriverWait wait1=new WebDriverWait(driver,Duration.ofSeconds(20));	

		driver.findElement(By.xpath("//button[@class='buy-now-btn fw-bold p-0']")).click();//Back to all courses
	    Thread.sleep(3000);		
	    
	    aboutusdown.executeScript("window.scrollBy(0,-150)", "");

//2. Podcast Page functionalities 
	    
	    
		driver.findElement(By.xpath("//button[contains(text(),'PODCAST')]")).click();//Podcast
	    Thread.sleep(2000);		
	    
	    aboutusdown.executeScript("window.scrollBy(0,600)", "");
	    Thread.sleep(2000);
	    
	    //driver.findElement(By.xpath("//a[text()='Interview with Naz Qarbozian on the impact of technology innovation-Sep 18, 2023']")).click();// Play Podcast
	    //Thread.sleep(2000);	// not working	
	    
	    //driver.findElement(By.xpath("*[class='icon icon-download']")).click();//Download  Podcast
	    //Thread.sleep(2000);  // not working		
	    
	    driver.findElement(By.xpath("//a[@class='btn btn-primary mr-5']")).click();//Buy Podcast Bundle
	    Thread.sleep(2000); 
	    
	    aboutusdown.executeScript("window.scrollBy(0,-750)", "");
	    Thread.sleep(1800);
	    
	    aboutusdown.executeScript("window.scrollBy(0,350)", "");
	    Thread.sleep(1800);
	    
	    driver.findElement(By.xpath("//button[@class='nav-link']")).click();// Review Bundle
	    Thread.sleep(2000); 
	    
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Aayushihardia");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("Automation.useraayushi@mailinator.com");
		driver.findElement(By.xpath("//span[4]//staricon[1]//*[name()='svg']")).click();//rating
		driver.findElement(By.xpath("//textarea[@class='form-control ng-untouched ng-pristine ng-invalid']")).sendKeys("Test is doing for testing purpose, Thank You for the Support.");
	    Thread.sleep(1000); 
	    
	    aboutusdown.executeScript("window.scrollBy(0,750)", "");
	    Thread.sleep(500);
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();//Submit button
	    
		JavascriptExecutor js = (JavascriptExecutor) driver;

        // Scroll to the top of the page
        js.executeScript("window.scrollTo(0,-750);");
	    Thread.sleep(1500);

		aboutusdown.executeScript("window.scrollBy(0,400)", "");
		Thread.sleep(1500); 
		
		driver.findElement(By.xpath("//text()[contains(.,'Add to cart')]/ancestor::button[1]")).click();//Add To Cart button
		Thread.sleep(1000);

		driver.findElement(By.xpath("//button[contains(text(),'Proceed to checkout')]")).click();//Proceed to checkout button
        driver.navigate().back();
        Thread.sleep(1000);

		driver.findElement(By.xpath("//button[contains(text(),'Remove')]")).click();//Remove button
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[text()='Return to Product']")).click();//Return to Product button
		Thread.sleep(1000);
	
	    
//3. Video Page functionalities 
	    
		driver.findElement(By.xpath("//button[contains(text(),'VIDEOS')]")).click();//Video button
		Thread.sleep(1000);
		
		 // Create a JavascriptExecutor object
        JavascriptExecutor ls = (JavascriptExecutor) driver;
        ls.executeScript("window.scrollTo(0, document.body.scrollHeight);"); // Scroll to the end of the page
        Thread.sleep(500);
        
	    aboutusdown.executeScript("window.scrollBy(0,750)", "");
   
		driver.findElement(By.xpath("//a[@class='btn btn-primary mr-5']")).click();// Video Bundle Button
		Thread.sleep(1000); 
		
		driver.findElement(By.xpath("//button[text()='Reviews (0)']")).click();// Video Review
		
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
		driver.findElement(By.xpath("//input[@type='text'][@id='name']")).sendKeys("Aayushihardia");
		driver.findElement(By.xpath("//input[@type='email'][@id='email']")).sendKeys("Automation.useraayushi@mailinator.com");
		driver.findElement(By.xpath("//span[4]//staricon[1]//*[name()='svg']")).click();//rating
		driver.findElement(By.xpath("//textarea[@id='description']")).sendKeys("Test is doing for testing purpose, Thank You for the Support.");
	    Thread.sleep(1000); 
	    
	    aboutusdown.executeScript("window.scrollBy(0,750)", "");
	    Thread.sleep(500);
		driver.findElement(By.xpath("//button[text()='Submit']")).click();//Submit button

        // Scroll to the top of the page
        js.executeScript("window.scrollTo(0, 0);");
	    Thread.sleep(1000);
	    
	   aboutusdown.executeScript("window.scrollBy(0,400)", "");
	   Thread.sleep(1000);
	   driver.findElement(By.xpath("//text()[contains(.,'Add to cart')]/ancestor::button[1]")).click();//Add to cart button
	   Thread.sleep(4000);

	   driver.findElement(By.xpath("//button[@class='checkout-button btn btn-primary alt ng-star-inserted']")).click();//Proceed to checkout button
	   Thread.sleep(500);
       driver.navigate().back();
       Thread.sleep(4500);

	   driver.findElement(By.xpath("//button[contains(text(),'Remove')]")).click();//Remove button
	   Thread.sleep(1000);
		
	   driver.findElement(By.xpath("//button[text()='Return to Product']")).click();//Return to Product button
	   
	   
		
	}  
	

}
