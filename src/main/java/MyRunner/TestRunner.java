package MyRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features="C:\\Users\\priyanka.bhalekar\\eclipse-workspace\\VIUBDDFramework\\src\\main\\java\\com\\features\\Login.feature",
		glue= {"stepDefinitions"},
		format= {"pretty","html:test_output"},
		monochrome= true,
		strict=true,
		dryRun=false
		
		
		
		
		)

public class TestRunner {
	

}
