package Runner;



import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\ameen\\Documents\\Selenium Scripts\\cucumber1\\src\\test\\java\\feature", // location of feature file
		glue="Step_definition"
		
		)

     public class runner {

}
