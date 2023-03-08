package org.torc.test.feature;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.torc.configuration.Environment;
import org.torc.driver.Chrome;
import org.torc.page.DuckDuckPOM;


public class FindDuckDuckFeature {

    private Chrome chrome;
    private DuckDuckPOM pom;
    @BeforeTest
    public void init(){
         chrome = new Chrome();
         pom = new DuckDuckPOM(chrome.getDriver());

    }

    @Test
    public void findForString(){
        pom.searchFor(Environment.properties.get("SEARCH_CONTENT"));
        pom.validateFirstLink(Environment.properties.get("EXPECTED_URL"));
    }

}
