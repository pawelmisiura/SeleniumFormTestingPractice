package com.spartaglobal.ToolsqaPractice;

import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pawel Misiura\\Downloads\\chromedriver_win32\\chromedriver.exe");
        ChromeDriver chromeDriver = new ChromeDriver();
        AutoPractice autoPractice = new AutoPractice(chromeDriver);

        autoPractice.goToFormPage();
        autoPractice.acceptCookies();
        autoPractice.fillInFirstNameField("Pawel");
        autoPractice.fillInLastNameField("Misiura");
        autoPractice.getSexElements();
        autoPractice.getYearsOfExpirienceElements();
        autoPractice.insertDate("11/11/2019");
        autoPractice.getAutomationTesterProfessionElements();
        autoPractice.getAutomationTool();
        autoPractice.selectContinents();

    //    autoPractice.closeDriver();
    }
}
