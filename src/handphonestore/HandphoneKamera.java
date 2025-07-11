
package handphonestore;

//class (inheritance)
public class HandphoneKamera extends Handphone {
    private int kameraMP;

    public HandphoneKamera(String nama, double harga, String merk, int kameraMP) {
        super(nama, harga, merk);
        this.kameraMP = kameraMP;
    }

    //override polymorphism
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Kamera      : " + kameraMP + " MP");
    }
}
