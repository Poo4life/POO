package cursopoo;
public class Ator {
    String nome;
    int idade;
    String genero;
    String nacionalidade;
    String formacao;
    String premios;
    String participacoes;
    boolean ocupado;
    
    void status(){
        System.out.println("Ator/Atriz: " + this.nome);
        if (this.ocupado == true){
            System.out.println(this.nome + " encontra-se ocupado(a).");
        }else{
            System.out.println(this.nome + " encontra-se desocupado(a).");
        }
    }
    
    void designar(){
        if (this.ocupado == true){
            System.out.println("O ator já está designado para outra peça.");
        } else {
            System.out.println("Para que peça quer designar o(a) ator/atriz?");
            //Listar peças e abrir input
            System.out.println("Ator " + this.nome + " foi designado para a peça " /*+ peça*/);
        }   
    }
    
    void desocupar(){
        if (this.ocupado == false){
            System.out.println("O ator/atriz já se encontra desocupado.");
        }else{
            System.out.println("Ator desocupado.");
            this.ocupado = false;
        }
    }
}
