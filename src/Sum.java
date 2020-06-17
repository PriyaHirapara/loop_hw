import java.util.Scanner;

public class Sum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("please enter five number :");
        int number = scanner.nextInt();
        int a;
        int b = 0;

        while (number >= 1) {
            a = number % 10;
            b = a + b;
           number = number / 10;

                System.out.println(b);

        }
            }


        }



