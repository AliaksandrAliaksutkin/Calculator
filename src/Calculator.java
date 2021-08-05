import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

            System.out.println("Ввод: ");
            String line = scanner.nextLine();

            try {
                String[] symbols = line.trim().split(" "); // делим строки на подстроки, разделитель пробел и отрезаем пробелы вначале и конце
                if (symbols.length != 3) throw new Exception("Что-то пошло не так, попробуйте еще раз"); // не более 3х подстрок

                Number firstNumber = NumberService.parseAndValidate(symbols[0]);
                Number secondNumber = NumberService.parseAndValidate(symbols[2], firstNumber.getType());
                String result = Service.calculate(firstNumber, secondNumber, symbols[1]);
                System.out.println("Результат: \n" + result);

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }