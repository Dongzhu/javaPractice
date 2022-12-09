package arrayTest;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Scanner;

import static java.time.Year.now;

public class ArrayOperation {
    public static void main(String[] args) throws IOException {
        ArrayOperation myOperation = new ArrayOperation();
        myOperation.setYear();
        myOperation.readElementOfArray();
        myOperation.arrayElementExchange();
    }


    public void getName(){

    };
    public void getType(){
        
    };
    
    public void setName(String arrayName){
        
    }
    
    public void setType(String arrayType){
        
    }

    String[] originalArray = {"Lamborghini", "FERRARI", "Shelby", "Bentley", "Koenigsegg", "McLaren", "Bugatti", "Pagani", "Maybach", "Rolls-Royce", "Aston Martin", "BENZ", "BMW", };

    public void readElementOfArray(){
        //String[] cars = {"Lamborghini", "FERRARI", "Shelby", "Bentley", "Koenigsegg", "McLaren", "Bugatti", "Pagani", "Maybach", "Rolls-Royce", "Aston Martin", "BENZ", "BMW", };
        //String arrayName = originalArray.setName(getName());
        //String arrayType = originalArray.setTy(getType());
        for(int i = 0; i < originalArray.length; i++){
            System.out.println("Ranking: " + i + "---------->" + originalArray[i] + "\n");
        }
    }



    public void exchangeElementOrder(){
        String[] originalArray1 = originalArray;
        readElementOfArray();

    }

    public void setYear(){
        System.out.println("This year is:" + now() + "\n");
        System.out.println("Enter the year you want to review: \n");
        Scanner sc = new Scanner(System.in);
        int input = (int)sc.nextInt();
        System.out.println("You want to review the year: " + input + "----- Ranking information: \n");
    }

    //这里准备写一些方法可实现：将指定数组的元素按一定条件进行查、增、删、改，并根据指定规则进行数组内元素重新排序的方法
    public void arrayElementExchange(){
        //Read the element and filled to the new tempArray by ID.

        //根据将要被处理的数组创建等长同类型的数组transferInArray，用于存储传入数组元素
        //originalArray.read();
        int length = (int)Array.getLength(originalArray);
        String[] transferInArray = new String[length];
        for(int i = 0; i < length; i ++){
            transferInArray[i] = originalArray[i];
        }

        String[] tempArray = new String [(int)transferInArray.length];
        int year = new Scanner(System.in).nextInt();

        //String year = tempArray.set;
        System.out.println("The original Array element order of the Year" + year + " is: \n");
        for(int m = 0; m < transferInArray.length; m ++){
            System.out.println(m + "." + transferInArray[m] + "\n");
        }


/*        int k, j, q;
        if(! tempArray[k].isEmpty()){
            q = tempArray.length;
            j = q/2;
            if(Math.)
            tempArray[]
        }*/
    }

}
