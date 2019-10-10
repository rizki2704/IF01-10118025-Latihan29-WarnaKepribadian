/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if01.pkg10118025.latihan29.warnakepribadian;

import java.util.Scanner;

/**
 * Nama     : Rizki Restu Illahi
 * NIM      : 10118025
 * Kelas    : IF-01
 */
public class IF0110118025Latihan29WarnaKepribadian {

    public static final String RESET = "\u001B[0m";
    public static final String BLACK = "\u001B[30m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String PURPLE = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";
    public static final String WHITE = "\u001B[37m";
    public static final String BGRED = "\u001B[41m";
    public static final String BGGREEN = "\u001B[42m";
    public static final String BGYELLOW = "\u001B[43m";
    public static final String BGBLUE = "\u001B[44m";
    public static final String BGMAGENTA = "\u001B[45m";

    
    public static void ColRed() {
        System.out.println("1. Periang,");
        System.out.println("2. Pemberani,");
        System.out.println("3. Berani mengambil resiko dalam setiap langkah,");
        System.out.println("4. Menyukai tantangan");
        System.out.println("5. Kurang sabar,");
        System.out.println("6. Dapat menahan marah namun jika sudah tahap puncak toleransi, kemarahnnya akan sulit dikontrol,");
        System.out.println("7. Memiliki energi kehangatan dan cinta.");
    }
    
    
    public static void ColGreen() {
        System.out.println("1. Romantis,");
        System.out.println("2. Menyukai hal yang berbau alami dan keindahan,");
        System.out.println("3. Teguh pada prinsip,");
        System.out.println("4. Menginginkan kesempurnaan,");
        System.out.println("5. Mudah cemburu,");
        System.out.println("6. Mudah merasa iri,");
        System.out.println("7. Menjunjung tinggi suatu nilai toleransi dan kepercayaan.");
    }
    
    
    public static void ColYellow() {
        System.out.println("1. Optimis,");
        System.out.println("2. Suka bergaul,");
        System.out.println("3. Periang,");
        System.out.println("4. Senang menolong,");
        System.out.println("5. Lincah dan aktif,");
        System.out.println("6. Tidak suka meremehkan kekurangan orang lain,");
        System.out.println("7. Loyal,");
        System.out.println("8. Hangat,");
        System.out.println("9. Meskipun karakternya optimis dan idealis, seringkali goyah dan tidak stabil,");
        System.out.println("10. Cenderung penakut.");
    }
    
    
    public static void ColBlue() {
        System.out.println("1. Menyenangkan,");
        System.out.println("2. Bijaksana,");
        System.out.println("3. Pembawaan diri tenang saat menghadapi masalah,");
        System.out.println("4. Dinamis,");
        System.out.println("5. Senang berbagi,");
        System.out.println("6. Bersahabat,");
        System.out.println("7. Tidak terlalu suka menjadi sorotan banyak orang,");
        System.out.println("8. Menyembunyikan perasaan karena karakternya yang cenderung mencari jalan damai.");
    }

    
    public static void ColPurple() {
        System.out.println("1. Optimis,");
        System.out.println("2. Tidak pernah ragu, ");
        System.out.println("3. Menurutnya pasangan yang ideal adalah yang memiliki mental yang kuat,");
        System.out.println("4. Memiliki ambisi yang besar,");
        System.out.println("5. Memiliki empati yang besar,");
        System.out.println("6. Memiliki sisi misterius sebab seringkali menutupi perasaannya,");
        System.out.println("7. Terkadang bersikap keras kepala dan angkuh.");
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        String  pilihan, warnaPribadi, nama, Nama;
        
        
        System.out.println(RED + "YUK " + GREEN + "CEK " + YELLOW + "KEPRIBADIANMU " + CYAN + "DARI " + PURPLE + "WARNA " + BLUE + "FAVORITMU");
        System.out.println(BGRED + WHITE + "           MERAH           ");
        System.out.println(BGGREEN + WHITE + "           HIJAU           ");
        System.out.println(BGYELLOW + WHITE + "           KUNING          ");
        System.out.println(BGBLUE + WHITE + "           BIRU            ");
        System.out.println(BGMAGENTA + WHITE + "           UNGU            ");
        
        
        Scanner scan = new Scanner(System.in);

        System.out.print(RESET + "\nPILIH WARNA FAVORITMU : " + RESET);
        pilihan = scan.nextLine();
        warnaPribadi = pilihan.toUpperCase();

        System.out.print("NAMA KAMU: " + RESET);
        nama = scan.nextLine();
        Nama = nama.toUpperCase();
        
        
        System.out.println("\n===HASIL TEST KEPRIBADIAN " + Nama + "===");
        switch (warnaPribadi) {
            case "MERAH":
                System.out.println(RESET + "Warna Favoritmu adalah : " + RED + warnaPribadi);
                ColRed();
                break;

            case "HIJAU":
                System.out.println("Warna Favoritmu adalah : " + GREEN + warnaPribadi);
                ColGreen();
                break;

            case "KUNING":
                System.out.println("Warna Favoritmu adalah : " + YELLOW + warnaPribadi);
                ColYellow();
                break;

            case "BIRU":
                System.out.println("Warna Favoritmu adalah : " + BLUE + warnaPribadi);
                ColBlue();
                break;

            case "UNGU":
                System.out.println("Warna Favoritmu adalah : " + PURPLE + warnaPribadi);
                ColPurple();
                break;
            default:
                System.out.println("Oops.. Belum teridentifikasi");
                break;
        }

        
    }
    
}
