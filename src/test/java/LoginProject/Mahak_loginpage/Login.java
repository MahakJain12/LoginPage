package LoginProject.Mahak_loginpage;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;

//import org.openqa.selenium.remote.RemoteWebDriver;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Login{
@Test
    public void login() throws MalformedURLException, InterruptedException {
        
	DesiredCapabilities capabilities=new DesiredCapabilities();
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("deviceName", "mahak_device");
        capabilities.setCapability("automationName", "UiAutomator2");
        capabilities.setCapability("udid", "emulator-5554");
        capabilities.setCapability("app","C:\\Users\\MJ109471\\eclipse-workspace\\Mahak_loginpage\\src\\test\\java\\resources\\Android.SauceLabs.Mobile.Sample.app.2.7.1.apk");
        capabilities.setCapability("appPackage", "com.swaglabsmobileapp");
        capabilities.setCapability("appActivity", "com.swaglabsmobileapp.MainActivity");


    AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), capabilities);
        Thread.sleep(3000);
        Assert.assertEquals(driver.findElement(By.xpath("//android.widget.EditText[@content-desc=\"test-Username\"]")).getText(),"Username");
        driver.findElement(By.xpath("//android.widget.EditText[@content-desc=\"test-Username\"]")).sendKeys("standard_user");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        //Thread.sleep(3000);
        Assert.assertEquals(driver.findElement(By.xpath("//android.widget.EditText[@content-desc=\"test-Password\"]")).getText(),"Password");
        driver.findElement(By.xpath("//android.widget.EditText[@content-desc=\"test-Password\"]")).sendKeys("secret_sauce");
        Thread.sleep(3000);
        Assert.assertEquals(driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"test-LOGIN\"]/android.widget.TextView")).getText(),"LOGIN" );
        driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"test-LOGIN\"]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//android.view.ViewGroup[@content-desc=\"test-ADD TO CART\"])[1]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"test-Cart\"]/android.view.ViewGroup/android.widget.ImageView")).click();
        Thread.sleep(3000);
        Assert.assertEquals(driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"test-CHECKOUT\"]/android.widget.TextView")).getText(),"CHECKOUT");
        driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"test-CHECKOUT\"]/android.widget.TextView")).click();
        Thread.sleep(3000);
        Assert.assertEquals(driver.findElement(AppiumBy.accessibilityId("test-First Name")).getText(), "First Name");
        driver.findElement(AppiumBy.accessibilityId("test-First Name")).sendKeys("Mahak");
        Assert.assertEquals(driver.findElement(AppiumBy.accessibilityId("test-Last Name")).getText(), "Last Name");
        driver.findElement(By.xpath("//android.widget.EditText[@content-desc=\"test-Last Name\"]")).sendKeys("Jain");
        Assert.assertEquals(driver.findElement(By.xpath("//android.widget.EditText[@content-desc=\"test-Zip/Postal Code\"]")).getText(), "Zip/Postal Code");
        driver.findElement(By.xpath("//android.widget.EditText[@content-desc=\"test-Zip/Postal Code\"]")).sendKeys("122010");
        Thread.sleep(3000);
        Assert.assertEquals(driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"test-CONTINUE\"]/android.widget.TextView")).getText(), "CONTINUE");
        driver.findElement(AppiumBy.accessibilityId("test-CONTINUE")).click();
        Thread.sleep(3000);
    	driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"FINISH\"));")).click();   				
        Thread.sleep(3000);
        driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"test-BACK HOME\"]")).click();
        Thread.sleep(3000);
        driver.quit();
   

	
}
}