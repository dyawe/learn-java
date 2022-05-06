package fundamentals.dotcom.game;

import java.util.ArrayList;

public class DotCom {
    public void setLocationCells(ArrayList<String> locationCells) {
        this.locationCells = locationCells;
    }

    private ArrayList<String> locationCells;
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String checkYourself(String userInput){
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
