package org.torc.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class DuckDuckPOM extends PageFactory {

    private WebDriver driver;
    private WebElement firstResult = null;
    @FindBy(how = How.ID, using = "search_form_input_homepage")
    private WebElement searchInput;
    @FindBy(how = How.ID, using = "search_button_homepage")
    private WebElement searchButton;

    public DuckDuckPOM(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }

    public void searchFor(String s) {
        searchInput.sendKeys(s);
        searchButton.click();
    }

    public void validateFirstLink(String s) {
        firstResult = driver.findElement(By.cssSelector("article#r1-0 > div > h2 > a"));
        Assert.assertEquals(firstResult.getAttribute("href"), s);
    }
}
