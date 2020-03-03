import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String NewString = reader.readLine();
        Change(NewString);
    }
    public static void Change(String NewString){
        String ReverseString = " ";
        int num = NewString.length() - 1;
        for (int i = 0; i <NewString.length() ; i++) {
            ReverseString += NewString.charAt(num);
            num--;
        }
        System.out.println(ReverseString);
    }
}
