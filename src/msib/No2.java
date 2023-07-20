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
public class No2 {
    //Inisiasi variabel
    int jumPeserta;
    int currRank = 1;
    int a;

    public No2() {
    }

    public No2(int jumPeserta) {
        this.jumPeserta = jumPeserta;
    }
    
    public int getJumPeserta() {
        return jumPeserta;
    }

    public void setJumPeserta(int jumPeserta) {
        this.jumPeserta = jumPeserta;
    }
    
    public void dense(String input){ //Public agar dapat dipanggil
        String[] stringArr = input.split(","); //Memasukan angka yang dipisahkan oleh koma ke dalam sebuah array
        System.out.println("Jumlah Peserta: " + getJumPeserta()); //Menampilkan jumlah peserta dengan getter
        Integer[] integerArr = new Integer[stringArr.length]; //Membuat arraylist baru dengan tipe data Integer
        for (int i = 0; i < stringArr.length; i++) { //Looping untuk mengubah array data String menjadi Integer
            integerArr[i] = Integer.parseInt(stringArr[i]); 
        }
        for (int i = 0; i < integerArr.length; i++) { //Proses pencocokan
            int b = a+1; //Inisiasi B
            if (i==0) { //Jika i adalah 0 (Angka awal)
                System.out.println(currRank + ". " + integerArr[i]); //Menampilkan Ranking Sementara
                a = 0; //Inisiasi a = 0
            }else{
                if (b<stringArr.length){ //Angka selanjutnya
                   if(integerArr[a]== integerArr[b]){ //Membandingkan angka
                        currRank = currRank; //Jika sama maka ranking akan tetap
                        System.out.println(currRank + ". " + integerArr[i]);
                        a++; 
                    } else{
                        currRank = currRank + 1; //Jika berbeda maka ranking akan menurun (bertambah)
                        System.out.println(currRank + ". " + integerArr[i]);
                        a++;
                    } 
                }
                else{
                    break;
                }
            }
        }    
    }
}
