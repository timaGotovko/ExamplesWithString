public class Reverse {
    public static String Reverse(String NewString){
        String ReverseString = "";
        int num = NewString.length() - 1;
        for (int i = 0; i <NewString.length() ; i++) {
            ReverseString += NewString.charAt(num);
            num--;
        }
        //System.out.println(ReverseString);
        return ReverseString;
    }
}
