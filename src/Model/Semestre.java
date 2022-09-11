package Model;

import java.util.Date;

/**
 *
 * @author Eugênio Oliveira
 */
public class Semestre {
    private int id;
    private Date data_inicial;
    private Date data_final;
    private Integer periodoMatriculaProfessor;
    private Integer periodoMatriculaAluno;
    private Integer status;

    
    public Semestre() {
        
    }

    public Semestre(int id, Date data_inicial, Date data_final, Integer periodoMatriculaProfessor, Integer periodoMatriculaAluno, Integer status) {
        this.id = id;
        this.data_inicial = data_inicial;
        this.data_final = data_final;
        this.periodoMatriculaProfessor = periodoMatriculaProfessor;
        this.periodoMatriculaAluno = periodoMatriculaAluno;
        this.status = status;
    }

    
    public int getId() {
        return id;
    }

    public Date getData_inicial() {
        return data_inicial;
    }

    public Date getData_final() {
        return data_final;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setData_inicial(Date data_inicial) {
        this.data_inicial = data_inicial;
    }

    public void setData_final(Date data_final) {
        this.data_final = data_final;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getPeriodoMatriculaProfessor() {
        return periodoMatriculaProfessor;
    }

    public void setPeriodoMatriculaProfessor(Integer periodoMatriculaProfessor) {
        this.periodoMatriculaProfessor = periodoMatriculaProfessor;
    }

    public Integer getPeriodoMatriculaAluno() {
        return periodoMatriculaAluno;
    }

    public void setPeriodoMatriculaAluno(Integer periodoMatriculaAluno) {
        this.periodoMatriculaAluno = periodoMatriculaAluno;
    }
      
}
