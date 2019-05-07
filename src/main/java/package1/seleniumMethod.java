package package1;


public class seleniumMethod  extends setup{


    public static void main(String[] args) {
        SetupDriver("mac", "https:/www.ebay.com", "chrome");
        String titele =driver.getTitle();
        System.out.println(titele);
       String sespected ="Electronics, Cars, Fashion, Collectibles, Coupons and More | eBay";
        String currenturl = driver.getCurrentUrl();
        System.out.println(currenturl);
        if (currenturl.equalsIgnoreCase(sespected));{
            System.out.println("passed ");
        }
        searchebay(driver,"java books");
driver.navigate().back();
driver.navigate().forward();
driver.navigate();
//driver.navigate().to("https:/www.yahoo.com");
    }
}
