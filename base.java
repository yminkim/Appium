package hihi;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class jebal {

	public static void main(String[] args) throws MalformedURLException {
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, 9.0);
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "KimsPhone");
		
		dc.setCapability("appPackage", "com.android.calculator2");
		dc.setCapability("appActivity", "com.android.calculator2.Calculator");
		
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");  // 웹브라우져 localhost:4723/wd/hub/status 주소창에 검색하면 돌아가고 있는지 확인 가능
		
		AndroidDriver<WebElement> driver = new AndroidDriver<WebElement>(url, dc);
		
		WebElement seven = driver.findElementById("com.android.calculator2:id/digit_7"); // 인스턴트 만들어서 사용가능!
		seven.click();
		
		driver.findElementById("com.android.calculator2:id/op_add").click();
		seven.click();
		driver.findElementById("com.android.calculator2:id/eq").click();
		
	}

}
