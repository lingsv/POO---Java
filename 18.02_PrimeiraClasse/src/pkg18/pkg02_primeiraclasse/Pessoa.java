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
public class Pessoa {
    // variáveis que representam as propriedades da classe, variáveis privadas
    private String nome;
    private String email;
    private float salario;
    private int idade;
    
    // construtores
    
    // getters e setters
    // para programar automaticamente use <alt esquerdo + insert>

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade < 0 || idade >100){
            System.out.println("Idade Inválida");
        }else
            this.idade = idade;
    }
  
    
    // métodos
    public float calcularINSS(){
        float inss;
        
        // o "f" indica que é float
        inss = salario * 0.11f;
        
        return inss;
    }
    
    public void fazAniversario(){
        idade ++;
    }
    
    public String dadosGerais(){
        String retorno;
        
        retorno = "\nNome: " + nome +
                "\nEmail: " + email +
                "\nSalário: R$ " + salario +
                "\nidade: " + idade;
        
        return retorno;
        
    }
    
    
    
}
