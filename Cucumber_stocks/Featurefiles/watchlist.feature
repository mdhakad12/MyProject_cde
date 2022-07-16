    
    Feature: my watchlist
    I want to use this template to my watchlist adding stocks

    Scenario Outline: Add mywatchlist
    Given i open browser with url "https://portfolio.rediff.com/portfolio-login"
    Then i shold see submit page
    When i enter usrename as "kishanjadhav456@gmail.com"
    And i enter password as"Kishan05@"
    And i click submit
    When i click on my watchlist
    And i click add stocks
    Then i should see Add to Watchlist and set alerts
    When i enter stocks "<Sname>" and "<Gabove>" and "<Gbelow>"
    And i click add
    
     Examples:
    |Sname|Gabove|Gbelow|
    |Himandri|1000|500| 