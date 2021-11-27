public class BasePlusCommissionEmployee extends CommissionEmployee{
    private double baseSalary;

    //constructor that uses constructor of parent class
    public BasePlusCommissionEmployee(String firstName, String lastName, long cnic, double grossSales, double commissionRate, double baseSalary) {
        super(firstName, lastName, cnic, grossSales, commissionRate);

        //check for base salary
        if(baseSalary<0.0){
            throw new IllegalArgumentException("Base salary can not be less than 0");
        }
        this.baseSalary = baseSalary;
    }

    //getter setter methods for base salary

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    //OverRiding earning method

    public double earnings(){
        return super.earnings() + getBaseSalary();
    }

    //toString method that uses toString method of parent class

    public String toString(){
        return String.format("\n %s\n Base Salary: %.2f\n",super.toString(),getBaseSalary());
    }
}
