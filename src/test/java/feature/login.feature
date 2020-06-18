Feature: Website login feature

Scenario: Positive login to website
Given    User enters amazon.com website
And      User clicks login button
When     User enters valid username "test"
And      User enters valid password "12345"
And      User clicks signin button
Then     User should land into homepage




Scenario: Negative login to website
Given    User enters amazon.com website
And      User clicks login button
When     User enters invalid username "app"
And      User enters invalid password "2244"
And      User clicks signin button
Then     User shouldnot land into homepage
And      User should see an error message