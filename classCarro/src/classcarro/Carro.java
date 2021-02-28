/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classcarro;

/**
 *
 * @author Carol
 */
public class Carro {
    
    // variáveis privadas
    private String proprietario;
    private int ano_modelo;
    private float valor;
    private int marchaAtual;
    private boolean ligado;

    // getters e setters
    public String getProprietario() {
        return proprietario;
    }

    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }

    public int getAno_modelo() {
        return ano_modelo;
    }

    public void setAno_modelo(int ano_modelo) {
        this.ano_modelo = ano_modelo;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public int getMarchaAtual() {
        return marchaAtual;
    }

    public void setMarchaAtual(int marchaAtual) {
        this.marchaAtual = marchaAtual;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }
    
    // métodos
    
    public String nome_proprietario(String proprietario){
        this.proprietario = proprietario;
        
        return proprietario;
    }
    
    public void ligarDesligar(boolean ligado){
        this.ligado = ligado;
    }
        if (ligado == True){
            System.out.println("O veículo está ligado");
        }else
        {
            System.out.println("O veículo está desligado");
        }
    }
  
    public int frear(int marchaAtual){
        if (this.marchaAtual >= 115){
            this.marchaAtual = marchaAtual - 10;
            
        }
        return marchaAtual;
        
    }
    public String status(){
        String retorno;
        
        retorno = "\nNome do proprietario: " + proprietario +
                  "\nLigado ou desligado: " + ligado + 
                  "\nVelocidade atual " + marchaAtual + 
                  "\nAno do modelo: " + ano_modelo;
        
        return retorno;
    }

