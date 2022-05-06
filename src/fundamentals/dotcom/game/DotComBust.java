package fundamentals.dotcom.game;
import java.util.*;

public class DotComBust {
    private GameHelper helper = new GameHelper();
    private ArrayList<DotCom> dotComList = new ArrayList<DotCom>();
    private int numOfGuesses = 0;

    private void setUpGame(){
        //make dotcoms and give locations
        DotCom one = new DotCom();
        one.setName("Pets.com");
        DotCom two = new DotCom();
        two.setName("eToys.com");
        DotCom three = new DotCom();
        three.setName("Go2.com");
        dotComList.add(one);
        dotComList.add(two);
        dotComList.add(three);

        System.out.println("Your goal is to sink three dotcoms \nPets.com, eToys.com and Go2.com\n " +
                "Try to sink them all in the fewest number of guesses");

        for(DotCom dotComToSet : dotComList){
            ArrayList<String> newLocation = helper.placeDotCom(3);
            dotComToSet.setLocationCells(newLocation);
        }
    }

    private void startPlaying(){
        while(!dotComList.isEmpty()){
            String userGuesses = helper.getUserInput("Enter a guess: ");
            checkUserGuess(userGuesses);
        }
        finishGame();
    }

    private void checkUserGuess(String userGuess){
        numOfGuesses++;
        String result = "miss";

        for(DotCom dotComToTest : dotComList){
            result = dotComToTest.checkYourself(userGuess);
            if(result == "hit"){
                break;
            }
            if(result == "kill"){
                dotComList.remove(dotComToTest);
                break;
            }
        }
        System.out.println("You " + result);
    }

    private void finishGame(){
        System.out.println("All Dot Coms are now dead. Your stocks are worthless.");
        if(numOfGuesses <= 18){
            System.out.println("It only took you " + numOfGuesses + " guesses.\nYou got out before your options sank");
        }else {
            System.out.println("Took you long enough. " + numOfGuesses + " guesses.\nFish are dancing with your options.");
        }
    }

    public static void main(String[] args) {
        DotComBust game = new DotComBust();
        game.setUpGame();
        game.startPlaying();
    }
}
