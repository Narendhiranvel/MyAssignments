package baseClass;

import java.time.Duration;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {

//	// Parallel Execution
//	public EdgeDriver driver;
	
	 //Sequence Execution
	public static EdgeDriver driver;
	
	@BeforeMethod
	public void preCondition() {
	driver  = new EdgeDriver();
	driver.manage().window().maximize();
	driver.get("http://leaftaps.com/opentaps/control/main");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
   }
	
	@AfterMethod
	public void postCondition() {
	driver.close();
	}
}
