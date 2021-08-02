import java.util.Scanner;

public class calculator1 {
    public static void main(String[] args) {
        RomeNumbers rome = new RomeNumbers();
        int value1 = 0;
        int value2 = 0;
        String operation = null;

        System.out.println("Введите 2  целых числа: ");
        Scanner scanner = new Scanner(System.in);
        if (value1 > 0 || value1 < 10) {
            value1 = scanner.nextInt();
            operation = scanner.next();
            value2 = scanner.nextInt();
        }
        if (operation.equals("+")) {
            System.out.println(value1 + value2);
        }

        if (operation.equals("-")) {
            System.out.println(value1 - value2);
        }

        if (operation.equals("*")){
            System.out.println( value1 * value2);
        }

        if (operation.equals("/")){
            System.out.println(value1 / value2);
        }
//        else {
//            System.out.println("какого хрена error!");
//        }

    }
}

class RomeNumbers {
    int I = 1;
    int II = 2;
    int III = 3;
    int IV = 4;
    int V = 5;
    int VI = 6;
    int VII = 7;
    int VIII = 8;
    int IX = 9;
    int X = 10;


}

