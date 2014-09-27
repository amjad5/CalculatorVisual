
public class CalculatorProps {
    
    int val1,val2, int_result;
    double d_val1, d_val2, d_result;
    
    CalculatorProps(){
        
    }
    
    public int sum(int val1,int val2)
    {
        return int_result = val1+val2;
    }
    
    public int sub(int val1,int val2){
        return int_result = val1-val2;
    }
    
    public int multiply(int val1,int val2){
        return int_result = val1*val2;
    }
    
    public int divide(int val1,int val2){
        return int_result = val1 / val2;
    }
    
    public int remainder(int val1,int val2){
            return int_result = val1 % val2;
    }
    
    double sqrt(double d_val1){
        double d_result=Math.sqrt(d_val1);
        return d_result;
    }
    
    double pow(double d_val1,double d_val2){
        double d_result=Math.pow(d_val1,d_val2);
        return d_result;
    }
    
    int fact(int val1){
        if(val1<=1)
            return 1;
        else
            return (val1*fact(val1-1));
    }
    
    public double calcSine(double d_val1){
        double d_result= Math.sin(d_val1);
        return d_result;
    }
    
    public double calcCos(double d_val1){
        double d_result = Math.cos(d_val1);
        return d_result;
    }
    
    public double calcTan(double d_val1){
        double d_result = Math.tan(d_val1);
        return d_result;
    }
    
    public double calcLog(double d_val1){
        double d_result = Math.log(d_val1);
        return d_result;
    }
}