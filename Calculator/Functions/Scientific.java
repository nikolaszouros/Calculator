package Calculator.Functions;

public class Scientific {
    
    public double toPower(double x, double y){
        return Math.pow(x, y);
    }

    public double getSqrt(double x){
       return (x<0) ? -1 : Math.sqrt(x);
    }

    public double getCbrt(double x){
        return Math.cbrt(x);
    }

    public double getAbs(double x){
        return (x>0)? x : -x;
    }

    public double factorial(int x){
        double num=x;
        for(int i=x-1; i>0; i--){
            num = num * i;
        }
        return num;
    }

    public double getPrecentageOf(double x, double y){
        return (100*x)/y;
    }

    public double getNegative(int x){
        return -x;
    }
}
