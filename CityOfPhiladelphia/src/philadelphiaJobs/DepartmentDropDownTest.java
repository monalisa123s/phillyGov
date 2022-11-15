package philadelphiaJobs;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;



public class DepartmentDropDownTest {
	

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Projects\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.phila.gov/jobs/#/");
		
		driver.manage().window().maximize();
		Thread.sleep(5000);
		String[] exp = {"Labor","Law","Revenue","Streets","Information Technology"};
		//String[] exp = {"Commerce","Community Empowerment and Opportunity","Director of Finance","Innovation and Technology","Inspector General","Labor","Law","Managing Director's Office","Multiple departments","Planning and Development","Police Department","Public Health","Sustainability","Water Department"};	
 		
              int count=0;  
		 WebElement dropdown = driver.findElement(By.id("search-dropdown"));  
		 Select select = new Select(dropdown);  

		 List<WebElement> options = select.getOptions();  
		 for(WebElement we:options)  
		 {  
		 // boolean match =false;
		  for (int i=0; i<exp.length; i++){
		      if (we.getText().equals(exp[i])){
		    	  
		    		 // System.out.println("matched");
		    		  //break;
		    	  count++;
		    	  }
		       
		      }
		 
		    }
		 if(count==exp.length)
		  {
			  System.out.println("Test Case Passed");
		  }
		  else
		  {
			  System.out.println("Test case failed");
		  }
		      
		 
		 // driver.quit();
		  
		 }  

	}


