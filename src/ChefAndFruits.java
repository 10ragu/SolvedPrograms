import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by raghavh on 2/9/2016.
 */
public class ChefAndFruits {

    public static void main(String[] args) throws IOException
    {
        DifferenceFinder find=new DifferenceFinder();

        List<Integer> numbers = Files.lines(Paths.get(".\\input.txt"))
                .map(line -> line.split("\\s+")).flatMap(Arrays::stream)
                .map(Integer::valueOf)
                .collect(Collectors.toList());

        Object[] numberArray = numbers.toArray();
        boolean validateInput = find.IsValidateInput(numberArray);

        if (validateInput)
        {
            int[] minimumDiffs = find.MinimumDiff(numberArray);
            for (int minDiff : minimumDiffs)
            {
                System.out.println(minDiff);
            }
        }
        else
            System.out.println("Provided input is not valid. Please check the input file(file name: input.txt).");
    }
}
