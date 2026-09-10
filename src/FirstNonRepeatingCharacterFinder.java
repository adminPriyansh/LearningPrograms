import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatingCharacterFinder {
    public static void main(String[] args) {
        String str = "swiss";

        Map<Character,Long> characterIntegerMap = str.chars().mapToObj(c->(char)c).
                collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        Character character = characterIntegerMap.entrySet().stream().
                filter(c->c.getValue()==1).
                map(Map.Entry::getKey).findFirst().get();

        System.out.println(character);


    }
}
