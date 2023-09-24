import java.util.Scanner;
public class Gaji25 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int jmlMasuk, jmlTdkMasuk, TotGaji;
        int gaji, potGaji;
        System.out.println("Masukan Gaji Perbulan Anda ");
        gaji=input.nextInt();
        System.out.println("Masukan Potongan Gaji Anda ");
        potGaji=input.nextInt();
System.out.println("Masukan Jumlah Hari Kerja Anda ");
jmlMasuk=input.nextInt();
System.out.println("Masukan Jumlah Hari Tidak Masuk Anda ");
jmlTdkMasuk=input.nextInt();
TotGaji=(jmlMasuk*gaji)-(jmlTdkMasuk*potGaji);
System.out.println("Gaji yang anda terima adalah " +TotGaji);
    }
}