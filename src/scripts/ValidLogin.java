package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import generic.Auto_constant;
import generic.Excel;


public class ValidLogin implements Auto_constant {
static
{
	System.setProperty(key,value);
}
	public static void main(String[] args) {
		String us=Excel.abc(excelpath,"Sheet1",0,0);
		String pwd=Excel.abc(excelpath,"Sheet1",1,0);
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.koovs.com/");
		driver.findElement(By.xpath("//img[@alt='My Account']")).click();
		driver.findElement(By.id("login-email")).sendKeys(us);
		driver.findElement(By.id("login-pswd")).sendKeys(pwd);
		driver.findElement(By.xpath("//button[@type='button']")).click();
		
	

	}

}


















