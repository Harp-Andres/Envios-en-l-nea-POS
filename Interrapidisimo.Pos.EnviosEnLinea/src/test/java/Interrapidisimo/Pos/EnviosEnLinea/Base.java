package Interrapidisimo.Pos.EnviosEnLinea;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;
import org.openqa.selenium.winium.WiniumDriverService;
import org.openqa.selenium.WebElement;

public class Base {

	public static WiniumDriver driver;
	Properties loadProperty = new Properties();

	public Base(WiniumDriver driver) {
		Base.driver = driver;
	}

	public WiniumDriver winiumDriverConnection() throws IOException, InterruptedException {
		
		loadProperty.load(new FileReader("./params.properties"));

		DesktopOptions options = new DesktopOptions();
		options.setApplicationPath(loadProperty.getProperty("appDir"));

		File drivePath = new File(loadProperty.getProperty("winiumDriverDir"));

		WiniumDriverService service = new WiniumDriverService.Builder().usingDriverExecutable(drivePath).usingPort(9999).withVerbose(true).withSilent(false).buildDesktopService();
		service.start();
		driver = new WiniumDriver(service, options);

		return driver;
	}

	public WebElement findElement(By locator) {
		return driver.findElement(locator);
	}

	public String getText(WebElement element) {
		return element.getText();
	}

	public String getText(By locator) {
		return driver.findElement(locator).getText();
	}

	public static void type(String inputText, By locator) {
		driver.findElement(locator).sendKeys(inputText);
	}

	public static void click(By locator) {
		driver.findElement(locator).click();
	}

	public static boolean isDisplayed(By locator) {
		try {
			return driver.findElement(locator).isDisplayed();
		} catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}
	}

	public static void closeDriver() throws IOException, InterruptedException {
		Process process = Runtime.getRuntime().exec("taskkill /F /IM Winium.Desktop.Driver.exe");
		process.waitFor();
		process.destroy();
	}

	
	
}
