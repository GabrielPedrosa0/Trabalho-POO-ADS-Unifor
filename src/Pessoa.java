package src;
public abstract class Pessoa {
    public String nome;
    private String cpf;
    private int idade;

    Pessoa(String nome, String cpf, int idade){
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
    }

    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getCpf(){
        return this.cpf;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public int getIdade(){
        return this.idade;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public void fezAniversario(){
        this.idade++;
        System.out.println(this.nome + " fez aniversário e está com " + this.idade + " anos!" + "\n" + "---------------------------");
    }

    public void apresentar(){
        System.out.println(
            "Nome: " + this.nome +
            " | CPF: " + this.cpf + 
            " | Idade: " + this.idade 
        );
        
    }
}
