package src;
import java.util.*;

public class Turma {
    public String codigo;
    public Disciplina disciplina;
    public Professor professor;
    public ArrayList <Aluno> alunos = new ArrayList<>();

    Turma(Disciplina disciplina, Professor professor, String codigo){
        this.disciplina = disciplina;
        this.professor = professor;
        this.codigo = codigo;
    }

    public void adicionarAluno(Aluno aluno){
        alunos.add(aluno);
    } 

    public void removerAluno(Aluno aluno){
        alunos.remove(aluno);

    }

    public void listarAluno(){
        System.out.println("Alunos: ");
        for(int i = 0; i < alunos.size(); i++){        
            System.out.println(alunos.get(i));
        }
    }

    @Override
    public String toString(){
        return "Turma: " + this.codigo + "\n" + "Professor: " + this.professor + "\n" + "Disciplina: " + this.disciplina; 
    }

}
