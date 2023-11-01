package BeforeLoginWithotUser;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ProductandCart {
	public static void main(String[] args) throws InterruptedException {
		
	
		WebDriverManager.chromedriver().setup();

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);

		driver.get("https://staging-fe.maximizeu.life/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(2000);

//1.Product Page and Cart Functionality
		
		driver.findElement(By.xpath("//button[contains(text(),'PRODUCTS')]")).click(); // Product button
		Thread.sleep(1000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver; 
		js.executeScript("window.scrollBy(0,350);");
		Thread.sleep(500);
	
		driver.findElement(By.xpath("//div[@class='p-dropdown-trigger']")).click();// Select Button of Filter First Time
		Thread.sleep(500);
        driver.findElement(By.xpath("//span[text()='Sort by latest']")).click(); // Short By Latest
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@class='p-dropdown-trigger']")).click();// Select Button of Filter second time
		Thread.sleep(500);		
		driver.findElement(By.xpath("//text()[.='Sort by price: low to high']/ancestor::li[1]")).click(); // Short By Low To High
		Thread.sleep(2000);
	
		driver.findElement(By.xpath("//div[@class='p-dropdown-trigger']")).click();// Select Button of Filter third time
		Thread.sleep(500);		
		driver.findElement(By.xpath("//span[text()='Sort by price: high to low']")).click(); // Short By High To Low
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[@class='p-dropdown-trigger']")).click();// Select Button of Filter Fourth time
		Thread.sleep(3000);
		driver.findElement(By.xpath("//text()[.='Select']/ancestor::li[1]")).click();// Select Button 
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@type='text'][@placeholder='Type here something..']")).sendKeys("Test"); // Search 1
        Thread.sleep(1000);
		driver.navigate().back();
		
		driver.findElement(By.xpath("//input[@type='text'][@placeholder='Type here something..']")).sendKeys("Good"); // Search 2
        Thread.sleep(1000);
		driver.navigate().back();
	
		driver.findElement(By.xpath("//input[@type='text'][@placeholder='Type here something..']")).sendKeys("28"); // Search 3
        Thread.sleep(3000);
		driver.navigate().back();
		
		js.executeScript("window.scrollBy(0,350);");
		
		driver.findElement(By.xpath("//span[text()='Assessments']")).click(); //'Assessments 	 
        Thread.sleep(1000);
        
		
		driver.findElement(By.xpath("//span[text()='Books']")).click(); // Books
        Thread.sleep(1000);
		
		driver.findElement(By.xpath("//span[text()='Merchandise']")).click(); // Merchandise
        Thread.sleep(1000);
		
		driver.findElement(By.xpath("//span[text()='Music']")).click(); // Music  
        Thread.sleep(1000);
	
	    driver.findElement(By.xpath("//span[text()='Podcast and Video Subscription']")).click(); // Podcast and Video   
        Thread.sleep(1000);
		
	    driver.findElement(By.xpath("//span[text()='Coaching']	")).click(); // Coaching 
        Thread.sleep(1000);

	    driver.findElement(By.xpath("//span[text()='Ebook']")).click(); // Ebook
	    Thread.sleep(2000);
        
        driver.findElement(By.xpath("//button[contains(text(),'LOGIN/REGISTER')]")).click(); //  button
		Thread.sleep(1000);
		
        driver.findElement(By.xpath("//button[contains(text(),'PRODUCTS')]")).click(); // Product button
		Thread.sleep(2500);
		
		js.executeScript("window.scrollBy(0,450);");
		Thread.sleep(500);
		
		//driver.findElement(By.xpath("//*[@class='mdc-slider__input mat-slider__right-input ng-pristine ng-valid ng-touched']")).click(); // Slider Filter 
		driver.findElement(By.xpath("//body/app-root[1]/app-public-base[1]/app-product-component[1]/div[1]/div[1]/div[1]/div[1]/div[3]/app-range-slider[1]/div[1]/form[1]/div[1]/mat-slider[1]/input[1]")).click();
		Thread.sleep(2500); 
			
		driver.findElement(By.xpath("//button[text()='Clear Filter']")).click(); // Clear Filter button
		Thread.sleep(1000);
		
		js.executeScript("window.scrollBy(0,-750);");
		Thread.sleep(2000);		
		js.executeScript("window.scrollBy(0,150);");
		Thread.sleep(2000);		
		
		driver.findElement(By.xpath("//input[@type='text'][@placeholder='Type here something..']")).sendKeys("Is 86 Good Enough? Maximize Potential & Customize your Gro"); // Search 1
        Thread.sleep(1000);
	
        js.executeScript("window.scrollBy(0,150);");
		Thread.sleep(1000);	
		
		driver.findElement(By.xpath("/html/body/app-root/app-public-base/app-product-component/div/div/div/div[2]/div[2]/div[2]")).click(); // $14.99 Is 86 Good Enough?2nd Edition ebook by Sal Celly
		Thread.sleep(1000);
		
		js.executeScript("window.scrollBy(0,-750);");
		Thread.sleep(4000);		
		js.executeScript("window.scrollBy(0,850);");
		Thread.sleep(3000);	
		
//		driver.findElement(By.xpath("//button[text()='Reviews (0)']")).click(); // product review
//		Thread.sleep(1000);
//		
//		js.executeScript("window.scrollBy(0,350);");	
//		
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
		driver.findElement(By.xpath("//input[@type='text'][@id='name']")).sendKeys("Aayushihardia");
		driver.findElement(By.xpath("//input[@type='email'][@id='email']")).sendKeys("Automation.useraayushi@mailinator.com");
		driver.findElement(By.xpath("//span[4]//staricon[1]//*[name()='svg']")).click();//rating
		driver.findElement(By.xpath("//textarea[@id='description']")).sendKeys("Test is doing for testing purpose, Thank You for the Support.");
	    Thread.sleep(1000); 
	    
		JavascriptExecutor aboutusdown = (JavascriptExecutor) driver;
	    aboutusdown.executeScript("window.scrollBy(0,750)", "");
	    Thread.sleep(500);
		driver.findElement(By.xpath("//button[text()='Submit']")).click();//Submit button
		
		// Scroll to the top of the page
        js.executeScript("window.scrollTo(0, 0);");
	    Thread.sleep(4000);
	    
	    aboutusdown.executeScript("window.scrollBy(0,650)", "");
	    Thread.sleep(500);
	    driver.findElement(By.xpath("//text()[contains(.,'Add to cart')]/ancestor::button[1]")).click();//Add to cart button
	    Thread.sleep(4000);
		
	    driver.findElement(By.xpath("//button[contains(text(),'Proceed to checkout')]")).click();//Proceed to checkout button
	    Thread.sleep(500);
	    driver.navigate().back();
	    Thread.sleep(500);

		 driver.findElement(By.xpath("//button[contains(text(),'Remove')]")).click();//Remove button
	     Thread.sleep(1000);
			
		 driver.findElement(By.xpath("//button[text()='Return to Product']")).click();//Return to Product button
	     Thread.sleep(2000);

	     driver.findElement(By.xpath("//button[@class='p-link layout-topbar-button ng-star-inserted']")).click();//Cart
	     Thread.sleep(1000);	    
	    
		
}
}