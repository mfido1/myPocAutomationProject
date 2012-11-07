require 'calabash-android/calabash_steps'

When /^"(.*?)" is running$/ do |viewName|
  #performAction('get_activity_name', viewName)
end

Then /^I see the "(.*?)" as "(.*?)"$/ do |text, viewID|
  performAction('assert_text_in_textview', text, viewID)
end


