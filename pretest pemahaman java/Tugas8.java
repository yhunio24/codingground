public class Tugas8 {

    public static void main(String[] args) {
        Biodata Bio = new Biodata();
        Bio.CetakkBiodata();
    }
}

    class Biodata {
    String nama = "Yhunio Miki Husnayanti";
    String alamat = "Jepara";
        int umur = 19;
    void CetakkBiodata() {
    System.out.println("Nama : "+nama+" umur: "+umur+" alamat: "+alamat);
    }
    }