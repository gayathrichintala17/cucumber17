package stepDefinition;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Register {
	public static WebDriver driver;
@Given("^user open TestMeApp$")
	public void useropenTestMeApp() {
	System.setProperty("webdriver.chrome.driver", "C:\\seleniumfolder\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("http://10.232.237.143:443/TestMeApp");
	//driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
	}
@When("^user click signup$")
public void userclicksignup() 
{
driver.findElement(By.xpath("//a[@href='RegisterUser.htm']")).click();	
}

@And("^enter user name as \"([^\"]*)\"$")
	public void enterusername(String uname) {
	driver.findElement(By.id("userName")).sendKeys(uname);
	}

@And("^enter first name as \"([^\"]*)\"$")
public void enterfirstname(String fname) {
	driver.findElement(By.id("firstName")).sendKeys(fname);
}
@And("^enter last name as \"([^\"]*)\"$")
public void enterlastname(String lname) {
	driver.findElement(By.id("lastName")).sendKeys(lname);
}
@And("^enter password as \"([^\"]*)\"$")
public void enterpassword(String password) {
	driver.findElement(By.id("password")).sendKeys(password);
}
@And("^enter confirm password as \"([^\"]*)\"$")
public void enterconfirmpassword(String cpassword) {
	driver.findElement(By.id("pass_confirmation")).sendKeys(cpassword);;
}
@And("^enter gender as \"([^\"]*)\"$")
public void entergender(String gender) {
	if(gender.equalsIgnoreCase("male")) {
	driver.findElement(By.xpath("//input[@value='Male']")).click();
}
	else if (gender.equalsIgnoreCase("female")) {
		driver.findElement(By.xpath("//input[@value='Female']")).click();
	}
	}
@And("^enter email as \"([^\"]*)\"$")
public void enteremail(String email) {
	driver.findElement(By.name("emailAddress")).sendKeys(email);
}
@And("^enter mobile number as \"([^\"]*)\"$")
public void entermobilenumber(String number) {
	driver.findElement(By.name("mobileNumber")).sendKeys(number);
}

@And("^enter dob as \"([^\"]*)\"$")
public void enterdob(String dob) {
	driver.findElement(By.name("dob")).sendKeys(dob);
}
@And("^enter address as \"([^\"]*)\"$")
public void enteraddress(String address) {
	driver.findElement(By.name("address")).sendKeys(address);
}

@And("^enter answer as \"([^\"]*)\"$")
public void enteranswer(String answer) {
	driver.findElement(By.name("answer")).sendKeys(answer);
}
@Then("^user click Register$")
public void userclickRegister() {
	driver.findElement(By.name("Submit")).click();
}
@When("^user click signin$")
public void userclicksignin() {
	driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[1]/a")).click();
}
@When("^user enter credentials as$")
public void enterunamepwd(DataTable dt)
{
	List<String> cred=dt.asList(String.class);
			driver.findElement(By.name("userName")).sendKeys(cred.get(0));
	driver.findElement(By.name("password")).sendKeys(cred.get(1));
	driver.findElement(By.name("Login")).click();

}
@When("^user search the product$")
public void usersearchproduct(DataTable dt)
{
	List<String> cred=dt.asList(String.class);
			driver.findElement(By.name("products")).sendKeys(cred.get(0));
}
@When("^user click on find button$")
public void userclickonfindbutton() {
	driver.findElement(By.xpath("/html/body/div[1]/form/input")).click();
	driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div/div[2]/center/a")).click();
}

}
