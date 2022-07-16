package stepdefinitions;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StockLibrary 

{     
	public static WebDriver driver;
	
	@Given("^i open browser with url \"([^\"]*)\"$")
	public void i_open_browser_with_url(String url)  
	{
		   System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		   driver = new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.manage().deleteAllCookies();
		   driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		   
		   driver.get(url);
	}

	@Then("^i shold see submit page$")
	public void i_shold_see_submit_page() 
	{
		if(driver.findElement(By.id("loginsubmit")).isDisplayed())
		{
			System.out.println("submit page displayed");
		} 
	}

	@When("^i enter usrename as \"([^\"]*)\"$")
	public void i_enter_usrename_as(String user) 	
	{
		 driver.findElement(By.id("useremail")).sendKeys(user); 
	}

	@When("^i enter password as\"([^\"]*)\"$")
	public void i_enter_password_as(String pass) 
	{
		 driver.findElement(By.id("userpass")).sendKeys(pass); 
	}

	@When("^i click submit$")
	public void i_click_submit()  
	{    
		
		driver.findElement(By.id("loginsubmit")).click();
		
		
	}

	@When("^i click Add Stock first as \"([^\"]*)\"$")
	public void i_click_Add_Stock_first_as(String arg1) throws InterruptedException 
	{      
		WebElement links = driver.findElement(By.id("addStock"));
	    
		   
		  try 
		   {
			links.click();
		    } catch (StaleElementReferenceException e) 
		   {
		    	links = driver.findElement(By.id("addStock"));
		    	links.click();
		    }
		  
		  // driver.findElement(By.id("addStock")).click();
		   driver.findElement(By.id("addstockname")).sendKeys(arg1);
		   driver.findElement(By.id("13020007")).click();
		   driver.findElement(By.id("stockAddDate")).sendKeys("14-07-2022");
		   driver.findElement(By.id("addstockqty")).sendKeys("2");
		   driver.findElement(By.id("addstockprice")).sendKeys("200");
		   
		   driver.findElement(By.id("addStockButton")).click(); 
	}
	
	@When("^i click Add Stock second as \"([^\"]*)\"$")
	public void i_click_Add_Stock_second_as(String arg2)
	{
		
		 WebElement links = driver.findElement(By.id("addStock"));
		    
		   
		  try 
		   {
			links.click();
		    } catch (StaleElementReferenceException e) 
		   {
		    	links = driver.findElement(By.id("addStock"));
		    	links.click();
		    }
		   
		   driver.findElement(By.id("addstockname")).sendKeys(arg2);
		   driver.findElement(By.id("10520003.01")).click();
		   driver.findElement(By.id("stockAddDate")).sendKeys("15-07-2022");
		   driver.findElement(By.id("addstockqty")).sendKeys("2");
		   driver.findElement(By.id("addstockprice")).sendKeys("200");
		   
		   driver.findElement(By.id("addStockButton")).click(); 
	}

	@When("^i click Add Stock third as \"([^\"]*)\"$")
	public void i_click_Add_Stock_third_as(String arg3)
	{
		 WebElement links = driver.findElement(By.id("addStock"));
		 
		  try 
		   {
			links.click();
		    } catch (StaleElementReferenceException e) 
		   {
		    	links = driver.findElement(By.id("addStock"));
		    	links.click();
		    }
		   
		   driver.findElement(By.id("addstockname")).sendKeys(arg3);
		   driver.findElement(By.id("10520003")).click();
		   driver.findElement(By.id("stockAddDate")).sendKeys("16-07-2022");
		   driver.findElement(By.id("addstockqty")).sendKeys("3");
		   driver.findElement(By.id("addstockprice")).sendKeys("300");
		   
		   driver.findElement(By.id("addStockButton")).click(); 
	}

	@When("^i click Add Stock fourth as \"([^\"]*)\"$")
	public void i_click_Add_Stock_fourth_as(String arg4)
	{
		 WebElement links = driver.findElement(By.id("addStock"));
		    
		  try 
		   {
			links.click();
		    } catch (StaleElementReferenceException e) 
		   {
		    	links = driver.findElement(By.id("addStock"));
		    	links.click();
		    }
		   
		   driver.findElement(By.id("addstockname")).sendKeys(arg4);
		   driver.findElement(By.id("14030010")).click();
		   driver.findElement(By.id("stockAddDate")).sendKeys("17-07-2022");
		   driver.findElement(By.id("addstockqty")).sendKeys("3");
		   driver.findElement(By.id("addstockprice")).sendKeys("300");
		   
		   driver.findElement(By.id("addStockButton")).click();  
	}

	@When("^i click Add Stock five as \"([^\"]*)\"$")
	public void i_click_Add_Stock_five_as(String arg5) 
	{
		WebElement links = driver.findElement(By.id("addStock"));
	    
		  try 
		   {
			links.click();
		    } catch (StaleElementReferenceException e) 
		   {
		    	links = driver.findElement(By.id("addStock"));
		    	links.click();
		    }
		  
		   driver.findElement(By.id("addstockname")).sendKeys(arg5);
		   driver.findElement(By.id("17090175")).click();
		   driver.findElement(By.id("stockAddDate")).sendKeys("18-07-2022");
		   driver.findElement(By.id("addstockqty")).sendKeys("3");
		   driver.findElement(By.id("addstockprice")).sendKeys("400");
		   
		   driver.findElement(By.id("addStockButton")).click();  
	}

@When("^i click delete add stock$")
public void i_click_delete_add_stock() 
{
	 WebElement lock =  driver.findElement(By.id("deletePortfolio"));
     try 
     {
		lock.click();
	} catch (Exception e) 
     {
		lock =  driver.findElement(By.id("deletePortfolio"));
		lock.click();
	}  
}

@Then("^i should see the alert msg$")
public void i_should_see_the_alert_msg()  
{
	 driver.switchTo().alert().accept();
}

@Then("^i should see name your portfolio$")
public void i_should_see_name_your_portfolio() 
{
	 if(driver.findElement(By.xpath("//*[@id=\"create\"]")).isDisplayed())
	 {
		 System.out.println("name your portfolio page displayed");
	 }
}

@When("^i enter keyword as \"([^\"]*)\"$")
public void i_enter_keyword_as(String key) 
{
	     WebElement words = driver.findElement(By.xpath("//*[@id=\"create\"]")); 
	try 
	{
	   words.sendKeys("dhakad");
	   Thread.sleep(2000);
    } catch (Exception e) 
	{
    	words = driver.findElement(By.xpath("//*[@id=\"create\"]"));
    	words.sendKeys("dhakad");
    }
	  
    }

@When("^i click createportfolio$")
public void i_click_createportfolio() 
{
	 driver.findElement(By.id("createPortfolioButton")).click();
}

@When("^i click logout$")
public void i_click_logout() 
{
	try 
	{
	    driver.findElement(By.linkText("Sign Out")).click();

		
	} catch (StaleElementReferenceException e) 
	{
		System.out.println("Stale element ");
	}
}

@When("^i close browser$")
public void i_close_browser() 
{
	driver.close(); 
}
@When("^i click addmutual funds$")
public void i_click_addmutual_funds()
{
	driver.findElement(By.id("addmf")).click(); 
}

@When("^i enter \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
public void i_enter_and_and_and(String arg1, String arg2, String arg3, String arg4) throws InterruptedException
{
	 WebElement fund = driver.findElement(By.id("mfname"));
	 fund.sendKeys(arg1);
	 Thread.sleep(2500);
	 fund.sendKeys(Keys.ENTER);
    
    driver.findElement(By.id("mfinitialAmt")).sendKeys(arg2);
    driver.findElement(By.id("addMFDate")).sendKeys(arg3);
    driver.findElement(By.id("mfprice")).sendKeys(arg4);
}

@When("^i click addmf$")
public void i_click_addmf() 
{
	 driver.findElement(By.id("addMFButton")).click(); 
}
@When("^i click on my watchlist$")
public void i_click_on_my_watchlist() throws InterruptedException
{
	Thread.sleep(2000);
	driver.findElement(By.linkText("My Watchlist")).click();;
}



@When("^i click add stocks$")
public void i_click_add_stocks() 
{
  driver.findElement(By.id("add-stock-button")).click();  
}

@Then("^i should see Add to Watchlist and set alerts$")
public void i_should_see_Add_to_Watchlist_and_set_alerts() 
{
  if (driver.findElement(By.id("add-stock-submit")).isDisplayed()) 
  {
	System.out.println("system displayed Watchlist and set alerts");
}
}

@When("^i enter stocks \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
public void i_enter_stocks_and_and(String arg1, String arg2, String arg3) throws InterruptedException 
{
   WebElement watch = driver.findElement(By.id("stocksearch")); 
   watch.sendKeys(arg1);
   Thread.sleep(1500);
   watch.sendKeys(Keys.ENTER);
   
   driver.findElement(By.id("maxprice")).sendKeys(arg2);
   driver.findElement(By.id("minprice")).sendKeys(arg3);
 }

@When("^i click add$")
public void i_click_add() 
{
  driver.findElement(By.id("add-stock-submit")).click(); 
}

	
	
	
	
	
}






