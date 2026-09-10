import java.util.Collections;
import java.util.stream.Collectors;

public class PalindromeReverser {
    public static void main(String[] args) {

        String str2 = "madam";

        String str3 = str2.chars().mapToObj(c->(char)c).collect(Collectors.collectingAndThen(Collectors.toList(),
                list-> {Collections.reverse(list);
        return list.stream();
        }
                )).map(String::valueOf).collect(Collectors.joining(""));

        System.out.println(str3);
    }
}
