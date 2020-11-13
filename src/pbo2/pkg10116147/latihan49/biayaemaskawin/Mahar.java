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
public class Mahar {
    private double berat;
    private double harga;
    
    public double getBerat(){
        return berat;
    }
    
    public void setBerat(double berat){
        this.berat = berat;
    }
    
    public double getHarga(){
        return harga;
    }
    
    public void setHarga(double harga){
        this.harga = harga;
    }
    
    public double totalHarga(){
        return getBerat() * getHarga();
    }
}
