package day3;

import java.io.IOException;
import java.util.List;

public class Solver {
    public static void main(String... args){

        RucksackInputReader rucksackInputReader = new RucksackInputReader();
        String filePath = "day3//input_test.txt";
        List<List<Rucksack>> rucksacks = null;
        RucksackManager rucksackManager = new RucksackManager();
        try {
            rucksacks = rucksackInputReader.readInput(filePath);
            System.out.println(rucksacks);
        } catch (IOException e) {
            System.out.println("File "+ filePath + " not found");
            System.exit(0);
        }
        char objType;
        int prioritiesSum = 0;
        // for (Rucksack rucksack : rucksacks) {
        //     // System.out.println(rucksack);
        //     objType = rucksackManager.findCommonObjectType(rucksack);
        //     prioritiesSum += rucksackManager.findPriority(objType);
        // }
        // System.out.println(prioritiesSum);
        
    }
}
