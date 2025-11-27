package src;

public class Main {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();

        Disciplina d1 = new Disciplina("P358", "POO - Programação Orientada a Objetos", 1);
        Disciplina d2 = new Disciplina("R255", "RLA - Raciocínio Lógico Algorítimico", 1);
        Disciplina d3 = new Disciplina("S305", "SO - Sistemas Operacionais", 2);

        
        Aluno a1 = new Regular("Luiz", "98765432101", 20, "A2124");
        Aluno a2 = new Regular("Cíntia", "68100587125", 24, "A1422");
        Aluno a3 = new Bolsista("Gabriel", "01234567890", 21, "A3243");

        Professor p1 = new Professor("Andre", "9846510078453", 45, "Tecnologia");

        Visitante v1 = new Visitante("Lucas", "8940354876", 32);
        Visitante v2 = new Visitante("Pedro", "0002157489", 55);
       
        Turma t1 = new Turma(d1, p1, "T1-001");
        t1.adicionarAluno(a1);
        t1.adicionarAluno(a2);
        t1.adicionarAluno(a3);

        Turma t2 = new Turma(d2, p1, "T2-002");
        t2.adicionarAluno(a1);
        t2.adicionarAluno(a2);
        t2.adicionarAluno(a3);

        Turma t3 = new Turma(d3, p1, "T3-003");
        t3.adicionarAluno(a1);
        t3.adicionarAluno(a2);
        t3.adicionarAluno(a3);

        System.out.println("--------------------------");
        System.out.println(t1);
        t1.listarAluno();

        System.out.println("--------------------------");
        System.out.println(t2);
        t2.listarAluno();

        System.out.println("--------------------------");
        System.out.println(t3);
        t3.listarAluno();
        
        a1.fezAniversario();
        p1.fezAniversario();
        a1.apresentar();
        p1.apresentar();

        a1.pagarMensalidade();
        a3.pagarMensalidade();
        p1.darAula();

        
    }
}

