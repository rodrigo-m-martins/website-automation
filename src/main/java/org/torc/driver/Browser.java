package org.torc.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public interface Browser {

    WebDriver driver = null;
    WebDriverWait wait = null;

    WebDriver getDriver();
}
