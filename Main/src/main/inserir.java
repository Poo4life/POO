package main;
import java.util.Scanner;
import static main.Main.main;

public class inserir {
   
    public static void printmenu(){
        
       int opcao;
       Scanner teclado = new Scanner(System.in); //Input       
        
        do{
            //Menu
            System.out.println("-----------------");
            System.out.println("Menu Inserir");
            System.out.println("-----------------");
            System.out.println("1 - Inserir Ator");
            System.out.println("2 - Inserir Realizador");
            /*System.out.println("3 - Apagar Dados");
            System.out.println("4 - Consultar");
            System.out.println("5 - Listar");
            System.out.println("");*/
            System.out.println("0 - Sair para o Menu Principal");
            System.out.println("-----------------");
            System.out.println("");
            System.out.println("Introduza a opção pretendida.");
            
            opcao= teclado.nextInt();
            
            switch (opcao) {
                    
                case 1:
                    System.out.println("Inserir Dados"); //Estes souts são só exemplos, foi para testar, aqui depois se calhar entra uma função só para inserir.
                    break;

                case 2:
                    System.out.println("Editar");
                    break;
/*
                case 3:
                    System.out.println("Apagar");
                    break;

                case 4:
                    System.out.println("Consultar");
                    break;

                case 5:
                    System.out.println("Listar"); 
                    break;
*/                
                case 0:
                    System.out.println("A fechar...");
                    main(null);
                default:
                    System.err.println("Opção inválida");
            }                
        }while (opcao != 0);
   }
}
