package jakalvision;
import java.util.Scanner;

public class JakalVision {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int jumlah = 0; int pilihan; int total;
       int lama;
       double diskon;
       String nama, alamat, ID, no_hp, cariid;
       Pelanggan[] p = new Pelanggan[100];
       Beli[] bl = new Beli[100]; 
       boolean ngulang=true, ada=false;
       System.out.println("-------SELAMAT DATANG DI JAKALVISION---------");
       System.out.println("");
        OUTER:
        while (ngulang == true) {
            System.out.println("Menu : ");
            System.out.println("1. Daftarkan Pelanggan ");
            System.out.println("2. Cari Pelanggan");
            System.out.println("3. Keluar");
            System.out.println("---------------------------------------------");
            System.out.println("Masukkan Pilihan : ");
            pilihan = sc.nextInt();
            switch (pilihan) {
                case 1:
                    System.out.println("DAFTARKAN PELANGGAN BARU : ");
                    System.out.println("");
                    System.out.println("Jumlah");
                    jumlah = sc.nextInt();
                    for (int i = 0; i < jumlah; i++) {
                        System.out.println("Pelanggan ke-" + (i + 1));
                        System.out.println("ID : ");
                        ID = sc.next();
                        System.out.println("Nama : ");
                        nama = sc.next();
                        System.out.println("Alamat : ");
                        alamat = sc.next();
                        System.out.println("No.Telepon : ");
                        no_hp = sc.next();
                        System.out.println("");
                        p[i] = new Pelanggan(ID, nama, no_hp, alamat);
                        System.out.println("___________________________________________________________________");
                        System.out.println("|                                                                  |");
                        System.out.println("|Harga Paket:Premium = Rp.200.000/BULAN Reguler = Rp.100.000/BULAN |");
                        System.out.println("|__________________________________________________________________|");
                        
                        System.out.println("");
                        System.out.println("Pilih Jenis paket(premium/reguler): ");
                        String paket = sc.next();
                            if (paket.equalsIgnoreCase("premium")) {                          
                                System.out.println("");
                                System.out.println("------------ Paket Premium ------------------");
                                System.out.println("---------------------------------------------");
                                System.out.println("");
                                System.out.println("Lama Berlanggan/bulan :");
                                lama = sc.nextInt();
                                System.out.println("Banyak Diskon(%) : ");
                                diskon = sc.nextDouble();
                                bl[i] = new Premium(lama, diskon);
                            } else if (paket.equalsIgnoreCase("reguler")){
                                System.out.println("");
                                System.out.println("------------ Paket Reguler ------------------");
                                System.out.println("---------------------------------------------");
                                System.out.println("");
                                System.out.println("Lama Berlanggan/bulan :");
                                lama = sc.nextInt();
                                System.out.println("Banyak Diskon(%): ");
                                diskon = sc.nextDouble();
                                bl[i] = new Reguler(lama, diskon);
                            } else {
                                System.out.println("Paket Tidak Ada");
                            }
                        System.out.println("Tersimpan");}
                    System.out.println("=====================================");
                    break;
            //pilihan
                case 2:
                    System.out.println("Cari Pelanggan Berdasarkan id : ");
                    cariid = sc.next();
                    for(int i =0; i < jumlah; i++) {
                        if (cariid.equalsIgnoreCase(p[i].getID())) {
                            System.out.println("");
                            System.out.println("");
                            System.out.println("_________________________________________________________________________");
                            System.out.println("                            INFO PELANGGAN                              ");
                            System.out.println(                             bl[i].TOKO                                   );
                            System.out.println("_________________________________________________________________________");
                            System.out.println("Pelanggan ke-" + (i + 1));
                            if (bl[i] instanceof Premium) {
                                
                                System.out.println("Jenis Paket: PREMIUM");
                                System.out.println("ID pelanggan : "+p[i].getID());
                                System.out.println("Nama Pelanggan : "+p[i].getNama());
                                System.out.println("Alamat : " + p[i].getAlamat());
                                System.out.println("NO.HP : "+p[i].getNo_hp());
                                bl[i].info();
                            } else {
                                System.out.println("Jenis Paket: REGULER");
                                System.out.println("ID pelanggan : "+p[i].getID());
                                System.out.println("Nama Pelanggan : "+p[i].getNama());
                                System.out.println("Alamat : " + p[i].getAlamat());
                                System.out.println("NO.HP : "+p[i].getNo_hp());
                                bl[i].info();
                            } 
                            ada = true;
                        }                                 
                    }
                    if (ada == false) {
                        System.out.println("ID Yang Anda Cari Tidak Ditemukan");
                        System.out.println("==============================================");
                    }
                    break;
                default:
                    System.out.println("SELESAI");
                    ngulang=false;
                    break OUTER;
            }
        }
          jumlah=jumlah+jumlah;
}
}
    

