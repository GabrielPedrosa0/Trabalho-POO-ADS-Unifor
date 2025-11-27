package src;
public abstract class Pessoa {
    String nome;
    String cpf;
    int idade;

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
        return cpf;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public int getIdade(){
        return idade;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public void fezAniversario(){
        idade++;
        System.out.println(nome + " fez aniversário e está com " + idade + " anos!");
    }

    public void apresentar(){
        System.out.println(
            "Nome: " + nome +
            " | CPF: " + cpf + 
            " | Idade: " + idade
        );
    }
}
