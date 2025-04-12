package STACKS;
import java.util.*;
public class InsertAtBottom {
    public static void insertAtBottom(Stack<Integer> s, int val){
        Stack<Integer> extraStack= new Stack<>();
        while(s.size()>0){
            int data=s.pop();
            extraStack.push(data);
        }
        s.push(val);
        while(extraStack.size()>0){
            int data = extraStack.pop();
            s.push(data);
        }
    }
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    Stack<Integer> s = new Stack();
    while(n>0){
        
    }
}
}
