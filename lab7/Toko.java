///**
// * Created by rama on 11/11/17.
// */
//import java.util.Scanner;
//import java.util.List;
//import java.util.ArrayList;
//    public class Toko {
//        private Scanner reader;
//        private String nama;
//        private Gudang gudang;
//        private boolean running;
//
//        public Toko(String nama, Gudang gudang) {
//            reader = new Scanner(System.in);
//            this.nama = nama;
//            this.gudang = gudang;
//            running = false;
//        }
//
//        public void buka() {
//            running = true;
//            while (running) {
//                printMenu();
//                int pilihan = Integer.parseInt(reader.nextLine());
//                switch (pilihan) {
//                    case 1: // Cetak daftar barang
//                        cetakDaftarBarang();
//                        break;
//                    case 2: // Beli barang
//                        cetakDaftarBarang();
//                        // TODO: Minta masukan berupa nomor barang yang
////                        dipilih
//                        // TODO: Panggil method beliBarang, masukkan nomor
//        // barang yang dipilih sebagai parameter method
//                        break;
//                    case 3: // Hapus barang dari keranjang belanja
//                        cetakKeranjangBelanja();
//        // TODO: Minta masukan berupa nomor barang yang ingin
//        // dihapus dari keranjang belanja
//        // TODO: Panggil method hapusBarang, masukkan nomor
//        // barang yang ingin dihapus sebagai parameter method
//                        break;
//                    case 4: // Cetak kwitansi
//                        cetakKwitansi();
//                        break;
//                    case 5: // Keluar
//                    default:
//                        running = false;
//                        break;
//                }
//            }
//        }
//
//        private void cetakDaftarBarang() {
//            // TODO: Implementasikan saya!
//
//        }
//
//        private void cetakKeranjangBelanja() {
//            // TODO: Implementasikan saya!
//        }
//
//        private Barang beliBarang(int nomorBarang) {
//            // TODO: Implementasikan saya!
//        }
//
//        private Barang hapusBarang(int nomorBarang) {
//            // TODO: Implementasikan saya!
//        }
//
//        private void cetakKwitansi() {
//            // TODO: Implementasikan saya!
//        }
//
//        private void printMenu() {
//            System.out.println("Toko " + nama);
//            System.out.println("Menu");
//            System.out.println("(1) Cetak daftar barang");
//            System.out.println("(2) Beli barang");
//            System.out.println("(3) Hapus barang dari keranjang belanja");
//            System.out.println("(4) Cetak kwitansi");
//            System.out.println("(5) Keluar");
//            System.out.print("Pilihan Anda: ");
//        }
//
//        /**
//         * Main method untuk menjalankan program.
//         *
//         * @param args
//         */
//        public static void main(String[] args) {
//            // Persiapkan barang-barang yang akan dijual
//            List<Barang> daftarBarang = new ArrayList<>();
//            Gudang gudang = new Gudang();
//            // Buka toko
//            Toko toko = new Toko("Kom.com", gudang);
//            toko.buka();
//        }
//    }
