
package GUI;

public class warga {
    public int data;
    public String nama;
    public int noRumah;
    public int noKK;
    public String noTelp;
    public int jumlah;

    public warga(String nama, int noRumah, int noKK, String noTelp, int jumlah) {
        this.data = data;
        this.nama = nama;
        this.noRumah = noRumah;
        this.noKK = noKK;
        this.noTelp = noTelp;
        this.jumlah = jumlah;
    }
    
    public int getKey(){
        return data;
    }
    
    public String getNama(){
        return nama;
    }
    
    public int getNoRumah(){
        return noRumah;
    }
    
    public int getNoKK(){
        return noKK;
    }
    
    public String getNoTelp(){
        return noTelp;
    }
    
    public int getJumlah(){
        return jumlah;
    }
}