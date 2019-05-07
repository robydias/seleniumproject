package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class setup {
    public static WebDriver driver =null;

    public static WebDriver SetupDriver(String platform, String url, String browser) {

        if (platform.equalsIgnoreCase("mac") && (browser.equalsIgnoreCase("chrome"))) {
            System.setProperty("webdriver.chrome.driver", "src/main/resources/driver/chromedriver");
        } else if (platform.equalsIgnoreCase("windows") && browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver");
        }

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(url);
        return driver;
    }
    public static void searchebay(WebDriver driver, String element){
        driver.findElement(By.xpath("//*[@id=\"gh-ac\"]")).sendKeys(element);
        driver.findElement(By.xpath("//*[@id=\"gh-btn\"]")).click();
    }

    public static void main(String[] args) {
        SetupDriver("mac", "https:/www.ebay.com", "chrome");


    }
}
