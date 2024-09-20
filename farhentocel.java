import java.util.Scanner;
public class farhentocel {
    public static void main(String[] args) {
        
    
System.out.println("Please enter the temperature in farheinheit");
Scanner sc = new Scanner(System.in);
long far = sc.nextLong();
long cel = (5*(far-32))/9;
System.out.println("THE TEMPERATUE IN CELSIUS IS= " + cel);
}
}
