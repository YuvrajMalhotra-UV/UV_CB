package lec16;

public class recursionFACTORIAL {
    static long fact(long n){
        if(n==1) return 1;
        else return n*fact(n-1);
    }
public static void main(String[] args) {
    long n = 15;
    System.out.println(fact(n));
}
}
