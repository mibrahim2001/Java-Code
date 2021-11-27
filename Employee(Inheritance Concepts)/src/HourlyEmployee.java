public class HourlyEmployee extends Employee{

    private double wage;
    private double hours;

    public HourlyEmployee(String firstName, String lastName, long cnic, double wage, double hours) {
        super(firstName, lastName, cnic);
        setHours(hours);
        setWage(wage);
    }

    public void setHours(double hours) {
        if(hours<0 && hours>168)
            throw new IllegalArgumentException("Please enter a value between 0 and 168");
        this.hours = hours;
    }

    public void setWage(double wage) {
        if(wage<0)
            throw new IllegalArgumentException("Please enter a value greater than 0");
        this.wage = wage;
    }

    public double getWage() {
        return wage;
    }

    public double getHours() {
        return hours;
    }

    public double earnings(){
        return getHours() * getWage();
    }

    public String toString(){
        return String.format("\n %s\n Wage: %.2f\n Hours: %.2f\n Total Earning: %.2f\n",super.toString(),getWage(),getHours(),earnings());
    }
}
