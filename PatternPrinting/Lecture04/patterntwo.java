package PatternPrinting.Lecture04;
import java.util.Scanner;
public class patterntwo {
    public static void main(String[] args) {
        
    
    System.out.println("enter the number");
    Scanner sc = new Scanner(System.in);
    int n= sc.nextInt();
    for(int i=1; i<=n;i++){
        if(i==n){
            System.out.print("*");
        }
        else{
            System.out.print("  ");
        }
    for(int j=1;j<=n;j=j+1){
    System.out.print("*");



}
System.out.println();
    }








    }
}
