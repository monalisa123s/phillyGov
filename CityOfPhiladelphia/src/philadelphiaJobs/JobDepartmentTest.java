package philadelphiaJobs;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class JobDepartmentTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Projects\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.phila.gov/jobs/#/");
		
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		//WebElement ele = driver.findElement(By.xpath("(//b[text()='Offered by: ']/following::text())[1]"));
		//String str = ele.getText();
		//System.out.println(str);
        String ele = driver.findElement(By.xpath("(//div[@class='jb-job-dept'])[1]")).getText();
        System.out.println(ele);
        if (ele.equals("Offered by: "))
        {
        	System.out.println("TC Fail");
        }
        else
        {
        	System.out.println("TC Pass");
        }
        driver.close();
           
           
           //    (//b[text()='Offered by: ']/following::text())[1]
		//System.out.println(element);
		//List<WebElement> text=driver.findElements(By.xpath("//b[text()='Offered by: ']"));
		
	}

	private static boolean ele(Object contains) {
		// TODO Auto-generated method stub
		return false;
	}

	private static Object contains(String string) {
		// TODO Auto-generated method stub
		return null;
	}

}
