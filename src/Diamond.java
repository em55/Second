/**
 * Created by em on 9/12/16.
 */
public class Diamond {
    public static void main(String[] args) {
        int n = 9;
        /* isosceles triangle
        int s = n*2;
        for (int i = 0; i < s; i+=2) {

                for(int k=0; k<(s-i)/2; k++){
                    System.out.print(" ");
                }
                for (int j = 0; j <= i; j++) {
                    System.out.print("*");
                }
            System.out.println();
        }
        */
        // diamond
        for (int i = 0; i < n; i+=2) {

            for(int k=0; k<(n*2-i)/2; k++){
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = n-2; i > 0; i-=2) {

            for(int k=0; k<=(n*2-i)/2; k++){
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
