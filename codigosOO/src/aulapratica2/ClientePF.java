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
public class ClientePF extends Cliente{
    
    private String cpf;
    
    
    
     public ClientePF(String nome, String cpf){
        super(nome);
        this.cpf=cpf;
        
    }
     
     public ClientePF(String nome, String endereco,String cpf){
         super(nome,endereco);
         this.cpf=cpf;
         
     }
     
     public ClientePF(String cpf){
         this.cpf=cpf;
         
     }
     
    
    public String getCpf()
    {
        return cpf;
    }
    
    public void setCpf(String cpf){
        this.cpf=cpf;
    }
    
    
    public void valordaconta(double valor) {
    	this.valor = valor + 10;
    }
    
    
     
    public String toString(){
        return super.toString()+"cpf:"+cpf;
    }
}
