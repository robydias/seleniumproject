package package1;

import org.openqa.selenium.By;

public class searchtv extends setup {
    public static void main(String[] args) {

    SetupDriver("mac","https://www.google.com","chrome");
        driver.findElement(By.xpath("//*[@id=\"gbwa\"]")).click();

        try {
            Thread.sleep(5000);
        }catch(Exception ee){

        }
        driver.findElement(By.xpath("///*[@id=\"gb49\"]/span[1]")).click();
       // driver.findElement(By.xpath("//*[@id='nt:Driv:label'])")).click();

        //driver.findElement(By.xpath("//*[@id=\"userid\"]")).sendKeys("rarabsaid@gmail.com");
        //driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("qwert");
        //driver.findElement(By.xpath("//*[@id=\"sgnBt\"]")).click();
    }
}
//*[@id="gb49"]/span[1]