import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class DesiredCap {
public static void main(String[] args) {
	DesiredCapabilities cap = new DesiredCapabilities().internetExplorer();
	cap.setCapability("version","11");
	cap.setCapability("platform","10");
	cap.setCapability("ignoreProtectedModeSettings", true);
	WebDriver driver = new RemoteWebDriver(cap);
	driver.get("https://www.google.com/");
}
}
