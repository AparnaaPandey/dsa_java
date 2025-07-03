package arrays;

public class largestE {
    public static void main(String[] args) {
        int[] arr = {11, 2, 48, 24, 35};
        int max= Integer.MIN_VALUE;
        for(int i =0 ; i<arr.length;i++){
            if(arr[i]>max){
                max= arr[i];
            }
        }
        System.out.println("Largest element in the array is: " + max);
    }
    
}
