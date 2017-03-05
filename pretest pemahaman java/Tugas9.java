public class Tugas9 {

    public static void main(String[] args) {
    Biodata Bio = new Biodata("Yhunio Miki Husnayanti");
    Bio.display();
    }
}

    class Biodata {
    String nama;
    Biodata(String n) {
        nama = n;
    }
        void display(){
    System.out.println(nama);
    }
    }