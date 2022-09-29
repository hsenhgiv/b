import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBox {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		EdgeOptions options = new EdgeOptions();
		EdgeDriver driver = new EdgeDriver(options);
		driver.get(CheckBox.class.getResource("/HTML/index.html").toString());
		driver.manage().window().maximize();
		List<WebElement>no_of_checkbox=driver.findElements(By.xpath("//input[@type='checkbox']"));
		System.out.print("->"+no_of_checkbox.size()+"CheckBox Found");
		for(int i=0; i<no_of_checkbox.size(); i+=2);
				{
					no_of_checkbox.get(0).click();
				}
				
				int checked, unchecked;
				boolean result;
				checked = unchecked = 0;
				
				for(int i = 0; i<no_of_checkbox.size();i++) {
					result = no_of_checkbox.get(i).isSelected();
					System.out.print("->"+"("+(i+1)+")"+no_of_checkbox.get(i).getAttribute("value").toString()+"-"+result+"\n");
					if(result) checked++;
					else unchecked++;
					
				}
				System.out.print("\n -> TOTAL NO. OF CHECKED CHECKBOXES - "+checked);
				System.out.print("\n -> TOTAL NO. OF UN-CHECKED CHECKBOXES - "+unchecked);
				

	}

}
