package com.safvic.testCases;


import org.apache.log4j.PropertyConfigurator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
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
	@BeforeClass
	public void setup(String br) {
		
		log = LogManager.getLogger(BaseClass.class);
		//PropertyConfigurator.configure("log4j2.properties");
		
		if(br.equals("chrome"))
		{	
			//System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
			System.setProperty("webdriver.chrome.driver", rconfig.getChromeDriverPath());
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}
		else if(br.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", rconfig.getFirefoxDriverPath());
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
		}
		else if(br.equals("edge")) {
			System.setProperty("webdriver.edge.driver", rconfig.getEdgeDriverPath());
			driver = new EdgeDriver();
			driver.manage().window().maximize();
		}

		driver.get(baseURL);
	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}
