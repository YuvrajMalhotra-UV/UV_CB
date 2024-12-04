package PatternPrinting;
import java.util.Scanner;
public class patternprinting {
    
    public static void main(String[] args) {
        System.out.println("enter the number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //i ko 1 liya tha and j ko bhi
       for(int i =1; i<=n; i++){
            for(int j=i; j<=n;j++){
                System.out.print("* ");
           // for(int i =1; i<=n;i++){
               //// for(int j=1;j<=i;j++){
                    System.out.print(" ");
                }
                System.err.println();
            }
            
            
        }
        
    }


