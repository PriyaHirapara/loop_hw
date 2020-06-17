import java.util.Scanner;

public class Revarse {
    public static void main(String[] args) {
        String a;
        Scanner scanner = new Scanner(System.in);
        System.out.print("please Enter five digit :");
         a = scanner.nextLine();
        System.out.print("Revarse of a String "+a+ " is ");
        int i=a.length();
        while (i>0){
            System.out.print(a.charAt(i-1));
            --i;
        }






}}
