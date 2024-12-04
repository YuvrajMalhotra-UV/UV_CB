package lec17;

public class coinTOSS {
static void cointoss(int n , String ans){
    if(n==0){
        System.out.println(ans);
        return;
       
       
        }
        cointoss(n-1, ans + "H ");
        cointoss(n-1, ans + "T ");
    }
    public static void main(String[] args) {
        
        cointoss(3, "");
    }
}

