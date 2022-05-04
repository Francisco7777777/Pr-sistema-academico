
package sistema.academico;

import java.util.Scanner;
import Model.Aluno;

/**
 * @author Evandro
 */
public class SistemaAcademico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Obj = new Scanner(System.in);
        
        //Entradas de texto
        System.out.println("Digite o nome");
        String nome = Obj.nextLine();
        System.out.println("Digite o Endereço");
        String endereco = Obj.nextLine();
        
        //Entradas numericas
        System.out.println("Digite o id");
        int id = Obj.nextInt();
        System.out.println("Digite o CPF");
        Long cpf = Obj.nextLong();
        System.out.println("Digite o Telefone");
        Long telefone = Obj.nextLong();
        System.out.println("Digite o Matricula");
        Long matricula = Obj.nextLong();
        
        Aluno aluno = new Aluno( matricula, id, nome, null, cpf, telefone, endereco);
        System.out.println(aluno.getNome());
        
    }
    
}
