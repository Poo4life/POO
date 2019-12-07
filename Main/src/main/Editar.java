
package main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class Editar {
    
    public static void menuEditar() throws FileNotFoundException, IOException{
        int opcao;
        Scanner teclado = new Scanner (System.in);
        
        System.out.println("---------------------");
        System.out.println("O que deseja Editar?");
        System.out.println("---------------------");
        System.out.println("1 - Ator/Atriz");
        System.out.println("2 - Diretor(a)");
        System.out.println("3 - Cenógrafo(a)");
        System.out.println("4 - Dramaturgo(a)");
        System.out.println("5 - Figurante");
        System.out.println("6 - Figurista");
        System.out.println("7 - Iluminador(a)");
        System.out.println("8 - Ponto");
        System.out.println("9 - Produtor(a)");
        System.out.println("10 - Peça");
        System.out.println("---------------------");
        System.out.print("Insira a opção pretendida: ");
        
        opcao=teclado.nextInt();
        
        switch (opcao) {
            case 1:
                editarAtor();
                break;
            case 2:
                editarDiretor();
                break;
            case 3 :
                editarCenografo();
                break;
            case 4 :
                editarDramaturgo();
                break;
            case 5 :
                editarFigurante();
                break;
            case 6:
                editarFigurista();
                break;
            case 7 : 
                editarIluminador();
                break;
            case 8 :
                editarPonto();
                break;
            case 9 :
                editarProdutor();
                break;
            case 10 : 
                editarPeca();
                break;
            default:
                throw new AssertionError();
        }
        
    }    
    
    public static Scanner x;
    
    public static void editarAtor() throws FileNotFoundException, IOException{
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Estes são os Atores da Companhia neste momento: ");
        
        try (BufferedReader br = new BufferedReader(new FileReader("Atores.txt"))) {
               String line = null;
               while ((line = br.readLine()) != null) {
                 System.out.println(line);
                }
        }
        
        System.out.print("Introduza o nome do(a) ator/atriz que quer fazer mudanças aos dados: ");
        String chave = teclado.nextLine();
        
        System.out.print("Introduza o novo Nome: ");
        String newnome =teclado.nextLine();
        
        System.out.print("Introduza a nova Idade: ");
        String newidade =teclado.nextLine();
        
        System.out.print("Introduza a nova nacionalidade: ");
        String newnac =teclado.nextLine();
    
        System.out.print("Introduza o Genero: ");
        String newgen=teclado.nextLine();
    
        System.out.print("Introduza as Habilitações ");
        String newhab=teclado.nextLine();
    
        System.out.print("Introduza os Prémios ");
        String newprem=teclado.nextLine();
    
        System.out.print("Introduza as Participações:  ");
        String newpart =teclado.nextLine();
    
    
        String tempfile="temp.txt";
        File oldFile = new File("Atores.txt");
        File newFile = new File(tempfile);
        
        String nome="";
        String idade="";
        String nac="";
        String gen="";
        String hab="";
        String prem="";
        String part="";
        
        
        try{
            FileWriter fw = new FileWriter(tempfile, true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            x = new Scanner( new File ("Atores.txt"));
            x.useDelimiter("[|\n]");
        
            while(x.hasNext()){
                
                nome=x.next();
                idade=x.next();
                nac=x.next();
                gen=x.next();
                hab=x.next();
                prem=x.next();
                part=x.next();
                
                if(nome.equals(chave)){
                    
                    pw.println(newnome+"|"+newidade+"|"+newnac+"|"+newgen+"|"+newhab+"|"+newprem+"|"+newpart);
                }else{
                    pw.println(nome+"|"+idade+"|"+nac+"|"+newgen+"|"+hab+"|"+prem+"|"+part);
                }
            }
            
            x.close();
            pw.flush();
            pw.close();
            oldFile.delete();
            File lixo = new File ("Atores.txt");
            newFile.renameTo(lixo);
        }
        catch(Exception e){
            System.out.println("Error");
        }
    }

    public static void editarDiretor() throws FileNotFoundException, IOException {    
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Estes são os Diretores da Companhia neste momento: ");
        
        try (BufferedReader br = new BufferedReader(new FileReader("diretores.txt"))) {
               String line = null;
               while ((line = br.readLine()) != null) {
                 System.out.println(line);
                }
        }
        
        System.out.print("Introduza o nome do(a) diretor(a) que quer fazer mudanças aos dados: ");
        String chave = teclado.nextLine();
        
        System.out.print("Introduza o novo Nome: ");
        String newnome =teclado.nextLine();
        
        System.out.print("Introduza a nova Idade: ");
        String newidade =teclado.nextLine();
        
        System.out.print("Introduza a nova nacionalidade: ");
        String newnac =teclado.nextLine();
    
        System.out.print("Introduza o Genero: ");
        String newgen=teclado.nextLine();
    
        System.out.print("Introduza as Habilitações ");
        String newhab=teclado.nextLine();
    
        System.out.print("Introduza os Prémios ");
        String newprem=teclado.nextLine();
    
        System.out.print("Introduza as Participações:  ");
        String newpart =teclado.nextLine();
    
    
        String tempfile="temp.txt";
        File oldFile = new File("diretores.txt");
        File newFile = new File(tempfile);
        
        String nome="";
        String idade="";
        String nac="";
        String gen="";
        String hab="";
        String prem="";
        String part="";
        
        
        try{
            FileWriter fw = new FileWriter(tempfile, true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            x = new Scanner( new File ("diretores.txt"));
            x.useDelimiter("[|\n]");
        
            while(x.hasNext()){
                
                nome=x.next();
                idade=x.next();
                nac=x.next();
                gen=x.next();
                hab=x.next();
                prem=x.next();
                part=x.next();
                
                if(nome.equals(chave)){
                    
                    pw.println(newnome+"|"+newidade+"|"+newnac+"|"+newgen+"|"+newhab+"|"+newprem+"|"+newpart);
                }else{
                    pw.println(nome+"|"+idade+"|"+nac+"|"+gen+"|"+hab+"|"+prem+"|"+part);
                }
            }
            
            x.close();
            pw.flush();
            pw.close();
            oldFile.delete();
            File lixo = new File ("diretores.txt");
            newFile.renameTo(lixo);
        }
        catch(Exception e){
            System.out.println("Error");
        }
    }

    public static void editarCenografo() throws FileNotFoundException, IOException {

           Scanner teclado = new Scanner(System.in);
        
        System.out.println("Estes são os Cenógrafos da Companhia neste momento: ");
        
        try (BufferedReader br = new BufferedReader(new FileReader("cenografos.txt"))) {
               String line = null;
               while ((line = br.readLine()) != null) {
                 System.out.println(line);
                }
        }
        
        System.out.print("Introduza o nome do Cénografo que quer fazer mudanças aos dados: ");
        String chave = teclado.nextLine();
        
        System.out.print("Introduza o novo Nome: ");
        String newnome =teclado.nextLine();
        
        System.out.print("Introduza a nova Idade: ");
        String newidade =teclado.nextLine();
        
        System.out.print("Introduza a nova nacionalidade: ");
        String newnac =teclado.nextLine();
    
        System.out.print("Introduza o Genero: ");
        String newgen=teclado.nextLine();
    
        System.out.print("Introduza as Habilitações ");
        String newhab=teclado.nextLine();
    
        System.out.print("Introduza os Prémios ");
        String newprem=teclado.nextLine();
    
        System.out.print("Introduza as Participações:  ");
        String newpart =teclado.nextLine();
    
    
        String tempfile="temp.txt";
        File oldFile = new File("cenografos.txt");
        File newFile = new File(tempfile);
        
        String nome="";
        String idade="";
        String nac="";
        String gen="";
        String hab="";
        String prem="";
        String part="";
        
        
        try{
            FileWriter fw = new FileWriter(tempfile, true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            x = new Scanner( new File ("cenografos.txt"));
            x.useDelimiter("[|\n]");
        
            while(x.hasNext()){
                
                nome=x.next();
                idade=x.next();
                nac=x.next();
                gen=x.next();
                hab=x.next();
                prem=x.next();
                part=x.next();
                
                if(nome.equals(chave)){
                    
                    pw.println(newnome+"|"+newidade+"|"+newnac+"|"+newgen+"|"+newhab+"|"+newprem+"|"+newpart);
                }else{
                    pw.println(nome+"|"+idade+"|"+nac+"|"+gen+"|"+hab+"|"+prem+"|"+part);
                }
            }
            
            x.close();
            pw.flush();
            pw.close();
            oldFile.delete();
            File lixo = new File ("cenografos.txt");
            newFile.renameTo(lixo);
        }
        catch(Exception e){
            System.out.println("Error");
        }
    }

    public static void editarDramaturgo() throws FileNotFoundException, IOException {
        
             Scanner teclado = new Scanner(System.in);
        
        System.out.println("Estes são os Dramaturgos da Companhia neste momento: ");
        
        try (BufferedReader br = new BufferedReader(new FileReader("dramaturgos.txt"))) {
               String line = null;
               while ((line = br.readLine()) != null) {
                 System.out.println(line);
                }
        }
        
        System.out.print("Introduza o nome do Dramaturgo que quer fazer mudanças aos dados: ");
        String chave = teclado.nextLine();
        
        System.out.print("Introduza o novo Nome: ");
        String newnome =teclado.nextLine();
        
        System.out.print("Introduza a nova Idade: ");
        String newidade =teclado.nextLine();
        
        System.out.print("Introduza a nova nacionalidade: ");
        String newnac =teclado.nextLine();
    
        System.out.print("Introduza o Genero: ");
        String newgen=teclado.nextLine();
    
        System.out.print("Introduza as Habilitações ");
        String newhab=teclado.nextLine();
    
        System.out.print("Introduza os Prémios ");
        String newprem=teclado.nextLine();
    
        System.out.print("Introduza as Participações:  ");
        String newpart =teclado.nextLine();
    
    
        String tempfile="temp.txt";
        File oldFile = new File("dramaturgo.txt");
        File newFile = new File(tempfile);
        
        String nome="";
        String idade="";
        String nac="";
        String gen="";
        String hab="";
        String prem="";
        String part="";
        
        
        try{
            FileWriter fw = new FileWriter(tempfile, true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            x = new Scanner( new File ("dramaturgo.txt"));
            x.useDelimiter("[|\n]");
        
            while(x.hasNext()){
                
                nome=x.next();
                idade=x.next();
                nac=x.next();
                gen=x.next();
                hab=x.next();
                prem=x.next();
                part=x.next();
                
                if(nome.equals(chave)){
                    
                    pw.println(newnome+"|"+newidade+"|"+newnac+"|"+newgen+"|"+newhab+"|"+newprem+"|"+newpart);
                }else{
                    pw.println(nome+"|"+idade+"|"+nac+"|"+gen+"|"+hab+"|"+prem+"|"+part);
                }
            }
            
            x.close();
            pw.flush();
            pw.close();
            oldFile.delete();
            File lixo = new File ("dramaturgo.txt");
            newFile.renameTo(lixo);
        }
        catch(Exception e){
            System.out.println("Error");
        }
    }

    public static void editarFigurante() throws FileNotFoundException, IOException {
            
             Scanner teclado = new Scanner(System.in);
        
        System.out.println("Estes são os Figurantes da Companhia neste momento: ");
        
        try (BufferedReader br = new BufferedReader(new FileReader("figurantes.txt"))) {
               String line = null;
               while ((line = br.readLine()) != null) {
                 System.out.println(line);
                }
        }
        
        System.out.print("Introduza o nome do Figurante que quer fazer mudanças aos dados: ");
        String chave = teclado.nextLine();
        
        System.out.print("Introduza o novo Nome: ");
        String newnome =teclado.nextLine();
        
        System.out.print("Introduza a nova Idade: ");
        String newidade =teclado.nextLine();
        
        System.out.print("Introduza a nova nacionalidade: ");
        String newnac =teclado.nextLine();
    
        System.out.print("Introduza o Genero: ");
        String newgen=teclado.nextLine();
    
        System.out.print("Introduza as Habilitações ");
        String newhab=teclado.nextLine();
    
        System.out.print("Introduza os Prémios ");
        String newprem=teclado.nextLine();
    
        System.out.print("Introduza as Participações:  ");
        String newpart =teclado.nextLine();
    
    
        String tempfile="temp.txt";
        File oldFile = new File("figurantes.txt");
        File newFile = new File(tempfile);
        
        String nome="";
        String idade="";
        String nac="";
        String gen="";
        String hab="";
        String prem="";
        String part="";
        
        
        try{
            FileWriter fw = new FileWriter(tempfile, true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            x = new Scanner( new File ("figurantes.txt"));
            x.useDelimiter("[|\n]");
        
            while(x.hasNext()){
                
                nome=x.next();
                idade=x.next();
                nac=x.next();
                gen=x.next();
                hab=x.next();
                prem=x.next();
                part=x.next();
                
                if(nome.equals(chave)){
                    
                    pw.println(newnome+"|"+newidade+"|"+newnac+"|"+newgen+"|"+newhab+"|"+newprem+"|"+newpart);
                }else{
                    pw.println(nome+"|"+idade+"|"+nac+"|"+gen+"|"+hab+"|"+prem+"|"+part);
                }
            }
            
            x.close();
            pw.flush();
            pw.close();
            oldFile.delete();
            File lixo = new File ("figurantes.txt");
            newFile.renameTo(lixo);
        }
        catch(Exception e){
            System.out.println("Error");
        }
    
    }
    
    public static void editarFigurista() throws FileNotFoundException, IOException {
            
             Scanner teclado = new Scanner(System.in);
        
        System.out.println("Estes são os Figuristas da Companhia neste momento: ");
        
        try (BufferedReader br = new BufferedReader(new FileReader("figuristas.txt"))) {
               String line = null;
               while ((line = br.readLine()) != null) {
                 System.out.println(line);
                }
        }
        
        System.out.print("Introduza o nome do Figurista que quer fazer mudanças aos dados: ");
        String chave = teclado.nextLine();
        
        System.out.print("Introduza o novo Nome: ");
        String newnome =teclado.nextLine();
        
        System.out.print("Introduza a nova Idade: ");
        String newidade =teclado.nextLine();
        
        System.out.print("Introduza a nova nacionalidade: ");
        String newnac =teclado.nextLine();
    
        System.out.print("Introduza o Genero: ");
        String newgen=teclado.nextLine();
    
        System.out.print("Introduza as Habilitações ");
        String newhab=teclado.nextLine();
    
        System.out.print("Introduza os Prémios ");
        String newprem=teclado.nextLine();
    
        System.out.print("Introduza as Participações:  ");
        String newpart =teclado.nextLine();
    
    
        String tempfile="temp.txt";
        File oldFile = new File("figuristas.txt");
        File newFile = new File(tempfile);
        
        String nome="";
        String idade="";
        String nac="";
        String gen="";
        String hab="";
        String prem="";
        String part="";
        
        
        try{
            FileWriter fw = new FileWriter(tempfile, true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            x = new Scanner( new File ("figuristas.txt"));
            x.useDelimiter("[|\n]");
        
            while(x.hasNext()){
                
                nome=x.next();
                idade=x.next();
                nac=x.next();
                gen=x.next();
                hab=x.next();
                prem=x.next();
                part=x.next();
                
                if(nome.equals(chave)){
                    
                    pw.println(newnome+"|"+newidade+"|"+newnac+"|"+newgen+"|"+newhab+"|"+newprem+"|"+newpart);
                }else{
                    pw.println(nome+"|"+idade+"|"+nac+"|"+gen+"|"+hab+"|"+prem+"|"+part);
                }
            }
            
            x.close();
            pw.flush();
            pw.close();
            oldFile.delete();
            File lixo = new File ("figuristas.txt");
            newFile.renameTo(lixo);
        }
        catch(Exception e){
            System.out.println("Error");
        }
    
    }
    
    public static void editarIluminador() throws FileNotFoundException, IOException{
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Estes são os Iluminadores da Companhia neste momento: ");
        
        try (BufferedReader br = new BufferedReader(new FileReader("figurantes.txt"))) {
               String line = null;
               while ((line = br.readLine()) != null) {
                 System.out.println(line);
                }
        }
        
        System.out.print("Introduza o nome do Iluminador que quer fazer mudanças aos dados: ");
        String chave = teclado.nextLine();
        
        System.out.print("Introduza o novo Nome: ");
        String newnome =teclado.nextLine();
        
        System.out.print("Introduza a nova Idade: ");
        String newidade =teclado.nextLine();
        
        System.out.print("Introduza a nova nacionalidade: ");
        String newnac =teclado.nextLine();
    
        System.out.print("Introduza o Genero: ");
        String newgen=teclado.nextLine();
    
        System.out.print("Introduza as Habilitações ");
        String newhab=teclado.nextLine();
    
        System.out.print("Introduza os Prémios ");
        String newprem=teclado.nextLine();
    
        System.out.print("Introduza as Participações:  ");
        String newpart =teclado.nextLine();
    
    
        String tempfile="temp.txt";
        File oldFile = new File("iluminadores.txt");
        File newFile = new File(tempfile);
        
        String nome="";
        String idade="";
        String nac="";
        String gen="";
        String hab="";
        String prem="";
        String part="";
        
        
        try{
            FileWriter fw = new FileWriter(tempfile, true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            x = new Scanner( new File ("iluminadores.txt"));
            x.useDelimiter("[|\n]");
        
            while(x.hasNext()){
                
                nome=x.next();
                idade=x.next();
                nac=x.next();
                gen=x.next();
                hab=x.next();
                prem=x.next();
                part=x.next();
                
                if(nome.equals(chave)){
                    
                    pw.println(newnome+"|"+newidade+"|"+newnac+"|"+newgen+"|"+newhab+"|"+newprem+"|"+newpart);
                }else{
                    pw.println(nome+"|"+idade+"|"+nac+"|"+gen+"|"+hab+"|"+prem+"|"+part);
                }
            }
            
            x.close();
            pw.flush();
            pw.close();
            oldFile.delete();
            File lixo = new File ("iluminadores.txt");
            newFile.renameTo(lixo);
        }
        catch(Exception e){
            System.out.println("Error");
        
        
    }
  }

    public static void editarPonto() throws FileNotFoundException, IOException {

        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Estes são os Pontos da Companhia neste momento: ");
        
        try (BufferedReader br = new BufferedReader(new FileReader("pontos.txt"))) {
               String line = null;
               while ((line = br.readLine()) != null) {
                 System.out.println(line);
                }
        }
        
        System.out.print("Introduza o nome do Ponto que quer fazer mudanças aos dados: ");
        String chave = teclado.nextLine();
        
        System.out.print("Introduza o novo Nome: ");
        String newnome =teclado.nextLine();
        
        System.out.print("Introduza a nova Idade: ");
        String newidade =teclado.nextLine();
        
        System.out.print("Introduza a nova nacionalidade: ");
        String newnac =teclado.nextLine();
    
        System.out.print("Introduza o Genero: ");
        String newgen=teclado.nextLine();
    
        System.out.print("Introduza as Habilitações ");
        String newhab=teclado.nextLine();
    
        System.out.print("Introduza os Prémios ");
        String newprem=teclado.nextLine();
    
        System.out.print("Introduza as Participações:  ");
        String newpart =teclado.nextLine();
    
    
        String tempfile="temp.txt";
        File oldFile = new File("pontos.txt");
        File newFile = new File(tempfile);
        
        String nome="";
        String idade="";
        String nac="";
        String gen="";
        String hab="";
        String prem="";
        String part="";
        
        
        try{
            FileWriter fw = new FileWriter(tempfile, true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            x = new Scanner( new File ("pontos.txt"));
            x.useDelimiter("[|\n]");
        
            while(x.hasNext()){
                
                nome=x.next();
                idade=x.next();
                nac=x.next();
                gen=x.next();
                hab=x.next();
                prem=x.next();
                part=x.next();
                
                if(nome.equals(chave)){
                    
                    pw.println(newnome+"|"+newidade+"|"+newnac+"|"+newgen+"|"+newhab+"|"+newprem+"|"+newpart);
                }else{
                    pw.println(nome+"|"+idade+"|"+nac+"|"+gen+"|"+hab+"|"+prem+"|"+part);
                }
            }
            
            x.close();
            pw.flush();
            pw.close();
            oldFile.delete();
            File lixo = new File ("pontos.txt");
            newFile.renameTo(lixo);
        }
        catch(Exception e){
            System.out.println("Error");
        
        
    }
  }

    public static void editarProdutor() throws FileNotFoundException, IOException {

        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Estes são os Produtores da Companhia neste momento: ");
        
        try (BufferedReader br = new BufferedReader(new FileReader("produtores.txt"))) {
               String line = null;
               while ((line = br.readLine()) != null) {
                 System.out.println(line);
                }
        }
        
        System.out.print("Introduza o nome do Produtor que quer fazer mudanças aos dados: ");
        String chave = teclado.nextLine();
        
        System.out.print("Introduza o novo Nome: ");
        String newnome =teclado.nextLine();
        
        System.out.print("Introduza a nova Idade: ");
        String newidade =teclado.nextLine();
        
        System.out.print("Introduza a nova nacionalidade: ");
        String newnac =teclado.nextLine();
    
        System.out.print("Introduza o Genero: ");
        String newgen=teclado.nextLine();
    
        System.out.print("Introduza as Habilitações ");
        String newhab=teclado.nextLine();
    
        System.out.print("Introduza os Prémios ");
        String newprem=teclado.nextLine();
    
        System.out.print("Introduza as Participações:  ");
        String newpart =teclado.nextLine();
    
    
        String tempfile="temp.txt";
        File oldFile = new File("produtores.txt");
        File newFile = new File(tempfile);
        
        String nome="";
        String idade="";
        String nac="";
        String gen="";
        String hab="";
        String prem="";
        String part="";
        
        
        try{
            FileWriter fw = new FileWriter(tempfile, true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            x = new Scanner( new File ("produtores.txt"));
            x.useDelimiter("[|\n]");
        
            while(x.hasNext()){
                
                nome=x.next();
                idade=x.next();
                nac=x.next();
                gen=x.next();
                hab=x.next();
                prem=x.next();
                part=x.next();
                
                if(nome.equals(chave)){
                    
                    pw.println(newnome+"|"+newidade+"|"+newnac+"|"+newgen+"|"+newhab+"|"+newprem+"|"+newpart);
                }else{
                    pw.println(nome+"|"+idade+"|"+nac+"|"+gen+"|"+hab+"|"+prem+"|"+part);
                }
            }
            
            x.close();
            pw.flush();
            pw.close();
            oldFile.delete();
            File lixo = new File ("produtores.txt");
            newFile.renameTo(lixo);
        }
        catch(Exception e){
            System.out.println("Error");
        
        
    }
  }

    public static void editarPeca() throws FileNotFoundException, IOException {
        
         
        Scanner teclado = new Scanner (System.in); 
        System.out.println("Estes são as Peças da Companhia neste momento:");
        
        try (BufferedReader br = new BufferedReader(new FileReader("pecas.txt"))) {
               String line = null;
               while ((line = br.readLine()) != null) {
                 System.out.println(line);
                }
        }
        
        System.out.print("Introduza o nome da Peça que quer fazer mudanças aos dados: ");
        String chave = teclado.nextLine();
        
        System.out.print("Introduza o Nome: ");
        String newnome=teclado.nextLine();
        
        System.out.print("Introduza o Dia: ");
        String newdia =teclado.nextLine();
        
        System.out.print("Introduza o Mês: ");
        String newmes =teclado.nextLine();
        
        System.out.print("Introduza o Ano: ");
        String newano =teclado.nextLine();
        
        System.out.print("Introduza o Local : ");
        String newlocal=teclado.nextLine();
        
        String tempfile="temp.txt";
        File oldFile = new File("pecas.txt");
        File newFile = new File(tempfile);
        
        String dia="";
        String mes="";
        String ano="";
        String nome="";
        String local="";
       
        try{
            FileWriter fw = new FileWriter(tempfile, true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            x = new Scanner( new File ("pecas.txt"));
            x.useDelimiter("[|\n]");
        
            while(x.hasNext()){
                
                nome=x.next();
                dia=x.next();
                mes=x.next();
                ano=x.next();
                local=x.next();
            
                if(nome.equals(chave)){
                    
                    pw.println(newnome+"|"+newdia+"|"+newmes+"|"+newano+"|"+newlocal);
                }else{
                    pw.println(nome+"|"+dia+"|"+mes+"|"+ano+"|"+local);
                }
            }
            
            x.close();
            pw.flush();
            pw.close();
            oldFile.delete();
            File lixo = new File ("pecas.txt");
            newFile.renameTo(lixo);
        }
        catch(Exception e){
            System.out.println("Error");
        
    }
 }
}



    
    

