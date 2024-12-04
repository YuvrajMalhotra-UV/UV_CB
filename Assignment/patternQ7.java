package Assignment;
import java.util.Scanner;

public class patternQ7 {
    public static void main(String[] args) {
        
    System.out.println("How many stars do you wanna print?");
  Scanner  sc = new Scanner(System.in);

int n =  sc.nextInt();
for(int i=1;i<=n;i++){
for(int j =1;j<=n;j++){
    if(i==j)
    System.out.print("*");
if(i==1 || i==j || j==1 || j==n)
System.out.print("*");
else{
    System.out.println("  ");
}
// System.out.println();
}




}



    }

}
