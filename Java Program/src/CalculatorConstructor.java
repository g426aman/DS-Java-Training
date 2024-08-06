import java.util.Scanner;

public class CalculatorConstructor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = sc.nextInt();
        System.out.println("Enter the second number: ");
        int b = sc.nextInt();
        System.out.println("Select the operation: ");

        System.out.println("1: For Addition ");
        System.out.println("2: For Subtraction ");
        System.out.println("3: For Multiplication ");
        System.out.println("4: For Division ");
        int c = sc.nextInt();
        Calculator myClass = new Calculator(a, b, c);
    }
}



class Calculator {

    public Calculator(int a, int b, int op) {
        this.a = a;
        this.b = b;
        this.c = op;

        switch (op) {
            case 1:
                System.out.println(a + b);
                break;
            case 2:
                System.out.println(a - b);
                break;
            case 3:
                System.out.println(a * b);
                break;

            case 4:
                System.out.println(a / b);
                break;
        }
    }

    int a, b, c,op;

}
