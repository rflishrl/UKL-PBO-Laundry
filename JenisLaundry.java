package ukl_pbo_laundry;
import java.util.ArrayList;
public class JenisLaundry {
    
    private ArrayList<String> jenisLaundry = new ArrayList<String>();
    private ArrayList<Integer> durasi = new ArrayList<Integer>();
    private ArrayList<Integer> harga = new ArrayList<Integer>();
    
    public JenisLaundry() {
        
        this.jenisLaundry.add("Cuci Basah");
        this.durasi.add(1);
        this.harga.add(1500);
        
        this.jenisLaundry.add("Cuci Kering");
        this.durasi.add(2);
        this.harga.add(2000);
        
        this.jenisLaundry.add("Cuci Setrika");
        this.durasi.add(2);
        this.harga.add(2000);
    }
    
    //Getter
    public int getJmlLaundry(){
        return this.jenisLaundry.size();
    }
    
    public String getJenisLaundry(int idLaundry){
        return this.jenisLaundry.get(idLaundry);
    }
    
    public int getDurasi(int idLaundry){
        return this.durasi.get(idLaundry);
    }
    
    public int getHarga(int idLaundry){
        return this.harga.get(idLaundry);
    }
    
    public void editDurasi(int idLaundry, int durasi){
        this.durasi.set(idLaundry, durasi);
    }
    
    //Setter
    public void setJenisLaundry(String jenisLaundry){
        this.jenisLaundry.add(jenisLaundry);
    }
    
    public void setDurasi(int durasi){
        this.durasi.add(durasi);
    }
    
    public void setHarga(int harga){
        this.harga.add(harga);
    }
    
}
