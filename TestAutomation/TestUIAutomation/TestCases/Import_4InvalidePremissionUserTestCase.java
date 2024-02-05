
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class ImportInvalidePermissionTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void importInvalidePermission() {
    driver.get("http://localhost:3000/collection/1-Haseeb-Ahmed-s-personal-collection");
    driver.manage().window().setSize(new Dimension(1054, 808));
    driver.findElement(By.cssSelector("div:nth-child(1) > .relative .css-qz4bcb")).click();
    driver.findElement(By.cssSelector(".css-w1qkh2 .css-qz4bcb")).click();
    {
      WebElement element = driver.findElement(By.cssSelector(".css-w1qkh2 .css-qz4bcb"));
      Actions builder = new Actions(driver);
      builder.doubleClick(element).perform();
    }
    {
      List<WebElement> elements = driver.findElements(By.cssSelector(".css-11v6dh8"));
      assert(elements.size() == 0);
    }
  }
}
