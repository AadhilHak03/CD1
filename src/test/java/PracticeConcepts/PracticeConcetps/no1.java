package PracticeConcepts.PracticeConcetps;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class no1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ChromeOptions co = new ChromeOptions();
		System.out.println(co.getBrowserName());
		WebDriver dr  = new ChromeDriver(co);
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		dr.get("https://www.google.com/");
		dr.findElement(By.name("q")).sendKeys("hi",Keys.ENTER);
		JavascriptExecutor je = (JavascriptExecutor)dr;
		je.executeScript("window.scrollBy(0,2000)");
		 List<WebElement>  l = dr.findElements(By.tagName("h3"));
		//Stream.of(l).filter(s->s.contains("Hawaii")).map(s->dr.findElement(By.tagName("h3")).click());
		 WebDriverWait w = new WebDriverWait(dr, Duration.ofSeconds(15));
		l.stream().filter(s->s.getText().contains("Cambridge")).forEach(s->s.click());	
		w.until(ExpectedConditions.visibilityOf(dr.findElement(By.cssSelector(".hw.dhw"))));

		File  b = ((TakesScreenshot)dr).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(b, new File("C:\\Users\\aadhi\\OneDrive\\Desktop\\Career\\screenshot5.png"));
		
		dr.switchTo().newWindow(WindowType.WINDOW);
		Set<String> w1 = dr.getWindowHandles();
		Iterator<String> w2 = w1.iterator();
		String p = w2.next();
		String c = w2.next();
		dr.switchTo().window(c);
		dr.get("https://www.youtube.com/");
		
		
			
	
	}

}
