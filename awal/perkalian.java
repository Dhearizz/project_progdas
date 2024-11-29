
import java.util.Scanner;


public class perkalian{


    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);

        System.out.print("masukan angka pertama : ");
        int firstnumber = sc.nextInt();

        System.out.print("masukan angka kedua : ");
        int secondnumber = sc.nextInt();

        int hasil = firstnumber * secondnumber;
        
        System.out.print("hasil perkalian : " + hasil);
        sc.close();
    }
    
} 
    

