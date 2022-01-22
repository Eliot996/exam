public class Calculator {
    protected double numberA, numberB;

    public Calculator(double numberA, double numberB) {
        this.numberA = numberA;
        this.numberB = numberB;
    }

    public void setNumberA(double numberA) {
        this.numberA = numberA;
    }

    public void setNumberB(double numberB) {
        this.numberB = numberB;
    }

    public double calculate(String op) {
        switch (op) {
            case "add" -> {
                return numberA + numberB;
            }
            case "sub" -> {
                return numberA - numberB;
            }
            case "multiply" -> {
                return numberA * numberB;
            }
            case "divide" -> {
                return numberA / numberB;
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator(20, 7);
        System.out.println(calculator.calculate("add"));
        calculator.setNumberA(10);
        System.out.println(calculator.calculate("sub"));
        System.out.println(calculator.calculate("multiply"));
        System.out.println(calculator.calculate("divide"));

        sCalculator sCalculator = new sCalculator(10,10);
        System.out.println((sCalculator.calculate("squareroot")));
        System.out.println((sCalculator.calculate("add")));
    }
}
