package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class WebTablePage extends PageBase{

    @FindBy(id ="table1")
    public WebElement table;

    public WebTablePage(WebDriver driver) {
        super(driver);
    }



    public void tableData () {
        List<WebElement> rows = table.findElements(By.tagName("tr"));

        for (WebElement row : rows) {
            List<WebElement> clos = row.findElements(By.tagName("td"));
            for (WebElement col : clos) {
                System.out.println(col.getText() + "\t");
            }
            System.out.println();
        }
    }

}
