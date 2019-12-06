
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
        
        switch (opcao) {
            case 1:
                editarAtor();
                break;
            default:
                throw new AssertionError();
        }
        
    }    
    
    private static Scanner x;
    
    public static void editarAtor() throws FileNotFoundException, IOException{
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Estes são os Atores da Companhia neste momento: ");
        
        try (BufferedReader br = new BufferedReader(new FileReader("infos.txt"))) {
               String line = null;
               while ((line = br.readLine()) != null) {
                 System.out.println(line);
                }
        }
        
        System.out.println("Introduza o nome do Ator que quer fazer mudanças aos dados: ");
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
        File oldFile = new File("infos.txt");
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
            x = new Scanner( new File ("infos.txt"));
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
                    
                    pw.println(newnome+"|"+newidade+"|"+newnac+"|"+newhab+"|"+newprem+"|"+newpart);
                }else{
                    pw.println(nome+"|"+idade+"|"+nac+"|"+hab+"|"+prem+"|"+part);
                }
            }
            
            x.close();
            pw.flush();
            pw.close();
            oldFile.delete();
            File lixo = new File ("infos.txt");
            newFile.renameTo(lixo);
        }
        catch(Exception e){
            System.out.println("Error");
        }
    }
    
}
