import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringBasedStreamApiProgs {
    public static void main(String[] args) {
        //Find alll strings starts with A
        List<String> words = List.of("Apple","Amazon","Java","Azure");

        List<String> output1 = words.stream().filter(s->s.startsWith("A")).collect(Collectors.toList());
        System.out.println(output1);

        //Find all strings whose length is greater than 5.

        List<String> output2 = words.stream().filter(s->s.length()>5).collect(Collectors.toList());
        System.out.println(output2);

        //Convert all strings to uppercase.
        List<String> output3 = words.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(output3);

        //Convert all strings to lowercase.
        List<String> output4= words.stream().map(String::toLowerCase).collect(Collectors.toList());
        System.out.println(output4);

        //Count strings having length greater than 5.
        Long count = words.stream().filter(s->s.length()>5).count();
        System.out.println(count);

        //Find the longest string.
        String output = words.stream().
                max(Comparator.comparingInt(String::length)).orElse("");
        System.out.println(output);

        //Check whether all strings have length greater than 3.
        words.stream().filter(s->s.length()<3).count();
    }
}
