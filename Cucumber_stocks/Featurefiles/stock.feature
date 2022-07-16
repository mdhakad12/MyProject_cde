
  Feature: Addstock
  I want to use this template to Addstock with valid company name

    @tag
    Scenario: Add stock with valid data
    Given i open browser with url "https://portfolio.rediff.com/portfolio-login"
    Then i shold see submit page
    When i enter usrename as "mdhakad2015@gmail.com"
    And i enter password as"Qedge123!@#"
    And i click submit
    When i click Add Stock first as "info"
    And  i click Add Stock second as "tech"
    And  i click Add Stock third as "mah"
    And  i click Add Stock fourth as "bank"
    And  i click Add Stock five as "easy"
    And i click delete add stock
    Then i should see the alert msg
    And i should see name your portfolio
    When i enter keyword as "abc"
    And i click createportfolio
    And i click logout
    When i close browser
    
    @tag1
    Scenario Outline: Adding mutual funds
    Given i open browser with url "https://portfolio.rediff.com/portfolio-login"
    Then i shold see submit page
    When i enter usrename as "mdhakad2015@gmail.com"
    And i enter password as"Qedge123!@#"
    And i click submit
    When i click addmutual funds
    And i enter "<mfname>" and "<iniamount>" and "<mfdate>" and "<mfunit>"
    And i click addmf
    And i click logout
    When i close browser
    
    Examples:
    |mfname|iniamount|mfdate|mfunit|
    |ICICI|1000|15-07-2022|2|
    |SBI|4000|15-07-2022|3|
    |Kotak|1500|16-07-2022|4|
    |HDFC|1500|17-07-2022|1|
    |IDFC|1000|18-07-2022|3|
    
   
    
    