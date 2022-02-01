import java.io.*;
import java.util.ArrayList;


public class FileHandle {
     private static ArrayList<Student> students = new ArrayList<>();
     private static File myFile = new File("student.ser");

    /** Method to add records to the file*/
     public static boolean addRecord(Student studentObject) {
         //clearing the array if any data already exist in it
         students.clear();

         //reading the objects from file to store them in the array
         readObjects(myFile);

         //checking that student with same id exist in file already or not
         for(Student currentStudent:students){
             if(currentStudent.getId() == studentObject.getId()){
                 return false;
             }

         }

         //adding the new student to the array
         students.add(studentObject);

         //writing array (that now contains the added student) to the file
         writeObjects(myFile);

         //return true if added successfully
         return true;

     }

    /**Method to search record of a student*/
     public static Student searchRecord(int searchID){
         ObjectInputStream reader = null;
         try {
             reader = new ObjectInputStream(new FileInputStream(myFile));

             if(reader != null) {
                 System.out.println("file opened");
                 while (true) {
                     try {
                         Student temp = (Student) reader.readObject();
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


    /** Method to delete the student data*/
     public static boolean deleteStudent(int studentID){
         boolean deleted = false;
         Student studentToDelete = null;
         students.clear(); //clearing the array if anything is already present

        //reading the students in file
         readObjects(myFile);
         for(Student currentStudent:students){
             if(currentStudent.getId() == studentID){
                studentToDelete = currentStudent;
             }
         }

         //checking if the studentToDelete variable contains some student or not
         if(studentToDelete!=null) {
             students.remove(studentToDelete); //removing the student if the id matches with the given id
             deleted = true;
         }else
             deleted = false;

        //overwriting the file without the deleted user
         writeObjects(myFile);

         //returning the boolean variable deleted that will be true if the object is found and deleted
         return deleted;
    }

    /**Method to edit student data*/
    public static void editStudent(int studentID,String name,String gender,int age){
        students.clear(); //clearing the array if anything is already present

        //reading the students in file
        readObjects(myFile);
        for(Student currentStudent:students){
            if(currentStudent.getId() == studentID) {
                currentStudent.setName(name);
                currentStudent.setGender(gender);
                currentStudent.setAge(age);
            }

        }
        //overwriting the file without the deleted user
        writeObjects(myFile);

     }

     /**Method to read objects from the file*/
     public static void readObjects(File file){
        ObjectInputStream reader = null;
        try {
            reader = new ObjectInputStream(new FileInputStream(file));

            if(reader != null) {
                System.out.println("file opened");
                while (true) {
                    try {
                        Student temp = (Student) reader.readObject();
                        students.add(temp);
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

     /**Method to write objects on the file*/
     public static void writeObjects(File file){

        try {
            ObjectOutputStream writer = new ObjectOutputStream(new FileOutputStream(file));
            for(Student currentStudent:students){
                writer.writeObject(currentStudent);
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

     }


    }
