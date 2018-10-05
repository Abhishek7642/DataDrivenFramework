package scripts;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import generic.Auto_constant;
import generic.Excel;
import generic.Sample;

public class Demo implements Auto_constant {
	static
	{
		System.setProperty(key,value);
	}
public static void main(String[] args) {
	String us=Excel.abc(excelpath,"Sheet1",0,0);
	String pwd=Excel.abc(excelpath,"Sheet1",1,0);
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.koovs.com");
	Sample s=new Sample(driver);
	s.login();
	s.email(us);
	s.pass(pwd);
	s.log();
	
	}

}
