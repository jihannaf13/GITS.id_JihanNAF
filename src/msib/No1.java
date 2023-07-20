/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package msib;

/**
 *
 * @author jihan
 */
public class No1 {
    public void proses(int input){ //Public agar dapat dipanggil
        int x = 1; //Inisiasi x menjadi 1
        for (int i = 0; i < input; i++){ //For Looping
            x = x + i; //Menambahkan x dengan i
            if ((i+1) == input) { //Permisalan jika i+1 bernilai sama dengan input
                System.out.print(x + " "); //Program sudah mencapai angka terakhir
            } else {
                System.out.print(x + "-"); //Program belum mencapai angka terakhir
            }    
        }
    }
}
