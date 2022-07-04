package testrunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;

import cucumber.api.junit.Cucumber;

	



	@RunWith(Cucumber.class)
	@CucumberOptions(
			   features = "src/test/java/feature",
		        glue ={"stepdefinition"},
		        monochrome = true,//proper allign
		        		dryRun = false,
		        		tags={"@tarun"},  //And condition
		        		//tags={"@tarun,@tarun"},  //OR condition
		        		//tags={"~@tarun"},  //skipping tag
		        		//plugin = {"pretty"}
		                plugin = {"pretty","html:Reports","json:Reports/jsonreport.json","junit:Reports/xmlreport.xml" }
			   )
		        		
			   
	public class runner{
	

	}


