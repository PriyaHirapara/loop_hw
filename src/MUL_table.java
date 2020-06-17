import java.util.Scanner;

public class MUL_table {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("please enter any number :");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        for (int i=1;i<=10;i++){
            System.out.println(i*a);
           for (int j=a;j<=b;j++){
               System.out.println(a*b);
           }
            System.out.println("");
           a++;
        }
    }
}
