package Lesson3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumStart {
    public static void main(String[] args) throws InterruptedException {
//        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.lamoda.ru/p/mp002xm085bb/shoes-timejump-krossovki/");
        WebElement sSize = driver.findElement(By.xpath("//div[@class=\"icon icon_collapse-arrow icon_direction-down icon_24 _28uC95jsrEpO2Q9yRKqHdI\"]"));
        sSize.click();
        driver.findElement(By.xpath("//*[@id=\"vue-root\"]/main/div/div[2]/div[2]/div/div[3]/div[1]/div/div[1]/div[1]"));

        Thread.sleep(2000);

        driver.quit();

    }
}
