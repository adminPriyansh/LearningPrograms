import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class LastNonRepeatativeCharacterInString {
    public static void main(String[] args) {
        String s = "swiss";

        //firstNonRepeatedCharacter
        Character firstCharacter = s.chars().mapToObj(c->(char)c).
                collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,
                Collectors.counting())).entrySet().stream().filter(i->i.getValue()==1).map(Map.Entry::getKey).
                findFirst().orElse(null);

        System.out.println(firstCharacter);

        Character lastRepeated = s.chars().mapToObj(c->(char)c).
                collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,
                        Collectors.counting())).entrySet().stream().filter(i->i.getValue()==1).map(Map.Entry::getKey).
                reduce(((character, character2) -> character2)).orElse(null);

        System.out.println(lastRepeated);


    }
}
