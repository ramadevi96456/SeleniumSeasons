package com.nt.SRC;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import graphql.schema.GraphQLSchema.BuilderWithoutTypes;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CALCULATORS {

	WebDriver driver;

	@BeforeMethod
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://emicalculator.net/");
		driver.manage().window().maximize();
	}

	@Test
	public void mouseHoverTest()
	{
		Actions action=new Actions(driver);
		action.dragAndDropBy(driver.findElement(By.xpath("(//span[@tabindex='0'])[1])")))
		.dragAndDropBy(driver.findElement(By.xpath("(//span[@tabindex='0'])[2])"))
		.build()
		.perform();
	}
}
