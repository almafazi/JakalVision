
package jakalvision;


public class Premium extends Beli implements Paket {
    public final double HARGA = 200000;
    
    public Premium(int lama, double diskon) {
        this.lama = lama;
        this.diskon = HARGA*diskon/100;
    }
    
    @Override
    public double getDiskon() {
        return (HARGA-diskon);
    }
    
    @Override
    public double getTotal() {
      return (getDiskon() * lama);
    }
    
    @Override
    public void info() {
        
        
        
       
        System.out.println("Paket yang dipilih Paket Premium");
        System.out.println("Harga Awal : Rp."+ HARGA);
        System.out.println("Harga Diskon : Rp." + diskon);
        System.out.println("Harga Setelah diskon : Rp."+getDiskon());
        System.out.println("Lama berlangganan: "+lama+" Bulan");
        System.out.println("Total Harga(harga setelah diskon x lama berlangganan): Rp." + getTotal());
    }
}
