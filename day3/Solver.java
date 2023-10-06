package day3;

import java.io.IOException;
import java.util.List;

public class Solver {
    public static void main(String... args){

        RucksackInputReader rucksackInputReader = new RucksackInputReader();
        String filePath = "day3//day_3_input.txt";
        List<Rucksack> rucksacks = null;
        RucksackAnomalyManager rucksackAnomalyManager = new RucksackAnomalyManager();
        try {
            rucksacks = rucksackInputReader.readInput(filePath);
        } catch (IOException e) {
            System.out.println("File "+ filePath + " not found");
            System.exit(0);
        }
        char objType;
        int prioritiesSum = 0;
        for (Rucksack rucksack : rucksacks) {
            // System.out.println(rucksack);
            objType = rucksackAnomalyManager.findAnomalyObjectType(rucksack);
            prioritiesSum += rucksackAnomalyManager.findPriority(objType);
        }
        System.out.println(prioritiesSum);
        
    }
}
