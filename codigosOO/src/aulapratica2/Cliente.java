/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulapratica2;

/**
 *
 * @author helder
 */
public class Cliente {
    
    private String nome;
    private String endereco;
    public double valor;
    
    
    public Cliente(String nome, String endereco){
        this.nome=nome;
        this.endereco=endereco;
    }
    
    public Cliente(String nome){
        this.nome=nome;
    }
    
    public Cliente(){
    }
    
    public String getNome(){
        return nome;
    }
    
    public String getEndereco(){
        return endereco;
    }
    
    public void setNome(String nome){
        this.nome=nome;
    }
    
    
    public void setEndereco(String endereco){
        this.endereco=endereco;
    }
    
    public void valordaconta(double valor) {
    	this.valor = valor;
    }
    
     public String toString( ){
        return "nome:"+nome+"endereco:"+endereco;
    }
   
    
}
