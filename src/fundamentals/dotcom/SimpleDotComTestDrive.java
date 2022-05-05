package fundamentals.dotcom;

public class SimpleDotComTestDrive {
    public static void main(String[] args) {
        SimpleDotCom dot = new SimpleDotCom();

        int[] locations = {2,3,4};
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
