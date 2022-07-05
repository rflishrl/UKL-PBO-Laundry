package ukl_pbo_laundry;
import java.util.ArrayList;
public class Petugas extends Client{
    
    // enkapsulasi
    private ArrayList<String> namaPetugas = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();
    private ArrayList<Integer> jabatan = new ArrayList<Integer>();
    
    public Petugas(){
        this.namaPetugas.add("Admin");
        this.alamat.add("Malang");
        this.telepon.add("0811122233333");
        this.jabatan.add(0);
    }
    
    public void setJabatan(int jabatan){
        this.jabatan.add(jabatan);
    }
    
    public int getJabatan(int id){
        return this.jabatan.get(id);
    }
    
    public int getJmlPetugas(){
        return this.jabatan.size();
    }

    //Inheritance (yang diwariskan)
    public void setNamaPetugas(ArrayList<String> namaPetugas){
        this.namaPetugas = namaPetugas;
    }
    
    public void setAlamat(ArrayList<String> alamat){
        this.alamat = alamat;
    }
    
    public void setTelepon(ArrayList<String> telepon){
        this.telepon = telepon;
    }
    
    public ArrayList<String> getNamaPetugas(){
        return namaPetugas;
    }
    
    public ArrayList<String> getAlamat(){
        return alamat;
    }
    
    public ArrayList<String> getTelepon(){
        return telepon;
    }
    
}
