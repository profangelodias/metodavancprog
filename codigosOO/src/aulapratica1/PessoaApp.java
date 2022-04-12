package aulapratica1;

public class PessoaApp {
    
    public static void main(String[] args){
        
        Pessoa pessoa1 = new Pessoa(1,"Angela");
        
        Pessoa pessoa2 = new Pessoa(2,"Ana");
        
        System.out.println("o nome do objeto pessoa1 eh: "+pessoa1.getNome());
        
        pessoa1.setNome("Maria");
        
        System.out.println("o nome do objeto pessoa1 eh: "+pessoa1.getNome());
                
        
    }
    
}
