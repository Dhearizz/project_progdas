import java.util.Scanner;
public class calculator {

public static void main(String[] args) {
    
    int nilai1, nilai2, oprator;
    System.out.println("1.masukan angka 1 untuk penjumlahan " + "\n" + 
    "2. masukan angka 2 untuk perkalian" + "\n" + 
    "3. masukan angka 3 untuk pengurangan" + "\n" + 
    "4. masukan angka 4 untuk pembagian" + "\n" + 
    "5. masukan angka 5 untuk modulus");

    Scanner sc = new Scanner(System.in);

    System.err.print("Masukan dan pilih angka :");
    oprator = sc.nextInt();

    System.err.print("Masukan nilai pertama ");
    nilai1 = sc.nextInt();

    System.err.print("masukan nilai kedua :");
    nilai2 = sc.nextInt();

    int hasil;

    if(oprator == 1){
        hasil = nilai1 + nilai2;
        System.out.println("hasil penjumlahan " + hasil);
    }else if (oprator == 2 ) {
        hasil = nilai1 * nilai2;
        System.err.println("hasil perkalian " + hasil);
    }else if (oprator == 3) {
        hasil = nilai1 - nilai2;
        System.err.println("hasil pengurangan " + hasil);
    }else if (oprator == 4) {
        hasil = nilai1 / nilai2;
        System.out.println("hasil pembagian " + hasil);
    }else if (oprator == 5) {
        hasil = nilai1 % nilai2;
        System.out.println("hasil modulus " + hasil);
   
 }
sc.close();
  }
}  


