package Model;

public class Aluno extends Pessoa{
    
    private Integer matricula;

    public Aluno() {
        
    }
    
    public Aluno(Integer matricula, String nome, String email, String senha) {
        super(nome, email, senha);
        this.matricula = matricula;
    }
    

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Aluno{ " + matricula + " " + this.nome + " " + this.email + " " + this.senha + '}';
    }
    
}
