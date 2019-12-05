package Teatro;
import java.util.Scanner; //Scanner Class
import Teatro.Inserir;
public class Teatro {
    public static void main(String[] args) {
        int opcao;
        Scanner teclado = new Scanner(System.in); //Input
        
            //Menu
            System.out.println("-----------------");
            System.out.println("Menu Principal");
            System.out.println("-----------------");
            System.out.println("1 - Inserir Dados");
            System.out.println("2 - Editar Dados");
            System.out.println("3 - Apagar Dados");
            System.out.println("4 - Consultar");
            System.out.println("5 - Listar");
            System.out.println("");
            System.out.println("0 - Sair");
            System.out.println("-----------------");
            System.out.println("");
            System.out.println("Introduza a opção pretendida.");
            
            opcao= teclado.nextInt();
            
            switch (opcao) {
                    
                case 1:
                    Inserir.menu(); //Chamada do menu da classe Inserir
                    break;

                case 2:
                    System.out.println("Editar");
                    break;

                case 3:
                    System.out.println("Apagar");
                    break;

                case 4:
                    System.out.println("Consultar");
                    break;

                case 5:
                    System.out.println("Listar"); 
                    break;
                
                case 0:
                    System.out.println("A fechar...");
                    System.err.println("Programa encerrado.");
                    
                default:
                    System.err.println("Opção inválida");
            }                
    }
    
}
