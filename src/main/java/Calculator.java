public class Calculator {
    public int add(int a, int b) {
        return (a + b);
    }

    public int dif(int a, int b) {
        return (a - b);
    }

    public int div(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Error! Divide by zero!")
        }
        return (a / b);
    }

    public int times(int a, int b) {
        return (a * b);
    }

    public int solver(int a, int b) {                   // ax-b=0
        if (a == 0) {
            throw new ArithmeticException("Error! Divide by zero!");
        }
        return div(b, a);
    }
}
