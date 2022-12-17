@tag
Feature:login 

  @tag1
  Scenario: User should be successfully login into the application
   Given open the browser enter the url
   When enter valid username and valid password
   And click on login button
   Then home page should be dispalyed 
 
