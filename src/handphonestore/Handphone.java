
package handphonestore;

//class
public class Handphone extends Produk {
    protected String merk;

    //constructor
    public Handphone(String nama, double harga, String merk) {
        super(nama, harga);
        this.merk = merk;
    }

    //accessor
    public String getMerk() {
        return merk;
    }

    //mutator
    public void setMerk(String merk) {
        this.merk = merk;
    }

    //override polymorphism
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Merk        : " + merk);
    }
}
