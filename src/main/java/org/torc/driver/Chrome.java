package org.torc.driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.torc.configuration.Environment;

import java.util.concurrent.TimeUnit;

public class Chrome implements Browser {

    private WebDriver driver;
    private WebDriverWait wait;

    public Chrome(){
        Environment.loadConfig();
        WebDriverManager.chromedriver().setup();
        this.driver = WebDriverManager.chromedriver().create();
        driver.manage().window().maximize();
        driver.navigate().to(Environment.properties.get("URL"));

        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
        driver.manage().timeouts().pageLoadTimeout(5000,TimeUnit.MILLISECONDS);
        driver.manage().timeouts().setScriptTimeout(5000, TimeUnit.MILLISECONDS);

        this.wait=new WebDriverWait(this.driver, 10);
    }

    public WebDriver getDriver() {
        return driver;
    }

    public WebDriverWait getWait() {
        return wait;
    }
}
