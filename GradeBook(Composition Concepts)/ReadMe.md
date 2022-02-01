**<====================GradeBook(Composition Concepts)====================>**

_Reference of question is Java How to Program (Early Objects) (10th Edition)_ 

Assume below basic skeleton of Student and GradeBook class:
public class GradeBook { private String courseName; private Student[] students; // ... other methods .... } public class Student{ private int id; private String name; int marks[];
// marks in different tests }
Encapsulate fields and defined needed constructors. Then, make a GradeBook object and fully initialize it based on user input. Get number of students from user input. 
As number of tests each student given may be different, so your program shall take number of tests and marks in each test, form user input too. You can also generate
and use random number to quickly initialize whole data, instead of getting from user, but choose decent ranges e.g. maximum marks 100, maximum students 50 and maximum number of 
test each student may give shall be less or equal to 10. After fully initializing the GradeBook object, print following information:

*Which student given maximum number of test, print student id

*Who got maximum average marks, print student id.

*Average marks of the class

*Average marks of each student in the class

*Minimum marks of each student, print marks and student id

*Maximum marks of each student,  print marks and student id

*Average, minimum and maximum marks of the student (get student from user)

Some methods shall be written in Student class and some inside the GradeBook class, decide the best place for a method based 
on what it does. Perform all listed tasks in different methods and call those methods from the main method in GradeBook test class.
