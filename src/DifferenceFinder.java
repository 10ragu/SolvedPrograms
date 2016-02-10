
/**
 * Created by raghavh on 2/9/2016.
 */
public class DifferenceFinder {

    public int[] MinimumDiff(Object[] numberArray) {
        int testCases = (int) numberArray[0];
        int[] fruitDifferences=new int[testCases];

        System.out.println("Testcases: " + testCases);

        int index=1;
        for (int i=0;i<testCases;i++)
        {
            int apples = (int) numberArray[index];

            index++;
            int oranges = (int) numberArray[index];

            index++;
            int golds = (int) numberArray[index];
            index++;

            int fruitDifference;

            if (apples < oranges) {
                fruitDifference = oranges - apples;
                fruitDifferences[(i)]=fruitDifference - golds;
            } else if (oranges < apples) {
                fruitDifference = apples - oranges;
                fruitDifferences[(i)] = fruitDifference - golds;
            }
        }
        return fruitDifferences;
    }
}
