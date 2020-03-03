import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String NewString = reader.readLine();
        Reverse NewReverse = new Reverse();
        NewReverse.Reverse(NewString);
        BackSlang NewBackSlang = new BackSlang();
        NewBackSlang.VoidBackSlang(NewString);
    }
}
