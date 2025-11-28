package src;
public class Visitante extends Pessoa {
    
    Visitante(String nome, String cpf, int idade){
        super(nome, cpf, idade);
    }

    @Override
    public void apresentar() {
        System.out.println(this.nome + ", está visitando a Universidade!");
        System.out.println("Seja Bem Vindo!" + this.nome);
    }
}
