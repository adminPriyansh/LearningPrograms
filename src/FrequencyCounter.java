import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyCounter {
    public static void main(String[] args) {
        int[] arr = {5,6,7,9,7,6,9};

        Map<Integer, Long> hashMap  = Arrays.stream(arr).boxed().
                        collect(Collectors.groupingBy(Function.identity(),
                                Collectors.counting()));

        System.out.println(hashMap);

        String str = "abcdabcddcca";

        Map<Character, Long> hashMap1 = str.chars().mapToObj(ch->(char)(ch)).
                collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        System.out.println(hashMap1);






    }
}