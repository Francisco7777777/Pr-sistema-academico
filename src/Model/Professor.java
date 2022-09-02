
package Model;

/**
 *
 * @author Francisco Mendonça
 */
public class Professor extends Pessoa{
    
    private Integer num_Registro;
    private Integer adiministrador;

    public Professor() {
        
    }
    
    public Professor(Integer num_Registro, String nome, String email, String senha, Integer adiministrador) {
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

    public int getAdiministrador() {
        return adiministrador;
    }

    public void setAdiministrador(int adiministrador) {
        this.adiministrador = adiministrador;
    }
    
}
