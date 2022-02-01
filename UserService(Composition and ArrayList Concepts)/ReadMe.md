**<==================== UserService(Composition and ArrayList Concepts) ====================>**

_Reference: Given as a Lab assignment in University_

Develop a menu driven application that shall allow user to choose different option numbers to add, search, update and delete users in an ArrayList object. Make a UserService class and implement different methods to perform each operation. These methods shall be called from main metod of UserServiceTest class. The ArrayList shall be defined as private instance variable in UserService, of type ArrayList<User> named users.


The User class shall be composed of id, name and city fields. Define a constructor in User class that shall take and initialize id and name fields. Initialize the city field using setCity method. When user choose an option number for search, you shall take a string from user and list all those users id, name ad city where given string appears in user name or city (use some method of String class or StringUtils class from Apache Commons library to match sub-string for search). Search operation shall be performed by a method in UserService class, ArrayList<User> search(String searchString), the method shall be called from UserServiceTest class where menu logic shall be implemented.


When user choose to add a new user, get name and city from user input (id shall be auto-incremented for each object, starting from 1). After getting the data, ask user at what index the object shall be added. You shall call void add(User user, int index) method defined in UserService class to add new user object at given index. If user enters an invalid index (i.e. => ArrayList size), show an error message and retake the index from user. After adding the user in ArrayList, show generated id for the added user. e.g. "User added with id 3". If users enters negative value for index, then add the user object as last element in the ArrayList.


When user choose to update user, get user id as input. Define User getUser(int userID) method in UserService class that shall return the user with given user ID. You shall display the current name and city of the user and let him/her update by getting updated name and city from input. Update both fields of that object in ArrayList. Do not change the user ID. To update, you shall call void updateUser(int userID, String newName, String newCityName).


When user choose to delete an object from the ArrayList, get user ID as input. Pass that id to UserService deleteUser method (boolean deleteUser(int userID), the method shall first search the ArrayList where that user is stored. Once you searched its index, remove that user from the ArrayList object. If no user exist with the specified ID, the method shall return false to indicate that no user was found inside the ArrayList with specified ID.


After adding and deleting, print how many users are there in the list. The count shall be retrieved by calling int getUsersCount() defined in UserService class.


Create a method User[] getUsers(int... ids) in UserService that shall retrieve all users from the users ArrayList and return them by making an Array of those objects. Take ids from user. Definiltey, you shall give an option for this and get required number of inputs. In main method, you shall print the names and IDs of the returned users.


Add another menu option in menu, "Press <n> to search by city name". Get city name from user input and show all users who belong to that city. It shall be done calling a method a ArrayList<User> searchByCityName(String city) defined in UserService class. In body of this method, you shall iterate all users stored in users ArrayList and filter those where the city name matches with parameter value. You shall add all matching users in an ArrayList and return. The main method shall print IDs and names of those users.


Create a method void printUserCountByCityName() in UserService class that shall print unique city name and numbers of users that belong to each city: e.g.

Lahore - 4 users

Karachi - 6 users

and so

Add approppriate option to invoke this operation in menu.
