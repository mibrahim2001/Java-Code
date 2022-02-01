/*
import java.io.*;
import java.util.ArrayList;


public class FileHandle {
    private static ArrayList<Account> accounts = new ArrayList<>();
    private static File myFile = new File("Account.ser");


    */
/** Method to add records to the file*//*

    public static boolean addRecord(Account AccountObject) {
        //clearing the array if any data already exist in it
        accounts.clear();

        //reading the objects from file to store them in the array
        readObjects(myFile);

        //checking that Account with same id exist in file already or not
        for(Account currentAccount:accounts){
            if(currentAccount.getId() == AccountObject.getId()){
                return false;
            }

        }

        //adding the new Account to the array
        accounts.add(AccountObject);

        //writing array (that now contains the added Account) to the file
        writeObjects(myFile);

        //return true if added successfully
        return true;

    }

    */
/**Method to search record of a Account*//*

    public static Account searchRecord(int searchID){
        ObjectInputStream reader = null;
        try {
            reader = new ObjectInputStream(new FileInputStream(myFile));

            if(reader != null) {
                System.out.println("file opened");
                while (true) {
                    try {
                        Account temp = (Account) reader.readObject();
                        if(temp.getId() == searchID){
                            return temp;
                        }
                    }catch (EOFException e){
                        System.err.println("loop break");
                        break;

                    }catch (ClassNotFoundException e) {
                        e.printStackTrace();
                    }
                }
            }
        }catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(reader != null){
                try {
                    reader.close();
                    System.out.println("file closed");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return null;
    }


    */
/** Method to delete the Account data*//*

    public static boolean deleteAccount(int AccountID){
        boolean deleted = false;
        Account AccountToDelete = null;
        accounts.clear(); //clearing the array if anything is already present

        //reading the accounts in file
        readObjects(myFile);
        for(Account currentAccount:accounts){
            if(currentAccount.getId() == AccountID){
                AccountToDelete = currentAccount;
            }
        }

        //checking if the AccountToDelete variable contains some Account or not
        if(AccountToDelete!=null) {
            accounts.remove(AccountToDelete); //removing the Account if the id matches with the given id
            deleted = true;
        }else
            deleted = false;

        //overwriting the file without the deleted user
        writeObjects(myFile);

        //returning the boolean variable deleted that will be true if the object is found and deleted
        return deleted;
    }

    */
/**Method to edit Account data*//*

    public static void editAccount(int AccountID,String name,String gender,int age){
        accounts.clear(); //clearing the array if anything is already present

        //reading the accounts in file
        readObjects(myFile);
        for(Account currentAccount:accounts){
            if(currentAccount.getId() == AccountID) {
                currentAccount.setName(name);
                currentAccount.setGender(gender);
                currentAccount.setAge(age);
            }

        }
        //overwriting the file without the deleted user
        writeObjects(myFile);

    }

    */
/**Method to read objects from the file*//*

    public static void readObjects(File file){
        ObjectInputStream reader = null;
        try {
            reader = new ObjectInputStream(new FileInputStream(file));

            if(reader != null) {
                System.out.println("file opened");
                while (true) {
                    try {
                        Account temp = (Account) reader.readObject();
                        accounts.add(temp);
                    }catch (EOFException e){
                        break;

                    }catch (ClassNotFoundException e) {
                        e.printStackTrace();
                    }
                }
            }
        }catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(reader != null){
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }

    */
/**Method to write objects on the file*//*

    public static void writeObjects(File file){

        try {
            ObjectOutputStream writer = new ObjectOutputStream(new FileOutputStream(file));
            for(Account currentAccount:accounts){
                writer.writeObject(currentAccount);
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
*/
