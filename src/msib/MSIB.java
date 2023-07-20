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
        
        System.out.println("Silahkan Pilih Nomor Soal:)");
        System.out.println("No.1 Buat fungsi untuk menyelesaikan rumus A000124 of Sloane’s OEIS!");
        System.out.println("No.2 Buat fungsi yang digunakan untuk menyelesaikan permasalahan Dense Ranking!");
        System.out.println("No.3 Buat fungsi untuk menemukan Balanced Bracket dengan kompleksitas paling rendah!");
        System.out.println("Jawaban:");
        Scanner nomor = new Scanner(System.in);
        int pil = nomor.nextInt();
        if(pil == 1){
            System.out.println("Masukan Bilangan: "); 
            Scanner input = new Scanner(System.in);
            int a = input.nextInt();
            System.out.println("Hasil:");
            n1.proses(a);
        }else if(pil==2){
            System.out.println("Masukan Jumlah Peserta: ");
            Scanner input2 = new Scanner(System.in);
            int b = input2.nextInt();
            n2.setJumPeserta(b);
            System.out.println("Masukan Nilai (Dipisahkan dengan koma tanpa spasi): ");
            Scanner input21 = new Scanner(System.in);
            String b1 = input21.nextLine();
            System.out.println("Hasil: ");
            n2.dense(b1);
        }else if(pil==3){
            System.out.println("Masukan bracket: "); 
            Scanner input3 = new Scanner(System.in);
            String c = input3.nextLine();
            System.out.println("Hasil:");
            n3.subs(c);
        }else{
            System.out.println("Maaf, pilihan anda tidak ada");
        }
    }
    
}
