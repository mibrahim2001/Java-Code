public class AccountTest {

    public static void main(String[] args) {
        Account[] accounts = new Account[]{
                new SavingsAccount(100000,"Ibrahim",20,true,true),
                new CurrentAccount(150000,"Ahmed",35,true),
                new InvestmentAccount(200000,"Ali",51,false,true),
                new SavingsAccount(100000,"Sehar",20,true,true),
                new CurrentAccount(150000,"Mahnoor",35,true),
                new CurrentAccount(150000,"Abubakar",25,true)

        };

        for(Account account:accounts){
            System.out.println(account);
            if(account instanceof EarningAccount){
                EarningAccount temp = (EarningAccount) account;
                double totalEarnings = temp.getTotalEarnings();
                System.out.printf(" Total Earnings: %.2f",totalEarnings);
                temp.reinvestProfit(totalEarnings);
            }

        }
        System.out.printf("%n%n ********* Total Profit Paid by the Bank: %.2f ********* %n%n",Account.getTotalPaidProfit(accounts));
    }
}
