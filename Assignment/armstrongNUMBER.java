package Assignment;
import java.util.Scanner;


public class armstrongNUMBER {
    static boolean armstrong(int n){

        int len = 0;
        int temp = n;
        while (temp!=0){
            temp/=10;
            len++;
        }
        int sum=0;
        temp=n;
        while (temp!=0){
            sum+= (int)Math.pow(temp%10 ,len );
            temp/=10;
        }
         
    public static void main(String[] args){ 

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
    



    }
    
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

System.out.println(armstrong(2323));







}
}
