import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Palindrome {
    public static void FindPalindrome(String NewString){
        Pattern pattern = Pattern.compile("\\b.+?\\b");
        Matcher matcher = pattern.matcher(NewString);
        String tempPalindrome="";
        while (matcher.find()) {
            tempPalindrome = NewString.substring(matcher.start(), matcher.end());
            if(tempPalindrome.equals(Reverse.Reverse(tempPalindrome))) {
                System.out.println(tempPalindrome);
            }
        }
    }
}
