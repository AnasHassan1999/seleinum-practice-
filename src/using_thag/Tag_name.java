

package using_thag;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tag_name {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "H:\\my new wep driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://127.0.0.1:5500/option.html");
		
		String Titel=driver.getTitle();
		List <WebElement> listOfOption=driver.findElements(By.tagName("a"));
		
	for(int i=0;i<listOfOption.size();i++) {
		
		System.out.println(listOfOption.get(i).getText());
		
	}
	}

}
