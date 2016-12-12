package jakalvision;


public class Pelanggan extends Beli{
    private String ID;
    private String nama;
    private String no_hp;
    private String alamat;
    
    public Pelanggan(String ID, String nama, String no_hp, String alamat) {
        this.ID = ID;
        this.nama = nama;
        this.no_hp = no_hp;
        this.alamat = alamat;
    }

    public String getID() {
        return ID;
    }

    public String getNama() {
        return nama;
    }

    public String getNo_hp() {
        return no_hp;
    }

    public String getAlamat() {
        return alamat;
    }
    
    @Override
    public void info() {
        System.out.println("ID     : " +ID);
        System.out.println("Nama   : " +nama);
        System.out.println("No.hp  : " +no_hp);
        System.out.println("Alamat : " +alamat);
    }
}
