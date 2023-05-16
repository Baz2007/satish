Feature: Recruiting Functionality

  @tag4
  Scenario Outline: Recruiting Functionality
    Given User is logged and Navigated to Recruitment
    Then User click on Recruitment Tab
    Then User click on the add button
    Then user enters the Firstname "<FirstName>"
    Then user enters the Midname "<MiddleName>"
    Then User enters the lastname "<LastName>"
    Then User select valid VacancyValue  "<VacancyValue>"
    Then User enters the Email_id  "<Email>"
    Then user enters the Contact number  "<Contact>"
    Then user upload the file  "<Browse>"
    Then user enters the valid date  "<Date>"
    Then user clicks on the save button
    

        Examples: 
      |FirstName|MidName|LastName|VacancyValue        |Email                     |Contact   |Date      |
      |Puneeth  |Raj    |Kumar	 |Associate IT Manager|satishversatile3@gmail.com|1234567890|15-05-2023|
     
