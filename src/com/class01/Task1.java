package com.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//TC 2: Syntax Page URL Verification: 
//Open chrome browser
//Navigate to “https://www.syntaxtechs.com/”
//Navigate to “https://www.google.com/”
//Navigate back to Syntax Technologies Page
//Refresh current page
//Verify url contains “Syntax”
public class Task1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.getCurrentUrl();
		driver.navigate().to("https://www.syntaxtechs.com/");
		driver.navigate().to("https://www.google.com/");
		driver.navigate().back();
		driver.navigate().refresh();
		
		String expectedUrl="https://syntaxtechs.com";
        String actualUrl=driver.getCurrentUrl();
        
        
        if(expectedUrl.contains("syntax")) {
            System.out.println("URL contains syntax");
        }else {
            System.err.println("URL does not contain syntax");
        }
        
        
        
        driver.close();

	}

}
