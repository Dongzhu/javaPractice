/**
 *
 *  *  下面的代码是先执行 nextInt()，再执行 nextLine()
 *  *  问题：这段代码在输入年龄，敲击enter键后，跳过了输入姓名，直接到了输入身高这里，是什么原因引起的？
 *  *  原因：在执行 nextInt() 函数之后，敲击了enter回车键，回车符会被 nextLine() 函数吸收，
 *  *  实际上是执行了nextLine()函数吸收了输入的回车符（并不是没有执行nextLine函数）
 *
 *
 * */

import java.io.IOException;
import java.util.Scanner;

public class KeyboardInputMethod04 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please input your age: ");
        int age = sc.nextInt();

        System.out.println("Please input your name: ");
        String name = sc.nextLine();

        System.out.println("Please input your height(unit:cm): ");
        float height = sc.nextFloat();

        System.out.println("========== Your information ==========");
        System.out.println("Name: " + name + "\nAge:" + age + "\nHeight: " + "cm==============");
        sc.close(); //Close the stream.
    }
}

/**
 *
 * Running result:
 * ***********************************************************
 * "C:\Program Files\Java\jdk-17.0.3.1\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2022.1.2\lib\idea_rt.jar=52538:C:\Program Files\JetBrains\IntelliJ IDEA 2022.1.2\bin" -Dfile.encoding=UTF-8 -classpath E:\projects\ideaProjects\practice_projects\javaBasic\out\production\javaBasic keyboardInputMethod04
 * Please input your age:
 * 18
 * Please input your name:
 * Please input your height(unit:cm):
 * 188
 * ========== Your information ==========
 * Name:
 * Age:18
 * Height: cm==============
 *
 * Process finished with exit code 0
 **************************************************************
 *
 *  Tips:
 *  In this case, the program runs the method nextInt() first, and then runs the method nextLine()
 *  Here is a problem: when the program running, you input your age, then click your "Enter" key on the keyboard, it will skip the name input, directly jump to height, what is causing the problem?
 *  Well,
 *  The reason is: When you click the "Enter" key after executing the nextInt() method, the carriage return character is absorbed by nextLine() method,
 *  Actually, the executing of nextLine() method absorbs the inputted carriage return character.(It is not that the NextLine function is not executed.)
 *
 *
 *
 * 总结：通过 Scanner 类的 next() 与 nextLine() 方法获取输入的字符串，使用 hasNext 与 hasNextLine 判断是否还有输入的数据。
 * nextInt() 和 next() 两者的功能是一样的，它们的区别是：
 * next() 函数不会接收回车符、tab、空格键等。在接收到有效数据前，所有的空格或者tab键等输入被忽略，next()方法自动将其去掉。只有输入有效数字后才能将其后面输入的空白作为分隔符或者结束符。也就是说，next()方法不能读取带有空格的字符串。
 * nextLine() 函数可以接收回车符、tab、空格键，其输入以Enter键结束。也就是说nextLine() 方法返回的是输入回车键以前的所有字符。
 *
 *
 * */