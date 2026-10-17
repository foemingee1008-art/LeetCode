package Q50;

public class Q50_sol {
    public double myPow(double x, int n) {
        double coef = 1;
        long N = n;
        if (n < 0){
            N = -n;
            x = 1 / x;
        }
        while (N != 0){
            if (N % 2 != 0){
                coef = x * coef;
            }
            x = x * x;
            N = N / 2;
        }
        return coef;
    }
}
