import java.util.Scanner;

public class belajar {
    public static void main(String[] args) {
         
         Scanner sc = new Scanner (System.in);

         System.out.print("masukan tinggi segitiga : ");
         int nilai = sc.nextInt();

         int i, j, k;
         for (i = 1; i <= nilai ; i++){
            for (j = i; j < nilai; j++) {
                System.out.print(" ");
            }
            for (k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
             }
            System.out.println();
            }
        }
    }
           
    
    
    