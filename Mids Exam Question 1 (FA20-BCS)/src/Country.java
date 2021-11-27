import java.util.ArrayList;

public class Country implements Stats{

    private Integer[] nameProvinceArea;

    private ArrayList<Integer> statesArea = new ArrayList<>();

    //constructor
    public Country(Integer[] nameProvinceArea, ArrayList<Integer> statesArea) {
        this.nameProvinceArea = nameProvinceArea;
        this.statesArea = statesArea;
    }

    //overriding the computeArea method of interface to calculate the area
    @Override
    public double computeArea() {
        double stateArea = 0;
        double provinceArea = 0;
        for(Integer province:nameProvinceArea){
            provinceArea += province;
        }
        for(Integer state:statesArea){
            stateArea += state;
        }
        return stateArea + provinceArea;
    }

    //overriding the reset method interface to reset all the values
    @Override
    public void reset() {
        statesArea.clear(); //method to reset statesArea to 0

        for(Integer province:nameProvinceArea){ //method to reset nameProvinceArea to 0
            province = 0;
        }
    }

    public String toString(){
        return String.format("%n<------Country------>");
    }

}
