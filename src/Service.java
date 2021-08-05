public class Service {
    public static String calculate(Number first, Number second, String action) throws Exception {

        int result;

        switch (action) {
            case "+":
                result = first.getValue() + second.getValue();
                break;
            case "-":
                result = first.getValue() - second.getValue();
                break;
            case "*":
                result = first.getValue() * second.getValue();
                break;
            case "/":
                result = first.getValue() / second.getValue();
                break;
            default:
                throw new Exception(" используйте только +, -, *, /");
        }

        if (first.getType() == RomanArabicNumber.ARABICNUMBER.ROMANNUMBER) {
            return NumberService.toRomanNumber(result);
        } else return String.valueOf(result);
    }

}
