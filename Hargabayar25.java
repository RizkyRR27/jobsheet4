import java.util.Scanner;
public class Hargabayar25 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
int harga, jumlah, jmlHalamanbuku;
double diskon, total, bayar, jmlDis;
String merkBuku;

System.out.println("mMasukan merk buku yang anda beli ");
merkBuku=input.nextLine();
System.out.println("Masukan jumlah halaman buku");
jmlHalamanbuku=input.nextInt();
System.out.println("Masukan harga barang yang dibeli ");
harga=input.nextInt();
System.out.println("Masukan Jumlah jumlah barang yang dibeli ");
jumlah=input.nextInt();
System.out.println("Masukan jumlah diskon ");
diskon=input.nextDouble();
total=harga*jumlah;
jmlDis=total*diskon;
bayar=total+jmlDis;
System.out.println("Merk buku yang dibeli adalah " +merkBuku);
System.out.println("Jumlah halaman buku " +jmlHalamanbuku);
System.out.println("Diskon yang anda dapatkan adalah " +jmlDis);
System.out.println("Jumlah yang harus dibayar adalah " +bayar);    
    }
}
