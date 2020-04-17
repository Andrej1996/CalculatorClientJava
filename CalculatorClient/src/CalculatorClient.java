import java.util.Scanner;

public class CalculatorClient extends Calculator{
    public static void main(String[] args) {
        Scanner one = new Scanner(System.in);
        String text;
        System.out.println("Enter your operation: ");
        text = one.nextLine();

        double a;
        System.out.println("Enter first number: ");
        a = one.nextDouble();

        double b;
        System.out.println("Enter second number: ");
        b = one.nextDouble();

        Calculator calculator = new Calculator();

        while (!text.equals("END")) {

            if (text.contains("SUM")) {
                System.out.printf("%.3f %n",calculator.SUM(a,b));
            }
            if (text.contains("SUB")) {
                System.out.printf("%.3f %n",calculator.SUB(a,b));
            }
            if (text.contains("MUL")) {
                System.out.printf("%.3f %n",calculator.MUL(a,b));
            }
            if (text.contains("DIV")) {
                System.out.printf("%.3f %n",calculator.DIV(a,b));
            }
            if (text.contains("PER")) {
                System.out.printf("%.3f %n",calculator.PER(a,b));
            }
            break;
        }
    }
}
