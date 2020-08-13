Feature:
  As a user go to google page and search amazon

  @googleamazon
  Scenario:amazon-search
    Given User is on the google search page
    When user write amazon on search box
    Then user should go to amazon page