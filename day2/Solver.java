package day2;

import java.io.IOException;
import java.util.List;

class Solver {
    public static void main(String... args){
        System.out.println("Hello World");
        GameInputReader gameInputReader1 = new GameInputReader("strategy1");
        GameInputReader gameInputReader2 = new GameInputReader("strategy2");
        String filePath = "day_2_input.txt";
        List<Round> roundsStrat1 = null;
        List<Round> roundsStrat2 = null;
        try {
            roundsStrat1 = gameInputReader1.readInput("day_2_input.txt");
            roundsStrat2 = gameInputReader2.readInput("day_2_input.txt");
        } catch (IOException e) {
            System.out.println("File "+ filePath + " not found");
            System.exit(0);
        }
        ScoreCalculator scoreCalculator = new ScoreCalculator();
        int totalScore = 0;
        for (Round round : roundsStrat1) {
            totalScore += scoreCalculator.calcScoreOneRound(round.getOpponentPlay(), round.getMyPlay());
        }
        System.out.println("Score with 1st strategy : " + totalScore);
        totalScore = 0;
        for (Round round : roundsStrat2) {
            totalScore += scoreCalculator.calcScoreOneRound(round.getOpponentPlay(), round.getMyPlay());
        }
        System.out.println("Score with 2nd strategy : " + totalScore);
        
        
        // System.out.println(rounds);
    }
}
