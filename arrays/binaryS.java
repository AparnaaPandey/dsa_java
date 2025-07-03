package arrays;

public class binaryS {
    public static void main(String[] args) {
    int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    int target=5;
    int  n= arr.length;
    int start =0;
    int end = n -1;
    for(int i = 0; i < n; i++) {
        int mid = (start + end) / 2;
        if(arr[mid]== 5) {
            System.out.println("Element found at index: " + mid);
            return;
        } else if(arr[mid] < 5) {
            start = mid + 1;
        } else {
            end = mid - 1;
        }
        
    }   
}     
}
