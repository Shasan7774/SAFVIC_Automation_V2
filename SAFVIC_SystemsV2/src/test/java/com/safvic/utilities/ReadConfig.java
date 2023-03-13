package com.safvic.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	Properties pro;

	public ReadConfig() {
		File src = new File("./Configuration/config.properties");

		try {
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
		} catch (Exception e) {
			System.out.println("Exception is" + e.getMessage());
		}
	}

	public String getApplicationURL() {
		String url = pro.getProperty("baseURL");
		return url;
	}

	public String getOfficerEmail() {
		String ofEmail = pro.getProperty("officerEmail");
		return ofEmail;

	}

	public String getOfficerPassword() {
		String ofPass = pro.getProperty("officerPassword");
		return ofPass;
	}

	public String getChromeDriverPath() {
		String chromeDriver = pro.getProperty("chromepath");
		return chromeDriver;
	}

	public String getFirefoxDriverPath() {
		String firefoxDriver = pro.getProperty("firefoxpath");
		return firefoxDriver;
	}

	public String getEdgeDriverPath() {
		String edgeDriver = pro.getProperty("msedgepath");
		return edgeDriver;
	}

}
