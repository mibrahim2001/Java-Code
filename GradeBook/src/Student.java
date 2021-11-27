import java.io.PrintStream;

public class Student {
    private String name;
    private int id;
    public int[] marks;
    private long[] phoneNumber;

    public long[] getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long[] phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public int totalMarks(){
        int sum = 0;
        for(int flag: marks){
            sum += flag;
        }
        return sum;
    }
    public double getStudentAverage(){

        return (double) totalMarks() / marks.length;
    }



    public String toString(){
        return String.format("%n%nStudent ID: %d%nName: %s%nTotal Marks in Tests: %d%nAverage Marks in Tests: %.2f",getId(),getName(),totalMarks(),getStudentAverage());
    }
}
