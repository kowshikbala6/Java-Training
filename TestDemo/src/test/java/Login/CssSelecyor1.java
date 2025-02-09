package Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CssSelecyor1 {
    public static void main(String[] args)  {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.amazon.com/");
        driver.manage().window().maximize();
      //  Thread.sleep(10000);
        String tittle = driver.getTitle();
        System.out.println(tittle);
        if(tittle.equals("Amazon.com. Spend less. Smile more."))
        {
        System.out.println("launched success");}
//driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("tshirts");
driver.close();
    }
}
