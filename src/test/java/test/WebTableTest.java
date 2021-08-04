package test;

import org.testng.annotations.Test;
import page.WebTablePage;

public class WebTableTest extends TestBase{
    WebTablePage webTablePage;

    @Test
    public void Test (){
        webTablePage = new WebTablePage(driver);
        webTablePage.tableData();
    }
}
