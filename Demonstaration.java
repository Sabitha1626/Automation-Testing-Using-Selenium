package Browser_command;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Demonstaration{

	public static void main(String[] args){
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.addArguments("incognito");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://demoblaze.com/");
		driver.manage().window().maximize();
		
		WebElement Login = driver.findElement(By.xpath("//a[@id='login2']"));
		Login.click();
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(100));
		WebElement Username = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"loginusername\"]")));
		Username.sendKeys("delip");
		
		WebDriverWait PS=new WebDriverWait(driver,Duration.ofSeconds(100));
		WebElement Password = PS.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"loginpassword\"]")));
		Password.sendKeys("12345");
		
		WebDriverWait L2=new WebDriverWait(driver,Duration.ofSeconds(100));
		WebElement Login2 = L2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]")));
		Login2.click();
		
		WebDriverWait SU=new WebDriverWait(driver,Duration.ofSeconds(100));
        WebElement welcome = SU.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"nameofuser\"]")));
        
//        Set <String>Window=driver.getWindowHandles();
//        WebDriverWait CA=new WebDriverWait(driver,Duration.ofSeconds(100));
//		WebElement Cart = CA.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"tbodyid\"]/div[1]/div/div/h4/a")));
//		Cart.click();
//		
//		WebDriverWait AC=new WebDriverWait(driver,Duration.ofSeconds(100));
//		WebElement Add_to_Cart = AC.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/a")));
//		Add_to_Cart.click();
//        
	    String expected_username="Welcome delip";
	    String actual_username=welcome.getText();
	      
	if(expected_username.equals(actual_username)) {
		System.out.println(" username matches");
	}
	else {
		System.out.println("username does not matches");
	}
	}

}
