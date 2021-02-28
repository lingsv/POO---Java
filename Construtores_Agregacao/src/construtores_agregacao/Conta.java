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
public class Conta {
    
    private int numero;
    private float saldo;
    
    
    //atributos de agregação
    private Cliente cliente = new Cliente();
    
    // construtor
    
    public Conta(){
        
         //se não criar o objeto Cliente direto na criação do atributo
        //cliente = new Cliente();
        
        System.out.println("Criando uma conta!");
        
         // atribuindo uma matricula
        
        Random r = new Random();
        numero = r.nextInt();
    }
     // tewrminar depois
    
    public Conta (String titular) { // construtor parametrico
        
        this(); // chama o construtor default, deve estar na primeir alinha de comando do método
         cliente.setTitular(titular);  
        
    }
    
    public Conta(String titular, int numero){// construtor parametrico
        cliente.setTitular(titular);
        setNumero(numero);
    }

   // getters e setters

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    
  
    
}
