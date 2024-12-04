package lec17;

public class genparanthesis {
    static void generatepara(int n , int l  ,int r , String ans ){
        if (n==l && l==r){
            System.out.println(ans);
            return;
        }

        if(l>n || r>l){
        return;
        }
        generatepara(n, l+1, r, ans+ "{");
        generatepara(n, l, r+1, ans + "}");
    }
    public static void main(String[] args) {
        
        generatepara(3, 0, 0, "");
    }
}
