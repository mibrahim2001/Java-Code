# Java-Code
Contains all the java projects and code I have written for practice.

***I am providing the questions with respect to folder name(that contains there solution) below***


**GradeBook(Composition Concepts)**

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



**Employee(Inheritance Concepts)**

_Reference of question is Java How to Program (Early Objects) (10th Edition)_ 

**9.14** (Employee Hierarchy) In this chapter, you studied an inheritance hierarchy in which class
BasePlusCommissionEmployee inherited from class CommissionEmployee. However, not all types of
employees are CommissionEmployees. In this exercise, you’ll create a more general Employee superclass
that factors out the attributes and behaviors in class CommissionEmployee that are common to all Employees. The common attributes and behaviors for all Employees are firstName, lastName, socialSecurityNumber, getFirstName, getLastName, getSocialSecurityNumber and a portion of method
toString. Create a new superclass Employee that contains these instance variables and methods and a
constructor. Next, rewrite class CommissionEmployee from Section 9.4.5 as a subclass of Employee.
Class CommissionEmployee should contain only the instance variables and methods that are not declared in superclass Employee. Class CommissionEmployee’s constructor should invoke class Employee’s
constructor and CommissionEmployee’s toString method should invoke Employee’s toString method.
Once you’ve completed these modifications, run the CommissionEmployeeTest and BasePlusCommissionEmployeeTest apps using these new classes to ensure that the apps still display the same results for
a CommissionEmployee object and BasePlusCommissionEmployee object, respectively.

**9.15** (Creating a New Subclass of Employee) Other types of Employees might include SalariedEmployees who get paid a fixed weekly salary, PieceWorkers who get paid by the number of pieces
they produce or HourlyEmployees who get paid an hourly wage with time-and-a-half—1.5 times the
hourly wage—for hours worked over 40 hours.
Create class HourlyEmployee that inherits from class Employee (Exercise 9.14) and has
instance variable hours (a double) that represents the hours worked, instance variable wage (a double) that represents the wages per hour, a constructor that takes as arguments a first name, a last
name, a social security number, an hourly wage and the number of hours worked, set and get methods for manipulating the hours and wage, an earnings method to calculate an HourlyEmployee’s
earnings based on the hours worked and a toString method that returns the HourlyEmployee’s
String representation. Method setWage should ensure that wage is nonnegative, and setHours
should ensure that the value of hours is between 0 and 168 (the total number of hours in a week).
Use class HourlyEmployee in a test program that’s similar to the one in Fig. 9.5. 



**Sessional 2 Solution (SP20-BCS)**

_Reference: This question is given by Dr.Shahbaz Akhtar Abid in Sessional 2 Exam of Batch SP20-BCS_

**Q 1:** [30 Marks]
**A.** Write an interface Billing having a method prototype purchaseBill having no parameter and
returns the total amount of the purchased products.

**B.** Write a class Product which models customer’s purchases and implements the Billing interface.

This class has:

• Three private instance variables pID (program initialized it automatically for each
product type object), pName (String) and pPrice (double).

• One constructor to initialize the instance variables.

• A no argument to initialize name to “no item”, and unitPrice to 0. use this()

• A method getPPrice that returns the pPrice.

• Get and set methods.

• A static method purchaseBill that takes billing array as parameter and returns the grand
total of the bill.

• A toString method to return the name of the item followed by = , then the unitPrice.

**C.** Inherit two subclasses WeighedProduct and CountedProduct from Product. WeighedProduct has
an additional instance variable weight (double) in Kg while CountedProduct has an additional
variable quantity (int) both private.

• Write an appropriate constructor for each of the classes making use of the constructor
of the superclass in defining those of the subclasses.

• Override getPPrice method that returns the total amount of the purchased products
based on its unit price and weight (WeighedItem), or quantity (CountedItem). Make use
of getPPrice of the superclass.

• Provide the definition of purchaseBill in WeightedProduct and CountedProduct that
calls the getPPrice method and returns the total amount of the purchased product.

• Define a static method purchaseBill in both CountedProduct and WeighedProduct that
takes billing array as parameter and returns the subtotal of CountedProduct and
WeighedProduct in their respective implementations.

• Override also toString method for each class making use of the toString method of the
superclass in defining those of the subclasses. toString should return the products detail
that can be printed on the receipt

**D.** Write a Driver Class that creates an array of Billing variables of size four. Billing array holds
two object (use the given output value) each of the WeightedProduct and CountedProduct. Use
an enhanced for loop to display the complete product information along with the total amount by
calling the purchaseBill method. Also display the subtotal for CountedProduct and
WeighedProduct and grand total of all the products from the billing array by calling the
purchaseBill method

**For example**

ID: 100 Rice = 3.00 1.37Kg 4.11 PKR (in case of WeighedProduct class)

ID: 200 Pens = 4.5 10 units 45 PKR (in case of CountedProduct class)

SubTotal for CountedProducts : 45.0

SubTotal for WeighedProducts : 4.11

GrandTotal : 49.11
