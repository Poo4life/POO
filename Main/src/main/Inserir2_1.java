package main;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.Writer;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class Inserir2_1 {
    
     static void menu() throws FileNotFoundException { //Menu inserir
        int opcao;
        Scanner teclado = new Scanner (System.in);
        
        System.out.println("---------------------");
        System.out.println("O que deseja inserir?");
        System.out.println("---------------------");
        System.out.println("1 - Ator/Atriz");
        System.out.println("2 - Cenógrafo(a)");
        System.out.println("3 - Diretor(a)");
        System.out.println("4 - Dramaturgo(a)");
        System.out.println("5 - Figurante");
        System.out.println("6 - Figurinista");
        System.out.println("7 - Iluminador(a)");
        System.out.println("8 - Ponto");
        System.out.println("9 - Produtor(a)");
        System.out.println("10 - Peça");
        System.out.println("---------------------");
        System.out.println("Insira a opção pretendida.");
        
        opcao=teclado.nextInt();
        Ator ator = new Ator();
        
        switch (opcao) {
            case 1:
                inserirAtor();
                break;
            default:
                throw new AssertionError();
        }
        
    }
    static void inserirAtor() throws FileNotFoundException{    
        
        Scanner teclado = new Scanner (System.in);    
        String insert;
        int idade;
        String nd = "Não definido";
        String a,b,c,d,e,f;
        Ator ator = new Ator(); 
    
        System.out.println("Qual o nome?"); //Inserir nome do ator
        a = teclado.nextLine();       
        ator.setNome(a);               
         
       /* try(FileWriter fw = new FileWriter("nomes.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter out = new PrintWriter(bw))
        {
            out.println(insert);             
         } catch (IOException e) {
             //exception handling left as an exercise for the reader
         }*/
              
        System.out.println("Qual a idade?"); //Inserir idade do ator
        idade = teclado.nextInt();
        ator.setIdade(idade);
        
        teclado.nextLine(); //Linha necesária para limpar o nextInt, senão salta o próximo nextLine
        
        /* try(FileWriter fw = new FileWriter("idades.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter out = new PrintWriter(bw))
        {
            out.println(idade);             
         } catch (IOException e) {
             //exception handling left as an exercise for the reader
         }
         
          */         
        System.out.println("Qual a nacionalidade?"); //Inserir nacionalidade
        b = teclado.nextLine();
        ator.setNacionalidade(b);
        /*
         try(FileWriter fw = new FileWriter("nacionalidades.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter out = new PrintWriter(bw))
        {
            out.println(insert);             
         } catch (IOException e) {
             //exception handling left as an exercise for the reader
         }
        
        */
        System.out.println("Qual o género?"); //Inserir género
        c = teclado.nextLine();
        ator.setGenero(c);
        /*
         try(FileWriter fw = new FileWriter("generos.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter out = new PrintWriter(bw))
        {
            out.println(insert);             
         } catch (IOException e) {
             //exception handling left as an exercise for the reader
         }
        */
        System.out.println("Qual a sua formação (Aperte enter para não definir)?"); //Inserir formacao
        d = teclado.nextLine();
        
        if (d.equals(null) || d.equals("")){ //Caso não seja definido, a string torna-se "Não definido"
            ator.setFormacao(nd);
            d = nd;
        }else{
            ator.setFormacao(d); //Senão ficará o input
        }/*
         try(FileWriter fw = new FileWriter("formacao.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter out = new PrintWriter(bw))
        {
            out.println(insert);             
         } catch (IOException e) {
             //exception handling left as an exercise for the reader
         }
           */     
        System.out.println("Quais os seus prémios (Aperte enter para não definir)?");
        e = teclado.nextLine();
                
        if (e.equals(null) || e.equals("")){ //Caso não seja definido, a string torna-se "Não definido"
            ator.setPremios(nd);
            e = nd;
        }else{
            ator.setPremios(e); //Senão ficará o input
        }/*
         try(FileWriter fw = new FileWriter("premios.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter out = new PrintWriter(bw))
        {
            out.println(insert);             
         } catch (IOException e) {
             //exception handling left as an exercise for the reader
         }        
           */     
        System.out.println("Quais as suas participações? (Aperte enter para não definir)?");
        f = teclado.nextLine();
                
        if (f.equals(null) || f.equals("")){ //Caso não seja definido, a string torna-se "Não definido"
            ator.setParticipacoes("Não definido");
            f = nd;
        }else{
            ator.setParticipacoes(f); //Senão ficará o input
        }
        /*
         try(FileWriter fw = new FileWriter("participacoes.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter out = new PrintWriter(bw))
        {
            out.println(insert);             
         } catch (IOException e) {
             //exception handling left as an exercise for the reader
         }
        */
        
        try(FileWriter fw = new FileWriter("infos.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter out = new PrintWriter(bw))
        {
            out.println(a+";"+idade+";"+b+";"+c+";"+d+";"+e+";"+f);             
         } catch (IOException g){
             System.out.println("erro");
         }
        System.out.println("Este é o ator final:");
        ator.status(); //Print do ator final
                
    }    
}
