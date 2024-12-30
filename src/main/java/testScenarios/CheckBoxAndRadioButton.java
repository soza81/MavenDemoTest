package testScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class CheckBoxAndRadioButton {
	
	WebDriver driver;
	@Test
	public void radioChk() throws InterruptedException
	{
		driver=new EdgeDriver();
		driver.get("https://www.letskodeit.com/practice");
		driver.manage().window().maximize();
		WebElement BMWRadioButton=driver.findElement(By.id("benzradio"));
		BMWRadioButton.click();
		Thread.sleep(3000);
		if(BMWRadioButton.isSelected())
		{
			System.out.println("BMW Radio Button IS Selected..");
		}
		else
		{
			System.out.println("BMW Radio Button IS NOT Selected");
		}
		WebElement benzCheck=driver.findElement(By.id("benzcheck"));
		WebElement hondaCheck=driver.findElement(By.id("hondacheck"));
		benzCheck.click();
		hondaCheck.click();
		if(benzCheck.isSelected() && hondaCheck.isSelected())	
		{
			System.out.println("Benz and Honda are selected..");
		}
		driver.quit();
		
	}
	

}
