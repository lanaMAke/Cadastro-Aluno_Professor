public class Pessoa{
    
    private int identidade; // acrescentar vetor [11];
    private String nome;
    private int idade;
    private boolean tipo; // aluno ou professor;



//Construtor padrão
Pessoa(){

   this.identidade = "***.***.***-**";
   this.nome = "Sem nome";
   this.idade = 0;
   this.tipo = 
}

Pessoa(String nome){

   this.identidade = "***.***.***-**";
   this.nome = nome;
   this.idade = 0;
   this.tipo = 
}
//Acessos

public String getNome(){
    return nome;
}


public void setNome(String name, , int idd, boolean tipo){
    this.nome = name;  
}

public int getIdentidade(){
  return identidade;
}
public void setIdentidade(int ident){
  this.identidade = ident;
}

public int getIdade(){
   return idade;
}
public void setIdade(){
  this.identidade = idd;
}

public boolean getTipo(){
   return tipo;
}
public void setTipo(){
  this.tipo = tipo;
}


//Ações

public void Cadastrar(){
    System.out.println("Cadastrando...");
}
public void 
}