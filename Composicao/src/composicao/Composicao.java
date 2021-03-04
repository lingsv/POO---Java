/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composicao;

/**
 *
 * @author ana
 */
public class Composicao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 1ª maneira de criar um objeto com compisição
        
        Motor m1 = new Motor();
        Carro c1 = new Carro(m1);
        
        // 2ª maneira
        
        Carro c2 = new Carro(new Motor());
        
        // colocar dados nos carros
        // 1ª maneira, poso atribuir via 'parte' ou pelo 'todo'
        m1.setNumero(2343234); //parte
        c1.getMotor().setCilindro(6); // todo
        
        // 2ª maneira, posso atribuir somente pelo 'todo'
        c2.getMotor().setNumero(34234);
        c2.getMotor().setCilindro(6); // todo
        
        Carro c3 = new Carro(m1);
        c3.getMotor().setCilindro(100);
        
        System.out.println("Carro 3 - Cilindros:" + c3.getMotor().getCilindro());
        System.out.println("Carro 1 - Cilindros:" + c1.getMotor().getCilindro());
        System.out.println("Motor 1 - Cilindros:" + m1.getCilindro());
    }
    
}
