package RandomDemos;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class RandomTests {

    public static void main(String[] args) {
        List<Integer> numList = Arrays.asList(1, 2, 3, 4, 5);

        Map<Integer, String> finalMap = new HashMap<>();

       //Solution 1:

       Map<Boolean, List<Integer>> filteredNums = numList.stream().collect(Collectors.partitioningBy(n -> n % 2 == 0));

        System.out.println("filtered nums: " + filteredNums);

        List<Integer> evenNum = filteredNums.get(true);
        List<Integer> oddNum = filteredNums.get(false);

        Map<Integer, String> numsMap = numList.stream().collect(Collectors.toMap(n -> n, n -> n%2==0? "Even" : "Odd" ));

        System.out.println(numsMap);

        System.out.println(filteredNums.get(true));


        /* Solution 2:
        for (int num: numList){
            if (num % 2 == 0){
                finalMap.put(num, "Even");
            }
            else {
                finalMap.put(num, "Odd");
            }
        }

        System.out.println(finalMap);

         */
    }
}
