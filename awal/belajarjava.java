import java.util.Scanner;

public class belajarjava {
    
    public static void main(String[] args) {
        
        //untuk memanggil libary scanner
        Scanner sc = new Scanner (System.in);
        
        System.out.print("masukan angka pertama : ");
        int a = sc.nextInt();
    
        System.out.print("masukan angka kedua : ");
        int b = sc.nextInt();
        boolean hasil;

        hasil = a == b;
        System.out.println("apakah  "+a+" == "+b+" = " + hasil );

        hasil = a != b;
        System.out.println("apakah "+a+" != "+b+" = " + hasil );
        
        hasil =  a > b;
        System.out.println("apakah "+a+" > "+b+" = " + hasil );

        hasil = a < b;
        System.out.println("apakah "+a+" < "+b+" = " + hasil );

        hasil = a >= b; 
        System.out.println("apakah "+a+" >= "+b+" = " + hasil );

        hasil = a <= b;
        System.out.println("apakah "+a+" <= "+b+" = " + hasil );

    }
}
