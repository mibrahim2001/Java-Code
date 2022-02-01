import java.util.Scanner;

public class InvestmentAccount extends EarningAccount{

    //instance variables
    Type accountType;


    //constructor
    public InvestmentAccount(double openingBalance, String name, int age, boolean zakat, boolean filer) {
        super(openingBalance, name, age, zakat, filer);
        accountType = setAccountType();
    }

    @Override
    public void withdraw(double amount){
        super.withdraw(amount);
        double surcharge = super.getOpeningBalance() * 0.04;
        setOpeningBalance(getOpeningBalance()-surcharge);   //deducting 4% surcharge on every withdraw

    }



    @Override
    public double getTotalEarnings() {
        double totalProfit = super.getOpeningBalance() * super.getCategory().getProfit();;/*getting profit by multiplying the original amount by the percent
                                                                                            amount stored in each 'Category' enum */
        double amountIncreasePerYear = 0;
        for (int i = 0; i < accountType.getYears(); i++) {
            amountIncreasePerYear = super.getOpeningBalance() * accountType.getProfit();
            super.setOpeningBalance(super.getOpeningBalance()+amountIncreasePerYear);
            totalProfit += amountIncreasePerYear;
        }

        /*Logic for above loop :
        * We iterate the loop according to years stored in enum 'Type'.
        * We get the total profit per year by multiplying original opening balance with profit based on the account type(enum that already has
          profit predefined for every account
        * We also increase the original opening balance with the profit so that next year profit can be calculated according to this amount
        * Then we finally increase the total(which is the total profit an account earns) by adding it with current year profit  */

        if(super.isFiler()){ //deducting 15% tax if user is a filer
            totalProfit = totalProfit - (totalProfit * 0.15);
        }
        else //deducting 25% tax if user is not a filer
            totalProfit = totalProfit - (totalProfit * 0.25);

        return totalProfit;
    }


    //method to set the type of account

    public Type setAccountType(){
        Scanner input = new Scanner(System.in);
        int choice;
        System.out.println("Please choose type of account below: \n1.One Year Account\n2.Three Year Account\n3.Five Year Account");
        choice = input.nextInt();

        switch (choice){  //switch case to check the choice
            case 1:
                return Type.ONE;
            case 2:
                return Type.THREE;
            case 3:
                return Type.FIVE;
            default:
                System.out.println("Please choose a valid option!");
                break;
        }
        return null;
    }

    //toString Method
    @Override
    public String toString(){
        return String.format("%n%n<========== Investment Account ==========>%n Account Type: %s%n %s%n Zakat to be deducted: %s ",accountType.getName(),super.toString(),deductZakat());
    }

}


