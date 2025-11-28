package src;
public class Professor extends Pessoa{
    String centro;

    Professor(String nome, String cpf, int idade, String centro){
        super(nome, cpf, idade);
        this.centro = centro;
    }

    public void darAula(){
        System.out.println(this.nome + " diz: Olá, turma. Vamos dar início à aula?");
    }

    @Override
    public String toString(){
        return  this.nome + " (Centro: " + this.centro + ")";
    }
}
