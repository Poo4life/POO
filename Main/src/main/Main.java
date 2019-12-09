package main;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner; //Scanner Class

public class Main {
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        int opcao;
        ArrayList<String> Ator = new ArrayList();
        String file_path = "";
        FileOutputSystem 
        
        Scanner teclado = new Scanner(System.in); //Input
        
        do{
            //Menu
            System.out.println("-----------------");
            System.out.println("Menu Principal");
            System.out.println("-----------------");
            System.out.println("1 - Inserir Dados");
            System.out.println("2 - Editar Dados");
            System.out.println("3 - Remover Dados");
            System.out.println("4 - Consultar");
            System.out.println("5 - Listar");
            System.out.println("");
            System.out.println("0 - Sair");
            System.out.println("-----------------");
            System.out.println("");
            System.out.print("Introduza a opção pretendida: ");
            
            opcao= teclado.nextInt();
            
            switch (opcao) {
                    
                case 1:
                    Inserir.menu();
                    break;

                case 2:
                    Editar.menuEditar();
                    break;

                case 3:
                    Remover.menuRemover();
                    break;

                case 4:
                    Consultar.menu();
                    break;

                case 5:
                    Listar.menuListar();
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
    
