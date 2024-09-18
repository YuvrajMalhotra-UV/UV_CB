package Assignment;
import java.util.Scanner;
public class CountingNumber {
    public static void main(String[] args) {
        
    
    System.out.println("enter the number");
    Scanner sc = new Scanner(System.in);
    int n1 = sc.nextInt();
    System.out.println("enter the digit");
    Scanner sc1 = new Scanner(System.in);
    int n2 = sc1.nextInt();
   int count=0;
   int rem=0;
   while(n1 !=0){
    rem =n1%10;
    if(n2==rem){
        count++;
    }
    n1=n1/10;
   }
    System.out.println("number of times digit is ocurring is =" + count);
    }

}
