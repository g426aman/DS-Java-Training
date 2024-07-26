import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the weight:");
        double weight = sc.nextDouble();
        System.out.println("Enter the height:");
        double height = sc.nextDouble();
        double bmi = weight / (height * height);
        System.out.println("BMI is " + bmi);
    }
}
