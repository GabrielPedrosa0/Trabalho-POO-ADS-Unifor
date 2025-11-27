package src;
public class Disciplina {
    String codigo;
    String nome;
    int semestre;

    Disciplina(String codigo, String nome, int semestre){
        this.codigo = codigo;
        this.nome = nome;
        this.semestre = semestre;
    }

    @Override
    public String toString(){
        return  this.nome + " (Código: " + this.codigo + ")";
    }
}
