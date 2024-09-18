package Assignment;
import java.util.Scanner;
public class Printreverse {
    public static void main(String[] args) {
       System.out.println("please enter the number");
       Scanner sc =  new Scanner(System.in);
       int n = sc.nextInt();
       int rem=0;
       while(n!=0){
        rem = n % 10;
        System.out.print(rem);
        n = n/10;
       }
        
    
    }

}