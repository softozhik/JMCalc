public class Operation {
    private int in1;
    private int in2;
    private String operation;
    private int result;

    public Operation(int in1, int in2, String operation) {
        this.in1 = in1;
        this.in2 = in2;
        this.operation = operation;
    }

    public int getResult() {
        return result;
    }

    public void operation() {
        switch (operation) {
            case "+" -> result = in1 + in2;
            case "-" -> result = in1 - in2;
            case "*" -> result = in1 * in2;
            case "/" -> result = in1 / in2;
            default -> throw new Error(operation + " - неправильная операция");
        }
    }
}
