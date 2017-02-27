public class Tugas4{

    public static void main(String []args){
        int parameter = 1;
        int hasil = Penjumlahan(parameter);
       System.out.println("Angka penjumlahan " + parameter + " + 2 = " + hasil);
     }
     
     public static int Penjumlahan(int num1) {
      int angka = num1;

      return angka + 2; 
   }
}