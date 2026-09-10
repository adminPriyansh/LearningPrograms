import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AnagramGrouper {
    public static void main(String[] args) {
        String[] arr = {"listen", "silent"};

        List<String> words = Arrays.asList(arr);

        Map<String,List<String>> listMap = words.stream().collect(Collectors.groupingBy(word-> {
                    char[] chars = word.toCharArray();
                    Arrays.sort(chars);
                    return new String(chars);
                }
                ));
        System.out.println(listMap);

        List<String> words1 = Arrays.asList("listen", "silent", "hello",
                "world", "night", "thing");

        Map<String, List<String>> anagrams = words1.stream().collect(Collectors.groupingBy(wo->{
            char ch[] = wo.toCharArray();
            Arrays.sort(ch);
            return new String(ch);
        }));
        System.out.println(anagrams);
    }
}
