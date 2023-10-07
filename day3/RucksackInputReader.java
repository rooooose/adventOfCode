package day3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class RucksackInputReader {
    
    public List<LinkedList<String>> readInput(String filepath) throws IOException {

        File file = new File(filepath);
        List<LinkedList<String>> allRucksacks = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String st;
            int itemsInGroupCounter = 3;
            int groupNum = -1;
            while ((st = br.readLine()) != null) {
                
                if (itemsInGroupCounter == 3) {
                    LinkedList<String> rucksackGroup = new LinkedList<>();
                    allRucksacks.add(rucksackGroup);
                    itemsInGroupCounter = 0;
                    groupNum += 1;
                }
                allRucksacks.get(groupNum).add(st);
                itemsInGroupCounter += 1;
            }
        }
        return allRucksacks;
    }
}