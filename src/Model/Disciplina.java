
package Model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Francisco Mendonça
 */
public class Disciplina {
    private Integer cod;
    private String nome;
    private Integer status;
    private Integer carga_horaria;
    
    private Semestre semestre;
    private Horario todosHorarios;
    
    public Disciplina() {
    }

    public Disciplina(Integer cod, String nome, Integer status, Integer carga_horaria, Semestre semestre) {
        this.cod = cod;
        this.nome = nome;
        this.status = status;
        this.carga_horaria = carga_horaria;
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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getCarga_horaria() {
        return carga_horaria;
    }

    public void setCarga_horaria(Integer carga_horaria) {
        this.carga_horaria = carga_horaria;
    }

    public Semestre getSemestre() {
        return semestre;
    }

    public void setSemestre(Semestre semestre) {
        this.semestre = semestre;
    }    

    public Horario getTodosHorarios() {
        return todosHorarios;
    }

    public void setTodosHorarios(Horario todosHorarios) {
        this.todosHorarios = todosHorarios;
    }
    
}
