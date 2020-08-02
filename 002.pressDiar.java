package hihi;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

 
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class DialTest {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, 9.0);
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "KimsPhone");
		
		dc.setCapability("appPackage", "com.google.android.dialer");
		dc.setCapability("appActivity", "com.google.android.dialer.DialtactsActivity");
		
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		
		AndroidDriver<WebElement> driver = new AndroidDriver<WebElement>(url, dc);
		Thread.sleep(3000);
		
		driver.findElementById("com.google.android.dialer:id/fab").click();
		
		WebElement d1 = driver.findElementById("com.google.android.dialer:id/one");
		WebElement d2 = driver.findElementById("com.google.android.dialer:id/two");
		WebElement d3 = driver.findElementById("com.google.android.dialer:id/three"); 
		WebElement d4 = driver.findElementById("com.google.android.dialer:id/four");
		WebElement d5 = driver.findElementById("com.google.android.dialer:id/five");
		WebElement d6 = driver.findElementById("com.google.android.dialer:id/six");
		WebElement d7 = driver.findElementById("com.google.android.dialer:id/seven");
		WebElement d8 = driver.findElementById("com.google.android.dialer:id/eight");
		WebElement d9 = driver.findElementById("com.google.android.dialer:id/nine");
		WebElement d0 = driver.findElementById("com.google.android.dialer:id/zero");
		WebElement deleteNum = driver.findElementById("com.google.android.dialer:id/deleteButton");
		 

		d0.click();
		d1.click();
		d0.click();
		d3.click();
		d8.click();
		d7.click();
		d9.click();
		d4.click();
		d2.click();
		d5.click();
		d6.click();
		
		for(int i=0; i<11 ; i++)
		{
			deleteNum.click();
		}
	
		
		
	}

}


// 만들긴 했는데 버튼 누르는게 너무 느리다. 다음에 속도 조절할 수 있는 방법을 알아내야겠다...
