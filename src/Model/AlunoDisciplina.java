
package Model;

/**
 *
 * @author Francisco Mendonça
 */
public class AlunoDisciplina {
    private Aluno alunos;
    private Disciplina disciplina;

    
    public AlunoDisciplina() {
    }

    public AlunoDisciplina(Aluno alunos, Disciplina disciplina) {
        this.alunos = alunos;
        this.disciplina = disciplina;
    }

    
    public Aluno getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno alunos) {
        this.alunos = alunos;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

}
