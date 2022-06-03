
package Model;

/**
 *
 * @author Francisco Mendonça
 */
public class Professor extends Pessoa{
    
    private Integer num_Registro;
    private boolean adiministrador;

    public Professor() {
        
    }
    
    public Professor(Integer num_Registro, boolean adiministrador, String nome, String email, String senha) {
        super(nome, email, senha);
        this.num_Registro = num_Registro;
        this.adiministrador = adiministrador;
    }


    public Integer getNumRegistro() {
        return num_Registro;
    }

    public void setNumRegistro(Integer num_Registro) {
        this.num_Registro = num_Registro;
    }

    public boolean isAdiministrador() {
        return adiministrador;
    }

    public void setAdiministrador(boolean adiministrador) {
        this.adiministrador = adiministrador;
    }
    
}
