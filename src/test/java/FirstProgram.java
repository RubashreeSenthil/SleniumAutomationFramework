import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstProgram {
    public static void main(String [] args)throws InterruptedException{
        System.out.println("I am alive");
        ChromeDriver driver = new ChromeDriver();

            driver.get("https://www.google.com/");
            driver.manage().window().maximize();

        //capture the title of the page
        String title = driver.getTitle();
        System.out.println("Title of the page is: " + title);

        //getcurrent URL of the page
        String currentURL = driver.getCurrentUrl();
        System.out.println("Current URL of the page is: " + currentURL);



        //get the source code of the page
        /*String pageSource = driver.getPageSource();
        System.out.println("Page source code is: " + pageSource);
        driver.quit();*/
        driver.manage().window().minimize();
        Thread.sleep(2000);
        driver.manage().window().fullscreen();
        driver.manage().window().setSize(new Dimension(50,800));
        Thread.sleep(2000);
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.manage().window().setPosition(new Point(800,100));
        Thread.sleep(2000);
        driver.manage().window().maximize();


        driver.navigate().to("https://www.flipkart.com/");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//span[text()='✕']")).click();


    }
}
