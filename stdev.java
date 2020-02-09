
import java.util.ArrayList;
public class stdev{
  public static void main(String[] args){
    if(args.length == 0){
      System.out.println("Don't forget to input values to find standard deviation.");
    }
    else{
      ArrayList<Double> numArray = new ArrayList<>();
      Double currentValue = 0.0;
      Double sum = 0.0;
      Double mean = 0.0;
      Double standardDeviation = 0.0;
      for(String argument : args){
        System.out.println(argument);
        currentValue = Double.parseDouble(argument);
        numArray.add(currentValue);
        sum += currentValue;
      }
      mean = sum/args.length;
      for(Double num : numArray){
        standardDeviation += Math.pow(num - mean, 2);
      }
      System.out.println("The mean is: " + mean);
      System.out.println("The standard deviation is: " + Math.sqrt(standardDeviation/args.length));
    }
  }
}
