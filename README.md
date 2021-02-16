# Advanced Spring Boot homework

### Instructions

1. Make the database for the subscriberList project persist to a file. (See class recording during office hour and final lesson slide.)

2. Add Bootstrap functionality and styling using the CDN from the Bootstrap website: https://getbootstrap.com/docs/4.5/getting-started/introduction/
  - Place the CSS link in the head of each page
  - place the scripts right before the closing body tag
  - wrap the page content in a div with class="container-fluid"

3. Add Bootstrap styling for the two template pages we made in class

4. Add an additional method in the controller
  - use the 'Get' annotation with a path(value) of "/subscribers"
  - name your method 'getAllSubscribers', include a parameter 'Model model'
  - inside the controller method use a subscriberRepository method to find all of the subscribers and store it as a List (what kind of objects will be in the list?)
  - make the list available to the Model using the addAttribute method, remember that the method you want takes two arguments: a string and a variable
  - have the method return the string "subscriber/subscribers"

5. Add a new template page: "subscribers.html"
  - set up the page with html 5
  - add Thymeleaf to the html tag
  - add Bootstrap to the page and add styling
  - create html content to display the first name and last name of each subscriber (look up how to do an enhanced for-loop with Thymeleaf)
  - add a link to allow the user to see subscriber details, (it doesn't need to work though)

6. add navigation links to the result page and the subscribers page to get back to index.html

### Submit:

Please submit a link to your GitHub repository with the completed assignment
