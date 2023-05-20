import java.util.concurrent.TimeUnit;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class A1 {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		WebDriver d=new ChromeDriver();
		//  WebDriver d = new FirefoxDriver();
		d.get("https://mail.google.com/mail/u/0/#inbox");
//d.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	//	WebElement e=d.findElement(By.className("topbar-icons style-scope ytd-masthead"));
	//		e.sendKeys("ram ji");
//System.out.print("fhhfhfh");WebElement e2=d.findElement(By.id("ybar-search"));
//e2.click();
//System.out.print("fhhfhfh");
		WebElement E1=d.findElement(By.xpath("//*[@id=\"yDmH0d\"]/c-wiz/div/div[2]/div/div[2]/div/div[2]/div/div/div[1]/div/button/span"));
		E1.click();
		WebElement E2=d.findElement(By.className("VfPpkd-StrnGf-rymPhb-b9t22c"));
		E2.click();
		WebElement E3=d.findElement(By.name("firstName"));
		E3.sendKeys("mithlesh");
		WebElement E4=d.findElement(By.name("lastName"));
		E4.sendKeys("chouhan");
		WebElement E5=d.findElement(By.name("Username"));
		E5.sendKeys("Mithleshchouhantester");
		WebElement E6=d.findElement(By.name("Passwd"));
		E6.sendKeys("Kushchouhan@2020");
		WebElement E7=d.findElement(By.name("ConfirmPasswd"));
		E7.sendKeys("Kushchouhan@2020");
		WebElement E8=d.findElement(By.className("VfPpkd-vQzf8d"));
		E8.click();
		
		//Thread.sleep(5000);
		d.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		WebElement E11=d.findElement(By.id("phoneNumberId"));
		E11.click();
		E11.sendKeys("234567890");
		WebElement E10=d.findElement(By.xpath("//*[@id=\"view_container\"]/div/div/div[2]/div/div[2]/div/div[1]/div/div/button/span"));
		E10.click();
		
		    }
		
		
}


