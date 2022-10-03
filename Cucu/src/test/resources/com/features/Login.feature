Feature: Validate login functionality
  
Scenario: user should be able to login after valid credentials
	  Given Launch the browser
    And User enters email ("queuecodes@gmail.com")
    And  User enters password ("123456")
    When  User Clicks on submit
    Then login Successful
    

