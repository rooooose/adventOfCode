package day3;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class Solver {
    public static void main(String... args){

        RucksackInputReader rucksackInputReader = new RucksackInputReader();
        String filePath = "day3//input_test.txt";
        List<LinkedList<String>> rucksacks = null;
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
        for (LinkedList<String> rucksackGroup : rucksacks) {
            objType = rucksackManager.findCommonObjectType(rucksackGroup);
            prioritiesSum += rucksackManager.findPriority(objType);

            for (String rucksack : rucksackGroup) {
                LinkedList<String> compartmentsContent = rucksackManager.separateCompartments(rucksack);
                objType = rucksackManager.findCommonObjectType(compartmentsContent);
                // prioritiesSum += rucksackManager.findPriority(objType);
            }
            // System.out.println(rucksack);
            
        }
        System.out.println(prioritiesSum);
        
    }
}
