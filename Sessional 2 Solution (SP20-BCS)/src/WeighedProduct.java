public class WeighedProduct extends Product {
    private double weight;

    //constructor that uses the Product constructor
    public WeighedProduct(String pName, double pPrice, double weight) {
        super(100, pName, pPrice);
        this.weight = weight;
    }

    //getter setter

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }


    //Overriding the getPPrince method

    public double getPPrice() {
        return super.getPPrice() * weight; //returns the total price after multiplying unit price with weight
    }


    //Overriding and defining purchaseBill method in Product

    @Override
    public double purchaseBill() {
        return getPPrice();
    }

    //Overriding static purchaseBill method

    public static double purchaseBill(Billing[] bill){
        double totalAmount = 0;
        for(Billing currentBill: bill){
            if(currentBill != null && currentBill instanceof WeighedProduct)
                totalAmount = totalAmount + currentBill.purchaseBill();
        }

        return  totalAmount;
    }

    //toString method
    public String toString() {
        return String.format("\nID:%d  %s=%.2f  %.2fKG  Total Price: %.2f (Weighed Product)\n",getpID(),getpName(),super.getPPrice(),getWeight(),getPPrice());
    }
}





