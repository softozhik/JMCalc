public class Convert2Digit {
    private String input;
    private int dig;
    private boolean roman;

    public Convert2Digit(String input) {
        this.input = input;
    }

    public int getDig() {
        return dig;
    }

    public boolean isRoman() {
        return roman;
    }

    public void convert()    {
        input = input.toUpperCase();

        switch (input) {
            case "1":
                dig = 1;
                roman = false;
                break;
            case "2":
                dig = 2;
                roman = false;
                break;
            case "3":
                dig = 3;
                roman = false;
                break;
            case "4":
                dig = 4;
                roman = false;
                break;
            case "5":
                dig = 5;
                roman = false;
                break;
            case "6":
                dig = 6;
                roman = false;
                break;
            case "7":
                dig = 7;
                roman = false;
                break;
            case "8":
                dig = 8;
                roman = false;
                break;
            case "9":
                dig = 9;
                roman = false;
                break;
            case "10":
                dig = 10;
                roman = false;
                break;

            case "I":
                dig = 1;
                roman = true;
                break;
            case "II":
                dig = 2;
                roman = true;
                break;
            case "III":
                dig = 3;
                roman = true;
                break;
            case "IV":
                dig = 4;
                roman = true;
                break;
            case "V":
                dig = 5;
                roman = true;
                break;
            case "VI":
                dig = 6;
                roman = true;
                break;
            case "VII":
                dig = 7;
                roman = true;
                break;
            case "VIII":
                dig = 8;
                roman = true;
                break;
            case "IX":
                dig = 9;
                roman = true;
                break;
            case "X":
                dig = 10;
                roman = true;
                break;
            default:
                throw new Error(input + " - неправильная цифра");
        }
    }

}
