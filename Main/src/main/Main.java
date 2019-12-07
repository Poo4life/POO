package main;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner; //Scanner Class

public class Main {
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        int opcao;
        Scanner teclado = new Scanner(System.in); //Input
        
        do{
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
                    System.out.println("Inserir Dados"); //Estes souts são só exemplos, foi para testar, aqui depois se calhar entra uma função só para inserir.
                    Inserir2_1.menu();
                    break;

                case 2:
                    System.out.println("Editar");
                    Editar.menuEditar();
                    break;

                case 3:
                    System.out.println("Apagar");
                    Remover.menuRemover();
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
        }while (opcao != 0);
    }
}
    
