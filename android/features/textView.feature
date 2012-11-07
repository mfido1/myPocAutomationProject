Feature: textView feature

  Scenario: Scenario: I can input text into a text edit field when my application 
starts
    When my app is running
    Then I see the text "Hello, Android NativeDriver!"
    Then I see the text "Text Value Activity" 
    Then I see the text "Edit Me"
    Then I enter "blah blah blah" into input field number 1 


    