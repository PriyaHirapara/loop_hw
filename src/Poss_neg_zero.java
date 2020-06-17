import java.util.Scanner;

public class Poss_neg_zero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("please enter two number :");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int positive=0;
        int negative=0;
        int temp1=0;
        int temp2=0;
        int temp=0;
        if (a<=b) {
            for (int value = a; value <= a; a++) {
                if (value == 0) {
                    temp++;
                } else if (value < 0) {
                    temp2++;
                } else {
                    temp1++;
                }
            }
            System.out.println("Total positive " + temp1);
            System.out.println("Total negative " + temp2);
            System.out.println("Zero " + temp);
        } else
        {
            System.out.println("please enter desending value");
        }


        }

    }



