package lecture06;
public class arraydisplay {

    static void displayArray(int arr[]){
        
for(int i=1;i<=arr.length;i++){
    System.out.println(i);
    }
}
public static void main(String[] args){


    int [] arr = new int[5];
        arr [0]=10;
        arr [1]=20;
        arr [2]=30;
        arr [3]=40;
        arr[4]=50; 

        displayArray(arr);

System.out.println(arr[4]);



}
}

