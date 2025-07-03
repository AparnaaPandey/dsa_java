package arrays.maxSumAr;

public class bruteForce {
    public static void main(String[] args) {
    int arr[]={4,2,7,39,1,3,5,6};
    int n= arr.length;
    int start=0;
    int end=0;
    int maxS= Integer.MIN_VALUE;
    for(int i = 0 ; i<n;i++){
        int currentS=0;
        for(int j=i;j<arr.length;j++){
            for(int k=i;k<=j;k++){
               currentS+= arr[k];

            }
            if(currentS>maxS){
                maxS=currentS;
                start = i;
                end = j;
            }
        }
    }
    System.out.println("Maximum sum of subarray is: " + maxS);
    System.out.println("Subarray with maximum sum is");
    for(int i =start;i<=end;i++){
        System.out.print(arr[i] + " ");
    }
    }
}
