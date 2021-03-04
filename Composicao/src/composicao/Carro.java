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
public class Carro {
    private int anoModelo;
    private String proprietario;
    
    // composição
    
    private Motor motor; // não precisa instanciar aqui, pois o objeto
                         // virá pelo construtor
    
    // construtores
    // todos os construtores criados devem receber pelo menos um motor, caso contrário
    // não seria composição
    public Carro(Motor motor){
        this.motor = motor;
    }
    public Carro(String proprietario, int anoModelo, Motor motor){
        setProprietario (proprietario);
        setAnoModelo(anoModelo);
        
        this.motor = motor;
    }
    
    // getters and setters
    
    public int getAnoModelo() {
        return anoModelo;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public void setAnoModelo(int anoModelo) {
        this.anoModelo = anoModelo;
    }

    public String getProprietario() {
        return proprietario;
    }

    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }
    
    // outros metodos
    //public int getCilindro();
    //return getMotor().getCilindro();
    
}
