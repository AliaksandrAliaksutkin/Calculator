import com.sun.jdi.IntegerValue;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Введите любое целое число от 1 до 10: ");
        Scanner scannerMy = new Scanner(System.in);
            String str1 = scannerMy.nextLine();
            String [] strings = str1.split(" ");
            if (strings.length != 3){
                System.out.println("Не соответствует условиям, колличество элементов строки больше 3.");
            }




//        int num1 = Integer.parseInt(scannerMy.nextLine());
//            int num2 = Integer.parseInt(scannerMy.nextLine());
//           char sign =
//           int result =

    }
}

