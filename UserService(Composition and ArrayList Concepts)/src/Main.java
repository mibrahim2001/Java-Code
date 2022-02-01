import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void printList(ArrayList<User> list){
        for(User user : list){
            System.out.println(user);
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;
        UserService service = new UserService();
        System.out.println(UserService.userCount);
        int option;

        do {
            System.out.println("Please choose one of the options below:\n1.Add User\n2.Search User\n3.Delete User\n4.Update User\n5.Search User by City Name\n6.Display user by id\n7.Get a single user by id\n");
            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("\nEnter Name: ");
                    input.nextLine();
                    String name = input.nextLine();
                    System.out.println("\nEnter City Name: ");
                    String cityName = input.nextLine();
                    System.out.println("\nEnter the index at which you want the user to be added: ");
                    int indexAdd = input.nextInt();
                    User localUser = new User(name, cityName);
                    service.addUser(localUser, indexAdd);
                    break;
                case 2:
                    System.out.println("\nPlease enter the search term: ");
                    input.nextLine();
                    String searchTerm = input.nextLine();
                    ArrayList<User> tempList = service.searchUser(searchTerm);
                    for(User user: tempList)
                        System.out.println(user);
                    break;
                case 3:
                    System.out.println("\nPlease enter the ID of the user you want to delete: ");
                    int delID = input.nextInt();
                    boolean result = service.deleteUser(delID);
                    if (result) {
                        System.out.println("\nThe user was successfully deleted!");
                    } else
                        System.out.println("\nThe user was not found i.e Incorrect user id");
                    break;
                case 4:
                    System.out.println("\nPlease enter the ID of the user you want to update: ");
                    int updateID = input.nextInt();
                    System.out.println("\nPlease enter the new name: ");
                    input.nextLine();
                    String newName = input.nextLine();
                    System.out.println("\nPlease enter the new city name: ");
                    String newCity = input.nextLine();
                    service.updateUser(updateID, newName, newCity);
                    break;
                case 5:
                    System.out.println("\nPlease enter the city name: ");
                    input.nextLine();
                    String searchingCity = input.nextLine();
                    ArrayList<User> tempList2 = service.searchByCityName(searchingCity);
                    System.out.println("\nThe following users were found under this city name: \n");
                    System.out.println(tempList2);
                    break;
                case 6:
                    System.out.println("\nEnter the amount of ids you want to search: \n");
                    int number = input.nextInt();
                    Integer[] ids = new Integer[number];
                    for (int i = 0; i < number; i++) {
                        System.out.printf("\nEnter the id: \n");
                        int id = input.nextInt();
                        ids[i] = id;
                    }
                    User[] searchedUsers = service.getUsers(ids);
                    System.out.println("\nFollowing users were found: \n");

                    for(User user: searchedUsers)
                        System.out.println(user);
                    break;

                case 7:
                    System.out.println("\nEnter the id of the user: \n");
                    int userid = input.nextInt();
                    User gotUser = service.getUser(userid);
                    System.out.println(gotUser);
                    break;

                default:
                    System.out.println("\nPlease enter a valid value!!\n");

            }

            System.out.println("\n\nIf you want to continue press 1 and 0 to quit.\n");
             option = input.nextInt();
        }while (option == 1);

    }
}
