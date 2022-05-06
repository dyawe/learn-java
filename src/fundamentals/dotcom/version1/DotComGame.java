package fundamentals.dotcom.version1;

import java.util.ArrayList;

public class DotComGame {
    public static void main(String[] args) {
        int numOfGuesses = 0;
        GameHelperClass helper = new GameHelperClass();

        DotComClass theDotComClass = new DotComClass();
        int randomNum = (int) (Math.random() * 5);

        ArrayList<Integer> locations = new ArrayList<Integer>();
        locations.add(randomNum);
        locations.add(randomNum+1);
        locations.add(randomNum+2);
        theDotComClass.setLocationCells(locations);
        boolean isAlive = true;

        while(isAlive == true){
            String guess = helper.getUserInput("enter a number");
            String result = theDotComClass.checkYourself(guess);
            numOfGuesses++;
            if(result.equals("kill")){
                isAlive = false;
                System.out.println("You took " + numOfGuesses + " guesses");
            }
        }
    }
}
