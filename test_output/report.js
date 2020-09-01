$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/priyanka.bhalekar/eclipse-workspace/VIUBDDFramework/src/main/java/com/features/Login.feature");
formatter.feature({
  "line": 1,
  "name": "VIU login feature",
  "description": "",
  "id": "viu-login-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "VIU login Test Scenario",
  "description": "",
  "id": "viu-login-feature;viu-login-test-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "user is already in login page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "title of login page is VIU",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user enters user name and password",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "user clicks on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user is on home page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinition.user_is_already_in_login_page()"
});
formatter.result({
  "duration": 18903014000,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.title_of_login_page_is_VIU()"
});
formatter.result({
  "duration": 15957000,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_enters_user_name_and_password()"
});
formatter.result({
  "duration": 964083200,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_clicks_on_login_button()"
});
formatter.result({
  "duration": 215431900,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_is_on_home_page()"
});
formatter.result({
  "duration": 3454765900,
  "status": "passed"
});
});