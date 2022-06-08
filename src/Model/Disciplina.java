
package Model;

/**
 *
 * @author Francisco Mendonça
 */
public class Disciplina {
    private Integer cod;
    private String nome;
    private boolean status;
    private Integer carga_horaria;
    
    private Professor professor;
    private Semestre semestre;

    public Disciplina() {
    }

    public Disciplina(Integer cod, String nome, boolean status, Integer carga_horaria, Professor professor, Semestre semestre) {
        this.cod = cod;
        this.nome = nome;
        this.status = status;
        this.carga_horaria = carga_horaria;
        this.professor = professor;
        this.semestre = semestre;
    }
    
    public Integer getCod() {
        return cod;
    }

    public void setCod(Integer cod) {
        this.cod = cod;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Integer getCarga_horaria() {
        return carga_horaria;
    }

    public void setCarga_horaria(Integer carga_horaria) {
        this.carga_horaria = carga_horaria;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Semestre getSemestre() {
        return semestre;
    }

    public void setSemestre(Semestre semestre) {
        this.semestre = semestre;
    }    
   
}
