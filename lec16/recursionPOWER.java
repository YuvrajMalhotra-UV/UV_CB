package lec16;

public class recursionPOWER {
    //static int Power(int x,int n){
      //  if ( n==0) return 1;
    // return x*Power(x,n-1);
    

    //}
//public static void main(String[] args) {
   // int x=2;
    //int n = 3;
   // System.out.println(Power(x,n));
//}

//Tail recursion power factor above one is head recursion 
static int power ( int x , int n, int k){
    if (n==0) return k;
     return power(x , n-1 , x*k);
}
public static void main(String[] args) {
    System.out.println(power(3, 02, 1));
}

}
