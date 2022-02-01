public enum Type {

    //enums
    ONE("One Year Type",0.10,1),
    THREE("Three Year Type",0.12,3),
    FIVE("Five Year Type",0.14,5);

    private String name;
    private double profit;
    private double years;

    //constructor
    Type(String name, double profit,int years) {
        this.name = name;
        this.profit = profit;
        this.years = years;
    }

    //getter for attributes
    public String getName() {
        return name;
    }

    public double getProfit() {
        return profit;
    }

    public double getYears() {
        return years;
    }
}
