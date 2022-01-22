public class sCalculator extends Calculator{

    public sCalculator(double numberA, double numberB) {
        super(numberA, numberB);
    }

    public double calculate(String op) {
        switch (op) {
            case "squareroot" -> {
                return Math.sqrt(numberA);
            }
        }
        return super.calculate(op);
    }
}
