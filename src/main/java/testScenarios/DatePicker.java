package testScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class DatePicker {
	
	WebDriver driver;
	@Test
	public void selDate()
	{
		driver=new EdgeDriver();
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		Integer Yr=2026;
		driver.switchTo().frame(0);
		driver.findElement(By.id("datepicker")).click();
		//Expected Date: Jan 20 2026
		while(true)
		{
		String month=driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/span[1]")).getText();
		String year=driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/span[2]")).getText();
		if(year.equals(String.valueOf(Yr)) && month.equals("January"))
		{
			driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[5]/td[2]/a")).click();
			break;
		}
		if(Yr<=2024)
		{
			//Click previous month button
			driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[1]/span")).click();
		}
		else
		{
			driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[2]/span")).click();
		}
		}
		driver.quit();
		
	}

}
