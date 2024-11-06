Feature: Invalid Login Feature

  Background:
    Given user navigate to the Website
    And click on login button
  @fail
  Scenario Outline: User login with invalid or empty credentials and verify the error message
    #Given user navigate to the Website
    When user enters the credentials "<username>" "<password>"
    #And click on login button
    Then verify the error message is "<Message>"
    Examples:
      | username | password    | Message|
      |          | 12345678      |   يجب ادخال البريد الالكتروني       |
      |    a.saad@ni.iq |              |   يجب ادخال رمز المرور    |
      | admin    | 12345678  |البريد الإلكتروني او رمز الدخول الذي أدخلته يبدو غير صحيح. |
      | admin    | 123456  | يجب أن يكون رمز المرور 6 أحرف على الأقل|

  @PASS
  Scenario: valid login
  #Given user navigate to the Website
    When user enters ess username and password
  # And user clicks on login button
    Then user is successfully logged in the application