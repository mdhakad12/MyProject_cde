package testrunners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features ="Featurefiles/watchlist.feature",glue ="stepdefinitions",dryRun = false)

public class Mywatchlist 
{

}
