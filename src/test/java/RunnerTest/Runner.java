package RunnerTest;

import java.io.IOException;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import com.helper.FileReaderManager;
import BaseClass.Baseclass;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\java\\com\\Feature",glue="com\\StepDefinition",
dryRun=false,monochrome= false ,plugin ="pretty")

public class Runner {

	public static WebDriver driver;
	
	@BeforeClass
	public static void setUp() throws IOException
	{
		//driver=Baseclass.getDriver("chrome");
		String browser = FileReaderManager.getInstance().getCrInstance().getBrowser();
		driver=Baseclass.getDriver(browser);
	}

	

	
	
	
	

}
