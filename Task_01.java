package Browser_command;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class Task_01{

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("incognito");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://demo.smart-hospital.in/site/login");
		driver.manage().window().maximize();
		
//		Actions action = new Actions(driver);
		Thread.sleep(1000);
		WebElement Pb = driver.findElement(By.xpath("//a[normalize-space()='Pathologist']"));
		Pb.click();
		WebElement sign = driver.findElement(By.cssSelector("button[type='submit']"));
		sign.click();
		
		WebElement Messaging = driver.findElement(By.cssSelector("body > div:nth-child(2) > aside:nth-child(3) > div:nth-child(2) > section:nth-child(1) > ul:nth-child(2) > li:nth-child(9) > a:nth-child(1) > span:nth-child(2)"));
		Messaging.click();
		
		WebElement PNM = driver.findElement(By.xpath("//a[normalize-space()='Post New Message']"));
		PNM.click();
		
		WebElement Title = driver.findElement(By.id("title"));
		Title.sendKeys("Request for Laboratory Report");
		
		Thread.sleep(5000);
		WebElement NDate= driver.findElement(By.xpath("//input[@id='date']"));
		//NDate.click();
		NDate.sendKeys("30-09-2025");
		
		Thread.sleep(5000);
		WebElement PON= driver.findElement(By.xpath("//input[@id='publish_date']"));
	//	PON.click();
		PON.sendKeys("01-10-2025");
		
		WebElement Iframe = driver.findElement(By.cssSelector("iframe.wysihtml5-sandbox"));
		driver.switchTo().frame(Iframe);
		WebElement MSG= driver.findElement(By.cssSelector("body"));
		MSG.click();
		MSG.sendKeys(" I hope this message find you well");
		
		driver.switchTo().defaultContent();
		
		WebElement send= driver.findElement(By.xpath("//button[@type='submit']//i[@class='fa fa-envelope-o']"));
		send.click();
		WebElement Record= driver.findElement(By.xpath("//div[@class='alert alert-success']"));
	    
	    String expected_username="Record Saved Successfully";
	    String actual_username=Record.getText();
	      
	if(expected_username.equals(actual_username)) {
		System.out.println(" Record matches");
	}
	else {
		System.out.println(" Record does not matches");
	}

}
}