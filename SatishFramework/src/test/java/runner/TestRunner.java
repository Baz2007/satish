package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/Features", 
glue="TestCase",
dryRun = false, tags= "@tag4"
)  
        

public class TestRunner extends AbstractTestNGCucumberTests{
    
     
}


	