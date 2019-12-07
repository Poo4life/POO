
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
        System.out.println("6 - Iluminador(a)");
        /*System.out.println("7 - Ponto");
        System.out.println("8 - Produtor(a)");
        System.out.println("9 - Peça");*/
        System.out.println("---------------------");
        System.out.println("Insira a opção pretendida.");
        
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
            case 5 :
                editarFigurante();
            default:
                throw new AssertionError();
        }
        
    }    
    
    private static Scanner x;
    
    public static void editarAtor() throws FileNotFoundException, IOException{
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Estes são os Atores da Companhia neste momento: ");
        
        try (BufferedReader br = new BufferedReader(new FileReader("Atores.txt"))) {
               String line = null;
               while ((line = br.readLine()) != null) {
                 System.out.println(line);
                }
        }
        
        System.out.println("Introduza o nome do(a) ator/atriz que quer fazer mudanças aos dados: ");
        String chave = teclado.nextLine();
        
        System.out.println("Introduza o novo Nome: ");
        String newnome =teclado.nextLine();
        
        System.out.println("Introduza a nova Idade: ");
        String newidade =teclado.nextLine();
        
        System.out.println("Introduza a nova nacionalidade: ");
        String newnac =teclado.nextLine();
    
        System.out.println("Introduza o Genero: ");
        String newgen=teclado.nextLine();
    
        System.out.println("Introduza as Habilitações ");
        String newhab=teclado.nextLine();
    
        System.out.println("Introduza os Prémios ");
        String newprem=teclado.nextLine();
    
        System.out.println("Introduza as Participações:  ");
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

    private static void editarDiretor() throws FileNotFoundException, IOException {    
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Estes são os Diretores da Companhia neste momento: ");
        
        try (BufferedReader br = new BufferedReader(new FileReader("diretores.txt"))) {
               String line = null;
               while ((line = br.readLine()) != null) {
                 System.out.println(line);
                }
        }
        
        System.out.println("Introduza o nome do(a) diretor(a) que quer fazer mudanças aos dados: ");
        String chave = teclado.nextLine();
        
        System.out.println("Introduza o novo Nome: ");
        String newnome =teclado.nextLine();
        
        System.out.println("Introduza a nova Idade: ");
        String newidade =teclado.nextLine();
        
        System.out.println("Introduza a nova nacionalidade: ");
        String newnac =teclado.nextLine();
    
        System.out.println("Introduza o Genero: ");
        String newgen=teclado.nextLine();
    
        System.out.println("Introduza as Habilitações ");
        String newhab=teclado.nextLine();
    
        System.out.println("Introduza os Prémios ");
        String newprem=teclado.nextLine();
    
        System.out.println("Introduza as Participações:  ");
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

    private static void editarCenografo() throws FileNotFoundException, IOException {

           Scanner teclado = new Scanner(System.in);
        
        System.out.println("Estes são os Cenógrafos da Companhia neste momento: ");
        
        try (BufferedReader br = new BufferedReader(new FileReader("cenografos.txt"))) {
               String line = null;
               while ((line = br.readLine()) != null) {
                 System.out.println(line);
                }
        }
        
        System.out.println("Introduza o nome do Cénografo que quer fazer mudanças aos dados: ");
        String chave = teclado.nextLine();
        
        System.out.println("Introduza o novo Nome: ");
        String newnome =teclado.nextLine();
        
        System.out.println("Introduza a nova Idade: ");
        String newidade =teclado.nextLine();
        
        System.out.println("Introduza a nova nacionalidade: ");
        String newnac =teclado.nextLine();
    
        System.out.println("Introduza o Genero: ");
        String newgen=teclado.nextLine();
    
        System.out.println("Introduza as Habilitações ");
        String newhab=teclado.nextLine();
    
        System.out.println("Introduza os Prémios ");
        String newprem=teclado.nextLine();
    
        System.out.println("Introduza as Participações:  ");
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

    private static void editarDramaturgo() throws FileNotFoundException, IOException {
        
             Scanner teclado = new Scanner(System.in);
        
        System.out.println("Estes são os Dramaturgos da Companhia neste momento: ");
        
        try (BufferedReader br = new BufferedReader(new FileReader("dramaturgos.txt"))) {
               String line = null;
               while ((line = br.readLine()) != null) {
                 System.out.println(line);
                }
        }
        
        System.out.println("Introduza o nome do Dramaturgo que quer fazer mudanças aos dados: ");
        String chave = teclado.nextLine();
        
        System.out.println("Introduza o novo Nome: ");
        String newnome =teclado.nextLine();
        
        System.out.println("Introduza a nova Idade: ");
        String newidade =teclado.nextLine();
        
        System.out.println("Introduza a nova nacionalidade: ");
        String newnac =teclado.nextLine();
    
        System.out.println("Introduza o Genero: ");
        String newgen=teclado.nextLine();
    
        System.out.println("Introduza as Habilitações ");
        String newhab=teclado.nextLine();
    
        System.out.println("Introduza os Prémios ");
        String newprem=teclado.nextLine();
    
        System.out.println("Introduza as Participações:  ");
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

    private static void editarFigurante() throws FileNotFoundException, IOException {
            
             Scanner teclado = new Scanner(System.in);
        
        System.out.println("Estes são os Figurantes da Companhia neste momento: ");
        
        try (BufferedReader br = new BufferedReader(new FileReader("figurantes.txt"))) {
               String line = null;
               while ((line = br.readLine()) != null) {
                 System.out.println(line);
                }
        }
        
        System.out.println("Introduza o nome do Figurante que quer fazer mudanças aos dados: ");
        String chave = teclado.nextLine();
        
        System.out.println("Introduza o novo Nome: ");
        String newnome =teclado.nextLine();
        
        System.out.println("Introduza a nova Idade: ");
        String newidade =teclado.nextLine();
        
        System.out.println("Introduza a nova nacionalidade: ");
        String newnac =teclado.nextLine();
    
        System.out.println("Introduza o Genero: ");
        String newgen=teclado.nextLine();
    
        System.out.println("Introduza as Habilitações ");
        String newhab=teclado.nextLine();
    
        System.out.println("Introduza os Prémios ");
        String newprem=teclado.nextLine();
    
        System.out.println("Introduza as Participações:  ");
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
    
    public static void editarIlumininador() throws FileNotFoundException, IOException{
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Estes são os Iluminador da Companhia neste momento: ");
        
        try (BufferedReader br = new BufferedReader(new FileReader("figurantes.txt"))) {
               String line = null;
               while ((line = br.readLine()) != null) {
                 System.out.println(line);
                }
        }
        
        System.out.println("Introduza o nome do Iliminador que quer fazer mudanças aos dados: ");
        String chave = teclado.nextLine();
        
        System.out.println("Introduza o novo Nome: ");
        String newnome =teclado.nextLine();
        
        System.out.println("Introduza a nova Idade: ");
        String newidade =teclado.nextLine();
        
        System.out.println("Introduza a nova nacionalidade: ");
        String newnac =teclado.nextLine();
    
        System.out.println("Introduza o Genero: ");
        String newgen=teclado.nextLine();
    
        System.out.println("Introduza as Habilitações ");
        String newhab=teclado.nextLine();
    
        System.out.println("Introduza os Prémios ");
        String newprem=teclado.nextLine();
    
        System.out.println("Introduza as Participações:  ");
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
}


    
    

