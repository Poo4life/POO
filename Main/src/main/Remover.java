package main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Remover {
     
    public static void menuRemover() throws FileNotFoundException, IOException{
       
        int opcao;
        Scanner teclado = new Scanner (System.in);
        
        System.out.println("---------------------");
        System.out.println("O que deseja Apagar?");
        System.out.println("---------------------");
        System.out.println("1 - Ator/Atriz");
        System.out.println("2 - Diretor(a)");
        System.out.println("3 - Cenógrafo(a)");
        System.out.println("4 - Dramaturgo(a)");
        System.out.println("5 - Figurante");
        /*System.out.println("6 - Iluminador(a)");
        System.out.println("7 - Ponto");
        System.out.println("8 - Produtor(a)");
        System.out.println("9 - Peça");*/
        System.out.println("---------------------");
        System.out.println("Insira a opção pretendida.");
        
        opcao=teclado.nextInt();
        
        switch (opcao) {
            case 1:
                removerAtor();
                break;
            case 2:
                removerDiretor();
                break;
            case 3 :
                removerCenografo();
                break;
            case 4 :
                removerDramaturgo();
                break;
            case 5 :
                removerFigurante();
                break;
            default:
                throw new AssertionError();
        }
        
    }
    
    static void removerAtor() throws IOException{
        
        System.out.println("Estes são os Atores da Companhia neste momento: ");
        
        try (BufferedReader br = new BufferedReader(new FileReader("Atores.txt"))) {
               String line = null;
               while ((line = br.readLine()) != null) {
                 System.out.println(line);
                }
        }
        Scanner teclado = new Scanner (System.in);
        
        //Teste se o ficheiro existe
        File inputFile = new File("Atores.txt");
        if (!inputFile.isFile()){
            System.out.println("Não existem atores criados.");
        }
        
        //Criação dum ficheiro temporário
        File tempFile = new File(inputFile.getAbsolutePath() + ".tmp");
        BufferedReader br = new BufferedReader(new FileReader("Atores.txt"));
        PrintWriter pw = new PrintWriter(new FileWriter(tempFile));
        String linha;
        String nome;
        
        System.out.println("Qual o nome (completo) do ator que quer apagar?");
        nome = teclado.nextLine();

        
        //Ler até encontrar a linha
        while ((linha = br.readLine()) != null){
            if (!linha.startsWith(nome)){
                pw.println(linha);
                pw.flush();
            }
            
        }
        
        pw.close();
        br.close();
        
        if (!inputFile.delete()){
            System.out.println("Não foi possível remover o ficheiro antigo.");
        }
        
        if (!tempFile.renameTo(inputFile)){
            System.out.println("Não foi possível editar o ficheiro.");
        }
    }

    private static void removerDiretor() throws FileNotFoundException, IOException {
            
        System.out.println("Estes são os Diretores da Companhia neste momento: ");
        
        try (BufferedReader br = new BufferedReader(new FileReader("diretores.txt"))) {
               String line = null;
               while ((line = br.readLine()) != null) {
                 System.out.println(line);
                }
        }
        Scanner teclado = new Scanner (System.in);
        
        //Teste se o ficheiro existe
        File inputFile = new File("diretores.txt");
        if (!inputFile.isFile()){
            System.out.println("Não existem diretores criados.");
        }
        
        //Criação dum ficheiro temporário
        File tempFile = new File(inputFile.getAbsolutePath() + ".tmp");
        BufferedReader br = new BufferedReader(new FileReader("diretores.txt"));
        PrintWriter pw = new PrintWriter(new FileWriter(tempFile));
        String linha;
        String nome;
        
        System.out.println("Qual o nome (completo) do diretores que quer apagar?");
        nome = teclado.nextLine();

        
        //Ler até encontrar a linha
        while ((linha = br.readLine()) != null){
            if (!linha.startsWith(nome)){
                pw.println(linha);
                pw.flush();
            }
            
        }
        
        pw.close();
        br.close();
        
        if (!inputFile.delete()){
            System.out.println("Não foi possível remover o ficheiro antigo.");
        }
        
        if (!tempFile.renameTo(inputFile)){
            System.out.println("Não foi possível editar o ficheiro.");
        }
    }

    private static void removerCenografo() throws FileNotFoundException, IOException {
          System.out.println("Estes são os Cenografos da Companhia neste momento: ");
        
        try (BufferedReader br = new BufferedReader(new FileReader("cenografos.txt"))) {
               String line = null;
               while ((line = br.readLine()) != null) {
                 System.out.println(line);
                }
        }
        Scanner teclado = new Scanner (System.in);
        
        //Teste se o ficheiro existe
        File inputFile = new File("cenografos.txt");
        if (!inputFile.isFile()){
            System.out.println("Não existem Cenṕgrafos criados.");
        }
        
        //Criação dum ficheiro temporário
        File tempFile = new File(inputFile.getAbsolutePath() + ".tmp");
        BufferedReader br = new BufferedReader(new FileReader("cenografos.txt"));
        PrintWriter pw = new PrintWriter(new FileWriter(tempFile));
        String linha;
        String nome;
        
        System.out.println("Qual o nome (completo) do Cenógrafo que quer apagar?");
        nome = teclado.nextLine();

        
        //Ler até encontrar a linha
        while ((linha = br.readLine()) != null){
            if (!linha.startsWith(nome)){
                pw.println(linha);
                pw.flush();
            }
            
        }
        
        pw.close();
        br.close();
        
        if (!inputFile.delete()){
            System.out.println("Não foi possível remover o ficheiro antigo.");
        }
        
        if (!tempFile.renameTo(inputFile)){
            System.out.println("Não foi possível editar o ficheiro.");
        } 
    }

    private static void removerDramaturgo() throws FileNotFoundException, IOException {
       
        System.out.println("Estes são os Dramaturgos da Companhia neste momento: ");
        
        try (BufferedReader br = new BufferedReader(new FileReader("dramaturgos.txt"))) {
               String line = null;
               while ((line = br.readLine()) != null) {
                 System.out.println(line);
                }
        }
        Scanner teclado = new Scanner (System.in);
        
        //Teste se o ficheiro existe
        File inputFile = new File("dramaturgos.txt");
        if (!inputFile.isFile()){
            System.out.println("Não existem dramaturgos criados.");
        }
        
        //Criação dum ficheiro temporário
        File tempFile = new File(inputFile.getAbsolutePath() + ".tmp");
        BufferedReader br = new BufferedReader(new FileReader("dramaturgos.txt"));
        PrintWriter pw = new PrintWriter(new FileWriter(tempFile));
        String linha;
        String nome;
        
        System.out.println("Qual o nome (completo) do dramaturgo que quer apagar?");
        nome = teclado.nextLine();

        
        //Ler até encontrar a linha
        while ((linha = br.readLine()) != null){
            if (!linha.startsWith(nome)){
                pw.println(linha);
                pw.flush();
            }
            
        }
        
        pw.close();
        br.close();
        
        if (!inputFile.delete()){
            System.out.println("Não foi possível remover o ficheiro antigo.");
        }
        
        if (!tempFile.renameTo(inputFile)){
            System.out.println("Não foi possível editar o ficheiro.");
        }

    }

    private static void removerFigurante() throws FileNotFoundException, IOException {
            
        System.out.println("Estes são os Figurantes da Companhia neste momento: ");
        
        try (BufferedReader br = new BufferedReader(new FileReader("figurantes.txt"))) {
               String line = null;
               while ((line = br.readLine()) != null) {
                 System.out.println(line);
                }
        }
        Scanner teclado = new Scanner (System.in);
        
        //Teste se o ficheiro existe
        File inputFile = new File("figurantes.txt");
        if (!inputFile.isFile()){
            System.out.println("Não existem figurantes criados.");
        }
        
        //Criação dum ficheiro temporário
        File tempFile = new File(inputFile.getAbsolutePath() + ".tmp");
        BufferedReader br = new BufferedReader(new FileReader("figurantes.txt"));
        PrintWriter pw = new PrintWriter(new FileWriter(tempFile));
        String linha;
        String nome;
        
        System.out.println("Qual o nome (completo) do figurantes que quer apagar?");
        nome = teclado.nextLine();

        
        //Ler até encontrar a linha
        while ((linha = br.readLine()) != null){
            if (!linha.startsWith(nome)){
                pw.println(linha);
                pw.flush();
            }
            
        }
        
        pw.close();
        br.close();
        
        if (!inputFile.delete()){
            System.out.println("Não foi possível remover o ficheiro antigo.");
        }
        
        if (!tempFile.renameTo(inputFile)){
            System.out.println("Não foi possível editar o ficheiro.");
        }
    }


}

