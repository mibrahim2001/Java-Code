import java.util.Scanner;

public abstract class EarningAccount extends Account {

    //instance variables
    private Category category;
    private boolean filer;

    //constructors
    public EarningAccount(double openingBalance, String name, int age, boolean zakat,boolean filer) {
        super(openingBalance, name, age, zakat);
        this.filer = filer;
        category = setCategory();
    }


    //method to set category
    public Category setCategory(){
        if(super.getAge()<35){
            return Category.YOUNG;
        }
        else if(super.getAge()>=35 && super.getAge()<=50){
            return Category.ADULT;
        }
        else if(super.getAge()>50){
             return Category.SENIOR;
        }
        else
            return null;
    }



    //setter and getter for filer
    public boolean isFiler() {
        return filer;
    }

    public void setFiler(boolean filer) {
        this.filer = filer;
    }

    //method to get category
    public Category getCategory() {
        return category;
    }


    //withdraw method for earning accounts
    public void withdraw(double withdrawAmount) {
        double surcharge;
        if(isFiler()){ //if user is a filer
            surcharge = super.getOpeningBalance() * 0.02; //deducting 2% surcharge
        }
        else { //if user is not a filer
            surcharge = super.getOpeningBalance() * 0.04; //deducting 4% surcharge
        }
        super.setOpeningBalance(super.getOpeningBalance() - surcharge - withdrawAmount);
        System.out.println(" Amount Withdrawn = "+withdrawAmount +"\n Tax: "+surcharge);
    }


    //method to reinvest the earned profit
    public void reinvestProfit(double profitEarned){
        Scanner input = new Scanner(System.in);
        System.out.println("\n Do you want to reinvest the earnings?\n Press 1 to reinvest or Press 0 if not"); //asking user if he wants to deposit the profit
        int choice = input.nextInt();
        if(choice == 1){
            deposit(profitEarned);
        }
    }

    //abstract method
    public abstract double getTotalEarnings();

    //toString Method
    public String toString(){
        return String.format("%n Account Category: %s%n %s%n Filer Status: %s",category.getName(),super.toString(),filer);
    }

}
