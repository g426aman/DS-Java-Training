import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");

        int n=sc.nextInt();
        int i=1;

        for(i=1;i<=n;i++){
            if(i%2==0){
                System.out.println(i);
            }




        }


    }
}