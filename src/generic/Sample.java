package generic;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sample {
	@FindBy(xpath="//img[@alt='My Account']")
	private WebElement click;
	
	@FindBy(id="login-email")
	private WebElement email;
	
	@FindBy(id="login-pswd")
	private WebElement password;
	
	@FindBy(xpath="//button[@type='button']")
	private WebElement submitbtn;
	
	public Sample(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void login()
	{
		click.click();
	}
	public void email(String us)
	{
		email.sendKeys(us);
	}
	public void pass(String passw)
	{
		password.sendKeys(passw);
	}
	public void log()
	{
		submitbtn.click();
	}
	
}
