package com.selenium;

import org.junit.Test;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class PooriTest {

    @Test
    public void PooriTestEg() throws InterruptedException {

         WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/MANOHAR%20KB/OneDrive/Desktop/SDET/ListBox_Breakfast.html");
		
		WebElement list = driver.findElement(By.id("mtr")); 
		Select  s = new Select(list); 
		List<WebElement> allElements = s.getOptions(); 
		HashMap<String, Integer> hashMapObj = new HashMap<String, Integer>(); 
		System.out.println("HashMap OBJECT BEFORE iF ELSE BLOCK"+ hashMapObj);
		for (WebElement element : allElements) { 
		String text = element.getText(); 
	
		if (hashMapObj.containsKey(text)) { 
		Integer value = hashMapObj.get(text); 
		System.out.println("Value when IF is true -->" + value);
		value++; 
		hashMapObj.put(text, value); 
		System.out.println("Text in the IF block<<-->>"+ text );
		System.out.println("Value in the IF block <<-->>" + value);
		System.out.println("HashMap OBJECT  in IF Block "+ hashMapObj);
		}else{ 
			hashMapObj.put(text, 1); 
			System.out.println("Text in the ELSE block<<-->>"+ text );
			System.out.println("HashMap OBJECT in ELSE Block "+ hashMapObj);
				} 
		
		System.out.println("HashMap OBJECT AFTER completion of IF ELSE Block "+ hashMapObj);
		} 
		
		Set<String> allKeys = hashMapObj.keySet(); 
		for (String key : allKeys) { 
		Integer value = hashMapObj.get(key); 
		System.out.println(key +" -->"+ value); 
		if (value>1) { 
		System.out.println("Occurance of " + key + " is :" + value); 
		
		Thread.sleep(2000);
		driver.quit();
		
		}}}}
