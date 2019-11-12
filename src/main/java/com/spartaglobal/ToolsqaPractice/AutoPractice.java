package com.spartaglobal.ToolsqaPractice;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class AutoPractice {

    private WebDriver driver;

    private String homePageURL = "https://www.toolsqa.com/automation-practice-form/";

    private By cookieFooter = By.id("cookie_action_close_header");
    private By firstNameId = By.name("firstname");
    private By lastNameId = By.id("lastname");
    private By sexElements = By.name("sex");
    private By yearsOfExpirienceElements = By.name("exp");
    private By dateInputField = By.id("datepicker");
    private By professionTesterElements = By.name("profession");
    private By automationToolElements = By.name("tool");
    private By continentElements = By.id("continents");



    public AutoPractice(WebDriver driver) {
        this.driver = driver;
    }

    public void goToFormPage(){
        driver.navigate().to(homePageURL);
    }

    public void acceptCookies(){
        driver.findElement(cookieFooter).click();
    }

    public void fillInFirstNameField(String firstName){
        driver.findElement(firstNameId).sendKeys(firstName);
    }

    public void fillInLastNameField(String lastName){
        driver.findElement(lastNameId).sendKeys(lastName);
    }

    public void getSexElements(){
        List<WebElement> sexItems = driver.findElements(sexElements);
        for (org.openqa.selenium.WebElement sexItem : sexItems){
            driver.findElement(By.id(sexItem.getAttribute("id"))).click();
            driver.findElement(By.id(sexItem.getAttribute("id"))).isSelected();
        }
    }

    public void getYearsOfExpirienceElements(){
        List<WebElement> yearsOfExpItems = driver.findElements(yearsOfExpirienceElements);
        for (org.openqa.selenium.WebElement yearsOfExpItem : yearsOfExpItems){
            driver.findElement(By.id(yearsOfExpItem.getAttribute("id"))).click();
            driver.findElement(By.id(yearsOfExpItem.getAttribute("id"))).isSelected();
        }
    }

    public void insertDate(String sampleDateForInput){
        driver.findElement(dateInputField).sendKeys(sampleDateForInput);
    }

    public void getAutomationTesterProfessionElements(){
        List<WebElement> professionItems = driver.findElements(professionTesterElements);
        for (org.openqa.selenium.WebElement yearsOfExpItem : professionItems){
            driver.findElement(By.id(yearsOfExpItem.getAttribute("id"))).click();
            driver.findElement(By.id(yearsOfExpItem.getAttribute("id"))).isSelected();
        }
    }

    public void getAutomationTool(){
        List<WebElement> toolItems = driver.findElements(automationToolElements);
        for (org.openqa.selenium.WebElement toolItem : toolItems){
            driver.findElement(By.id(toolItem.getAttribute("id"))).click();
            driver.findElement(By.id(toolItem.getAttribute("id"))).isSelected();
        }
    }

    public void selectContinents(){
        WebElement continents = driver.findElement(continentElements);
        Select drpContinents = new Select(continents);

        for (int i = 0; i < drpContinents.getOptions().size(); i++){
            drpContinents.selectByIndex(i);
            System.out.println(drpContinents.getFirstSelectedOption().getText());
        }
    }


    public void closeDriver(){
        driver.close();
    }
}
