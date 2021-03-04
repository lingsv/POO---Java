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
public class PessoaFisica extends Cliente{
    private String nome;
    private String CPF;

    
    //construtor
    public PessoaFisica(String pais){
        // chmara explicitamente o construtor de cliente
        super(pais);
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
    
    // métodos
    @Override
    public String mostraDados(){ // polimorfismo de sobreescrita
        String aux;
        
        // forma buscando os dados dos atreibutos direto da classe mãe
        // buscando os dados da classe mãe com e sem o "super"
        aux = "\nPaís: " + super.getPais() +
                "\nData Cadastro: " + getDataCadastro();
                
        // forma buscando os dados da classe mãe através de um método
        aux = super.mostraDados();
        
        
        return aux +        
                "\nNome: " + getNome() +
                "\nCPF: " + getCPF();
    }
    
}
