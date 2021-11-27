public class ProductTest{
    public static void main(String[] args) {
        //creating an array of Billing type
        Billing[] bill = new Billing[4];

        //Initializing the bill array
        bill[0] =  new WeighedProduct("Rice",3.00,1.37);
        bill[1] = new CountedProduct("Pens",4.5,10);

        //Using for loop to display product information
        for(Billing currentBill: bill){
            if(currentBill != null)
                System.out.println(currentBill);
        }

        //Getting the subtotal of weighed and counted products through static purchaseBill method declared in both classes
        double totalWeighedProduct = WeighedProduct.purchaseBill(bill);
        double totalCountedProduct = CountedProduct.purchaseBill(bill);

        //displaying the sub and grand total
        System.out.println("Sub total of weighed products = "+totalWeighedProduct);
        System.out.println("Sub total of counted products = "+totalCountedProduct);
        System.out.println("Grand Total = "+ Product.purchaseBill(bill));

    }
}
