package LEC12;
import java.util.Scanner;
public class secondtwoDarray {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][]arr= new int[n][m];
        for (int i=0; i<n; i++){
            for(int j=0; j<m; j++){
              arr[n][m]= sc.nextInt();
            }
        } 
        for (int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(arr[i][j] + "");
            }
            for(int i = 0 ; i< arr.length; i++){
                Arrays.sort(arr[i]);
            }
        
    }

}
}