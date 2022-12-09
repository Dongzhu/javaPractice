import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class VarValueRange {
    public static void main(String[] args) throws IOException {
        String intValueRange = "-2 billion to 2 billion";
        String shortValueRange = "-32,768 to 32767";
        String longValueRange = "-9 quintillion to 9 quintillion";
        String byteValueRange = "-128 to 127";
        String floatValueRange = "fractional number up to 6-7 digits ex. 3.141592f";
        String doubleValueRange = "fractional number up to 15 digits ex. 3.141592653589793";
        String charValueRange = "single character/letter/ASCII value ex.'f'";
        String booleanValueRange = "'true' or 'false'";
        String stringValueRange = "a sequence of characters ex. Hello World!";

        System.out.println("1.int \n");
        System.out.println("2.short \n ");
        System.out.println("3.long \n ");
        System.out.println("4.byte \n ");
        System.out.println("5.float \n ");
        System.out.println("6.double \n ");
        System.out.println("7.char \n ");
        System.out.println("8.boolean \n ");
        System.out.println("9.String\n" );

        System.out.println("Enter one item sequence int number of your choice from 1~9:" + "\n");
        Scanner sc = new Scanner(System.in);
        int input = (int)sc.nextInt();
        System.out.println("Your choice is:" + input);
        if (input == 1) {
            System.out.println("Your choice is: 1.int" + "----->" + "Value range is:" + intValueRange.toString());
        };
        if (input == 2){
            System.out.println("Your choice is: 2.short" + "----->" + "Value range is:" + shortValueRange.toString());
        }
        if (input == 3){
            System.out.println("Your choice is: 3.long" + "----->" + "Value range is:" + longValueRange.toString());
        }
        if (input == 4){
            System.out.println("Your choice is: 4.byte" + "----->" + "Value range is:" + byteValueRange.toString());
        }
        if (input == 5){
            System.out.println("Your choice is: 5.float" + "----->" + "Value range is:" + floatValueRange.toString());
        }
        if (input == 6){
            System.out.println("Your choice is: 6.double" + "----->" + "Value range is:" + doubleValueRange.toString());
        }
        if (input == 7){
            System.out.println("Your choice is: 7.char" + "----->" + "Value range is:" + charValueRange.toString());
        }
        if (input == 8){
            System.out.println("Your choice is: 8.boolean" + "----->" + "Value range is:" + booleanValueRange.toString());
        }
        if (input == 9){
            System.out.println("Your choice is: 9.String" + "----->" + "Value range is:" + stringValueRange.toString());
        }



        //Repeat waiting for input to check

        System.out.println("Finished and quit.");
        /*while(true)
            if (input == 1) {
                System.out.println("Your choice is: 1.int" + "----->" + "Value range is:" + intValueRange.toString());
            }else if (input == 2){
                System.out.println("Your choice is: 2.short" + "----->" + "Value range is:" + shortValueRange.toString());
            } else if (input == 3){
            System.out.println("Your choice is: 3.long" + "----->" + "Value range is:" + longValueRange.toString());
        }
        else if (input == 4){
            System.out.println("Your choice is: 4.byte" + "----->" + "Value range is:" + byteValueRange.toString());
        }
        else if (input == 5){
            System.out.println("Your choice is: 5.float" + "----->" + "Value range is:" + floatValueRange.toString());
        }
        else if (input == 6){
            System.out.println("Your choice is: 6.double" + "----->" + "Value range is:" + doubleValueRange.toString());
        }
        else if (input == 7){
            System.out.println("Your choice is: 7.char" + "----->" + "Value range is:" + charValueRange.toString());
        }
        else if (input == 8){
            System.out.println("Your choice is: 8.boolean" + "----->" + "Value range is:" + booleanValueRange.toString());
        }
        else if (input == 9){
            System.out.println("Your choice is: 9.String" + "----->" + "Value range is:" + stringValueRange.toString());
        }

        else {
            break;
        }
*/
    }

}
