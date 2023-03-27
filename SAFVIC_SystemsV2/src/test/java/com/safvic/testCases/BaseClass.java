package com.safvic.testCases;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.safvic.utilities.ReadConfig;

public class BaseClass {
	ReadConfig rconfig = new ReadConfig();
	public String baseURL = rconfig.getApplicationURL();
	public String officerEmail = rconfig.getOfficerEmail();
	public String officerPassword = rconfig.getOfficerPassword();

	public static WebDriver driver;// initiated webdriver object driver
	public static Logger log;

	@Parameters("browser")
	@BeforeTest
	public void setup(String browserName) {

		log = LogManager.getLogger(BaseClass.class.getName());
		// PropertyConfigurator.configure("log4j2.properties");
		System.out.println("Executing in:" + browserName);
		if (browserName.equals("chrome")) {
			// System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
			System.setProperty("webdriver.chrome.driver", rconfig.getChromeDriverPath());
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");

			driver = new ChromeDriver(options);
			driver.manage().window().maximize();
		} else if (browserName.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", rconfig.getFirefoxDriverPath());
			FirefoxOptions options = new FirefoxOptions();
			options.addArguments("--remote-allow-origins=*");

			driver = new FirefoxDriver(options);
			driver.manage().window().maximize();
		} else if (browserName.equals("edge")) {
			System.setProperty("webdriver.edge.driver", rconfig.getEdgeDriverPath());
			driver = new EdgeDriver();
			driver.manage().window().maximize();
		}

		driver.get(baseURL);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

	public void getFailedTestScreeshotPath(String failedTestCaseName, WebDriver driver) throws IOException {
		TakesScreenshot screenShot = (TakesScreenshot) driver;
		File source = screenShot.getScreenshotAs(OutputType.FILE);
		String destination = System.getProperty("user.dir") + "\\Screenshots\\" + failedTestCaseName + ".png";
		FileUtils.copyFile(source, new File(destination));

		// return destination;
		/*
		 * TakesScreenshot ts = (TakesScreenshot)driver; File source =
		 * ts.getScreenshotAs(OutputType.FILE); String destinationFile =
		 * System.getProperty("user.dir")+"\\reports\\"+testCaseName+".png";
		 * FileUtils.copyFile(source, new File(destinationFile));
		 * 
		 * return destinationFile;
		 */
	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
