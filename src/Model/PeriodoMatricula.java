
package Model;

/**
 *
 * @author Francisco Mendonça
 */
public class PeriodoMatricula {
    
    private Integer id;
    private Integer professorStatus;
    private Integer alunoStatus;
    private Semestre semetre;
    
    public PeriodoMatricula() {
    }

    public PeriodoMatricula(Integer id, Integer professorStatus, Integer alunoStatus, Semestre semetre) {
        this.id = id;
        this.professorStatus = professorStatus;
        this.alunoStatus = alunoStatus;
        this.semetre = semetre;
    }

    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProfessorStatus() {
        return professorStatus;
    }

    public void setProfessorStatus(Integer professorStatus) {
        this.professorStatus = professorStatus;
    }

    public Integer getAlunoStatus() {
        return alunoStatus;
    }

    public void setAlunoStatus(Integer alunoStatus) {
        this.alunoStatus = alunoStatus;
    }

    public Semestre getSemetre() {
        return semetre;
    }

    public void setSemetre(Semestre semetre) {
        this.semetre = semetre;
    }
    
}
