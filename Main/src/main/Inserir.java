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

public class Inserir {
    
    public static void menu() throws FileNotFoundException { //Menu inserir
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
        System.out.println("6 - Figurista");
        System.out.println("6 - Iluminador(a)");
        System.out.println("7 - Ponto");
        System.out.println("8 - Produtor(a)");
        System.out.println("9 - Peça");
        System.out.println("---------------------");
        System.out.print("Insira a opção pretendida: ");
        
        opcao=teclado.nextInt();
        
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
            case 6:
                inserirFigurista();
                break;
            case 7:
                inserirIluminador();
                break;
            case 8:
                inserirPonto();
                break;
            case 9:
                inserirProdutor();
                break;
            case 10: 
                inserirPeça();
            default:    
                throw new AssertionError();
        }
        
    }
     
    public static void inserirAtor() throws FileNotFoundException{    
        
        Scanner teclado = new Scanner (System.in);    

        int idade;
        String nd = "Não definido";
        String nome;
        String nac;
        String gen;
        String form;
        String prem;
        String part;
        Ator ator = new Ator(); 
    
        System.out.print("Nome Completo: "); //Inserir nome do ator
        nome = teclado.nextLine();       
        ator.setNome(nome);               
                   
        System.out.print("Idade: "); //Inserir idade do ator
        idade = teclado.nextInt();
        ator.setIdade(idade);
        
        teclado.nextLine(); //Linha necesária para limpar o nextInt, senão salta o próximo nextLine
        
        System.out.print("Nacionalidade: "); //Inserir nacionalidade
        nac = teclado.nextLine();
        ator.setNacionalidade(nac);
        
        System.out.print("Género: "); //Inserir género
        gen = teclado.nextLine();
        ator.setGenero(gen);
        
        System.out.print("Formação (Aperte enter para não definir): "); //Inserir formacao
        form = teclado.nextLine();
        
        if (form.equals(null) || form.equals("")){ //Caso não seja definido, a string torna-se "Não definido"
            ator.setFormacao(nd);
            form = nd;
        }else{
            ator.setFormacao(form); //Senão ficará o input
        }    
        System.out.print("Prémios (Aperte enter para não definir): ");
        prem= teclado.nextLine();
                
        if (prem.equals(null) || prem.equals("")){ //Caso não seja definido, a string torna-se "Não definido"
            ator.setPremios(nd);
            prem = nd;
        }else{
            ator.setPremios(prem); //Senão ficará o input
        }   
        System.out.print("Participações (Aperte enter para não definir): ");
        part = teclado.nextLine();
                
        if (part.equals(null) || part.equals("")){ //Caso não seja definido, a string torna-se "Não definido"
            ator.setParticipacoes("Não definido");
            part = nd;
        }else{
            ator.setParticipacoes(part); //Senão ficará o input
        }
        
        try(FileWriter fw = new FileWriter("atores.txt", true);
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
    
        System.out.print("Nome Completo: "); //Inserir nome do ator
        nome = teclado.nextLine();       
        diretor.setNome(nome);               
                   
        System.out.print("Idade: "); //Inserir idade do ator
        idade = teclado.nextInt();
        diretor.setIdade(idade);
        
        teclado.nextLine(); //Linha necesária para limpar o nextInt, senão salta o próximo nextLine
        
        System.out.print("Nacionalidade: "); //Inserir nacionalidade
        nac = teclado.nextLine();
        diretor.setNacionalidade(nac);
        
        System.out.print("Género: "); //Inserir género
        gen = teclado.nextLine();
        diretor.setGenero(gen);
        
        System.out.print("Formação (Aperte enter para não definir): "); //Inserir formacao
        form = teclado.nextLine();
        
        if (form.equals(null) || form.equals("")){ //Caso não seja definido, a string torna-se "Não definido"
            diretor.setFormacao(nd);
            form = nd;
        }else{
            diretor.setFormacao(form); //Senão ficará o input
        }    
        System.out.print("Prémios (Aperte enter para não definir): ");
        prem = teclado.nextLine();
                
        if (prem.equals(null) || prem.equals("")){ //Caso não seja definido, a string torna-se "Não definido"
            diretor.setPremios(nd);
            prem = nd;
        }else{
            diretor.setPremios(prem); //Senão ficará o input
        }   
        System.out.print("Participações (Aperte enter para não definir): ");
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
        System.out.println("Este é o(a) diretor(a) final:");
        diretor.status(); //Print do diretor  final
                
    }    

    public static void inserirCenografo() {
     
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
    
        System.out.print("Nome Completo: "); //Inserir nome do ator
        nome = teclado.nextLine();       
        cenografo.setNome(nome);               
                   
        System.out.print("Idade: "); //Inserir idade do ator
        idade = teclado.nextInt();
        cenografo.setIdade(idade);
        
        teclado.nextLine(); //Linha necesária para limpar o nextInt, senão salta o próximo nextLine
        
        System.out.print("Nacionalidade: "); //Inserir nacionalidade
        nac = teclado.nextLine();
        cenografo.setNacionalidade(nac);
        
        System.out.print("Género: "); //Inserir género
        gen = teclado.nextLine();
        cenografo.setGenero(gen);
        
        System.out.print("Formação (Aperte enter para não definir): "); //Inserir formacao
        form = teclado.nextLine();
        
        if (form.equals(null) || form.equals("")){ //Caso não seja definido, a string torna-se "Não definido"
            cenografo.setFormacao(nd);
            form = nd;
        }else{
            cenografo.setFormacao(form); //Senão ficará o input
        }    
        System.out.print("Prémios (Aperte enter para não definir): ");
        prem = teclado.nextLine();
                
        if (prem.equals(null) || prem.equals("")){ //Caso não seja definido, a string torna-se "Não definido"
            cenografo.setPremios(nd);
            prem = nd;
        }else{
            cenografo.setPremios(prem); //Senão ficará o input
        }   
        System.out.print("Participações (Aperte enter para não definir): ");
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
        System.out.println("Este é o(a) cénografo(a) final:");
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
    
        System.out.print("Nome Completo: "); //Inserir nome do ator
        nome = teclado.nextLine();       
        dramaturgo.setNome(nome);               
                   
        System.out.print("Idade: "); //Inserir idade do ator
        idade = teclado.nextInt();
        dramaturgo.setIdade(idade);
        
        teclado.nextLine(); //Linha necesária para limpar o nextInt, senão salta o próximo nextLine
        
        System.out.print("Nacionalidade: "); //Inserir nacionalidade
        nac = teclado.nextLine();
        dramaturgo.setNacionalidade(nac);
        
        System.out.print("Género: "); //Inserir género
        gen = teclado.nextLine();
        dramaturgo.setGenero(gen);
        
        System.out.print("Formação (Aperte enter para não definir): "); //Inserir formacao
        form = teclado.nextLine();
        
        if (form.equals(null) || form.equals("")){ //Caso não seja definido, a string torna-se "Não definido"
            dramaturgo.setFormacao(nd);
            form = nd;
        }else{
            dramaturgo.setFormacao(form); //Senão ficará o input
        }    
        System.out.print("Prémios (Aperte enter para não definir): ");
        prem = teclado.nextLine();
                
        if (prem.equals(null) || prem.equals("")){ //Caso não seja definido, a string torna-se "Não definido"
            dramaturgo.setPremios(nd);
            prem = nd;
        }else{
            dramaturgo.setPremios(prem); //Senão ficará o input
        }   
        System.out.print("Participações (Aperte enter para não definir): ");
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
        System.out.println("Este é o(a) dramaturgo(a) final:");
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
    
        System.out.print("Nome Completo: "); //Inserir nome do ator
        nome = teclado.nextLine();       
        figurante.setNome(nome);               
                   
        System.out.print("Idade: "); //Inserir idade do ator
        idade = teclado.nextInt();
        figurante.setIdade(idade);
        
        teclado.nextLine(); //Linha necesária para limpar o nextInt, senão salta o próximo nextLine
        
        System.out.print("Nacionalidade: "); //Inserir nacionalidade
        nac = teclado.nextLine();
        figurante.setNacionalidade(nac);
        
        System.out.print("Género: "); //Inserir género
        gen = teclado.nextLine();
        figurante.setGenero(gen);
        
        System.out.print("Formação (Aperte enter para não definir): "); //Inserir formacao
        form = teclado.nextLine();
        
        if (form.equals(null) || form.equals("")){ //Caso não seja definido, a string torna-se "Não definido"
            figurante.setFormacao(nd);
            form = nd;
        }else{
            figurante.setFormacao(form); //Senão ficará o input
        }    
        System.out.print("Prémios (Aperte enter para não definir): ");
        prem = teclado.nextLine();
                
        if (prem.equals(null) || prem.equals("")){ //Caso não seja definido, a string torna-se "Não definido"
            figurante.setPremios(nd);
            prem = nd;
        }else{
            figurante.setPremios(prem); //Senão ficará o input
        }   
        System.out.print("Participações (Aperte enter para não definir): ");
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
        System.out.println("Este é o figurante final:");
        figurante.status(); //Print do figurante  final
    }
     
    public static void inserirFigurista() throws FileNotFoundException{    
        
        Scanner teclado = new Scanner (System.in);    

        int idade;
        String nd = "Não definido";
        String nome;
        String nac;
        String gen;
        String form;
        String prem;
        String part;
       
        Figurista figurista = new Figurista(); 
    
        System.out.print("Nome Completo: "); //Inserir nome do ator
        nome = teclado.nextLine();       
        figurista.setNome(nome);               
                   
        System.out.print("Idade: "); //Inserir idade do ator
        idade = teclado.nextInt();
        figurista.setIdade(idade);
        
        teclado.nextLine(); //Linha necesária para limpar o nextInt, senão salta o próximo nextLine
        
        System.out.print("Nacionalidade: "); //Inserir nacionalidade
        nac = teclado.nextLine();
        figurista.setNacionalidade(nac);
        
        System.out.print("Género: "); //Inserir género
        gen = teclado.nextLine();
        figurista.setGenero(gen);
        
        System.out.print("Formação (Aperte enter para não definir): "); //Inserir formacao
        form = teclado.nextLine();
        
        if (form.equals(null) || form.equals("")){ //Caso não seja definido, a string torna-se "Não definido"
            figurista.setFormacao(nd);
            form = nd;
        }else{
            figurista.setFormacao(form); //Senão ficará o input
        }    
        System.out.print("Prémios (Aperte enter para não definir): ");
        prem = teclado.nextLine();
                
        if (prem.equals(null) || prem.equals("")){ //Caso não seja definido, a string torna-se "Não definido"
            figurista.setPremios(nd);
            prem = nd;
        }else{
            figurista.setPremios(prem); //Senão ficará o input
        }   
        System.out.print("Participações (Aperte enter para não definir): ");
        part = teclado.nextLine();
                
        if (part.equals(null) || part.equals("")){ //Caso não seja definido, a string torna-se "Não definido"
            figurista.setParticipacoes("Não definido");
            part = nd;
        }else{
            figurista.setParticipacoes(part); //Senão ficará o input
        }
        
        try(FileWriter fw = new FileWriter("figuristas.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter out = new PrintWriter(bw))
        {
            out.println(nome+"|"+idade+"|"+nac+"|"+gen+"|"+form+"|"+prem+"|"+part);             
         } catch (IOException g){
             System.out.println("erro");
         }
        System.out.println("Este é o figurista final:");
        figurista.status(); //Print do figurante  final
    }
    
    public static void inserirIluminador() throws FileNotFoundException{    
        
        Scanner teclado = new Scanner (System.in);    

        int idade;
        String nd = "Não definido";
        String nome;
        String nac;
        String gen;
        String form;
        String prem;
        String part;
       
        Iluminador iluminador = new Iluminador(); 
    
        System.out.print("Nome completo: "); //Inserir nome do ator
        nome = teclado.nextLine();       
        iluminador.setNome(nome);               
                   
        System.out.print("Idade: "); //Inserir idade do ator
        idade = teclado.nextInt();
        iluminador.setIdade(idade);
        
        teclado.nextLine(); //Linha necesária para limpar o nextInt, senão salta o próximo nextLine
        
        System.out.print("Nacionalidade: "); //Inserir nacionalidade
        nac = teclado.nextLine();
        iluminador.setNacionalidade(nac);
        
        System.out.print("Género: "); //Inserir género
        gen = teclado.nextLine();
        iluminador.setGenero(gen);
        
        System.out.print("Formação (Aperte enter para não definir): "); //Inserir formacao
        form = teclado.nextLine();
        
        if (form.equals(null) || form.equals("")){ //Caso não seja definido, a string torna-se "Não definido"
            iluminador.setFormacao(nd);
            form = nd;
        }else{
            iluminador.setFormacao(form); //Senão ficará o input
        }    
        System.out.print("Prémios (Aperte enter para não definir): ");
        prem = teclado.nextLine();
                
        if (prem.equals(null) || prem.equals("")){ //Caso não seja definido, a string torna-se "Não definido"
            iluminador.setPremios(nd);
            prem = nd;
        }else{
            iluminador.setPremios(prem); //Senão ficará o input
        }   
        System.out.print("Participações (Aperte enter para não definir): ");
        part = teclado.nextLine();
                
        if (part.equals(null) || part.equals("")){ //Caso não seja definido, a string torna-se "Não definido"
            iluminador.setParticipacoes("Não definido");
            part = nd;
        }else{
            iluminador.setParticipacoes(part); //Senão ficará o input
        }
        
        try(FileWriter fw = new FileWriter("iluminadores.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter out = new PrintWriter(bw))
        {
            out.println(nome+"|"+idade+"|"+nac+"|"+gen+"|"+form+"|"+prem+"|"+part);             
         } catch (IOException g){
             System.out.println("erro");
         }
        System.out.println("Este é o(a) iluminador(a) final:");
        iluminador.status(); //Print do figurante  final
    }
    
    public static void inserirPonto() throws FileNotFoundException{    
        
        Scanner teclado = new Scanner (System.in);    

        int idade;
        String nd = "Não definido";
        String nome;
        String nac;
        String gen;
        String form;
        String prem;
        String part;
       
        Ponto ponto = new Ponto(); 
    
        System.out.print("Nome Completo: "); //Inserir nome do ator
        nome = teclado.nextLine();       
        ponto.setNome(nome);               
                   
        System.out.print("Idade: "); //Inserir idade do ator
        idade = teclado.nextInt();
        ponto.setIdade(idade);
        
        teclado.nextLine(); //Linha necesária para limpar o nextInt, senão salta o próximo nextLine
        
        System.out.print("Nacionalidade: "); //Inserir nacionalidade
        nac = teclado.nextLine();
        ponto.setNacionalidade(nac);
        
        System.out.print("Género: "); //Inserir género
        gen = teclado.nextLine();
        ponto.setGenero(gen);
        
        System.out.print("Formação (Aperte enter para não definir): "); //Inserir formacao
        form = teclado.nextLine();
        
        if (form.equals(null) || form.equals("")){ //Caso não seja definido, a string torna-se "Não definido"
            ponto.setFormacao(nd);
            form = nd;
        }else{
            ponto.setFormacao(form); //Senão ficará o input
        }    
        System.out.print("Prémios (Aperte enter para não definir): ");
        prem = teclado.nextLine();
                
        if (prem.equals(null) || prem.equals("")){ //Caso não seja definido, a string torna-se "Não definido"
            ponto.setPremios(nd);
            prem = nd;
        }else{
            ponto.setPremios(prem); //Senão ficará o input
        }   
        System.out.print("Participações (Aperte enter para não definir): ");
        part = teclado.nextLine();
                
        if (part.equals(null) || part.equals("")){ //Caso não seja definido, a string torna-se "Não definido"
            ponto.setParticipacoes("Não definido");
            part = nd;
        }else{
            ponto.setParticipacoes(part); //Senão ficará o input
        }
        
        try(FileWriter fw = new FileWriter("pontos.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter out = new PrintWriter(bw))
        {
            out.println(nome+"|"+idade+"|"+nac+"|"+gen+"|"+form+"|"+prem+"|"+part);             
         } catch (IOException g){
             System.out.println("erro");
         }
        System.out.println("Este é o(a) ponto final:");
        ponto.status(); //Print do figurante  final
    }
    
    public static void inserirProdutor() throws FileNotFoundException{    
        
        Scanner teclado = new Scanner (System.in);    

        int idade;
        String nd = "Não definido";
        String nome;
        String nac;
        String gen;
        String form;
        String prem;
        String part;
       
        Produtor produtor = new Produtor(); 
    
        System.out.print("Nome Completo: "); //Inserir nome do ator
        nome = teclado.nextLine();       
        produtor.setNome(nome);               
                   
        System.out.print("Idade: "); //Inserir idade do ator
        idade = teclado.nextInt();
        produtor.setIdade(idade);
        
        teclado.nextLine(); //Linha necesária para limpar o nextInt, senão salta o próximo nextLine
        
        System.out.print("Nacionalidade: "); //Inserir nacionalidade
        nac = teclado.nextLine();
        produtor.setNacionalidade(nac);
        
        System.out.print("Género: "); //Inserir género
        gen = teclado.nextLine();
        produtor.setGenero(gen);
        
        System.out.print("Formação (Aperte enter para não definir): "); //Inserir formacao
        form = teclado.nextLine();
        
        if (form.equals(null) || form.equals("")){ //Caso não seja definido, a string torna-se "Não definido"
            produtor.setFormacao(nd);
            form = nd;
        }else{
            produtor.setFormacao(form); //Senão ficará o input
        }    
        System.out.print("Prémios (Aperte enter para não definir): ");
        prem = teclado.nextLine();
                
        if (prem.equals(null) || prem.equals("")){ //Caso não seja definido, a string torna-se "Não definido"
            produtor.setPremios(nd);
            prem = nd;
        }else{
            produtor.setPremios(prem); //Senão ficará o input
        }   
        System.out.print("Participações (Aperte enter para não definir): ");
        part = teclado.nextLine();
                
        if (part.equals(null) || part.equals("")){ //Caso não seja definido, a string torna-se "Não definido"
            produtor.setParticipacoes("Não definido");
            part = nd;
        }else{
            produtor.setParticipacoes(part); //Senão ficará o input
        }
        
        try(FileWriter fw = new FileWriter("produtores.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter out = new PrintWriter(bw))
        {
            out.println(nome+"|"+idade+"|"+nac+"|"+gen+"|"+form+"|"+prem+"|"+part);             
         } catch (IOException g){
             System.out.println("erro");
         }
        System.out.println("Este é o Produtor final:");
        produtor.status(); //Print do produtor  final
    }
    
    public static void inserirPeça() throws FileNotFoundException{    
        
        Scanner teclado = new Scanner (System.in);    

        int dia;
        String mes;
        int ano;
        String nome;
        String local;
       
        Peça peça = new Peça(); 
    
        System.out.print("Nome da Peça: "); //Inserir nome da peça
        nome = teclado.nextLine();       
        peça.setNome(nome);               
                   
        System.out.print("Dia de Apresentação: "); //Inserir dia da peça
        dia = teclado.nextInt();
        peça.setDia(dia);
        
        System.out.print("Mês de Apresentação: "); //Inserir mês da peça
        mes = teclado.nextLine();
        peça.setMes(mes);
        
        System.out.print("Ano de Apresentação: "); //Inserir ano da peça
        ano = teclado.nextInt();
        peça.setAno(ano);

        System.out.print("Local de Apresentação: "); //Inserir local de apresentação da peça
        local = teclado.nextLine();
        peça.setLocal(local);
        
        try(FileWriter fw = new FileWriter("peças.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter out = new PrintWriter(bw))
        {
            out.println(nome+"|"+dia+"|"+mes+"|"+ano);             
         } catch (IOException g){
             System.out.println("erro");
         }
        System.out.println("Esta é a peça final:");
        peça.status(); //Print do peça  final
        
        
    }
    
}



