/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heranca;

/**
 *
 * @author ana
 */
public class Heranca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        PessoaFisica pf = new PessoaFisica("USA");
        PessoaJuridica pj = new PessoaJuridica("Alemanha");
        Cliente c = new Cliente("USA");
        
        
        pf.setDataCadastro("24/02/2020");
        pf.setPais("Brasil");
        pf.setCPF("000.000.000-00");
        pf.setNome("Joana Maranhão");
        
       System.out.println("Dados: " + pf.mostraDados());
       
       System.out.println("Desconto PF: " + pf.desconto());
       System.out.println("Desconto PJ: " + pj.desconto());
    }
     
     
    
}
