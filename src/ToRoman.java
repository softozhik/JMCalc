public class ToRoman {
    private int dig;
    private String result;

    public String getResult() {
        return result;
    }


    public ToRoman(int dig) {
        this.dig = dig;
    }

    public void convertToRoman() {
        String[] rnChars = {"M", "CM", "D", "C", "XC", "L", "X", "IX", "V", "I"};
        int[] rnVals = {1000, 900, 500, 100, 90, 50, 10, 9, 5, 1};
        result = "";
        if (dig > 0) {
            for (int i = 0; i < rnVals.length; i++) {
                int numberInPlace = dig / rnVals[i];
                if (numberInPlace == 0) continue;
                result += numberInPlace == 4 && i > 0 ? rnChars[i] + rnChars[i - 1] :
                        new String(new char[numberInPlace]).replace("\0", rnChars[i]);
                dig = dig % rnVals[i];
            }
        }
    }
}
