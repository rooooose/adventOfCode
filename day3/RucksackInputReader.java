package day3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class RucksackInputReader {
    
    public List<Rucksack> readInput(String filepath) throws IOException {

        List<Rucksack> rucksacks = new ArrayList<>();
        File file = new File(filepath);
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String st;
            while ((st = br.readLine()) != null) {
                rucksacks.add(new Rucksack(st));
            }
        }
        return rucksacks;
    }
}