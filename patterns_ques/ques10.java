public class ques10 {
    public static void main(String[] args) {
        int n =5;
        for(int i =1; i<=n; i++){
            for(int j =0 ; j<i;j++){
                System.out.print(" *");
            }
            
            for(int k =1 ; k<=2*(n-i);k++){
                System.out.print("  ");
            }
            
            for(int l =0 ; l<i;l++){
                System.out.print(" *");
            }
            System.out.println();
            
        }
        for(int i =1;i<=n;i++){
            for(int j =0 ; j<n-i+1;j++){
                System.out.print(" *");
            }
            for(int k =1 ; k<=2*(i-1);k++){
                System.out.print("  ");
            }
            for(int l =0 ; l<n-i+1;l++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
        
    
    
}
