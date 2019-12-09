
package main;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;



public class Listar {

    public static void menuListar() throws IOException{
        int opcao;
        Scanner teclado = new Scanner (System.in);
        
        System.out.println("---------------------");
        System.out.println("O que deseja inserir?");
        System.out.println("---------------------");
        System.out.println("1 - Ator/Atriz");
        System.out.println("2 - Diretor(a)");
        System.out.println("3 - Cenógrafo(a)");
        System.out.println("4 - Dramaturgo(a)");
        System.out.println("5 - Figurante");
        System.out.println("6 - Iluminador(a)");
        /*System.out.println("7 - Ponto");
        System.out.println("8 - Produtor(a)");
        //System.out.println("9 - Peça");*/
        System.out.println("---------------------");
        System.out.println("Insira a opção pretendida.");
        
        opcao=teclado.nextInt();
        
        switch (opcao) {
            case 1:
                listarAtor();
                break;
            case 2:
                listarDiretor();
                break;
            case 3 :
                listarCenografo();
                break;
            case 4 :
                listarDramaturgo();
                break;
            case 5 :
                listarFigurante();
                break;
            case 6:
                listarIluminador();
                break;
            /*case 7:
                inserirPonto();
                break;
            case 8:
                inserirProdutor();
                break;*/
            default:    
                throw new AssertionError();
        }
        
    }

    public static void listarAtor() throws FileNotFoundException, IOException {

        System.out.println("Estes são os Atores da Companhia neste momento: ");
        
        try (BufferedReader br = new BufferedReader(new FileReader("Atores.txt"))) {
               String line = null;
               while ((line = br.readLine()) != null) {
                 System.out.println(line);
                }
        }

    }

    public static void listarDiretor() throws FileNotFoundException, IOException {
        
        System.out.println("Estes são os Diretores da Companhia neste momento: ");
        
        try (BufferedReader br = new BufferedReader(new FileReader("diretores.txt"))) {
               String line = null;
               while ((line = br.readLine()) != null) {
                 System.out.println(line);
                }
        }
    }

    public static void listarCenografo() throws FileNotFoundException, IOException {
        
        System.out.println("Estes são os Cenógrafos da Companhia neste momento: ");
        
        try (BufferedReader br = new BufferedReader(new FileReader("cenografos.txt"))) {
               String line = null;
               while ((line = br.readLine()) != null) {
                 System.out.println(line);
                }
        }
    }

    public static void listarDramaturgo() throws FileNotFoundException, IOException {

         System.out.println("Estes são os Dramaturgos da Companhia neste momento: ");
        
        try (BufferedReader br = new BufferedReader(new FileReader("dramaturgos.txt"))) {
               String line = null;
               while ((line = br.readLine()) != null) {
                 System.out.println(line);
                }
        }
    }

    public static void listarFigurante() throws FileNotFoundException, IOException {
        
        System.out.println("Estes são os Figurantes da Companhia neste momento: ");
        
        try (BufferedReader br = new BufferedReader(new FileReader("figurantes.txt"))) {
               String line = null;
               while ((line = br.readLine()) != null) {
                 System.out.println(line);
                }
        }
    }

    public static void listarIluminador() throws FileNotFoundException, IOException {
        
        System.out.println("Estes são os Iluminador da Companhia neste momento: ");
        
        try (BufferedReader br = new BufferedReader(new FileReader("figurantes.txt"))) {
               String line = null;
               while ((line = br.readLine()) != null) {
                 System.out.println(line);
                }
        }
    }
    
}
