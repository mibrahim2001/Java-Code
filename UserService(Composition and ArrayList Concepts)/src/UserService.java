import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class UserService {
     private ArrayList<User> users = new ArrayList<User>();
     static int userCount;

    public UserService() {
    }

    public UserService(ArrayList<User> users) {
        this.users = users;
    }

    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }


    public void addUser(User user,int index){
        if((index<=users.size())&&(index>=0)){
            users.add(index,user);
            userCount++;
        }
        else if(index<0){
            users.add(user);
            userCount++;
        }
        else{
            System.out.println("\nPlease enter index value less than "+ users.size());
        }

        System.out.println("\nThe user was registered with id "+ user.getId());
    }


    public ArrayList<User> searchUser(String searchString) {
        ArrayList<User> searchedUser = new ArrayList<User>();
        for (User user : users) {
            String name = user.getName();
            String city = user.getCity();

            if (name.contains(searchString) || city.contains(searchString))
                searchedUser.add(user);
            else
                continue;
        }
        return searchedUser;
    }

    public User getUser(int userid){
        for(User user:users){
            if (user.getId() == userid) {
                return user;
            }
        }
    return null;
    }


    public void updateUser(int userID,String newName, String newCityName){
        getUser(userID).setName(newName);
        getUser(userID).setCity(newCityName);
    }



    public boolean deleteUser(int userID){
        boolean result = false;
         for(User user:users){
            if(user.getId()==userID){
                users.remove(user);
                userCount--;
                result = true;
            }
            else {
                result = false;
            }

         }
         return result;
    }

    public User[] getUsers(Integer @NotNull [] ids){
        User[] arrayOfUsers = new User[ids.length+1];
        int i =0;
        for(int id:ids){
            for(User user:users){
                if(user.getId()==id){
                    arrayOfUsers[i] = user;
                    i++;
                }
            }
        }

        return arrayOfUsers;
    }


    public ArrayList<User> searchByCityName(String city) {
        ArrayList<User> searchedUser = new ArrayList<>();
        for (User user : users) {
            String searchingCity = user.getCity();

            if (searchingCity.contains(city))
                searchedUser.add(user);
            else
                continue;
        }
        return searchedUser;
    }



}
