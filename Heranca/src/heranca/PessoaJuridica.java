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
public class PessoaJuridica extends Cliente{
    private String razaoSocial;
    private String CNPJ; 
    
    // construtor
    public PessoaJuridica(String pais){
        // chama o construtor da classe-mãe
        super(pais);
    }
    
    
    // getters e setters
    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }
    
    // métodos
    
    public String mostraDados(){
        return "\nRazão Social: " + getRazaoSocial() + 
                "\nCNPJ: " + getCNPJ();
    }
    
    @Override
    public int desconto(){
        return super.desconto() + 5;
    }
    
    
}
