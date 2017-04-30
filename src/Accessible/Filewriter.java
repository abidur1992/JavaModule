package Accessible;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Filewriter {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver = null;
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("")));
		Assert.assertTrue("Google", true);
		File file = new File("");
		FileWriter fis = new FileWriter(file);
		BufferedWriter writer = new BufferedWriter(fis);
		
		writer.write("This is the first line");
		writer.newLine();
		writer.write("This is demo writing");
		writer.close();
		System.out.println("This is the forst writing practice");
		
		
		
		
	}
}
