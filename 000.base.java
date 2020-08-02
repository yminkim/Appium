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


/*
기본 셋업 방법
[이클립스]
1. 환경변수 세팅(이건 구글/유튜브 참고..)
2. 이클립스 실행
3. new 프로젝트 생성
4. 프로젝트 파일 우클릭 > properties > Java Build Path > Libraries
5. Add External JARs... 선택 후 아래 jar 파일 추가
 5-1) selenium-server-standalone-2.53.0
 5-2) java-client-3.2.0
 5-3) commons-lang3-3.11
 5-4) selenium-java-3.141.59
6. Apply and Close
[애뮬레이터]
7. Android Studio에서 애뮬레이터 실행(AVD Manager)
[애뮬레티어 뷰어]
8. C:\Users\user\AppData\Local\Android\Sdk\tools\bin > uiautomatorviewer(애뮬 뷰어)
[앱피움]
9. cmd에서 appium 입력 및 appium 클라이언트 실행


이제 이클립스에서 클래스를 추가하고 디바이스 정보를 입력해준 뒤 스크립트를 작성하면
앱피움 서버를 통해 등록된 애뮬레이터가 스크립트를 수행

ps.계속적으로 에러가 발생하거나 그런다면 작업관리자 > 세부정보에서 
node.js와 appium을 완전히 종료한 후 재실행 해볼 것.

+ 애뮬레이터에 apk info 라는 어플을 설치해야 .
appPackage
appActivity
의 정보를 확인할 수 있음


그럼 오늘도 화이팅!
https://www.youtube.com/watch?v=EOPRT8Z6fpQ&list=PLUDwpEzHYYLsx_2JFNBMITjHqTnuszhb_&index=11
 ㄴ 위 코드를 공부한 유튜브 
 
*/ 
