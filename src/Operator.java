import java.util.InputMismatchException;
import java.util.Scanner;

class Operations {

    public void arithmeticOperations() {
        int ans = 0;
        int a, b, c;
        String op1, op2;
        Scanner scanner = new Scanner(System.in);
        a = (scanner.nextInt());
        op1 = scanner.next();
        b = (scanner.nextInt());
        op2 = scanner.next();
        c = scanner.nextInt();



        if (a <= 10 && b <= 10 && c <= 10) {
            if (op1.equals("*") || op1.equals("-") || op1.equals("/") || op1.equals("+") && op2.equals("*") || op2.equals("-") || op2.equals("/") || op2.equals("+")) {
                if (op1.equals("+") && op2.equals("-")) {
                    ans = a + b - c;
                    System.out.print(ans);
                }
                else if (op1.equals("+") && op2.equals("*")) {
                    ans = a + b * c;
                    System.out.print(ans);
                }
                else if (op1.equals("+") && op2.equals("/")) {
                    ans = a + b / c;
                    System.out.print(ans);
                }
                else if (op1.equals("+") && op2.equals("+")) {
                    ans = a + b + c;
                    System.out.print(ans);
                }
                else if (op1.equals("-") && op2.equals("-")) {
                    ans = a - b - c;
                    System.out.print(ans);
                }
                else if (op1.equals("-") && op2.equals("*")) {
                    ans = a - b * c;
                    System.out.print(ans);
                }
                else if (op1.equals("-") && op2.equals("/")) {
                    ans = a - b / c;
                    System.out.print(ans);
                }
                else if (op1.equals("-") && op2.equals("+")) {
                    ans = a - b + c;
                    System.out.print(ans);
                }
                else if (op1.equals("*") && op2.equals("*")) {
                    ans = a * b * c;
                    System.out.print(ans);
                }
                else if (op1.equals("*") && op2.equals("+")) {
                    ans = a * b + c;
                    System.out.print(ans);
                }
                else if (op1.equals("*") && op2.equals("/")) {
                    ans = a * b / c;
                    System.out.print(ans);
                }
                else if (op1.equals("*") && op2.equals("-")) {
                    ans = a * b - c;
                    System.out.print(ans);
                }
                else if (op1.equals("/") && op2.equals("*")) {
                    ans = a / b * c;
                    System.out.print(ans);
                }
                else if (op1.equals("/") && op2.equals("+")) {
                    ans = a / b + c;
                    System.out.print(ans);
                }
                else if (op1.equals("/") && op2.equals("-")) {
                    ans = a / b - c;
                    System.out.print(ans);
                }
                else if (op1.equals("/") && op2.equals("/")) {
                    ans = a / b / c;
                    System.out.print(ans);
                }
                else System.out.println("Only + - * / operators are allowed");
            }
        } else System.out.println("Numbers should be in range of 1 to 10");
        scanner.close();
    }
}

public class Operator {
    public static void main(String[] args) {

        Operations operations = new Operations();

        try {
            operations.arithmeticOperations();
        } catch (InputMismatchException e) {
            //executes when input is an alphabet or an operator is wrong
            System.out.println("Only Integers are allowed");

        }  catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
