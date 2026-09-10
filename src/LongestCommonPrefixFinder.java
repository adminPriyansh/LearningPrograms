import java.util.Arrays;
import java.util.List;

//LongestCommonPrefixFinder
public class LongestCommonPrefixFinder {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Amaze","Amazon","Amaz");

        String longest = strings.stream().reduce((string, string2) ->
        {
            int length = Math.min(string.length(),string2.length());
            int i = 0;

            while (i<length && string.charAt(i)==string2.charAt(i)){
                i++;
            }
            return string.substring(0,i);
        }).orElse("");

        System.out.println(longest);


        String longest2=  strings.stream().reduce((s1,s2)->{
            int length = Math.min(s1.length(),s2.length());
            int i = 0;
            while(i<length && s1.charAt(i) == s2.charAt(i)){
                i++;
            }
            return s1.substring(0,i);
        }).orElse("");

        System.out.println(longest2);
    }
}
