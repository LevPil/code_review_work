public class Calculator {
    public int add(int a, int b){
        return a+b;
    }
    public int dif(int a, int b){
        return a-b;
    }
    public int div(int a, int b){
        return a/b;
    }
    public int times(int a, int b){
        return a*b;
    }
    public int solver(int a, int b){
        if (a == 0) {
            throw new IllegalArgumentException();
        } else {
            return div(-b, a);
        }
    }
}
