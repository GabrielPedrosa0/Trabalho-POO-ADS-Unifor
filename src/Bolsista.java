package src;
public class Bolsista extends Aluno {

    Bolsista(String nome, String cpf, int idade, String matricula){
        super(nome, cpf, idade, matricula);
    }


    @Override
    public void pagarMensalidade() {
        System.out.println(nome + " pagou a mensalidade com um desconto de 50%");
    }
}
