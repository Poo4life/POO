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
        System.out.println("2 - Diretor(a)");
        System.out.println("3 - Cenógrafo(a)");
        System.out.println("4 - Dramaturgo(a)");
        System.out.println("5 - Figurante");
       /* System.out.println("6 - Iluminador(a)");
        System.out.println("7 - Ponto");
        System.out.println("8 - Produtor(a)");
        System.out.println("9 - Peça");*/
        System.out.println("---------------------");
        System.out.println("Insira a opção pretendida.");
        
        opcao=teclado.nextInt();
        //Ator ator = new Ator É preciso este aqui?
        
        switch (opcao) {
            case 1:
                inserirAtor();
                break;
            case 2:
                inserirDiretor();
                break;
            case 3 :
                inserirCenografo();
                break;
            case 4 :
                inserirDramaturgo();
                break;
            case 5 :
                inserirFigurante();
                break;
            default:    
                throw new AssertionError();
        }
        
    }
    static void inserirAtor() throws FileNotFoundException{    
        
        Scanner teclado = new Scanner (System.in);    

        int idade;
        String nd = "Não definido";
        String nome;
        String nac;
        String gen;
        String form;
        String prem;
        String part;
        Ator2 ator = new Ator2(); 
    
        System.out.println("Qual o nome (completo)?"); //Inserir nome do ator
        nome = teclado.nextLine();       
        ator.setNome(nome);               
                   
        System.out.println("Qual a idade?"); //Inserir idade do ator
        idade = teclado.nextInt();
        ator.setIdade(idade);
        
        teclado.nextLine(); //Linha necesária para limpar o nextInt, senão salta o próximo nextLine
        
        System.out.println("Qual a nacionalidade?"); //Inserir nacionalidade
        nac = teclado.nextLine();
        ator.setNacionalidade(nac);
        
        System.out.println("Qual o género?"); //Inserir género
        gen = teclado.nextLine();
        ator.setGenero(gen);
        
        System.out.println("Qual a sua formação (Aperte enter para não definir)?"); //Inserir formacao
        form = teclado.nextLine();
        
        if (form.equals(null) || form.equals("")){ //Caso não seja definido, a string torna-se "Não definido"
            ator.setFormacao(nd);
            form = nd;
        }else{
            ator.setFormacao(form); //Senão ficará o input
        }    
        System.out.println("Quais os seus prémios (Aperte enter para não definir)?");
        prem= teclado.nextLine();
                
        if (prem.equals(null) || prem.equals("")){ //Caso não seja definido, a string torna-se "Não definido"
            ator.setPremios(nd);
            prem = nd;
        }else{
            ator.setPremios(prem); //Senão ficará o input
        }   
        System.out.println("Quais as suas participações? (Aperte enter para não definir)?");
        part = teclado.nextLine();
                
        if (part.equals(null) || part.equals("")){ //Caso não seja definido, a string torna-se "Não definido"
            ator.setParticipacoes("Não definido");
            part = nd;
        }else{
            ator.setParticipacoes(part); //Senão ficará o input
        }
        
        try(FileWriter fw = new FileWriter("Atores.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter out = new PrintWriter(bw))
        {
            out.println(nome+"|"+idade+"|"+nac+"|"+gen+"|"+form+"|"+prem+"|"+part);             
         } catch (IOException g){
             System.out.println("erro");
         }
        System.out.println("Este é o ator final:");
        ator.status(); //Print do ator final
                
    }    


      public static void inserirDiretor() throws FileNotFoundException{    
        
        Scanner teclado = new Scanner (System.in);    

        int idade;
        String nd = "Não definido";
        String nome;
        String nac;
        String gen;
        String form;
        String prem;
        String part;
       
        Diretor diretor = new Diretor(); 
    
        System.out.println("Qual o nome (completo)?"); //Inserir nome do ator
        nome = teclado.nextLine();       
        diretor.setNome(nome);               
                   
        System.out.println("Qual a idade?"); //Inserir idade do ator
        idade = teclado.nextInt();
        diretor.setIdade(idade);
        
        teclado.nextLine(); //Linha necesária para limpar o nextInt, senão salta o próximo nextLine
        
        System.out.println("Qual a nacionalidade?"); //Inserir nacionalidade
        nac = teclado.nextLine();
        diretor.setNacionalidade(nac);
        
        System.out.println("Qual o género?"); //Inserir género
        gen = teclado.nextLine();
        diretor.setGenero(gen);
        
        System.out.println("Qual a sua formação (Aperte enter para não definir)?"); //Inserir formacao
        form = teclado.nextLine();
        
        if (form.equals(null) || form.equals("")){ //Caso não seja definido, a string torna-se "Não definido"
            diretor.setFormacao(nd);
            form = nd;
        }else{
            diretor.setFormacao(form); //Senão ficará o input
        }    
        System.out.println("Quais os seus prémios (Aperte enter para não definir)?");
        prem = teclado.nextLine();
                
        if (prem.equals(null) || prem.equals("")){ //Caso não seja definido, a string torna-se "Não definido"
            diretor.setPremios(nd);
            prem = nd;
        }else{
            diretor.setPremios(prem); //Senão ficará o input
        }   
        System.out.println("Quais as suas participações? (Aperte enter para não definir)?");
        part = teclado.nextLine();
                
        if (part.equals(null) || part.equals("")){ //Caso não seja definido, a string torna-se "Não definido"
            diretor.setParticipacoes("Não definido");
            part = nd;
        }else{
            diretor.setParticipacoes(part); //Senão ficará o input
        }
        
        try(FileWriter fw = new FileWriter("diretores.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter out = new PrintWriter(bw))
        {
            out.println(nome+"|"+idade+"|"+nac+"|"+gen+"|"+form+"|"+prem+"|"+part);             
         } catch (IOException g){
             System.out.println("erro");
         }
        System.out.println("Este é o ator final:");
        diretor.status(); //Print do diretor  final
                
    }    

       private static void inserirCenografo() {
     
        Scanner teclado = new Scanner (System.in);    
        
        int idade;
        String nd = "Não definido";
        String nome;
        String nac;
        String gen;
        String form;
        String prem;
        String part;
       
        Cenografo cenografo = new Cenografo(); 
    
        System.out.println("Qual o nome (completo)?"); //Inserir nome do ator
        nome = teclado.nextLine();       
        cenografo.setNome(nome);               
                   
        System.out.println("Qual a idade?"); //Inserir idade do ator
        idade = teclado.nextInt();
        cenografo.setIdade(idade);
        
        teclado.nextLine(); //Linha necesária para limpar o nextInt, senão salta o próximo nextLine
        
        System.out.println("Qual a nacionalidade?"); //Inserir nacionalidade
        nac = teclado.nextLine();
        cenografo.setNacionalidade(nac);
        
        System.out.println("Qual o género?"); //Inserir género
        gen = teclado.nextLine();
        cenografo.setGenero(gen);
        
        System.out.println("Qual a sua formação (Aperte enter para não definir)?"); //Inserir formacao
        form = teclado.nextLine();
        
        if (form.equals(null) || form.equals("")){ //Caso não seja definido, a string torna-se "Não definido"
            cenografo.setFormacao(nd);
            form = nd;
        }else{
            cenografo.setFormacao(form); //Senão ficará o input
        }    
        System.out.println("Quais os seus prémios (Aperte enter para não definir)?");
        prem = teclado.nextLine();
                
        if (prem.equals(null) || prem.equals("")){ //Caso não seja definido, a string torna-se "Não definido"
            cenografo.setPremios(nd);
            prem = nd;
        }else{
            cenografo.setPremios(prem); //Senão ficará o input
        }   
        System.out.println("Quais as suas participações? (Aperte enter para não definir)?");
        part = teclado.nextLine();
                
        if (part.equals(null) || part.equals("")){ //Caso não seja definido, a string torna-se "Não definido"
            cenografo.setParticipacoes("Não definido");
            part = nd;
        }else{
            cenografo.setParticipacoes(part); //Senão ficará o input
        }
        
        try(FileWriter fw = new FileWriter("cenografos.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter out = new PrintWriter(bw))
        {
            out.println(nome+"|"+idade+"|"+nac+"|"+gen+"|"+form+"|"+prem+"|"+part);             
         } catch (IOException g){
             System.out.println("erro");
         }
        System.out.println("Este é o Cénografo final:");
        cenografo.status(); //Print do Cenógrafo final
                
    }
       public static void inserirDramaturgo() throws FileNotFoundException{    
        
        Scanner teclado = new Scanner (System.in);    

        int idade;
        String nd = "Não definido";
        String nome;
        String nac;
        String gen;
        String form;
        String prem;
        String part;
       
        Dramaturgo dramaturgo = new Dramaturgo(); 
    
        System.out.println("Qual o nome (completo)?"); //Inserir nome do ator
        nome = teclado.nextLine();       
        dramaturgo.setNome(nome);               
                   
        System.out.println("Qual a idade?"); //Inserir idade do ator
        idade = teclado.nextInt();
        dramaturgo.setIdade(idade);
        
        teclado.nextLine(); //Linha necesária para limpar o nextInt, senão salta o próximo nextLine
        
        System.out.println("Qual a nacionalidade?"); //Inserir nacionalidade
        nac = teclado.nextLine();
        dramaturgo.setNacionalidade(nac);
        
        System.out.println("Qual o género?"); //Inserir género
        gen = teclado.nextLine();
        dramaturgo.setGenero(gen);
        
        System.out.println("Qual a sua formação (Aperte enter para não definir)?"); //Inserir formacao
        form = teclado.nextLine();
        
        if (form.equals(null) || form.equals("")){ //Caso não seja definido, a string torna-se "Não definido"
            dramaturgo.setFormacao(nd);
            form = nd;
        }else{
            dramaturgo.setFormacao(form); //Senão ficará o input
        }    
        System.out.println("Quais os seus prémios (Aperte enter para não definir)?");
        prem = teclado.nextLine();
                
        if (prem.equals(null) || prem.equals("")){ //Caso não seja definido, a string torna-se "Não definido"
            dramaturgo.setPremios(nd);
            prem = nd;
        }else{
            dramaturgo.setPremios(prem); //Senão ficará o input
        }   
        System.out.println("Quais as suas participações? (Aperte enter para não definir)?");
        part = teclado.nextLine();
                
        if (part.equals(null) || part.equals("")){ //Caso não seja definido, a string torna-se "Não definido"
            dramaturgo.setParticipacoes("Não definido");
            part = nd;
        }else{
            dramaturgo.setParticipacoes(part); //Senão ficará o input
        }
        
        try(FileWriter fw = new FileWriter("dramaturgos.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter out = new PrintWriter(bw))
        {
            out.println(nome+"|"+idade+"|"+nac+"|"+gen+"|"+form+"|"+prem+"|"+part);             
         } catch (IOException g){
             System.out.println("erro");
         }
        System.out.println("Este é o Drmaturgo final:");
        dramaturgo.status(); //Print do dramaturgo  final
    }
       
         public static void inserirFigurante() throws FileNotFoundException{    
        
        Scanner teclado = new Scanner (System.in);    

        int idade;
        String nd = "Não definido";
        String nome;
        String nac;
        String gen;
        String form;
        String prem;
        String part;
       
        Figurante figurante = new Figurante(); 
    
        System.out.println("Qual o nome (completo)?"); //Inserir nome do ator
        nome = teclado.nextLine();       
        figurante.setNome(nome);               
                   
        System.out.println("Qual a idade?"); //Inserir idade do ator
        idade = teclado.nextInt();
        figurante.setIdade(idade);
        
        teclado.nextLine(); //Linha necesária para limpar o nextInt, senão salta o próximo nextLine
        
        System.out.println("Qual a nacionalidade?"); //Inserir nacionalidade
        nac = teclado.nextLine();
        figurante.setNacionalidade(nac);
        
        System.out.println("Qual o género?"); //Inserir género
        gen = teclado.nextLine();
        figurante.setGenero(gen);
        
        System.out.println("Qual a sua formação (Aperte enter para não definir)?"); //Inserir formacao
        form = teclado.nextLine();
        
        if (form.equals(null) || form.equals("")){ //Caso não seja definido, a string torna-se "Não definido"
            figurante.setFormacao(nd);
            form = nd;
        }else{
            figurante.setFormacao(form); //Senão ficará o input
        }    
        System.out.println("Quais os seus prémios (Aperte enter para não definir)?");
        prem = teclado.nextLine();
                
        if (prem.equals(null) || prem.equals("")){ //Caso não seja definido, a string torna-se "Não definido"
            figurante.setPremios(nd);
            prem = nd;
        }else{
            figurante.setPremios(prem); //Senão ficará o input
        }   
        System.out.println("Quais as suas participações? (Aperte enter para não definir)?");
        part = teclado.nextLine();
                
        if (part.equals(null) || part.equals("")){ //Caso não seja definido, a string torna-se "Não definido"
            figurante.setParticipacoes("Não definido");
            part = nd;
        }else{
            figurante.setParticipacoes(part); //Senão ficará o input
        }
        
        try(FileWriter fw = new FileWriter("figurantes.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter out = new PrintWriter(bw))
        {
            out.println(nome+"|"+idade+"|"+nac+"|"+gen+"|"+form+"|"+prem+"|"+part);             
         } catch (IOException g){
             System.out.println("erro");
         }
        System.out.println("Este é o ator final:");
        figurante.status(); //Print do figurante  final
    }
  
}



