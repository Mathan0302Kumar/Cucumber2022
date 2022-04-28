$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Login.feature");
formatter.feature({
  "name": "Generating the order id from adactin hotel application",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Generating Order id",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on Adactin1 hotel app page on chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDef1.user_is_on_Adactin_hotel_app_page_on_chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters the username and password.",
  "keyword": "When "
});
formatter.match({
  "location": "StepDef1.user_enters_the_username_and_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should click the login button.",
  "keyword": "And "
});
formatter.match({
  "location": "StepDef1.user_should_click_the_login_button()"
});
formatter.result({
  "error_message": "java.lang.NullPointerException\r\n\tat org.stepdef.StepDef1.user_should_click_the_login_button(StepDef1.java:33)\r\n\tat ✽.User should click the login button.(src/test/resources/Login.feature:7)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "User should verify homepage is displayed or not.",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDef1.user_should_verify_homepage_is_displayed_or_not()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
});