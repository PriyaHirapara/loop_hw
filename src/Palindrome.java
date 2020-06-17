import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("please enter any number :");
        int n = scanner.nextInt();
        int t = n;
        int rev = 0;
        while (t!=0){
            int dem = t%10;
            rev = 10*rev +dem;
            t = t/10;
        }
        if (rev ==n){
            System.out.println(n + " is a palindome number");
        }else
            System.out.println(n + " is not palindome number");

    }
}