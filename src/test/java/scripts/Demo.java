package scripts;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="./Systemtc.feature"
,glue= {"Stepdefinition1"})
public class Demo {
	
	

	

}
