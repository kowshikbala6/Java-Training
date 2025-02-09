package Login;

import jdk.javadoc.internal.doclets.toolkit.util.DocFileIOException;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.time.Duration;
import java.util.List;

public class LoginTets {
    public static void main(String[] args) throws DocFileIOException {
        WebDriver driver = new ChromeDriver();
        WebDriverWait newwait =new WebDriverWait(driver , Duration.ofSeconds(10));
        driver.get("http://demo.opencart.com");
  driver.manage().window().maximize();
     //   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebElement display = newwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='logo']/a/img")));
      //  boolean display = driver.findElement(By.xpath("//div[@id='logo']/a/img")).isDisplayed();
        File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

     File targetfile = new File(System.getProperty("user.dir")+"\\screenshots\\fullpage.png");

        System.out.println(display);
       // driver.manage().window().fullscreen();
        System.out.println(driver.getTitle());
        String tittle = driver.getTitle();
        if( tittle.equals("Your Store"))
        {
            System.out.println("web page launched successfully ");
        }else {
            System.out.println("incorrect web paeg");
        }
     //   System.out.println(driver.findElement(By.id("logo")));
       driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("mobile");
      //  driver.findElement(By.xpath("//button[@type='button']")).click();
       // driver.findElement(By.xpath("//a[text()='Desktops']")).click();
        List<WebElement> headerlinks = driver.findElements(By.className("list-inline-item"));
        List<WebElement> links = driver.findElements(By.tagName("a"));

        System.out.println(headerlinks.size());

      /*  System.out.println(links.size());
        try {
            FileOutputStream file = new FileOutputStream(System.getProperty("C:\\Users\\Public\\Pictures"));

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }*/
        driver.navigate().to("https://money.rediff.com/gainers/bse/daily/groupb");
        WebElement parent = driver.findElement(By.xpath("a[text()='Taylormade Renewable']"));
        parent.click();

        //Thread.sleep(3000);
    driver.close();
        driver.quit();
    }
}
