/**
 * @author 
 * Nama      : Garry Prang
 * Kelas     : PBO2
 * NIM       : 10116147
 * Deskripsi : Program untuk menghitung total biaya emas kawin.
 */

package pbo2.pkg10116147.latihan49.biayaemaskawin;
/**
 *
 * @author Corazon
 */
import java.util.Scanner;
public class PBO210116147Latihan49BiayaEmasKawin {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Mahar mahar = new Mahar();
        
        System.out.println("======= Menghitung Harga Emas =======");
        System.out.print("Masukkan berat emas = ");
        mahar.setBerat(input.nextDouble());
        System.out.print("Masukkan harga emas bulan ini = Rp");
        mahar.setHarga(input.nextInt());
        System.out.println("Total Biaya = Rp" +mahar.totalHarga());
        
    }
    
}
