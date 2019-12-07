package main;
import java.io.BufferedReader;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Consultar {
    static void menu() throws FileNotFoundException, IOException { //Menu inserir
        int opcao;
        Scanner teclado = new Scanner (System.in);
        
        System.out.println("---------------------");
        System.out.println("O que deseja consultar?");
        System.out.println("---------------------");
        System.out.println("1 - Ator/Atriz");
        System.out.println("2 - Diretor(a)");
        System.out.println("3 - Cenógrafo(a)");
        System.out.println("4 - Dramaturgo(a)");
        System.out.println("5 - Figurante");
        System.out.println("6 - Iluminador(a)");
        System.out.println("7 - Ponto");
        System.out.println("8 - Produtor(a)");
        //System.out.println("9 - Peça");
        System.out.println("---------------------");
        System.out.println("Insira a opção pretendida.");
        
        opcao=teclado.nextInt();
        
        switch (opcao) {
            case 1:
                consultarAtor();
                break;
            case 2:
                consultarDiretor();
                break;
            case 3 :
                consultarCenografo();
                break;
            case 4 :
                consultarDramaturgo();
                break;
            case 5 :
                consultarFigurante();
                break;
            case 6:
                consultarIluminador();
                break;
            case 7:
                consultarPonto();
                break;
            case 8:
                consultarProdutor();
                break;
            case 9:
                consultarPeça();
                break;
            default:    
                throw new AssertionError();
        }
    }
    
    public static void consultarAtor() throws FileNotFoundException, IOException{
        BufferedReader br = new BufferedReader(new FileReader("atores.txt"));
        String linha;
        while ((linha = br.readLine()) != null) {
            System.out.println(linha);
        }
    }    
    
    public static void consultarDiretor() throws FileNotFoundException, IOException{
        BufferedReader br = new BufferedReader(new FileReader("diretores.txt"));
        String linha;
        while ((linha = br.readLine()) != null) {
            System.out.println(linha);
        }
    } 
    
    public static void consultarCenografo() throws FileNotFoundException, IOException{
        BufferedReader br = new BufferedReader(new FileReader("cenografos.txt"));
        String linha;
        while ((linha = br.readLine()) != null) {
            System.out.println(linha);
        }
    }    
    
    public static void consultarDramaturgo() throws FileNotFoundException, IOException{
        BufferedReader br = new BufferedReader(new FileReader("dramaturgos.txt"));
        String linha;
        while ((linha = br.readLine()) != null) {
            System.out.println(linha);
        }
    }    
    
    public static void consultarFigurante() throws FileNotFoundException, IOException{
        BufferedReader br = new BufferedReader(new FileReader("figurantes.txt"));
        String linha;
        while ((linha = br.readLine()) != null) {
            System.out.println(linha);
        }
    }    
    
    public static void consultarIluminador() throws FileNotFoundException, IOException{
        BufferedReader br = new BufferedReader(new FileReader("iluminadores.txt"));
        String linha;
        while ((linha = br.readLine()) != null) {
            System.out.println(linha);
        }
    }    
    
    public static void consultarPonto() throws FileNotFoundException, IOException{
        BufferedReader br = new BufferedReader(new FileReader("pontos.txt"));
        String linha;
        while ((linha = br.readLine()) != null) {
            System.out.println(linha);
        }
    }    
    
    public static void consultarProdutor() throws FileNotFoundException, IOException{
        BufferedReader br = new BufferedReader(new FileReader("produtores.txt"));
        String linha;
        while ((linha = br.readLine()) != null) {
            System.out.println(linha);
        }
    }    
    
    public static void consultarPeça() throws FileNotFoundException, IOException{
        BufferedReader br = new BufferedReader(new FileReader("peças.txt"));
        String linha;
        while ((linha = br.readLine()) != null) {
            System.out.println(linha);
        }
    }    
}
