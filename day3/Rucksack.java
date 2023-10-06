package day3;

public class Rucksack {

    private String compartment1;
    private String compartment2;

    public String getCompartment1() {
        return compartment1;
    }

    public String getCompartment2() {
        return compartment2;
    }

    public Rucksack(String content) {
        int mid = content.length() / 2;
        compartment1 = content.substring(0, mid);
        compartment2 = content.substring(mid);
    }

    public String toString() {
        return "Rucksack containing " + compartment1 + " in compartment 1 and " + compartment2 + " in compartment 2.";
    }
    
}
