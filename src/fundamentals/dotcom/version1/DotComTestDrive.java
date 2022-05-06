package fundamentals.dotcom.version1;

import java.util.ArrayList;

public class DotComTestDrive {
    public static void main(String[] args) {
        DotComClass dot = new DotComClass();

        ArrayList<Integer> locations = new ArrayList<Integer>();
        locations.add(2);
        locations.add(3);
        locations.add(4);
        dot.setLocationCells(locations);

        String userGuess = "2";
        String result = dot.checkYourself(userGuess);
        String testResult = "failed";
        if(result.equals("hit")){
            testResult = "passed"; //if fake guess is a hit it works
        }
        System.out.println(testResult);
    }
}
