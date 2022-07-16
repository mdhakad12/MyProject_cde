package testrunners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)
@CucumberOptions(features ="Featurefiles/stock.feature",glue ="stepdefinitions",dryRun = false,
tags =("@tag1"),plugin ={"com.cucumber.listener.ExtentCucumberFormatter:Reports/stockresult.html"})
public class AddStockTest extends AbstractTestNGCucumberTests
{

}
