import java.util.Scanner;


public class percabangan {

    public static void main(String[] args) {
        int a, b;
        a= 4;
        b= 7;

        // if(a < b){
        //       System.out.println("nilai a lebih dari nilai b");
        //   } else{
        //       System.out.println("nilai b kurang dari nilai a");
        //   }

        Scanner sc = new Scanner (System.in);
        System.out.println("masukan angka:");
        int nilai = sc.nextInt();

        switch (nilai) {
            case 1:
                System.out.println("Nilai pertama");
                break;

            case 2:
                System.out.println("Nilai kedua");
                break;

            case 3:
                System.err.println("Nilai ketiga");
                break;

            default:
                System.out.println("nilai tidak ditemukan");
                break;
        }
        sc.close();
    }
}
