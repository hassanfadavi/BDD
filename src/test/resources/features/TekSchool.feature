Feature:  Navigate to TekSchool

  Scenario: Navigate to TekSchool website from google

    Given The user is on google web page
    When The user enters TekSchool on google search bar and hit the enter
    Then The user should be navigate into goolge search results
    Then The user should see TekSchool website as a resukt of the search
    Then The user should click on TekSchool link
    Then The user should be navigate to TekSchool website