import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CountObject {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		EdgeOptions option = new EdgeOptions();
		EdgeDriver driver = new EdgeDriver(option);
		
		driver.get(CountObject.class.getResource("/HTML/index.html").toString());
		driver.manage().window().maximize();
		
		List<WebElement>links=driver.findElements(By.tagName("a"));
		
		for(int i=0;i<links.size();i++) {
			System.out.print("("+(i+1)+")"+links.get(i).getText()+"\n");
		}
		//driver.quit();

	}

}
