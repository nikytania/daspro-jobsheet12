public class Tugas1 {

  public static void main(String[] args) {
      int n = 10; // Contoh nilai awal

      System.out.println("Menggunakan fungsi rekursif:");
      cetakRekursif(n);

      System.out.println("\nMenggunakan fungsi iteratif:");
      cetakIteratif(n);
  }

  // Fungsi rekursif
  public static void cetakRekursif(int n) {
      if (n >= 0) {
          System.out.print(n + " ");
          cetakRekursif(n - 1);
      }
  }

  // Fungsi iteratif
  public static void cetakIteratif(int n) {
      for (int i = n; i >= 0; i--) {
          System.out.print(i + " ");
      }
  }
}