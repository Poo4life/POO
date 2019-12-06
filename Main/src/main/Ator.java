package main;

import java.util.Scanner;

public class Ator {
    String nome;
    int idade;
    String genero;
    String nacionalidade;
    String formacao;
    String premios;
    String participacoes;
    boolean ocupado;
    
    public String getNome() {
        return nome;
    
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    public String getPremios() {
        return premios;
    }

    public void setPremios(String premios) {
        this.premios = premios;
    }

    public String getParticipacoes() {
        return participacoes;
    }

    public void setParticipacoes(String participacoes) {
        this.participacoes = participacoes;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }
   
    public  void status(){
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
        } else  {
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
    public void apagar(){
        
    }
    
    public void editar(){
        
    }
    
    public void inserirator(){
        
        int idade;
        String nome,genero,nacionalidade,formacao,premios,participacoes;
        Scanner teclado = new Scanner(System.in);//Input
        
        System.out.println("Insira o Nome: ");
        nome=teclado.nextLine();
        
        setNome(nome);
       
        boolean funcionar=false;
        do{
            System.out.println("Inisira a Idade: ");
            if(teclado.hasNextInt()){
                idade=teclado.nextInt();
                funcionar=true;
                setIdade(idade);
            }else{
            System.out.println("Idade Invalida");
            }
        }while(funcionar!=true);
        
        System.out.println("Insira o Género: ");
        genero=teclado.nextLine();
        setGenero(genero);
        
        System.out.println("Insira a Nacionalidade: ");
        nacionalidade=teclado.nextLine();
        setNacionalidade(nacionalidade);
        
        System.out.println("Insira a Formação");
        formacao=teclado.nextLine();
        setFormacao(formacao);
        
        System.out.println("Insira os Prémios");
        premios=teclado.nextLine();
        setPremios(premios);
        
        System.out.println("Insira as Participações");
        participacoes=teclado.nextLine();
        setParticipacoes(participacoes);       
    }
}
