public class GradeBook {
    private final Student[] students;
    private String courseName;

    public GradeBook(String courseName, Student[] students) {
        this.courseName = courseName;
        this.students = students;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Student getMaximum() {
        Student highestGradeStudent = students[0];
        for (Student student : students) {
            if (student.totalMarks() > highestGradeStudent.totalMarks())
                highestGradeStudent = student;


        }
        return highestGradeStudent;
    }

    public Student getMinimum() {
        Student lowestGradeStudent = students[0];
        for (Student student : students)
            if (student.totalMarks() < lowestGradeStudent.totalMarks())
                lowestGradeStudent = student;

        return lowestGradeStudent;
    }

    public double getClassAverage() {
        int total = 0;

        for (Student student : students)
            total += student.getStudentAverage();

        return (double) total / students.length;
    }


    public void outputGrades() {
        System.out.printf("The grades are %n%n");

        for (int i = 0; i < students.length; i++) {
            System.out.printf("%n<-------Student#%d-------> %s%n%n", students[i].getId(), students[i]);
            for (int j = 0; j < students[i].getPhoneNumber().length; j++) {
                System.out.printf("Phone#%d:%n", j + 1);
                System.out.println(students[i].getPhoneNumber()[j]);
            }
        }

    }

    public void processGrades() {
        outputGrades();

        System.out.printf("%n<-------Class Details------->");
        System.out.printf("%nAverage Marks of the class are: %.2f%n%n", getClassAverage());

        System.out.printf("The minimum grades are of following student: %s%n%n" +
                "The maximum grades are of following student: %s%n", getMinimum(), getMaximum());


    }
}
