import java.util.ArrayList;

public class Driver {

    //defining the printStats method

    public static void printStats(Stats[] stats){
        for(Stats currentStat:stats){
            System.out.printf("%n%s%nArea: %.2f %s",currentStat,currentStat.computeArea(),Stats.units);
            currentStat.reset();
        }
    }

    public static void main(String[] args) {
        Integer[] provinces = new Integer[]{   //declaring array to pass in constructor of country
                10,20,30,40
        };

        ArrayList<Integer> states = new ArrayList<>();  //declaring array list to pass in constructor of country
        states.add(20);
        states.add(30);
        states.add(40);
        states.add(50);

        Stats[] stats = new Stats[]{    //taking an array of interface(stats) to handle objects by Polymorphism

                new Rectangle(20.0,10.0),    //adding an object of rectangle
                new Square(10),                     //adding an object of square
                new Country(provinces,states)           //adding an object of country
        };

        printStats(stats);  /*calling the method that we defined at the start of this class
                              and passing stats array to it as a parameter */
    }
}
