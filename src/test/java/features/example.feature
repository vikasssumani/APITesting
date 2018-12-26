Feature: Testing scenarion with Examples
  @tag2
  Scenario Outline: Title of your scenario outline
    Given user perform the get operation for <url>
    When user gets a success response with <status_code> 
    Then verify the number of items in response as <items>

    Examples: 
      | url  | status_code | items  |
      | "/posts/" |    200 | 20 |

