package day3;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class Solver {
    public static void main(String... args){

        RucksackInputReader rucksackInputReader = new RucksackInputReader();
        String filePath = "day3//day_3_input.txt";
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
        char badgeType;
        int groupPrioritiesSum = 0;
        int compartmentsPrioritiesSum = 0;
        for (LinkedList<String> rucksackGroup : rucksacks) {
            for (String rucksack : rucksackGroup) {
                    LinkedList<String> compartmentsContent = rucksackManager.separateCompartments(rucksack);
                    System.out.println(compartmentsContent);
                    objType = rucksackManager.findCommonObjectType(compartmentsContent);
                    compartmentsPrioritiesSum += rucksackManager.findPriority(objType);
            }
        }
        for (LinkedList<String> rucksackGroup : rucksacks) {
            // System.out.println(rucksackGroup);
            badgeType = rucksackManager.findCommonObjectType(rucksackGroup);
            groupPrioritiesSum += rucksackManager.findPriority(badgeType);
            // System.out.println(rucksack);
            
        }
        
        System.out.println(groupPrioritiesSum);
        System.out.println(compartmentsPrioritiesSum);
        
    }
}
