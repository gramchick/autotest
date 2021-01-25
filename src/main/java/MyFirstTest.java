import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyFirstTest {

    public static WebDriver driver;

    @Test
    public void login() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\Временная папка\\chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://users.bugred.ru/user/login/index.html");
        driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[1]/form/table/tbody/tr[1]/td[2]/input")).sendKeys("gramma1991@gmail.com");
        driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[1]/form/table/tbody/tr[2]/td[2]/input")).sendKeys("123456");
        driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[1]/form/table/tbody/tr[3]/td[2]/input")).click();
        WebElement users = driver.findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[1]/a/span"));
        Assert.assertEquals(true, users.isDisplayed());


        driver.findElement(By.xpath("/html/body/div[3]/form/table/tbody/tr[4]/td/input")).sendKeys("gramma1991");
        driver.findElement(By.xpath("/html/body/div[3]/form/table/tbody/tr[5]/td[1]/button")).click();
        WebElement user = driver.findElement(By.xpath("/html/body/div[3]/table/tbody/tr/td[7]/a"));
        Assert.assertEquals(true, user.isDisplayed());

        driver.findElement(By.xpath("/html/body/div[3]/p[1]/a")).click();
        driver.findElement(By.xpath("/html/body/div[3]/form/table/tbody/tr[1]/td[2]/input")).sendKeys("Антон");
        driver.findElement(By.xpath("/html/body/div[3]/form/table/tbody/tr[2]/td[2]/input")).sendKeys("anton@gmail.com");
        driver.findElement(By.xpath("/html/body/div[3]/form/table/tbody/tr[3]/td[2]/input")).sendKeys("123456");
        driver.findElement(By.xpath("/html/body/div[3]/form/table/tbody/tr[5]/td[2]/input")).sendKeys("24121991");
        driver.findElement(By.xpath("/html/body/div[3]/form/table/tbody/tr[6]/td[2]/select")).click();
        driver.findElement(By.xpath("/html/body/div[3]/form/table/tbody/tr[6]/td[2]/select/option[2]")).click();
        driver.findElement(By.xpath("/html/body/div[3]/form/table/tbody/tr[7]/td[2]/input")).sendKeys("11112020");
        driver.findElement(By.xpath("/html/body/div[3]/form/table/tbody/tr[8]/td[2]/textarea")).sendKeys("Велоспорт");
        driver.findElement(By.xpath("/html/body/div[3]/form/table/tbody/tr[9]/td[2]/input")).sendKeys("Антуан");
        driver.findElement(By.xpath("/html/body/div[3]/form/table/tbody/tr[10]/td[2]/input")).sendKeys("Де Сент-Экзюпери");
        driver.findElement(By.xpath("/html/body/div[3]/form/table/tbody/tr[11]/td[2]/input[1]")).sendKeys("Валериевич");
        driver.findElement(By.xpath("/html/body/div[3]/form/table/tbody/tr[12]/td[2]/input")).sendKeys("Барби");
        driver.findElement(By.xpath("/html/body/div[3]/form/table/tbody/tr[13]/td[2]/input")).sendKeys("Умка");
        driver.findElement(By.xpath("/html/body/div[3]/form/table/tbody/tr[14]/td[2]/input")).sendKeys("Кеша");
        driver.findElement(By.xpath("/html/body/div[3]/form/table/tbody/tr[15]/td[2]/input")).sendKeys("Марсель");
        driver.findElement(By.xpath("/html/body/div[3]/form/table/tbody/tr[16]/td[2]/input")).sendKeys("Гоша");
        driver.findElement(By.xpath("/html/body/div[3]/form/table/tbody/tr[17]/td[2]/input")).sendKeys("Гайка");
        driver.findElement(By.xpath("/html/body/div[3]/form/table/tbody/tr[18]/td[2]/input")).sendKeys("0501234567");
        driver.findElement(By.xpath("/html/body/div[3]/form/table/tbody/tr[19]/td[2]/input")).sendKeys("Одесса, ул. Приморский бульвар, 1");
        driver.findElement(By.xpath("/html/body/div[3]/form/table/tbody/tr[20]/td[2]/input")).sendKeys("100500");
        driver.findElement(By.xpath("/html/body/div[3]/form/table/tbody/tr[21]/td[2]/input")).click();
        WebElement change = driver.findElement(By.xpath("/html/body/div[3]/table/tbody/tr[1]/td[5]/a"));
        Assert.assertEquals(true, change.isDisplayed());


        driver.findElement(By.xpath("//*[@id=\"fat-menu\"]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"fat-menu\"]/ul/li[1]/a")).click();
        driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/div[2]/form/table/tbody/tr[2]/td[2]/input")).clear();
        driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/div[2]/form/table/tbody/tr[2]/td[2]/input")).sendKeys("gramchick");
        driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/div[2]/form/table/tbody/tr[3]/td[2]/select")).click();
        driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/div[2]/form/table/tbody/tr[3]/td[2]/select/option[2]")).click();
        driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/div[2]/form/table/tbody/tr[4]/td[2]/input")).sendKeys("01011980");
        driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/div[2]/form/table/tbody/tr[5]/td[2]/input")).sendKeys("05052020");
        driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/div[2]/form/table/tbody/tr[6]/td[2]/textarea")).sendKeys("Спать");
        driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/div[2]/form/table/tbody/tr[7]/td[2]/input")).sendKeys("600600600600");
        driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/div[2]/form/table/tbody/tr[8]/td[2]/input")).click();
        WebElement profile = driver.findElement(By.xpath("/html/body/div[3]/div[1]/h2"));
        Assert.assertEquals(true, profile.isDisplayed());


    }

}
