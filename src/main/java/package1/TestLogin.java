package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TestLogin extends setup {
    public static void main(String[] args) {


    SetupDriver("mac","https://www.ebay.com","chrome");

       driver.findElement(By.xpath("//*[@id=\"gh-ug\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"userid\"]")).sendKeys("rarabsaid@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("qwert");
        driver.findElement(By.xpath("//*[@id=\"sgnBt\"]")).click();

      WebElement x = driver.findElement(By.xpath("//*[@id='errf']"));
        System.out.println(x);
    }

  }