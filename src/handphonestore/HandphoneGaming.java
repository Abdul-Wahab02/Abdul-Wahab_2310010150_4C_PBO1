
package handphonestore;

//class (inheritance)
public class HandphoneGaming extends Handphone {
    private String chipset;

    public HandphoneGaming(String nama, double harga, String merk, String chipset) {
        super(nama, harga, merk);
        this.chipset = chipset;
    }

    //override polymorphism
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Chipset     : " + chipset);
    }
}