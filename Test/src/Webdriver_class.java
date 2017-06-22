
//Run yout First Selenium WebDriver script by copy paste below code after executing above five simple steps.

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Webdriver_class {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	/*	WebDriver driver = new FirefoxDriver();
		driver.get("http://google.com");
		System.out.println(driver.getTitle());
		driver.close();*/
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
        driver.get("https://uat.xome.com");
        
        Cookie name = new Cookie(".publicauth","1BA43BB7C6298415CD72FC071A3BED913AA003F128BF77D42B6BC1B6EC04F745057496FA669556544634E937EF1BEDA54619E061F5226FF99CB734848FFB15D9332C866939142A3267DA53A17326FAAB2D491CA88F0671692383689DC0CF8A4CD6F051A0F184578A65253FA5FC3D8C0AC7CDB93754E860497979CDD0D9ADBADE1576FC41704FC235D9F1145886A230AE20A78D9203D0FA4C6040ED41F3C0943D5303ABDF363A0867C687F78F9DD1DFEFAED9F166BDAC705880A658BB39A0414B14C655D207488CF918DEB350F10419A74B1AEEB7B2F5835C2A9139D6E61995810DFCE894F31B616A73BAC69AED3861600F16E0152C15FD33DA6A1291224431142FB62134209109FE6093C01F096B68F287EBC340398D5D565E091833DD548FDA415FA6AF912208DD6CD2E8B219F9F90F093782EA041A6D6F659C4CACECBEE598E9A48B1BFEF6807065850E46E8146B8137069937152E58A43AB42EDEF8B2A02F4305AD150FA6FD7112EAB5F116FE9BC9AEDACD91A4BFB8D6FB767ECE921013B2CE23BE064727D5177A1E8B252A95ECF4A3703055F4FAFA0DD6A601FEB44C765910C0B25E30DDFC42F661F63821BDB9C6C47CAB82F03539A8EB8C9D0C2C4D84D4C756748378A46EC44CD90CD29E3AD813DA4BF3B33C6C818F27E80B2A1B73A3B9160FA4F316B9C247683D0C67BD2AA64B2E36ECCE9699F2F9C9CBD357CC7B15CEA155808F44C36D5ACB154197DFCF017EE1D179D84435CF83EBD92BAA51FE340B8989BFE899C3E86ADB19A41A7C644789B4C0071DE8B7BE8A9BF92A31CD3A9D2CDE659FDED0AC6E84B38E93887BBDA0A91673282D3614C5BFE388312C26DB9BFFA5E6D51A9C412EE16D9E040A6F513E105BB44E1CEDB83BE8256A80DB1CD0F04565F693A7F948D8B1CD7B21CDF77D8080946E021DFFE7F7D70A133CA451CC59D9D08A0DBB3BAAFF9D6498B61E3E056CEF79627F38");
            
        driver.manage().addCookie(name);
		/*System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		 
		// Open Google
		driver.get("http://test1.extnp.xome.com");
		
		WebElement click = driver.findElement(By.xpath("//*[@id='login-overlay']"));
		click.click();
		WebElement email= driver.findElement(By.id("security_loginname"));
		Actions builder = new Actions(driver);
        Actions seriesOfActions = builder.moveToElement(email).click().sendKeys(email, "Sreenidhi.Srinivasan@xome.com");
        seriesOfActions.perform();
        Thread.sleep(2000);
        WebElement pass = driver.findElement(By.id("security_password"));
        WebElement login =driver.findElement(By.id("submit-button"));
        Actions seriesOfAction = builder.moveToElement(pass).click().sendKeys(pass, "*Sree3070$");
        seriesOfAction.perform();
        Thread.sleep(4000);
        login.click();
        

		
		 
		// Close browser
		//driver.close();*/
	}

}
