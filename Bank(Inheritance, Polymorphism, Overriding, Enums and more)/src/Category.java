public enum Category {

    //enums

    YOUNG("Young Saver",0.06),
    ADULT("Adult Saver",0.07),
    SENIOR("Senior Citizen Saver",0.08);

    //attributes for the enum

    private String name;
    private double profit;

    //constructor for the enum

    Category(String name, double profit){
        this.name = name;
        this.profit = profit;
    }

    //getter methods for attributes
    public String getName() {
        return name;
    }

    public double getProfit() {
        return profit;
    }
}
