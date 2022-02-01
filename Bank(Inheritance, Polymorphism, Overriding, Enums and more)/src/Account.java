public abstract class Account {

    //instance variables

    private double openingBalance;
    private String name;
    private int age;
    private boolean zakat; //to check if user wants to deduct zakat from his account
    private int id;
    private static int idAutomater = 1; //declaring static to automatically increase id number when constructor is called

    //constructors

    public Account(){} //default constructor

    public Account(double openingBalance, String name, int age, boolean zakat) {
        this.id = idAutomater;
        this.openingBalance = openingBalance;
        this.name = name;
        this.age = age;
        this.zakat = zakat;
        idAutomater++;
    }

    //setter and getter methods

    public double getOpeningBalance() {
        return openingBalance;
    }

    public void setOpeningBalance(double openingBalance) {
        this.openingBalance = openingBalance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isZakat() {
        return zakat;
    }

    public void setZakat(boolean zakat) {
        this.zakat = zakat;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    //declaring abstract methods
    public abstract void withdraw(double withdrawAmount);

    //method to check the balance of account
    public double checkBalance() {
        return getOpeningBalance();
    }

    //method to deposit amount in account
    public void deposit(double depositAmount) {
        setOpeningBalance(getOpeningBalance() + depositAmount); //adding the deposit amount to original amount
        System.out.println(" Amount Deposited = "+depositAmount);
    }


    //method to deduct zakat
    public double deductZakat(){
        if(isZakat()) {
            double amountToBeDeducted = getOpeningBalance() * 0.025;
            setOpeningBalance(getOpeningBalance()-amountToBeDeducted);
            return amountToBeDeducted;
        }else
            return 0;
    }


    //method to get total profit paid by bank to all users
    public static double getTotalPaidProfit(Account[] accounts){
        double totalProfitPaid = 0;
        for(Account currentAccount:accounts){
            if(currentAccount instanceof  EarningAccount) {
                EarningAccount temp = (EarningAccount) currentAccount;
                totalProfitPaid += temp.getTotalEarnings();
            }

        }
        return totalProfitPaid;
    }

    //toString Method

    @Override
    public String toString() {
        return String.format("%n Account Holder Name: %s%n Account ID: %s%n Opening Balance: %s%n Age of Account Holder: %s%n Zakat Deduction Status: %s ",name,id,openingBalance,age,zakat);
    }
}
