package dockerTests;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class DockerChrome {

    @Test
    public void chromeTesOne() throws MalformedURLException {

        ChromeOptions chromeOptions = new ChromeOptions();

        URL url = new URL("http://localhost:4444/wd/hub");

        RemoteWebDriver driver = new RemoteWebDriver(url, chromeOptions);

        driver.get("https://www.google.com");
        System.out.println("Title is: " + driver.getTitle());

        driver.quit();
    }

}
