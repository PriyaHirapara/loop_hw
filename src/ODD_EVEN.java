import java.util.Scanner;

public class ODD_EVEN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter five value :");
        int value = scanner.nextInt();
        int odd = 0;
        int even=0;
        int s_even = 0;
        int s_odd = 0;
        int store = 0;
       // if (value>=10000 && value<100000){
            while (value >0) {
                store = value % 10;
                if (value % 2 == 0) {
                    s_even = s_even + store;
                } else {
                    s_odd = s_odd + store;
                }
                value = value / 10;
            }
            System.out.println("addition  of ODD number is : " +s_odd);
        System.out.println("addition of Even numbre is : " +s_even);
   // }else {
        //System.out.println("Plesae Enter five Digits Only  ");
    }
}
//}