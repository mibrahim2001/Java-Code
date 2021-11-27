public class CommissionEmployee extends Employee {

    //instance variables new to Commission Employee
    private double grossSales;
    private double commissionRate;

    //constructor that uses constructor of Employee class
    public CommissionEmployee(String firstName, String lastName, long cnic, double grossSales, double commissionRate) {

        //calling constructor of employee class using super keyword
        super(firstName, lastName, cnic);

        // checks for setting values
        if(grossSales<0.0){
            throw new IllegalArgumentException("Value of Gross Sales must not be less than 0");
        }

        if(commissionRate<=0 || commissionRate>1.0){
            throw new IllegalArgumentException("Value of Commission Rate must be larger than 0 and less than 1 ");
        }

        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }

    //getter setter method for instance variable of Commission Employee

    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double grossSales) {

        // checks for setting values
        if(grossSales<0.0){
            throw new IllegalArgumentException("Value of Gross Sales must not be less than 0");
        }

        this.grossSales = grossSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {

        // checks for setting values
        if(commissionRate<=0 || commissionRate>1.0){
            throw new IllegalArgumentException("Value of Commission Rate must be larger than 0 and less than 1 ");
        }

        this.commissionRate = commissionRate;
    }

    //method to calculate earnings
    public double earnings(){
        return getCommissionRate() * getGrossSales();
    }

    //toString method that uses toString method of employee in it
    public String toString(){
        return String.format("\n %s\n Gross Sales: %.2f\n Commission Rate: %.2f\n",super.toString(),getGrossSales(),getCommissionRate());
    }
}
