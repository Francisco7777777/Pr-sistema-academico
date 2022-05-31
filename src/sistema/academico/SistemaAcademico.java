
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
        
        System.out.println("Digite o email");
        String email = Obj.nextLine();
        
        System.out.println("Digite a senha");
        String senha = Obj.nextLine();
        
        //Entradas numericas
        System.out.println("Digite o Matricula");
        Integer matricula = Obj.nextInt();
        
        
        Aluno aluno01 = new Aluno(matricula, nome, email, senha);
        System.out.println(aluno01.getNome() + " " + aluno01.getEmail() + " " + aluno01.getSenha());
                
        Obj.close();
        
    }
}
