package fundamentals.dotcom.version1;
import java.util.ArrayList;

public class DotComClass {
    private ArrayList<Integer> locationCells;
    //int numOfHits = 0;

    public void setLocationCells(ArrayList<Integer> loc) {
        locationCells = loc;
    }

    public String checkYourself(String userInput){
        int guess = Integer.parseInt(userInput);
        String result = "miss";

        //check if the user input is in the arrayList -- else return -1
        int index = locationCells.indexOf(userInput);
        if (index >=0 ){
            locationCells.remove(index);
            result = "hit";
        }
        if(locationCells.isEmpty()){
            result = "kill";
        }
        System.out.println(result);
        return result;
    }
}
