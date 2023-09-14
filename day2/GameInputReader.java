package day2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GameInputReader {

    private String gameStrategy;

    public GameInputReader(String strategy) {
        gameStrategy = strategy;
    }
    
    public List<Round> readInput(String filepath) throws IOException {
        List<Round> rounds = new ArrayList<>();
        File file = new File(filepath);
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String st;
            while ((st = br.readLine()) != null) {
                // System.out.println(st);
                String[] line = st.split(" ");
                rounds.add(new Round(line[0], line[1], gameStrategy));
            }
        }
        return rounds;
    }
}
