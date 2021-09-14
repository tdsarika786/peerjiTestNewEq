package eqcare.factories;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.github.bonigarcia.wdm.WebDriverManager;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.devicefarm.DeviceFarmClient;
import software.amazon.awssdk.services.devicefarm.model.CreateTestGridUrlRequest;
import software.amazon.awssdk.services.devicefarm.model.CreateTestGridUrlResponse;

public class BrowserFactory {

	public static WebDriver getApplication(String browser, String appURL, String projectrun) throws IOException {
		RemoteWebDriver driver1 = null;
		//AppiumDriver driver = null;
		WebDriver driver = null;
		
		if (projectrun.equalsIgnoreCase("aws")) {

			  DeviceFarmClient client  = DeviceFarmClient.builder().region(Region.US_WEST_2).build();
				CreateTestGridUrlRequest request = CreateTestGridUrlRequest.builder()
			                .expiresInSeconds(300)        // 5 minutes
			                .projectArn("arn:aws:devicefarm:us-west-2:059362432186:testgrid-project:90639a83-a341-47b6-8377-1e16ef9ddbc4")
			                .build();
			        URL testGridUrl = null;
			        try {
			            CreateTestGridUrlResponse response = client.createTestGridUrl(request);
			            testGridUrl = new URL(response.url());
			        } catch (Exception e) {
			            e.printStackTrace();
			        }
			        //Assertions.assertNotNull(testGridUrl);
			        
			        if (browser.equalsIgnoreCase("Chrome")) {
			        
			        DesiredCapabilities desired_capabilities = DesiredCapabilities.chrome();
			        driver1 = new RemoteWebDriver(testGridUrl, desired_capabilities);
			        }
			        if (browser.equalsIgnoreCase("Firefox")) {
			        	  DesiredCapabilities desired_capabilities = DesiredCapabilities.firefox();
					        driver1 = new RemoteWebDriver(testGridUrl, desired_capabilities);
			        	
			        }
	
		}

		if (projectrun.equalsIgnoreCase("and")) {
			
			 DesiredCapabilities capabilities = new DesiredCapabilities();
		        //capabilities.setCapability("chromedriverExecutable", System.getProperty("user.dir")+ Constants.CHROME_DRIVER_PATH);
		        
		        System.setProperty("webdriver.chrome.driver", "/Users/sarikadhall/Desktop/chromedriver-90-4");
		        
		        capabilities.setCapability(MobileCapabilityType.NO_RESET, "true");
		        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Emulator_Peerji");
		        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9.0");
		        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		        capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "chrome");
		        
		        
		        driver = new AndroidDriver<WebElement>( new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		        
		    /*    URL url = null;
		        
		        url = new URL("http://127.0.0.1:4723/wd/hub");

		        driver = new AndroidDriver<>(url, capabilities);
		        
		        driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		     
		        driver.manage().deleteAllCookies();*/
	
		}
		
		if (projectrun.equalsIgnoreCase("eq")) {
			
			if (browser.equalsIgnoreCase("chrome")) {
				
				// setting up property to suppress the warning
				//System.setProperty("webdriver.chrome.silentOutput","true");
			
			//WebDriverManager.chromedriver().setup();
			
			System.setProperty("webdriver.chrome.driver", "/Users/sarikadhall/Downloads/chromedriver");
			
			ChromeOptions options = new ChromeOptions();

			//options.addArguments("--headless");
		
			options.addArguments("use-fake-device-for-media-stream");
			options.addArguments("use-fake-ui-for-media-stream");
			//options.setPageLoadStrategy(PageLoadStrategy.NONE);

			driver = new ChromeDriver(options);
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			}
			
			else {
				System.setProperty("webdriver.gecko.driver", "/Users/sarikadhall/Downloads/geckodriver");
				driver = new FirefoxDriver(); //Creating an object of FirefoxDriver
				driver.manage().window().maximize();
			}
		}
		
		if (projectrun.equalsIgnoreCase("anu")) {
			
			// setting up property to suppress the warning
			//System.setProperty("webdriver.chrome.silentOutput","true");
			
			System.setProperty("webdriver.chrome.driver", "/Users/sarikadhall/Downloads/chromedriver");
			
			//System.setProperty("webdriver.chrome.driver", "/Users/sarika/Documents/ChromeDriver/chromedriver-89");
			
			//WebDriverManager.chromedriver().setup();
			
			ChromeOptions options = new ChromeOptions();

			//options.addArguments("--headless");
		
			options.addArguments("use-fake-device-for-media-stream");
			options.addArguments("use-fake-ui-for-media-stream");

			driver = new ChromeDriver(options);
			
			driver.manage().window().maximize();
			
		}
		/*else{
			
			if (browser.equalsIgnoreCase("Chrome")) {

				System.setProperty("webdriver.chrome.driver", "/Users/sarikadhall/Documents/ChromeDriver/chromedriver-90");

				ChromeOptions options = new ChromeOptions();

				//options.addArguments("--headless");
			
				options.addArguments("use-fake-device-for-media-stream");
				options.addArguments("use-fake-ui-for-media-stream");

				driver1 = new ChromeDriver(options);
			
		}}s
		*/
		//driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);

		driver.get(appURL);
		
		//driver.navigate().to(appURL);

		//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		return driver;
	}

	public static void closeApplication(WebDriver driver) {

		driver.close();

		driver.quit();

		System.out.println("LOG:INFO- Session closed");
	}
}
