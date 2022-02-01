public class CurrentAccount extends Account{

    //constructors
    public CurrentAccount(double openingBalance, String name, int age, boolean zakat) {
        super(openingBalance, name, age, zakat);
    }

    //overriding withdraw method
    @Override
    public void withdraw(double withdrawAmount) {
        super.setOpeningBalance(super.getOpeningBalance() - withdrawAmount); //subtracting the withdrawn amount from original amount
        System.out.println("Amount Withdrawn = "+withdrawAmount);
    }

    //toString method
    @Override
    public String toString(){
        return String.format("%n%n<========== Current Account ==========>%s%n Zakat to be deducted: %s ",super.toString(),deductZakat());
    }

}
