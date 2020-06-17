import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("please enter any number :");
        int p = scanner.nextInt();

        int c =0;// count the number of factor
        for (int i=1; i<=p; i++){
            if ( p%i ==0) // cheking fucter tha num
                   c++;
        } if (c ==2){ // cheking that num
            System.out.println(p + " is a prime number");
        }else
            System.out.println(p + " is not a prime number");


    }
}
