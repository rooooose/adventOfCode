package day2;

public class Round {

    private String opponentPlay;
    private String myPlay;

    public String getMyPlay() {
        return myPlay;
    }
    public String getOpponentPlay() {
        return opponentPlay;
    }
    
    public Round(String opponentPlayEnc, String col2, String strategy){
        switch (opponentPlayEnc) {
            case "A": opponentPlay = "Rock"; break;
            case "B": opponentPlay = "Paper"; break;
            case "C": opponentPlay = "Scissors"; break;
        }
        if (strategy.equals("strategy1")) {
            switch (col2) {
                case "X": myPlay = "Rock"; break;
                case "Y": myPlay = "Paper"; break;
                case "Z": myPlay = "Scissors"; break;
            }
        } else {
            switch (col2) {
                case "X": 
                    switch (opponentPlay) {
                        case "Rock": myPlay = "Scissors"; break;
                        case "Paper": myPlay = "Rock"; break;
                        case "Scissors": myPlay = "Paper"; break;
                    }
                    break;
                case "Y": 
                    myPlay = opponentPlay;
                    break;
                case "Z": 
                    switch (opponentPlay) {
                        case "Rock": myPlay = "Paper"; break;
                        case "Paper": myPlay = "Scissors"; break;
                        case "Scissors": myPlay = "Rock"; break;
                    }
                    break;
            }
            
        }
        
    }

    //TODO String method ?
}
