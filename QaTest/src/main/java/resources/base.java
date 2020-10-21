package resources;

	import java.io.FileInputStream;
	import java.io.IOException;
	import java.util.Properties;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class base {
		public WebDriver driver;
		public static Properties prop;
		
		public WebDriver initializeDriver() throws IOException {

			
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\main\\java\\resources\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
		    prop=new Properties();
		    FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\resources\\data.properties");
		    prop.load(fis);
		    
		    String Url=prop.getProperty("URL");
			return driver;
		    
		
		
		
		
		
	}
	}



