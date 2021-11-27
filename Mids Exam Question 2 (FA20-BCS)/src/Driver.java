public class Driver {
    public static void main(String[] args) {

        //creating an array of parent class
        Player[] players = new Player[]{

                //adding two objects of batsman class
                new Batsman("Ali", "Street 2", 921234567, 10000, 500),
                new Batsman("Ahmed", "Street 4", 92126576, 5000, 100),

                //adding two objects of bowler class
                new Bowler("Ibrahim", "Street 1", 920045675, 100, 55),
                new Bowler("Shadab", "Street 7", 920002145, 50, 25)
        };



        /*<========== Task 1(Displaying batsman with highest average and bowler with lowest average) ==========>*/


        Batsman highBatsman = null; //declaring null batsman object to store batsman with highest average
        Bowler lowBowler = null;    //declaring null bowler object to store bowler with lowest average

        for (Player player : players) {
            if (player instanceof Batsman && highBatsman == null) {
                highBatsman = (Batsman) player;
            } else if (player instanceof Batsman && highBatsman.playerAverage() < player.playerAverage()) {
                highBatsman = (Batsman) player;
            }
        }

        for (Player player : players) {

            if (player instanceof Bowler && lowBowler == null) {
                lowBowler = (Bowler) player;
            } else if (player instanceof Bowler && lowBowler.playerAverage() > player.playerAverage()) {
                lowBowler = (Bowler) player;
            }
        }

        //Can't write the whole logic for above for-loop here contact me xD


        //printing the stats of batsman and bowler
        System.out.println("\n <-----Batsman with highest average----->" + highBatsman);
        System.out.println("\n <-----Bowler with lowest average----->" + lowBowler);


        /*<=============== Task 2 (Traversing) ===============>*/

        Batsman[] arrayOfBatsman = new Batsman[players.length]; //initializing the batsman array with length of players array to minimize the memory wastage
        Bowler[] arrayOfBowler = new Bowler[players.length];    //initializing the bowler array with length of players array to minimize the memory wastage

        int i = 0;  //for indexing batsman array
        int c = 0;  //for indexing bowler array

        for (Player player : players) {
            if (player instanceof Batsman) {
                arrayOfBatsman[i] = (Batsman) player; //downcasting and storing the object in batsman array
                i++;
            } else if (player instanceof Bowler) {
                arrayOfBowler[c] = (Bowler) player; //downcasting and storing the object in bowler array
                c++;
            }
        }

        //checking if traversing was successful
        if (arrayOfBatsman != null && arrayOfBowler != null) {
            System.out.println("\n <------The traversing was successful----->");
        }

    }
}
