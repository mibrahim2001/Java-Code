public class Batsman extends Player{

    //initializing the variables for Batsman

    private int totalRuns;
    private int totalOneDayMatches;

    //constructor for batsman

    public Batsman(String name, String address, long telephone, int totalRuns, int totalOneDayMatches) {
        super(name, address, telephone);
        super.setStatus("Batsman");
        this.totalRuns = totalRuns;
        this.totalOneDayMatches = totalOneDayMatches;
    }

    //getter setter for Batsman variables

    public int getTotalRuns() {
        return totalRuns;
    }

    public void setTotalRuns(int totalRuns) {
        this.totalRuns = totalRuns;
    }

    public int getTotalOneDayMatches() {
        return totalOneDayMatches;
    }

    public void setTotalOneDayMatches(int totalOneDayMatches) {
        this.totalOneDayMatches = totalOneDayMatches;
    }

    //overriding the playerAverage method

    @Override
    public double playerAverage(){
        return totalRuns/totalOneDayMatches;
    }

    //overriding toString method

    @Override
    public String toString(){
        return String.format("%n %s%n Total Runs: %s%n Total OneDay Matches: %s%n Player Average: %.2f",super.toString(),totalRuns,totalOneDayMatches,playerAverage());
    }
}
