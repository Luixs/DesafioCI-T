package Resources;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AtivarDriverChrome {
	
	public static WebDriver Open() {
		System.setProperty("webdrive.chrome.driver", "C:\\Windows\\chromedriver.exe");
		WebDriver navegador = new ChromeDriver();
		return navegador;
	}

}
