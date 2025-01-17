public class largestarray {
    public static int largest(int arr[]){
        int large = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(large < arr[i]){
                large = arr[i];
            }
        }
        return large;
    }
    public static void main(String[] args) {
        int arr[]={1,2,6,3,5};
        System.out.println("largest no is"+largest(arr));
    }
    
}
