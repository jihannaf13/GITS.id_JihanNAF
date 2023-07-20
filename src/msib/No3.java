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
    private int opbrac1, clbrac1, opbrac2, clbrac2, opbrac3, clbrac3,other; 
    public void subs(String input){
        int total = input.length();
        for (int i = 0; i < total; i++){
            String sub = input.substring(i, i+1);
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
            }else{
                other = other + 1;
            }
        }
        if((opbrac1 == clbrac1) && (opbrac2 == clbrac2)&&(opbrac3 == clbrac3)){
            System.out.println("YES");
            System.out.println("Jumlah Pasangan {} : " + opbrac1 + " pasang");
            System.out.println("Jumlah Pasangan [] : " + opbrac1 + " pasang");
            System.out.println("Jumlah Pasangan () : " + opbrac1 + " pasang");
            System.out.println("Jumlah karakter lain: "+ other);

        }else{
            System.out.println("NO");
            System.out.println("Jumlah karakter lain: "+ other);
        }
    }
    
}
