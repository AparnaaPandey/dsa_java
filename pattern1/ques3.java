package pattern3;

public class ques3 {
    public static void main(String[] args) {
        char r = 'A';
        for (int i = 1; i < 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(r+ " ");
                r++;
            }
            System.out.println();
        }
    }
}
