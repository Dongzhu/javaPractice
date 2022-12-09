import java.io.IOException;
import java.util.Scanner;

public class KeyboardInputMethod03 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please input your name: ");
        String name = sc.nextLine(); //Read the string

        System.out.println("Please input your age: ");
        int age = sc.nextInt(); //Read int

        System.out.println("Please input your height(unit:cm): ");
        float height = sc.nextFloat(); //Read float

        System.out.println("============  Your information  ============");
        System.out.println("Name: " + name + "\nAge: " + age + "\nHeight: " + height + "cm\n=====================");
        sc.close();   //Close the stream.
    }
}


/**
 *Summary:
 * Tips:
 *      This implementation method is the most powerful method aforementioned three method.
 *      Different type value input will be supported in the third method in "keyboardInputMethod03.java".
 *
 * */