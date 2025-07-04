package arrays;

public class pairsA {
    public static void main(String[] args) {
        int[] arr= {2,6,3,2,8,9};
        for(int i =0; i<arr.length;i++){
            for(int j = i+1;j<arr.length;j++){
                System.out.println("Pair: (" + arr[i] + ", " + arr[j] + ")");
            }
        }
    }
}
