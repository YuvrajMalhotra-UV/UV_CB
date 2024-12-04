package lecture06;
public class array2 {

    //static void showreverse( int arr[]){
      //  for(int i=arr.length; i>=arr.length;i--){
        //    System.out.println(arr[i] );
       //}
    //}
    static void show(int arr[]){
        for(int i:arr){
            System.out.print(i+ " ");
            System.out.println();
        }
    }
    
    static void swapindex(int [] arr,int i,int j){
        int temp =arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        //System.out.println(arr[i]);

     
    }
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
      //  arr[0]=10;
        // arr[1]=20;
        // arr[2]=30;
        // arr[3]=40;
        // arr[4]=50;
        //showreverse(arr);
        swapindex(arr, 2, 3);
        show(arr);
        
       
}
}