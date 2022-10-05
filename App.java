import java.util.Scanner;

public class App {
    static final Scanner inputScanner = new Scanner(System.in); 

    

    private static double getDouble (String prompt) {
        System.out.println(prompt);
        double answer2 = inputScanner.nextDouble();
        System.out.println(answer2);
        return answer2;
    }
        
    
    public static void main(String[] args) {
        //System.out.println("Hello earthlings!");
        //Calculator calc = new Calculator();
        double num1 = getDouble("give me a number!!");
        double num2 = getDouble("give me another number!");
        double added = Calculator.add(num1,num2);
        //String letsAdd = String.format("You want to add %f & %f.", num1, num2);
        System.out.println(added);
        
    


    }
}