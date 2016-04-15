package module1.nechiporenko;

import java.util.*;

public class ArrayListEfficiency {
    private List <Integer> integerArList = new ArrayList<>();
    private Random randomInt = new Random();

    public void showMeasures (int size, int changeValue) {
        long timeForPopulating = measurePopulate(size);
        System.out.println("ArrayList\t" + measureAdd(changeValue) + "\t\t\t" + measureGet(changeValue)
                + "\t\t\t" + measureRemove(changeValue)  + "\t\t\t" + measureContains(changeValue) +
                "\t\t\t" + timeForPopulating + "\t\t\t" + measureIteratorAdd(changeValue) + "\t\t\t\t"
                + measureIteratorRemove(changeValue));
    }

    public long measurePopulate (int measureSize) {
        long populateResult = System.currentTimeMillis();

        for (int i = 0; i < measureSize; i++) {
            integerArList.add(randomInt.nextInt());
        }

        populateResult = System.currentTimeMillis() - populateResult;
        return populateResult;
    }

    public long measureAdd (int amount) {
        long addResult = System.currentTimeMillis();

        for (int i = 0; i < amount; i++) {
            integerArList.add(i, randomInt.nextInt());
        }

        addResult = System.currentTimeMillis() - addResult;
        return addResult;
    }

    public long measureGet (int amount) {
        long getResult = System.currentTimeMillis();

        for (int i = 0; i < amount; i++) {
            integerArList.get(i);
        }

        getResult = System.currentTimeMillis() - getResult;
        return getResult;
    }

    public long measureRemove (int amount) {
        long removeResult = System.currentTimeMillis();

        for (int i = 0; i < amount; i++) {
            integerArList.remove(i);
        }

        removeResult = System.currentTimeMillis() - removeResult;
        return removeResult;
    }

    public long measureContains (int amount) {
        long containsResult = System.currentTimeMillis();

        for (int i = 0; i < amount; i++) {
            integerArList.contains(randomInt.nextInt());
        }

        containsResult = System.currentTimeMillis() - containsResult;
        return containsResult;
    }

    public long measureIteratorAdd (int amount) {
        long iterAddResult = System.currentTimeMillis();
        ListIterator ArrayIterator = integerArList.listIterator();

        for (int i = 0; i < amount; i++) {
            ArrayIterator.add(randomInt.nextInt());
        }

        iterAddResult = System.currentTimeMillis() - iterAddResult;
        return iterAddResult;
    }

    public long measureIteratorRemove (int amount) {
        long iterRemoveResult = System.currentTimeMillis();
        ListIterator ArrayIterator = integerArList.listIterator();

        for (int i = 0; i < amount; i++) {
            ArrayIterator.next();
            ArrayIterator.remove();
        }

        iterRemoveResult = System.currentTimeMillis() - iterRemoveResult;
        return iterRemoveResult;
    }

}
