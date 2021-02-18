/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg18.pkg02_primeiraclasse;

/**
 *
 * @author Carol
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                
        // criando instâncias/obketos da classe 
        Pessoa p1 = null; // Variável criada - dado não primitivo
        p1 = new Pessoa(); // Criação de um objeto, atribui à variável p1 (ponteiro)
        
        //ou
        
        Pessoa p2 = new Pessoa();
        
        // Atribuição dos dados para o objeto
        p1.setIdade(15);
        System.out.println("A idade de P1 é: " + p1.getIdade());
        
        p1.setNome("Carlos");
        p1.setEmail("carlos@uol.com.br");
        p1.setSalario(4590.76f);
        p1.setIdade(37);
        
        //exibindo os dados
        
        System.out.println(" Os dados de P1 são: " + p1.dadosGerais());
        System.out.println("O valor do INSS é R$ " + p1.calcularINSS());
        //vamos fazer aniversário
        p1.fazAniversario();
        // dados atuais
        System.out.println("O dados atuais de P1 são: " + p1.dadosGerais());
        
    }
    
}
