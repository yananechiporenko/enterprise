package module1.nechiporenko;

public class MeasureRunner {
    public static void main(String[] args) {
        allCollectionsMeasures(10000, 100);
        allCollectionsMeasures(100000, 100);
        allCollectionsMeasures(1000000, 100);
    }

    public static void allCollectionsMeasures (int numberOfElements, int numberOfChanges) {
        ArrayListEfficiency arrayForTesting = new ArrayListEfficiency();
        LinkedListEfficiency linkListForTesting = new LinkedListEfficiency();
        HashSetEfficiency hashSetForTesting = new HashSetEfficiency();
        TreeSetEfficiency treeSetForTesting = new TreeSetEfficiency();

        HeadOfTable.showHeadOfTable(numberOfElements);
        arrayForTesting.showMeasures(numberOfElements, numberOfChanges);
        linkListForTesting.showMeasures(numberOfElements, numberOfChanges);
        hashSetForTesting.showMeasures(numberOfElements, numberOfChanges);
        treeSetForTesting.showMeasures(numberOfElements, numberOfChanges);
    }
}
