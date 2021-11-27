public abstract class Product implements Billing {
    //Instance variables
    protected int pID;
    protected String pName;
    protected double pPrice;

    //constructor

    public Product(int pID, String pName, double pPrice) {
        this.pID = pID;
        this.pName = pName;
        this.pPrice = pPrice;
    }

    public Product() {
        this.pName = "no item";
        this.pPrice = 0;
    }

    //setter and getter methods


    public int getpID() {
        return pID;
    }

    public void setpID(int pID) {
        this.pID = pID;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public double getPPrice() {
        return pPrice;
    }

    public void setpPrice(double pPrice) {
        this.pPrice = pPrice;
    }


    //static method purchase bill
    public static double purchaseBill(Billing[] bill){
        double totalAmount = 0;

        for(Billing currentBill:bill){
            if(currentBill != null)
                totalAmount += currentBill.purchaseBill();
        }
        return totalAmount;
    }


    //toString method

    public String toString(){
        return String.format("\n Name of item: %s\n Unit Price: %.2f\n",getpName(),getPPrice());
    }
}
