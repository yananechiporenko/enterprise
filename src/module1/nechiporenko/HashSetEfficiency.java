package module1.nechiporenko;

import java.util.*;

public class HashSetEfficiency {

    private HashSet <Integer> integerHashSet = new HashSet<>();
    private Random randomInt = new Random();

    public void showMeasures (int size, int changeValue) {
        long timeForPopulating = measurePopulate(size);
        System.out.println("HashSet\t\t" + measureAdd(changeValue) + "\t\t\t-\t\t\t" + measureRemove(changeValue)
                + "\t\t\t" + measureContains(changeValue) + "\t\t\t" + timeForPopulating + "\t\t\t-\t\t\t\t-");
    }

    public long measurePopulate (int measureSize) {
        long populateResult = System.currentTimeMillis();

        for (int i = 0; i < measureSize; i++) {
            integerHashSet.add(randomInt.nextInt());
        }

        populateResult = System.currentTimeMillis() - populateResult;
        return populateResult;
    }

    public long measureAdd (int amount) {
        long addResult = System.currentTimeMillis();

        for (int i = 0; i < amount; i++) {
            integerHashSet.add(randomInt.nextInt());
        }

        addResult = System.currentTimeMillis() - addResult;
        return addResult;
    }

    public long measureRemove (int amount) {
        long removeResult = System.currentTimeMillis();

        for (int i = 0; i < amount; i++) {
            integerHashSet.remove(i);
        }

        removeResult = System.currentTimeMillis() - removeResult;
        return removeResult;
    }

    public long measureContains (int amount) {
        long containsResult = System.currentTimeMillis();

        for (int i = 0; i < amount; i++) {
            integerHashSet.contains(randomInt.nextInt());
        }

        containsResult = System.currentTimeMillis() - containsResult;
        return containsResult;
    }

}
