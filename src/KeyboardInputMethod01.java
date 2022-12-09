import java.io.IOException;

public class KeyboardInputMethod01 {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter your char:");     //Receive a char from console
        char i = (char)System.in.read();
        System.out.println("Your char is:" + i);
    }
}
