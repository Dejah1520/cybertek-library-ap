

  Feature: Create login function for librarian

    Scenario: Login as a librarian
      Given Librarian is on home page
      When Librarian puts in username "librarian46@library" and password "YiDR3nCQ"
      And Summit to login
      Then Librarian should see home page
