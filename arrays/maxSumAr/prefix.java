package arrays.maxSumAr;

public class prefix {
    public static void main(String[] args) {
        int[] arr = {2, 6, 3, 2, 8, 9};
        int n = arr.length;
        int currsum=0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[]= new int[arr.length];
        prefix[0]= arr[0];
        for(int i =1; i<prefix.length;i++){
            prefix[i]= prefix[i-1]+arr[i];
        }

        for(int i =0;i<n;i++){
            int start =i;
            for(int j =i;j<n;j++){
                int end=j;
                currsum= start==0 ? prefix[end] : prefix[end]- prefix[start-1];
                if(maxSum<currsum){
                    maxSum= currsum;
                }
            }

        }
         
        System.out.println("Maximum sum of subarray is: " + maxSum);

    }
    
}
