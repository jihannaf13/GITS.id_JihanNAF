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
public class No3 {
    private int opbrac1, clbrac1, opbrac2, clbrac2, opbrac3, clbrac3, other; //Inisiasi variabel
    //brac1 = {}, brac2 = [], dan brac3 = ()
    public void subs(String input){ 
        int total = input.length(); //Mengambil panjang masukan
        for (int i = 0; i < total; i++){ //Looping untuk masing-masing karakter
            String sub = input.substring(i, i+1); //Mengeluarkan nilai (string) dari rentang i dan i+1
            //Proses perhitungan karakter
            if (sub.equals("{")) { 
                opbrac1 =  opbrac1 + 1; 
            }else if (sub.equals("}")){
                clbrac1 = clbrac1 + 1;
            }else if (sub.equals("[")){
                opbrac2 = opbrac2 + 1; 
            }else if (sub.equals("]")){
                clbrac2 = clbrac2 + 1; 
            }else if (sub.equals("(")){
                opbrac3 = opbrac3 + 1; 
            }else if(sub.equals(")")){
                clbrac3 = clbrac3 + 1; 
            //Jika karakter tidak termasuk dalam kategori
            }else{
                other = other + 1;
            }
        }
        //Perbandingan masing-masing braket, jika sama maka braket tersebut memiliki pasangan
        if((opbrac1 == clbrac1) && (opbrac2 == clbrac2)&&(opbrac3 == clbrac3)){ 
            System.out.println("YES");
            System.out.println("Jumlah Pasangan {} : " + opbrac1 + " pasang");
            System.out.println("Jumlah Pasangan [] : " + opbrac1 + " pasang");
            System.out.println("Jumlah Pasangan () : " + opbrac1 + " pasang");
            System.out.println("Jumlah karakter lain: "+ other);
        }else{ //Jika berbeda maka braket tersebut tidak memiliki pasangan
            System.out.println("NO");
            System.out.println("Jumlah karakter lain: "+ other);
        }
    }
}
