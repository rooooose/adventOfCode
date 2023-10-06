package day3;

public class RucksackManager {

    //Prendre en param les séquences de strings à comparer (compartiments ou rucksacks directement)
    public char findCommonObjectType(Rucksack rucksack) {
        String comp1 = rucksack.getCompartment1();
        String comp2 = rucksack.getCompartment2();
        char commonObjType = 'a';

        for (int i = 0; i < comp1.length(); i++) {
            for (int j = 0; j < comp2.length(); j++) {
                if (comp1.charAt(i) == comp2.charAt(j)) {
                    commonObjType = comp1.charAt(i);
                }
            }
        }
        // System.out.println(commonObjType);
        return commonObjType;

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
