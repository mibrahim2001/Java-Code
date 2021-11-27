public class Bowler extends Player{

        //initializing the variables for Batsman

        private int totalWickets;
        private int totalOneDayMatches;

        //constructor for batsman

        public Bowler(String name, String address, long telephone,int totalWickets, int totalOneDayMatches) {
            super(name, address, telephone);
            super.setStatus("Bowler");
            this.totalWickets = totalWickets;
            this.totalOneDayMatches = totalOneDayMatches;
        }

        //getter setter for Batsman variables


        public int getTotalWickets() {
        return totalWickets;
        }

         public void setTotalWickets(int totalWickets) {
        this.totalWickets = totalWickets;
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
            return totalWickets/totalOneDayMatches;
        }

        //overriding toString method

        @Override
        public String toString(){
            return String.format("%n %s%n Total Wickets: %s%n Total OneDay Matches: %s%n Player Average: %.2f",super.toString(),totalWickets,totalOneDayMatches,playerAverage());
        }
}


