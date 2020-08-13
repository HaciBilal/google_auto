
Feature:
  As a user go to google page and search apple

  @googleapple
  Scenario:Apple-search
    Given User is on the search page
    When user write apple on search box
    Then user should go to apple page