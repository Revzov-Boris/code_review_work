public class Calculator {
    public int add(int a, int b){
        return a + b;
    }
    public int dif(int a, int b){
        return  a - b;
    }
    public int div(int a, int b){
        if (b == 0) throw new ArithmeticException("Division by zero");
        return  a / b;
    }
    public int times(int a, int b){
        return a * b;
    }
    public int solver(int a, int b, int c){
        int D = b * b - 4 * a * c;
        if (D >= 0){
            int x1 = (int) (-b + Math.sqrt(D));
            int x2 = (int) (-b - Math.sqrt(D));
            return x1 + x2;
        }else {
            throw new ArithmeticException("Cannot extract the root from a negative number");
        }
    }
}
