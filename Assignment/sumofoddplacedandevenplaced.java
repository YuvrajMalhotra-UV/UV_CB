package Assignment;
import java.util.Scanner;
public class sumofoddplacedandevenplaced {
    public static void main(String[] args) {
        System.out.println("Please enter the number");
        Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
      
    int quot = 0;
    int rem1 = 0;
    int rem2 = 0;
    int S1 =0;
    int S2 = 0;
    int count =0;
    int num = n;
    while (num != 0) {
         num = num/10;
        count++;
    }
    while(n>0){

        rem1 = n%10;
        S1 = S1+rem1;
        
        quot = n/10;
        rem2= quot%10;
        S2=S2+rem2;
        n=quot/10;
    }
    
    if( count%2==0){

    System.out.print("\n Sum of even placed  digits is "  + S1);
    System.out.print("\n Sum of odd placed digits is " +  S2);
}
else{ System.out.print("\n Sum of odd placed digits is "+   S1);
System.out.print("\n Sum of even placed digits is " +  S2);

}
   
}
}