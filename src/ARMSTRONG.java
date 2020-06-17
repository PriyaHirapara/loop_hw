import java.util.Scanner;

public class ARMSTRONG {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       System.out.print("please enter any 4 digit number :");
        int n = scanner.nextInt();
        int temp = n;
        int rem;
        int sum =0;
        while (n>0)
        {
            rem = n % 10;
            n = n / 10;
            sum = sum +( rem * rem * rem *rem);
        }
        if (temp==sum) {
            System.out.println("its an armstrong number" );
        }else
            System.out.println(" its not an armstrong number" );



    }}

