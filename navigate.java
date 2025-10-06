package Browser_command;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigate {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
	    driver.navigate().to("https://www.google.com");
	    Thread.sleep(20);
	    driver.navigate().to("https://www.flipkart.com");
	    Thread.sleep(80);
	    driver.navigate().to("https://www.amazon.in/");   
	    Thread.sleep(80);
	    driver.navigate().to("https://www.swiggy.com/"); 
	    Thread.sleep(90);
	    driver.navigate().to("https://www.google.com");   
	
	}

}