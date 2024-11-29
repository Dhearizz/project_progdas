import java.util.Scanner;

public class biodatadiri {
    

public static void main(String[] args){

// untuk memanggil library scanner
Scanner sc = new Scanner(System.in);

// untuk interaksi inputan
System.out.print("masukan nama : ");
String name = sc.nextLine();

System.out.print("Masukan umur : ");
int umur = sc.nextInt();

sc.nextLine();

System.out.print("masukan kelas : ");
String kelas = sc.nextLine();

System.out.print("masukan hobby : ");
String hobi = sc.nextLine();

System.out.print("masukan alamat : ");
String alamat = sc.nextLine();


// untuk menampilkan hasil inputan
System.out.println("nama saya adalah : " + name);
System.out.println("umur saya adalah : " + umur);
System.out.println("kelas saya adalah : " + kelas);
System.out.println("hobi saya adalah : " + hobi);
System.out.println("alamat saya di : " + alamat);

sc.close();

}
}