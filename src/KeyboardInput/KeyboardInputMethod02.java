package KeyboardInput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KeyboardInputMethod02 {
    public static void main(String[] args) throws IOException {
        String str = null;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Please Enter Your Value: ");
        String str1 = null;
        str1 = br.readLine();
        System.out.println("Your Value is: " + str1);

    }
}
