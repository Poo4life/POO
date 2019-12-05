package Teatro;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Inserir {

    static void inserirAtor(){    
    Scanner teclado = new Scanner (System.in);    
    String insert;
    int idade;
    String nd = "Não definido";
    Ator ator = new Ator(); 
    
        System.out.println("Qual o nome?"); //Inserir nome do ator
        insert = teclado.nextLine();       
        ator.setNome(insert);               
                
        System.out.println("Qual a idade?"); //Inserir idade do ator
        idade = teclado.nextInt();
        ator.setIdade(idade);
        
        teclado.nextLine(); //Linha necesária para limpar o nextInt, senão salta o próximo nextLine
                    
        System.out.println("Qual a nacionalidade?"); //Inserir nacionalidade
        insert = teclado.nextLine();
        ator.setNacionalidade(insert);
                
        System.out.println("Qual o género?"); //Inserir género
        insert = teclado.nextLine();
        ator.setGenero(insert);
                
        System.out.println("Qual a sua formação (Aperte enter para não definir)?"); //Inserir formacao
        insert = teclado.nextLine();
        
        if (insert.equals(null) || insert.equals("")){ //Caso não seja definido, a string torna-se "Não definido"
            ator.setFormacao(nd);
        }else{
            ator.setFormacao(insert); //Senão ficará o input
        }
                
        System.out.println("Quais os seus prémios (Aperte enter para não definir)?");
        insert = teclado.nextLine();
                
        if (insert.equals(null) || insert.equals("")){ //Caso não seja definido, a string torna-se "Não definido"
            ator.setPremios(nd);
        }else{
            ator.setPremios(insert); //Senão ficará o input
        }
                
                
        System.out.println("Quais as suas participações? (Aperte enter para não definir)?");
        insert = teclado.nextLine();
                
        if (insert.equals(null) || insert.equals("")){ //Caso não seja definido, a string torna-se "Não definido"
            ator.setParticipacoes("Não definido");
        }else{
            ator.setParticipacoes(insert); //Senão ficará o input
        }
        
        System.out.println("Este é o ator final:");
        ator.status(); //Print do ator final
                
    }

    static void menu() { //Menu inserir
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
    
}
