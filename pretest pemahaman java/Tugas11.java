public class Tugas11{

    public static void main(String[] args){
        Mahasiswa m = new Mahasiswa();
        m.CetakprofilMhs();
    }
}

class Biodata{
    String nama = "Yhunio Miki Husnayanti";
    String alamat = "Jepara";
    int umur = 19;
}

class Mahasiswa extends Biodata{
    String nim = "141240000258";
    String jurusan = "Teknik Informatika";
    void CetakprofilMhs(){
    System.out.println("Nama : " + nama + " Alamat : " + alamat + " Umur : " + umur + " NIM : " + nim + " Jurusan : " + jurusan);
    }
}