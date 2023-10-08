package day3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class RucksackManager {

    public LinkedList<String> separateCompartments(String rucksackContent) {
        int mid = rucksackContent.length() / 2;
        String compartment1 = rucksackContent.substring(0, mid);
        String compartment2 = rucksackContent.substring(mid);
        // String[] separatedContent = {compartment1, compartment2};
        LinkedList<String> separatedContent = new LinkedList<>();
        separatedContent.add(compartment1);
        separatedContent.add(compartment2);

        return separatedContent;
    }

    //LinkedList ?
    // TODO ESSAYER EN NON RECURSIF / sans modifier le parametre car l'ordre d'appel en dépend du coup
    public char findCommonObjectType(LinkedList<String> rucksackContents) {
        List<Character> commonObjTypes = new ArrayList<>();
        String el1 = rucksackContents.get(0);
        String el2 = rucksackContents.get(1);
        for (char c1 : el1.toCharArray()) {
            for (char c2 : el2.toCharArray()) {
                if (c1 == c2) {
                    commonObjTypes.add(c1);
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        // Appends characters one by one
        for (Character ch : commonObjTypes) {
            sb.append(ch);
        }
        // convert in string
        String commonObjString = sb.toString();
        rucksackContents.removeFirst();
        rucksackContents.removeFirst();
        rucksackContents.addFirst(String.valueOf(commonObjString));
        while (rucksackContents.size() >= 2) {
            findCommonObjectType(rucksackContents);
        }
        // System.out.println(commonObjString.charAt(0));
        return commonObjString.charAt(0);

    }

    public int findPriority(char commonObjType) {

        int priority = 0;
        if(commonObjType >= 'A' && commonObjType <= 'Z') {
            priority = commonObjType - 'A' + 27;
            // System.out.println(priority);
        }
        else if(commonObjType >= 'a' && commonObjType <= 'z') {
           priority = commonObjType - 'a' + 1;
            // System.out.println(priority);
        }

        return priority;
    }
    
}
