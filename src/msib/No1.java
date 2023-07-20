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
    public void proses(int input){
        int x = 1;
        for (int i = 0; i < input; i++){
            x = x + i;
            if ((i+1) == input) {
                System.out.print(x + " ");
            } else {
                System.out.print(x + "-");
            }    
        }
    }
}
