package Lecture03;
import java.util.Scanner; 
public class Loops {
    public static void main(String[] args) {

        System.out.println("Please enter the number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Number you entered is : " + n);
int rem = 1;
for (int i = 2 ; i<= n-1; i++)
{
//System.out.println("i" + i);
rem = n%i;

if (rem == 0)
{
    System.out.println(" this is not a prime number : " + n);
    break;
}

}
if (rem !=0)
{
    System.out.println(" THis is a prime number " + n);
}
}
    
  
}