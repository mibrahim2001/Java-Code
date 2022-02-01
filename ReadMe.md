# Java-Code
Contains all the java projects and code I have written for practice.

***I am providing the questions with respect to folder name(that contains there solution) below and respective folders also contains the question in them.***


**<==================== @@GradeBook(Composition Concepts)@@ ====================>**

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



**<==================== Employee(Inheritance Concepts) ====================>**

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



**<==================== Sessional 2 (SP20-BCS) ====================>**

_Reference: This question is given by Dr.Shahbaz Akhtar Abid in Sessional 2 Exam of Batch SP20-BCS (COMSATS Lahore Campus)_

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



**<==================== Java GUI ====================>**

_Contains some basic code in the basic sub-folder_

**Flag Check** folder contains a program that shows some flag on the frame and when you hover over your mouse on one of the flag it changes into the name of that country and when the mouse exits the flag is shown again.

_**src**_ folder contains two questions from an assignment from universitry 

i) Write an application to make paint having provision of various font colors while drawing. 

ii) Write an application CLICK a Button in Java using Swing classes. The application handles the mouse enetered event. The button on the form displaces as the user tries to         click the button. 




**<==================== Bank(Inheritance, Polymorphism, Overriding, Enums and more) ====================>**

_Reference: Given as a lab assignment in Uni_

Task 9B - Inheritance, Polymorphism, Overriding, Enums and more

Identify and write the code of classes, their attributes, behavior and relationships that shall fulfil below requirements. Think and decide yourself where you need to use which type, where enum make sense, where overloading, overriding and inheritance can help etc. to devise a solution that is reusable and maintainable. It has nothing to do with how real banking work, so don’t worry if something do not make sense to you.
A bank allow citizens to open accounts, each account must have an id, opening balance, account holder name, and age. Bank offers 3 types of accounts i.e. current account, saving account and investment account. Bank gives no profit on current accounts but to others. So, the saving and investment account are earning accounts, means the account holders of saving and investment accounts make profit from their deposits.
Both earning based account shall expose a public behavior to retrieve total earnings (how it’s calculated is explained below). All saving accounts has a category that is fixed and do not change i.e. young saver, adult saver, and senior citizen saver. Category shall be auto assigned to each saving account at the time of account opening (means at the time of object instantiation) depending on the age of account holder i.e. young, adult, and senior citizen for age below 35, from 35 to 50 age, and above 50, respectively. Bank gives 6% annual profit to young savers, 7% profit to adult savers and 8% to senior citizen savors. Users can withdraw and deposit any time in current and saving accounts, no extra fee is charged.
Each investment account has a type too. The type indicate for how much duration the investment is made. These types are fixed and shall not change during the life cycle of account. These types include one year, three year or five year. It must be specified at the time of account opening. Bank gives 10% profit who open investment account for one year, 12% per year for three year investment and 14% profit who open account for 5 years investment plan. For example, if a person open an investment account with 3 year plan with initial balance of 100,000, after a year, his earning shall be 112000. For more than one year plan, the investment shall be compounded for subsequent years e.g. if an account belong to 3 year investment plan that was opened with 100,000 PKR investment. First year profit shall be calculated on 100,000, resulting into 112,000, the second year profit of 12% shall be calculated on 112,000 and so on. Bank discourage withdraws from all type of investment accounts, when an account holder withdraw some amount from investment account, bank deduct 4% of that amount as surcharge.
Define a static behavior getTotalProfitPaid in Account class that shall take one or more earning accounts objects as argument and return the total amount the bank must pay as profit to all those account holders collectively.
Please add following features in your assignment (in addition to what is written above)

Above mentioned profit ratios are fixed for each Type and Category, shift profit ratio inside each enum to make the code of getTotalEarnings simple.

Define getTotalEarnings such that it shall return the total profit. It shall not update the balance. If the account holder want to reinvest, he/she shall call the deposit method again and pass the profit in it).

Background: A person who submit tax return each year is called Filer. They submit their all details of income sources, assets and expenses to goverment each year and pay the tax due, in return, government gives them some benefits. For example, when they withdraw cash from bank, buy a plot or car, win a lucky draw or get some profit from any type investment, government charge them less tax as compared to non-filers.

Update code such that when any earning account is created, it should take a boolean value to represent whether the account holder is filer or not. Update withdraw method for all accounts such that if the account holder is filer, charge 2% tax and incase of non-filer, charge 4% tax on the profit earned. In same way, when getTotalEarnings is called on earning acounts, return the earning after deducting tax i.e. 25% from non-filer and 15% from filer. 15% of profit. This is called capital gain tax.

On all accounts, bank deduct 2.5% of balance as Zakat each year. Bank allow account holders to declare if Zakat is not applicable to them when a new account is opened. If a peson opt-out, the bank do not deduct the Zakat on such accounts. Implement this requirement in your code and also define a method deductZakat, it shall deduct zakat depending on what the account holder declared at the time of opening the account (i.e. at the time of object instantiation). It shall decrease the balance according to Zakat due and return the amount deducted.

Make a test class, create 5 to 7 different types of accounts object. Print each account holder earning and also print total profit paid by the bank (implemented in getTotalProfitPaid).

Consider this point a bonus feature that is not required. Its only for those who think they are good programmers. 

Background: In many countries, currency loose its value because of inflation e.g. you get less petrol for 100 PKR today as compared to 5 years ago. Check this link for latest inflation rates in different countries.

Define a method getRealProfitRatio, it should return the actual profit percentage that the account holder got i.e. after deducting government tax, zakat, and adjusting the rate of inflation (how much value the account holder lost by investing with bank because of inflation and taxes). So, for all earning accounts you shall store country along with year in which the account is opened, as it would impact the real profit. Search Capital Gain Tax in 7 countries from Google (use 15% if you could not find for a country). Take consective 5 years e.g. 2018-2022 and store inflation rate  of each year for each country (take maximum 7 countries from this list). Store country names, inflation rate, years etc. in such a way that structure should be flexible i.e. adding more countires data should not require change in code but in data only. Must include Japan, China, Pakistan and Lebanon with 3 others of your choice. Take real inflation rates of year 2021 from this link and take inflation rate of 2022 from this forecast. Search real inflation rates or scale down with right proportion for years 2018-2020. Create a test class, in its main method, create 7 InvestmentAccount in year 2018 with 5 years plan in 7 different countries. Print which country is best for the long term investment.
