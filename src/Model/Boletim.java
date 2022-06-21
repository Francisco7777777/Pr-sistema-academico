
package Model;

/**
 *
 * @author Francisco Mendonça
 */
public class Boletim {
    private Integer id;
    private Double nota_1;
    private Double nota_2;
    private Double media;
    private Situacao situacao;
    
    private Aluno alunos;
    private Disciplina disciplina;

    
    public Boletim() {
    }

    public Boletim(Integer id, Double nota_1, Double nota_2, Double media, Situacao situacao, Aluno alunos, Disciplina disciplina) {
        this.id = id;
        this.nota_1 = nota_1;
        this.nota_2 = nota_2;
        this.media = media;
        this.situacao = situacao;
        this.alunos = alunos;
        this.disciplina = disciplina;
    }

    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getNota_1() {
        return nota_1;
    }

    public void setNota_1(Double nota_1) {
        this.nota_1 = nota_1;
    }

    public Double getNota_2() {
        return nota_2;
    }

    public void setNota_2(Double nota_2) {
        this.nota_2 = nota_2;
    }

    public Double getMedia() {
        return media;
    }

    public void setMedia(Double media) {
        this.media = media;
    }
    
    public Situacao getSituacao() {
        return situacao;
    }

    public void setSituacao(Situacao situacao) {
        this.situacao = situacao;
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
