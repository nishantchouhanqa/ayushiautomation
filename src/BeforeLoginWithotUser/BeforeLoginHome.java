package BeforeLoginWithotUser;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BeforeLoginHome {

	public static void main(String[] args) throws InterruptedException {

// 0.Site Opening

		WebDriverManager.chromedriver().setup();

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);

		driver.get("https://staging-fe.maximizeu.life/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		JavascriptExecutor Dk = (JavascriptExecutor) driver;


//1.Home page functionalities 
		driver.findElement(By.xpath("//button[normalize-space()='HOME']")).click();
		Thread.sleep(2000);

		// getting windows handles
		Set<String> windows = driver.getWindowHandles();
		// getting parent and child window handles and iterating it
		Iterator<String> it = windows.iterator();
		String parentid = it.next();
		String childid = it.next();
		// Switching to child window.
		driver.switchTo().window(childid);
		System.out.println(parentid);
		System.out.println(childid);
		Thread.sleep(500);

		driver.findElement(By.cssSelector("div[id='ct_button-1684c4a'] a")).click();//Schedule Appointment 1
		Thread.sleep(500);
		Dk.executeScript("window.scrollBy(0,250);");
		Thread.sleep(500);


		// Schedule Appointment l Form Filling

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.name("first-name")).sendKeys("Automation User", Keys.ENTER);
		driver.findElement(By.name("last-name")).sendKeys("Aayushihardia");
		driver.findElement(By.name("your-email")).sendKeys("Automation.useraayushi@mailinator.com");
		driver.findElement(By.name("your-phone")).sendKeys("9009604444");
		driver.findElement(By.name("your-message")).sendKeys("Test is doing for testing purpose, Thank You for the Support.");
		driver.findElement(By.className("wpcf7-submit")).click();
		Thread.sleep(500);
		
		driver.navigate().to("https://maximizeu.life/");
		Thread.sleep(500);
		Dk.executeScript("window.scrollBy(0,250);");
		Thread.sleep(500);

		
		driver.findElement(By.cssSelector("div[id='ct_button-2f3ede7'] a")).click(); // Login Button
		driver.navigate().to("https://maximizeu.life/");

		driver.findElement(By.cssSelector("div[id='ct_button-88bc86e'] a")).click(); // Why Us Button
		driver.navigate().to("https://maximizeu.life/");

		driver.findElement(By.cssSelector("div[id='ct_button-17c3e16'] a")).click(); // Why Are You Stressed Button
		driver.navigate().to("https://maximizeu.life/");

		driver.findElement(By.cssSelector("div[id='ct_button-20ea297'] a")).click(); // Rohit Succes's Story button
		driver.navigate().to("https://maximizeu.life/");

		driver.findElement(By.cssSelector("div[id='ct_button-a7619d2'] a")).click(); // Your Thoughts Haver Power button
		driver.navigate().to("https://maximizeu.life/");
        Thread.sleep(500);
        
        Dk.executeScript("window.scrollBy(0,350);");
		Thread.sleep(500);
        
		driver.findElement(By.cssSelector("div[id='ct_button-34fbf72'] a")).click(); // 12 Leadership Winning Strategy Button
        Thread.sleep(500);
		driver.get("https://maximizeu.life/");
        Thread.sleep(500);

		driver.switchTo().window(childid);
		Thread.sleep(500);
		Dk.executeScript("window.scrollBy(0,350);");

		driver.findElement(By.cssSelector("div[id='ct_button-e79ef40'] a")).click();// Schedule Appointment2 Button
		driver.get("https://maximizeu.life/");

		Thread.sleep(3000);
		driver.findElement(By.cssSelector("div[id='ct_button-8ca1dbd'] a")).click(); // Boost Productivity , Growth Productivity Button
		driver.get("https://maximizeu.life/");

		driver.findElement(By.cssSelector("div[id='ct_button-17b18c3'] a")).click(); // PBL: Training Button

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.switchTo().window(childid);

		driver.findElement(By.cssSelector("div[id='ct_button-6b2e0c7'] a")).click(); // Our Services
		driver.get("https://maximizeu.life/");

		driver.findElement(By.cssSelector("div[id='ct_button-8cf6853'] a")).click();// Schedule Appointment3 Button
		driver.get("https://maximizeu.life/");
		Thread.sleep(1000);

	    WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(10));
		//wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("overlay")));

		Dk.executeScript("window.scrollBy(0,450);");
		Thread.sleep(500);
		
		driver.findElement(By.xpath("//a[@href='/customized-coaching/']//i[@class='bravisicon-angle-arrow-right space-left']")).click();//Learn More Button 1
		Thread.sleep(250);
		
		driver.navigate().back();
		Thread.sleep(500);

		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("overlay")));
		driver.findElement(By.xpath("//a[@href='/technology-growth-platform/']//i[@class='bravisicon-angle-arrow-right space-left']")).click();//Learn More Button 2
		Thread.sleep(200);
		driver.navigate().back();
		Thread.sleep(500);

		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("overlay")));
		driver.findElement(By.xpath("//div[@class='elementor-element elementor-element-21a601a9 elementor-widget elementor-widget-ct_fancy_box']//i[@class='bravisicon-angle-arrow-right space-left']")).click();//Learn More Button 3
		Thread.sleep(250);
		driver.navigate().back();
		Thread.sleep(500);

		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("overlay")));
		driver.findElement(By.xpath("//a[@href='/learning-development/']//i[@class='bravisicon-angle-arrow-right space-left']")).click();//Learn More Button 4
		Thread.sleep(250);
		driver.navigate().back();
		Thread.sleep(500);


		System.out.println(driver.findElement(By.tagName("iframe")).getSize());

		Dk.executeScript("window.scrollBy(0,500);");
		Thread.sleep(500);
		
		driver.findElement(By.xpath("//a[contains(@href,'/about-us/')]//span[contains(@class,'ct-button-text')]")).click(); // About Us Button
		Thread.sleep(500);
		driver.navigate().back();

		Dk.executeScript("window.scrollBy(0,480);");
		Thread.sleep(500);
		
		driver.findElement(By.xpath("//select[@name='subscription_plans']")).click(); // Individual Dropdown
		Thread.sleep(2000);

		driver.findElement(By.xpath("//span[normalize-space()='Monthly']//i")).click();// Monthly Button
		Thread.sleep(5000);

		// Select Button of Monthly Gold Card
		driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/main[1]/article[1]/div[1]/div[1]/section[7]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]")).click();
		driver.navigate().back();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.xpath("//span[normalize-space()='Monthly']//i")).click();// Monthly Button
		Thread.sleep(5000);

		// Select Button of Monthly Diamond Card
        driver.findElement(By.xpath("//div[@class='elementor-widget-wrap elementor-element-populated']//div[1]//div[2]//div[2]//div[1]//section[1]//div[1]//div[1]//div[1]//div[1]//div[1]//div[1]//div[2]//div[1]//div[4]//div[1]")).click(); 
		driver.navigate().back();
		Thread.sleep(5500);
		              
		driver.findElement(By.xpath("//span[normalize-space()='Monthly']//i")).click();// Monthly Button
		Thread.sleep(5000);
		
        // Select Button of Monthly Platinum Card
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/main[1]/article[1]/div[1]/div[1]/section[7]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[4]/div[1]")).click();
		driver.navigate().back();
		Thread.sleep(1000);
		
		System.out.println("Tester Is Best");
		
        
        // Select Button of yearly Gold Card
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/main[1]/article[1]/div[1]/div[1]/section[7]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]")).click();
		driver.navigate().back();
		Thread.sleep(1500);
        
		 // Select Button of yearly Diamond Card
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/main[1]/article[1]/div[1]/div[1]/section[7]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[4]/div[1]")).click();
		driver.navigate().back();
		Thread.sleep(1000);
		
		//Select Button of Yearly Platinum Card
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/main[1]/article[1]/div[1]/div[1]/section[7]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/div[4]/div[1]	")).click();
		driver.navigate().back();
		Thread.sleep(1000);
		
		//variable declaration for Scrolled 
		JavascriptExecutor SK = (JavascriptExecutor) driver;
		SK.executeScript("window.scrollBy(0,550);");
		
		driver.findElement(By.xpath("//select[@name='subscription_plans']")).click(); // Individual Dropdown
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//option[@value='organization']")).click(); // Organization Dropdown
		
		System.out.println ("Test Coverage 1");
		Thread.sleep(1000);
		
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/main[1]/article[1]/div[1]/div[1]/section[11]/div[1]/div[1]/div[1]/section[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]")).click(); // Schedule Appointment4 Button
    	Thread.sleep(1000);
    	driver.navigate().to("https://maximizeu.life/");
    	
		driver.findElement(By.xpath("//button[text()='Next']")).click();//next button
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[text()='Previous']")).click();//previous button
		Thread.sleep(3000);

		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/main[1]/article[1]/div[1]/div[1]/section[12]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[2]/div[2]/a[1]")).click(); // Read More Button 1
		Thread.sleep(1000);
		driver.navigate().back();
		
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/main[1]/article[1]/div[1]/div[1]/section[12]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/div[2]/div[2]/a[1]	")).click(); // Read More Button 1
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(500);

		
		SK.executeScript("window.scrollBy(0,700);");
		Thread.sleep(500);
		
		driver.findElement(By.xpath("//text()[contains(.,'Contact us')]/ancestor::a[1]")).click(); // Contact Us Button 
		Thread.sleep(1000);
		
		SK.executeScript("window.scrollBy(0,250);");
		Thread.sleep(500);

		//Contact Us Form
		driver.findElement(By.xpath("//input[@type='text'][@name='your-name")).sendKeys("Aayushihardia");
		driver.findElement(By.xpath("//input[@type='email'][@name='your-email']")).sendKeys("Aayushi.hardia@mailinator.com");
	    driver.findElement(By.xpath("//input[@type='text'][@name='your-phone']")).sendKeys("9009604444");
		driver.findElement(By.xpath("//input[@type='text'][@name='your-subject']	")).sendKeys("QA");
		driver.findElement(By.xpath("//textarea[@name='your-message']")).sendKeys("Test is doing for testing purpose, Thank You for the Support.");
		driver.findElement(By.xpath("//text()[.='Send Message']/ancestor::button[1]")).click();
		Thread.sleep(500);
	    driver.navigate().back();
		
		
		
	}
}
