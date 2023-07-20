/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package msib;

import java.util.Scanner;

/**
 *
 * @author jihan
 */
public class MSIB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        No1 n1 = new No1(); //Membuat objek baru dari kelas lain
        No2 n2 = new No2(); 
        No3 n3 = new No3(); 
        
        System.out.println("Silahkan Pilih Nomor Soal:)"); //Menampilkan tulisan
        System.out.println("1. Buat fungsi untuk menyelesaikan rumus A000124 of Sloane’s OEIS!");
        System.out.println("2. Buat fungsi yang digunakan untuk menyelesaikan permasalahan Dense Ranking!");
        System.out.println("3. Buat fungsi untuk menemukan Balanced Bracket dengan kompleksitas paling rendah!");
        System.out.println("Jawaban (dengan angka):");
        Scanner nomor = new Scanner(System.in); //Input data dari pengguna
        int pil = nomor.nextInt(); //Mengambil data dan mengubahnya menjadi Integer
        if(pil == 1){ 
            System.out.println("Masukan Bilangan: ");
            Scanner input = new Scanner(System.in);//Input data dari pengguna
            int a = input.nextInt();//Mengambil data dan mengubahnya menjadi Integer
            System.out.println("Hasil:");
            n1.proses(a); //Memanggil function dari kelas lain
        }else if(pil==2){
            System.out.println("Masukan Jumlah Peserta: ");
            Scanner input2 = new Scanner(System.in); //Input data dari pengguna
            int b = input2.nextInt(); //Mengambil data dan mengubahnya menjadi Integer
            n2.setJumPeserta(b); //Mengset Jumlah Peserta
            System.out.println("Masukan Nilai (Dipisahkan dengan koma tanpa spasi): ");
            Scanner input21 = new Scanner(System.in); //Input data dari pengguna
            String b1 = input21.nextLine();//Mengambil data dan mengubahnya menjadi String
            System.out.println("Hasil: ");
            n2.dense(b1); //Memanggil function dari kelas lain
        }else if(pil==3){
            System.out.println("Masukan bracket: "); 
            Scanner input3 = new Scanner(System.in); //Input data dari pengguna
            String c = input3.nextLine(); //Mengambil data dan mengubahnya menjadi String
            System.out.println("Hasil:");
            n3.subs(c); //Memanggil function dari kelas lain
        }else{
            System.out.println("Maaf, pilihan anda tidak ada");
        }
    }
    
}
