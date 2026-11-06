import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class HomePage {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.flipkart.com/search?q=mobile+5g&sid=tyy%2C4io&as=on&as-show=on&otracker=AS_QueryStore_OrganicAutoSuggest_1_5_na_na_na&otracker1=AS_QueryStore_OrganicAutoSuggest_1_5_na_na_na&as-pos=1&as-type=RECENT&suggestionId=mobile+5g%7CMobiles&requestId=4a5c27bb-7f74-4546-896e-a44881dd71bd&as-backfill=on&p%5B%5D=facets.brand%255B%255D%3DApple");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//div[text()='Apple iPhone 17 (Black, 256 GB)']/ancestor::a[@class='k7wcnx']/descendant::div[@class='hZ3P6w DeU9vF']")).click();


    }
}
