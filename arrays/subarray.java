package arrays;

public class subarray {
    public static void main(String[] args) {
        int arr[]= {2,5,8,3,1};
        for( int i =0 ; i<arr.length;i++){
            int start = i ;
            for(int j =i ; j<arr.length;j++){
                int end=j;
                for(int k =start;k<=end;k++){
                    System.out.print(arr[k]);
                }
               System.out.println(); 
            }
            System.out.println();
                
            
        }
    }
}
