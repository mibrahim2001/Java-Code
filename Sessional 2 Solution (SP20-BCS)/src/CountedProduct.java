public class CountedProduct extends Product {
    private int quantity;

    //constructor that uses the constructor of Product super class

    public CountedProduct(String pName, double pPrice, int quantity) {
        super(200, pName, pPrice);
        this.quantity = quantity;
    }

    //getter setter

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


    //Overriding the getPPrice method

    public double getPPrice(){
        return super.getPPrice()*quantity; //returns the total price after multiplying unit price with quantity
    }


    //Overriding and defining purchaseBill method in Product

    public  double purchaseBill() {
        return getPPrice();
    }

    //Overriding static purchaseBill method

    public static double purchaseBill(Billing[] bill){
        double totalAmount = 0;
        for(Billing currentBill: bill){
            if(currentBill != null && currentBill instanceof CountedProduct)
                totalAmount = totalAmount + currentBill.purchaseBill();
        }

        return  totalAmount;
    }

    //Overriding toString Method
    public String toString(){
        return String.format("ID:%d  %s=%.2f  %d Units  Total Price: %.2f (Counted Product)\n",getpID(),getpName(),super.getPPrice(),getQuantity(),getPPrice());
    }




}
