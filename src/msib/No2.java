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
    
    public void dense(String input){
        String[] stringArr = input.split(",");
        System.out.println("Jumlah Peserta: " + getJumPeserta());
        Integer[] integerArr = new Integer[stringArr.length];
        for (int i = 0; i < stringArr.length; i++) {
            integerArr[i] = Integer.parseInt(stringArr[i]); 
        }
        for (int i = 0; i < integerArr.length; i++) {
            int b = a+1;
            if (i==0) {
                System.out.println(currRank + ". " + integerArr[i]);
                a = 0;
            }else{
                if (b<stringArr.length){
                   if(integerArr[a]== integerArr[b]){ 
                        currRank = currRank;
                        System.out.println(currRank + ". " + integerArr[i]);
                        a++;
                    } else{
                        currRank = currRank + 1;
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
