
package handphonestore;

//class
public class Produk {
    //atribut
    protected String nama;
    protected double harga;

    //constructor
    public Produk(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }

    //accessor
    public String getNama() {
        return nama;
    }

    //mutator
    public void setNama(String nama) {
        this.nama = nama;
    }

    //accessor
    public double getHarga() {
        return harga;
    }

    //mutator
    public void setHarga(double harga) {
        this.harga = harga;
    }

    //polymorphism
    public void tampilkanInfo() {
        System.out.println("Nama Produk : " + nama);
        System.out.println("Harga       : Rp" + harga);
    }
}
