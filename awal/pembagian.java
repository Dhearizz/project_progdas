import java.util.Scanner;
public class pembagian {

    public static void main(String[] args) {
        
            Scanner sc = new Scanner (System.in);

            System.out.print("masukan angka pertama : ");
            int firstnumber = sc.nextInt();

            System.out.print("masukan angka kedua : ");
            int secondnumber = sc.nextInt();

            int hasil = firstnumber / secondnumber;

            System.out.print("hasil pembagian : " + hasil);
            sc.close();
    }
    
}
