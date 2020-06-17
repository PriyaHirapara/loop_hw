import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("please enter  number :");
        int value = scanner.nextInt();
        int a = value, b=1;
        for (int i =5;i>0;i--){
        b=b*i;
            System.out.println(b);
        }

    }
}
