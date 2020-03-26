/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myPackage;

/**
 *
 * @author ticho
 */
public class PlaywithMath {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*
        double number=3.45;
        what is the result of ceil, round , floor,abs of Math Class
 what are the aboves if number=-3,45;        
        
        */
        double number=3.45;
      double numberAbs= Math.abs(number);
        System.out.println("the result of math abs: " +numberAbs);
        double numberCeil=Math.ceil(number);
        System.out.println("the result of math ceil:"+numberCeil);
        double numberRound=Math.round(number);
        System.out.println("the result of math round : " +numberRound);
        double numberFloor=Math.floor(number);
        System.out.println("the result of math floor: "+numberFloor);
        
        
        number=-3.45;
        System.out.println("the result of math abs: " +numberAbs);
        System.out.println("the result of math ceil:"+numberCeil);
        System.out.println("the result of math round : " +numberRound);
        System.out.println("the result of math floor: "+numberFloor);
        
        
        
        
        
    }
    
}
