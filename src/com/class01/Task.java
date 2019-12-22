package com.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//TC 1: Amazon Page Title Verification: 
//Open chrome browser
//Go to “https://www.amazon.com/”
//Verify Title “Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more” is displayed

public class Task {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
			WebDriver driver = new ChromeDriver();
			
			driver.getCurrentUrl();
			driver.navigate().to("http://www.amazon.com/");
			
			final String expectedTitle= "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";
			String actualTitle= driver.getTitle();
			
			if(expectedTitle.equals(actualTitle)) {
				System.out.println("The actual and expected Title matched");
			}else {
				System.err.println("The actual and expected Title did not match");
			}

	}

}
