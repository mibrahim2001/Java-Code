public class SavingsAccount extends EarningAccount{

    //constructor
    public SavingsAccount(double openingBalance, String name, int age, boolean zakat, boolean filer) {
        super(openingBalance, name, age, zakat, filer);
    }

    @Override
    public void withdraw(double withdrawAmount) {
        double surcharge;
        if(super.isFiler()){ //if user is a filer
            surcharge = super.getOpeningBalance() * 0.02; //deducting 2% surcharge
        }
        else { //if user is not a filer
            surcharge = super.getOpeningBalance() * 0.04; //deducting 4% surcharge
        }
        super.setOpeningBalance(super.getOpeningBalance() - surcharge - withdrawAmount);
        System.out.println(" Amount Withdrawn = "+withdrawAmount +"\n Tax: "+surcharge);
    }

    @Override
    public void deposit(double depositAmount) {
        super.setOpeningBalance(super.getOpeningBalance() + depositAmount); //adding the deposit amount to original amount
        System.out.println(" Amount Deposited = "+depositAmount);
    }

    @Override
    public double checkBalance() {
        return super.getOpeningBalance();
    }

    @Override
    public double getTotalEarnings() {

        double totalProfit = super.getOpeningBalance() * super.getCategory().getProfit();;/*getting profit by multiplying the original amount by the percent
                                                                                      amount stored in each 'Category' enum */

        if(super.isFiler()){ //deducting 15% tax if user is a filer
            totalProfit = totalProfit - (totalProfit * 0.15);
        }
        else //deducting 25% tax if user is not a filer
            totalProfit = totalProfit - (totalProfit * 0.25);



        return totalProfit;
    }



    //toString method
    public String toString(){
        return String.format("%n%n<========== Savings Account ==========>%s%n Zakat to be deducted: %s ",super.toString(),deductZakat());
    }
}
