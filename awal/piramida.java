
import java.util.Scanner;


public class piramida {

public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);

     System.out.print("masukan tinggi piramida : ");
     int nilai = sc.nextInt();

     int i, j ;
         for (i = 1; i <= nilai ; i++){
            for (j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}    