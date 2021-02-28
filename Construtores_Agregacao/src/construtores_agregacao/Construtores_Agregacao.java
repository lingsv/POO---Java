/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package construtores_agregacao;

import java.util.Random;

/**
 *
 * @author Carol
 */
public class Construtores_Agregacao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Conta c1 = new Conta();
        Conta c2 = new Conta();
        Conta c3 = new Conta("José Carlos");
         
        System.out.println("Numero C1: " + c1.getNumero());
        System.out.println("Numero C2: " + c2.getNumero());
        
        System.out.println("Numero C3: " + c3.getNumero());
        System.out.println("Titular C3: " + c3.getTitular());
        System.out.println("Fim");
        
       
    }
    
}
