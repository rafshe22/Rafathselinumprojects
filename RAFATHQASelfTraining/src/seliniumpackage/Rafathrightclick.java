package seliniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Rafathrightclick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver1.exe");
	ChromeDriver browserObject = new ChromeDriver();
	browserObject.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
	Actions action=new Actions (browserObject);
	WebElement rightclickelement=browserObject.findElement(By.xpath("/html/body/div/section/div/div/div/p/span"));
	action.contextClick(rightclickelement).build().perform();
		Thread.sleep(6000);
		
	}
}




