import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Student[] students;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number of students: ");
        int len = input.nextInt();
        students = new Student[len];

        for (int i = 0; i < students.length; i++) {
            System.out.printf("%nCollecting data of Student %d:%n", i + 1);
            System.out.println("Please enter the name of Student: ");
            input.nextLine();
            String name = input.nextLine();
            Student student = new Student(name, i + 1);
            students[i] = student;
            System.out.printf("Please enter the number of tests: %n");
            students[i].marks = new int[input.nextInt()];
            for (int j = 0; j < students[i].marks.length; j++) {
                System.out.printf("Please enter marks of test %d: %n", j + 1);
                students[i].marks[j] = input.nextInt();
            }
            System.out.printf("How many phone numbers this person has?%n");
            long[] phoneNumbers = new long[input.nextInt()];
            for (int c = 0; c < phoneNumbers.length; c++) {
                System.out.printf("Enter phone number %d ", c + 1);
                phoneNumbers[c] = input.nextLong();
            }
            students[i].setPhoneNumber(phoneNumbers);

        }


        GradeBook myGradeBook = new GradeBook("CS101 Object Oriented Programming", students);
        System.out.printf("Welcome to the Grade Book for %s%n%n", myGradeBook.getCourseName());
        myGradeBook.processGrades();
    }


}
