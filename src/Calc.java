import java.util.Scanner;

public class Calc {
    public String resultCalc;
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите строку вида 1 + 2: ");
        String input = in.nextLine();
        String[] elements = input.split(" ");

        String resultCalc;
        Convert2Digit in1 = new Convert2Digit(elements[0]);
        Convert2Digit in2 = new Convert2Digit(elements[2]);
        in1.convert();
        in2.convert();
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
        System.out.println(resultCalc);
    }
}

/*
class operation {

}

// проверка римская или арабская цифра
class check {

}

class Rome2Arabic<dig> {


    switch(dig) {
        case "I":
            return 1;
        break;
        case "II":
            return 2;
        break;
        case "III":
            return 3;
        break;
        case "IV":
            return 4;
        break;
        case "V":
            return 5;
        break;
        case "VI":
            return 6;
        break;
        case "VII":
            return 7;
        break;
        case "VIII":
            return 8;
        break;
        case "IX":
            return 9;
        break;
        case "X":
            return 10;
        break;
        default:
            throw new Error(dig + " - неправильная цифра");
            break;
    }
}

class Convert2Digit {
    enum RomanNumeral {
        I(1), IV(4), V(5), IX(9), X(10),
        XL(40), L(50), XC(90), C(100),
        CD(400), D(500), CM(900), M(1000);

        private int value;

        RomanNumeral(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public static List<RomanNumeral> getReverseSortedValues() {
            return Arrays.stream(values())
                    .sorted(Comparator.comparing((RomanNumeral e) -> e.value).reversed())
                    .collect(Collectors.toList());
        }
    }

}
*/
