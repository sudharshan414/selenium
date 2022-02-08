package com.Hrms.Lib;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import com.Hrms.TestScripts.*;
import com.Hrms.utility.Log;


public class General extends Global{
//std-rule:provideing all re-usable fun: /methods related
//to whole application
	
public void openApplication() {
System.setProperty("webdriver.chrome.driver", "F:\\Drivers\\chromeDriver\\chromedriver.exe");
driver = new ChromeDriver();
driver.navigate().to(url);
System.out.println("Application Opened");
Log.info("Application Opened");
}

public void closeApplication() {
driver.close();
System.out.println("Application closed");
Log.info("Application closed");
}
public void login() {
driver.findElement(By.name(txt_loginname)).sendKeys(un);
driver.findElement(By.name(txt_password)).sendKeys(pw);
driver.findElement(By.name(btn_login)).click();
System.out.println("Login Completed");
Log.info("Login Completed");

}
public void logout() {
driver.findElement(By.linkText(link_logout)).click();
System.out.println("Logout completed");
Log.info("logout compleated");
}
public void enterFrame() {
driver.switchTo().frame(frame_emp);
System.out.println("Entered into Frame");
Log.info("entered into frame");
}
public void exitFrame() {
driver.switchTo().defaultContent();
System.out.println("exit from frame");
Log.info("Exit from frame");
}
public void addEmp() {
driver.findElement(By.xpath(btn_Add)).click();
driver.findElement(By.name(txt_EFN)).sendKeys(FN);
driver.findElement(By.name(txt_ELN)).sendKeys(LN);
driver.findElement(By.id(btn_save)).click();
System.out.println("New Emp added");
Log.info("New emp added");
}
public void editEmp() {
driver.findElement(By.xpath(name_emp)).click();
driver.findElement(By.name(btn_edit_save)).click();
driver.findElement(By.name(txt_EFN)).clear();
driver.findElement(By.name(txt_ELN)).clear();
driver.findElement(By.name(txt_EFN)).sendKeys(FN);
driver.findElement(By.name(txt_ELN)).sendKeys(LN);
driver.findElement(By.name(btn_edit_save)).click();
System.out.println("Edit emp completed");
Log.info("Edit emp compleated");
}
public void delEmp() {
        System.out.println("Delete emp");
        Log.info("Delete emp");
}
}
