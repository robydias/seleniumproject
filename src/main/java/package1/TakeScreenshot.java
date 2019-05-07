package package1;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TakeScreenshot extends setup {
   public static void getscreenshot(WebDriver driver){
        DateFormat df = new SimpleDateFormat("(MM.dd.yyyy-HH:mma)");
        Date date = new Date();
        String name = df.format(date);
        File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
       try {
           FileUtils.copyFile(file, new File("/Users/rabaharabsaid/Documents/homewrk/src/main/screenshotfile"+name+".png"));
        } catch (IOException e) {
            e.printStackTrace();
        }}
       public static void main(String[] args) {
           SetupDriver("mac", "https://www.facebook.com","chrome");
           getscreenshot(driver);
    }
}
