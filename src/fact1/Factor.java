/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fact1;

/**
 *
 * @author AYBU
 */
public class Factor {
    int x;
    
    public Factor(int x){
        this.x = x;
    }
    
    public int getX(){
        return x;
    }
    public int fact(int x){
        if(x == 1){ //5! icin.
            return 1;
        }else{
            return x*fact(x-1);
        }
    }
}
