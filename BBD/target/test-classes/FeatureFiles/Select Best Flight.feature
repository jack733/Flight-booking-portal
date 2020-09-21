@Firstpage

Feature: Select Best Flight
 
Scenario: Choose fastest and Cheapest flight
  
  Given Access Flights Website
  Then  Search the flights with selected Source and Destination
  And   Get the fare charges
  Then  Sort by Cheapest and Fastest
  And   Select the best itinerary
  Then  Quit the Browser