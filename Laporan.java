package ukl_pbo_laundry;

public class Laporan {
    
    public void laporan (JenisLaundry jenisLaundry){
        
        int x = jenisLaundry.getJmlLaundry();
        
        System.out.println("============== LAUNDRY PAKAIAN ==============");
        System.out.println("");
        System.out.println("Tabel Jenis Laundry");
        System.out.println("");
        System.out.println("ID \tJenis Laundry \tDurasi(hr) \tHarga/kg");
        for (int i = 0; i < x; i++) {
            System.out.println(i + "\t" + jenisLaundry.getJenisLaundry(i) + "\t" +
            jenisLaundry.getDurasi(i) + "hr" + "\t" + "\t" + jenisLaundry.getHarga(i) + "/kg");
        }
    }
    
    public void laporan(Client client){
        
        int x = client.getJmlClient();
        
        System.out.println("");
        System.out.println("Tabel Client");
        System.out.println("");
        System.out.println("ID \tNama \tTelepon \t\tSaldo");
        
        for (int i = 0; i < x; i++) {
            System.out.println(i + "\t" + client.getNama(i) + "\t"
            + client.getTelepon(i) + "\t" + client.getSaldo(i));
        }
    }
    
    public void laporan(Transaksi transaksi, JenisLaundry jenisLaundry){
        
        int x = transaksi.getJmlTransaksi();
        
        System.out.println("");
        System.out.println("Laporan Transaksi");
        System.out.println("");
        System.out.println("ID \tJenis Laundry \tJumlah(kg) \tHarga(kg) \tJumlah");
        
        int total = 0;
        for (int i = 0; i < x; i++) {
            int jumlah = transaksi.getBanyaknya(i) * jenisLaundry.getHarga(transaksi.getIdJenisLaundry(i));
            total += jumlah;
            
            System.out.println(i + "\t" + jenisLaundry.getJenisLaundry(transaksi.getIdJenisLaundry(i)) + "\t" +
            transaksi.getBanyaknya(i) + "kg" + "\t" + "\t" + jenisLaundry.getHarga(transaksi.getIdJenisLaundry(i)) + "/kg" + "\t" + "\t"
            + jumlah);
        }
        System.out.println("Total Omset = " + total);
    }
}
