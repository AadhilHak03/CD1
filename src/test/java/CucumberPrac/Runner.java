package CucumberPrac;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/CucumberPrac", glue="StepDef1", monochrome=true, plugin= {"html:target/cucumber.html"}
)
public class Runner extends AbstractTestNGCucumberTests {

}
