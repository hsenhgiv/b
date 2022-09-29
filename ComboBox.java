import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;


import io.github.bonigarcia.wdm.WebDriverManager;

public class ComboBox {

	public static void main(String[] args) {
	WebDriverManager.firefoxdriver().setup();
		
		FirefoxOptions options = new FirefoxOptions();
		FirefoxDriver driver = new FirefoxDriver(options);
		
		driver.get(ComboBox.class.getResource("/HTML/index.html").toString());
		driver.manage().window().maximize();
		
		List<WebElement> Number_of_combobox = driver.findElements(By.xpath("//input[@type='combobox']"));
		
		
		System.out.println("--> " +Number_of_combobox.size() +("combobox Found"));
		
		for(int i =1; i < Number_of_combobox.size(); i+=2)
	
		{
			Number_of_combobox.get(i).click();
		}
		
			int Checked, unchecked;
			boolean result;
			Checked = unchecked = 0;
			
			for (int i = 0; i < Number_of_combobox.size(); i++)
			{
				result =  Number_of_combobox.get(i).isSelected();
				System.out.println("-->" + "(" + (i + 1) + ")" + Number_of_combobox.get(i).getAttribute("value").toString() + "-" + result + "\n");
				if (result)
				{
					Checked++;
				}
				else {
					unchecked++;
				}
				
				System.out.println("total no. of checkbox " +Checked);
				System.out.println("total no. of uncheckbox " +unchecked);
					
			}

	}

}