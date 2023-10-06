package day3;
import java.util.List;

public class RucksackGroup {

    private List<Rucksack> rucksacksList; //= new ArrayList<>();

    public RucksackGroup(List<Rucksack> rucksacks) {
        rucksacksList = rucksacks;
    }

    public void add(Rucksack rucksack) {
        rucksacksList.add(rucksack);
    }
    
}
