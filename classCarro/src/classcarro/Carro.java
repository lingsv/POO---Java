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
    public void ligarDesligar(){
        if (ligado == True ){
            System.out.println("O veículo está ligado");
        }else
        {
            System.out.println("O veículo está desligado");
        }
    }
    public int acelerar(){
        
    }
    public int frear(){
        
    }
    public String status(){
        
    }
}
