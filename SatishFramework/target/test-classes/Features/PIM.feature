Feature: PIM Feature Testing

  @tag2
  Scenario Outline: PIM functionality
    Given User is logged and Navigated to PIM page
    Then User click on PIM Tab
    Then User click on the add button
     Then user enters the firstname "<FirstName>"
     Then user enters the Midname   "<MidName>"
     Then User enters the lastname  "<LastName>"
     Then user clicks on the save button
    

    Examples: 
               | FirstName|MidName|LastName|
               | Sharat   |Kumar  |Maggi   |     