import java.io.IOException;
import java.util.Scanner;

public class Main {
   public static void main(String[] args) throws IOException{
        System.out.print("Введите например 2 + 2");
        Scanner scannerMy = new Scanner(System.in);
           String str1 = scannerMy.nextLine();
            String [] strings = str1.split(" ");
            if (strings.length != 3) {
                throw new IOException ("Неверное количество символов");
            }

   }
}

