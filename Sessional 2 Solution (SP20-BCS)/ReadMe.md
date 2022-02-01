**<====================Sessional 2 (SP20-BCS)====================>**

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
