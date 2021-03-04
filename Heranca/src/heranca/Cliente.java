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
public class Cliente {
    
    private String pais;
    private String dataCadastro;
    private final int DESCONTO = 12; // criei uma constante - não pode ser modificado 

    // construtor
    public Cliente(String pais){
        setPais(pais);
    }
    
    
    // getters e setters
    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(String dataCadastro) {
        this.dataCadastro = dataCadastro;
    }
    
    
    // métodos

    public String mostraDados(){
        return "\nPaís: " + getPais() + 
                "\nData Cadastro: " + getDataCadastro();
    }
    
    public int desconto(){
        return DESCONTO;
    }
    
    
}
