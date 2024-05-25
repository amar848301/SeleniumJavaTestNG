package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {

	public static WebDriver driver;
	public static Properties prop;

	public static WebDriver initilizeDriver() {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		return driver;
	}
	
	public void launchUrl() throws IOException
	{
		driver.get(getData().getProperty("url"));
	}

	public Properties getData() throws IOException {
		FileInputStream fis = new FileInputStream("./src/test/resources/data.properties");
		prop = new Properties();
		prop.load(fis);
		return prop;
	}
	
	public String getScreenshot(String testCaseName, WebDriver driver) throws IOException
	{
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File file = new File("C:\\Users\\amarv\\eclipse-workspace\\SeleniumJavaTestNG\\test-output\\sparkreports\\"+testCaseName+".png");
		FileUtils.copyFile(source, file);
		return "C:\\Users\\amarv\\eclipse-workspace\\SeleniumJavaTestNG\\test-output\\sparkreports\\"+testCaseName+".png";
	}
}
