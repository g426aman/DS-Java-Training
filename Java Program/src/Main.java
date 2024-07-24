import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");

        int n=sc.nextInt();
        int i=1;

        for(i=1;i<=n;i++){
            if(i==7){
                break;
            }

            System.out.println(i);

        }


    }
}