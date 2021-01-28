import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class ICanWin3 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://controlc.com/");
        // new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.id("gsc-i-id1")));

        // Inputting text
        WebElement searchInput = driver.findElement(By.id("input_text"));
        searchInput.sendKeys("Hello from WebDriver");
        Thread.sleep(2000);

        // set value in dropdown
        WebElement dropDown = driver.findElement(By.xpath("//*[@id='codeSyntax']/option[2]"));
        dropDown.click();
        Thread.sleep(2000);

        //tittle
        WebElement Title = driver.findElement(By.id("paste_title"));
        Title.sendKeys("helloweb");
        Thread.sleep(2000);

        //paste creation
        WebElement SearchBtn = driver.findElement(By.xpath("//*[@id='paste_toolbar_bottom']/div[1]/input"));
        SearchBtn.click();

        Thread.sleep(2000);
        driver.quit();

    }
}
