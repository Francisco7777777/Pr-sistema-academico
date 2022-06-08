
package Model;

import Model.enums.Turno;

/**
 *
 * @author Francisco Mendonça
 */
public class Horario {
    private Integer id;
    private Turno turno;
    private String h_inicial;
    private String h_final;
    
    private Disciplina disciplina;

    
    public Horario() {
    }

    public Horario(Integer id, Turno turno, String h_inicial, String h_final, Disciplina disciplina) {
        this.id = id;
        this.turno = turno;
        this.h_inicial = h_inicial;
        this.h_final = h_final;
        this.disciplina = disciplina;
    }

    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Turno getTurno() {
        return turno;
    }

    public void setTurno(Turno turno) {
        this.turno = turno;
    }

    public String getH_inicial() {
        return h_inicial;
    }

    public void setH_inicial(String h_inicial) {
        this.h_inicial = h_inicial;
    }

    public String getH_final() {
        return h_final;
    }

    public void setH_final(String h_final) {
        this.h_final = h_final;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

}
