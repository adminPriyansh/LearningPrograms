public class PalindromString {
    public static void main(String[] args) {
        String str = "madam";
        char ch[] = str.toCharArray();
        int i = 0;
        int j = ch.length-1;

        while(j>i){
            char c = ch[i];
            ch[i] = ch[j];
            ch[j] = ch[i];
            i++;
            j--;
        }

        System.out.println(String.valueOf(ch));
    }
}
