import java.util.Scanner;

public class Calc {
    public String resultCalc;
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите строку для расчета (символы и операции разделяются пробелом): ");
        String input = in.nextLine();
        String[] elements = input.split(" ");

        if (elements.length != 3) throw new Error("Неправильно введена строка");

        String resultCalc;
        Convert2Digit in1 = new Convert2Digit(elements[0]);
        Convert2Digit in2 = new Convert2Digit(elements[2]);
        in1.convert();
        in2.convert();

        if (in1.isRoman() != in2.isRoman()) throw new Error("В строке цифры разных значений");

        Operation op = new Operation(in1.getDig(), in2.getDig(), elements[1]);
        op.operation();
        int result = op.getResult();
        if (in1.isRoman()) {
            ToRoman out = new ToRoman(result);
            out.convertToRoman();
            resultCalc = out.getResult();
        } else {
            resultCalc = Integer.toString(op.getResult());
        }
        System.out.println("Результат операции: \"" + resultCalc + "\"");
    }
}

