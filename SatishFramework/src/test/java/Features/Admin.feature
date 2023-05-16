Feature: Admin Feature Testing


  @Admin
  Scenario Outline:  Admin functionality
    Given User is logged and Navigated to PIM page
    Then User click on Admin Tab
    Then User enter valid User Name "<Username>"

    Examples: 
               |Username|
               |Satish  |    
  

  
  @adduser
  Scenario Outline:  Admin functionality
    Given User is logged and Navigated to PIM page
    Then User click on Admin Tab
    Then User select valid User Role "<UserRole>"
    Then User enter valid Employee Name for Add User "<EmployeeName>"
    Then User enter valid Status "<Status>"
    Then User enter valid UserName "<UserName>"
    Then User enter valid  Password "<Password>"
    Then User enter valid  ConfirmPassword "<ConfirmPassword>"
    Then User clicks on the submit button
    Then User close the browser
	
    Examples: 
               |UserRole|EmployeeName  |Status   |UserName|Password   |ConfirmPassword |
               |ESS     |GarryWhite    |Enabled  |Helper  |Kingss@123 |Kingss@123      |