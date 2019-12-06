package Teatro;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Remover {
    static void removerAtor() throws IOException{
        Scanner teclado = new Scanner (System.in);
        
        //Teste se o ficheiro existe
        File inputFile = new File("infos.txt");
        if (!inputFile.isFile()){
            System.out.println("Não existem atores criados.");
        }
        
        //Criação dum ficheiro temporário
        File tempFile = new File(inputFile.getAbsolutePath() + ".tmp");
        BufferedReader br = new BufferedReader(new FileReader("infos.txt"));
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
}
