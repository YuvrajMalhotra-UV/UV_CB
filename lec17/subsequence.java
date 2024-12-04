package lec17;

public class subsequence {
    static void printSubSeq(String ques , String ans, int count ){
        if(ques.length()==0){
            System.out.println(ans);
            count ++;
            return;
        }
        char a = ques.charAt(0);
        
    
        
 // include 
 printSubSeq(ques.substring(1), ans +a , count ++);
 //dont include
 printSubSeq(ques.substring(1),ans, count ++);
  
  System.out.println(count);
    }
    public static void main(String[] args) {
        String s = "car";
        printSubSeq(s, "", 0);
    }
}
