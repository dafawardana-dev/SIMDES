package GUI;

import javax.swing.JOptionPane;

public class ClassMethode  {
    public warga[] hashArray;// menampung data warga bertipe array
    public int size;
    public int index = 0; 
    public int cari = 0; 
    
    public ClassMethode(int sizeVal) { // constructor untuk menampung banyak nya array 
        this.size = sizeVal;
        hashArray = new warga[size];
    }

    public int binarySearch(String data){  // method untuk mencari data dengan parameter data       
        cari++;
        int low = 0;
        int high = hashArray.length;
        int mid;
        
        while (low <= high) {
        mid = (low + high) / 2;
        String noRumah  = String.valueOf(hashArray[mid].getNoRumah());

            if (noRumah.compareTo(data) <0) {
                low = mid + 1;
            } else if (noRumah.compareTo(data) >0) {
                high = mid - 1;

            } else {
                return mid;
                
            }
        }
        return -1;
    }
    
    public void BubbleSortNoRumah() { // method untuk mengurutkan data berdasarkan nomor rumah
        int batas, i;

        for (batas = size-1; batas > 0 ; batas--) { 
            for (i = 0; i < batas; i++) { 
                if (hashArray[i].getNoRumah()> hashArray[i + 1].getNoRumah()) {// membandingkan data awal dengan data setelahnya
                    swap(i, i + 1);// menukar data 
                }
            }
        }
     }

    public void BubbleSortNoKK() { // method untuk mengurutkan data berdasarkan nomor kk
        int batas, i;

        for (batas = size-1; batas > 0 ; batas--) {
            for (i = 0; i < batas; i++) {
                if (hashArray[i].getNoKK()> hashArray[i + 1].getNoKK()) {// membandingkan data awal dengan data setelahnya
                    swap(i, i + 1);// menukar data 
                }
            }
        }
     }
    
    public void BubbleSortJmlAnggota() { // method untuk mengurutkan data berdasarkan jml anggota
        int batas, i;

        for (batas = size-1; batas > 0 ; batas--) {
            for (i = 0; i < batas; i++) {
                if (hashArray[i].getJumlah()> hashArray[i + 1].getJumlah()) {// membandingkan data awal dengan data setelahnya
                    swap(i, i + 1);// menukar data
                }
            }
        }
    }
    
    private int partitionNama(int left, int right, String pivot) { // method untuk menentukan nilai pivot 
        int leftPtr = left - 1;
        int rightPtr = right + 1;
        while (true) {
            while (leftPtr < right && hashArray[++leftPtr].getNama().compareTo(pivot) < 0) ;
            while (rightPtr > left && hashArray[--rightPtr].getNama().compareTo(pivot) > 0) ;
            if (leftPtr >= rightPtr) {
                break;
            } else {
                swap(leftPtr, rightPtr);
            }

        }
        return leftPtr;
    }
     
    private void recQuickSortNama(int left, int right) { // method untuk mengurutkan subarray secara rekursif
        if (right - left <= 0) 
            return;
        else {
            String pivot = hashArray[right].getNama();
            int partisi = partitionNama(left, right, pivot);
            recQuickSortNama(left, partisi - 1); // panggil method partisi untuk mengurutkan bagian kiri
            recQuickSortNama(partisi, right); // panggil method partisi untuk mengurutkan bagian kanan
        }
    }
         
    public void quickSortNama() { 
        recQuickSortNama(0, size - 1); // mengutkan nama dgn memanggil requicksortnama 
    }
    
    public int hashFunc(int key) { // method dgn parameter key untuk menentukan index
        return key % size;
    }
    
    // method untuk memasukkan data 
    void insert(String nama, int noRumah, int noKK, String noTelp, int jumlah, int urut) {
        warga item = new warga(nama,noRumah,noKK,noTelp,jumlah);
        int key = item.getKey();
        int hashVal = hashFunc(key);

        while (hashArray[hashVal] != null ) {

            ++hashVal;
            hashVal %= size;

        }
        hashArray[hashVal] = item;
    }
    
    private void swap(int left, int right) { // menukar posisi data
        warga temp = hashArray[left];
        hashArray[left] = hashArray[right];
        hashArray[right] = temp;
    }  
    
    public void DeleteAll(){ //method untuk menghapus semua data array
        int jawab = JOptionPane.showOptionDialog(null, 
                    "Apakah Anda yakin Data akan dihapus??", 
                    "Terhapus", 
                    JOptionPane.YES_NO_OPTION, 
                    JOptionPane.QUESTION_MESSAGE, null, null, null);
    
        if(jawab == JOptionPane.YES_OPTION){
                JOptionPane.showMessageDialog(null, "Data Berhasil Terhapus");
                
            for(int i=0;i<size;i++){ // mengambil banyak data dan di tampung pada var i
                hashArray[i] = null;  // menghapus semua data array dari method
            }
        }       
    }
}