package lec16;

public class FIBONACCIseries {
    static int fibo(int n){
        if(n==0 || n==1) {
        return n;
        }
        int fibo1 = fibo(n-1);
        int fibo2 =fibo(n-2);
        return fibo1 + fibo2;
    }
public static void main(String[] args) {
    System.out.println(fibo(6));
}
}
