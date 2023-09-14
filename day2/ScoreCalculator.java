package day2;

public class ScoreCalculator {

    private int scoreRock = 1;
    private int scorePaper = 2;
    private int scoreScissors = 3;
    private int scoreWon = 6;
    private int scoreDraw = 3;

    public int calcScoreOneRound(String playYou, String playMe){
        int score = 0;
        if (playMe == "Rock") {
            score = scoreRock;
            if (playYou == "Scissors") {
                score += scoreWon;
            }

        } else if (playMe == "Paper") {
            score = scorePaper;
            if (playYou == "Rock") {
                score += scoreWon;
            }

        } else if (playMe == "Scissors") {
            score = scoreScissors;
            if (playYou == "Paper") {
                score += scoreWon;
            }
            
        }

        if (playMe == playYou) {
            score += scoreDraw;
        }

        return score;

    }

    // public int calcTotalScore(List<Round> rounds, String play2){
        
    // }
}
