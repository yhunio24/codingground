public class Tugas10{

    public static void main(String[] args){
        Biodata b = new Biodata();
        b.setNama("Yhunio Miki Husnayanti");
        b.setUmur(19);
        b.setAlamat("Jepara");

        String Printnama = b.getNama();
        int Printumur = b.getUmur();
        String Printalamat = b.getAlamat();
    System.out.println("Nama : " + Printnama + " Alamat : " + Printalamat + " Umur : " + Printumur);
    }
}

class Biodata {
    String nama;
    int umur;
    String alamat;
    void setNama (String n) {
        nama = n;
    }
    void setUmur (int u){
        umur = u;
    }
    void setAlamat (String a){
        alamat = a;
    }
    String getNama() {
        return nama;
    }
    int getUmur() {
        return umur;
    }
    String getAlamat() {
        return alamat;
    }
} 