
import java.util.HashMap;
import java.util.Map;

class FinancialForecaster {
   
    public static double calculateFutureValueRecursive(double principal, double rate, int time) {

        if (time == 0) {
            return principal;
        }

        return calculateFutureValueRecursive(principal * (1 + rate), rate, time - 1);
    }

    
    public static double calculateFutureValueMemoized(double principal, double rate, int time, Map<String, Double> memo) {
        
        if (memo == null) {
            memo = new HashMap<>();
        }
        
        String key = principal + "," + time;
        
        if (memo.containsKey(key)) {
            return memo.get(key);
        }
        
        if (time == 0) {
            return principal;
        }
        
        double result = calculateFutureValueMemoized(principal * (1 + rate), rate, time - 1, memo);
        memo.put(key, result);
        return result;
    }
    
    
    public static void main(String[] args) {
        double principal = 1000.0; 
        double rate = 0.05;        
        int time = 1000;             

        // Using normal recursive approach
        double fvRecursive = calculateFutureValueRecursive(principal, rate, time);
        System.out.printf("Future Value (Recursive): $%.2f%n", fvRecursive);


        // Using memo to get optimized solution
        double fvMemoized = calculateFutureValueMemoized(principal, rate, time, null);
        System.out.printf("Future Value (Memoized): $%.2f%n", fvMemoized);
    }
}
    




