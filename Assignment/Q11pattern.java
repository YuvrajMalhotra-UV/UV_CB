package Assignment;
import java.util.Scanner;
public class Q11pattern  {
    public static void main(String[] args){
    int n = 7; // Number of lines
    for (int i = 1; i <= n; i++) {
        // Print numbers
        for (int j = 1; j <= i; j++) {
            System.out.print(j);
        }
        // Print asterisks
        for (int k = n; k > i; k--) {
            System.out.print("*");
        }
        System.out.println();
    }
}
}