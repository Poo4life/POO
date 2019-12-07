package main;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Cenografo {
    
   String nome;
    int idade;
    String genero;
    String nacionalidade;
    String formacao;
    String premios;
    String participacoes;
    boolean ocupado = false;

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
   
    
    void status(){
        System.out.println("Cenógrafo: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Género: " + this.genero);
        System.out.println("Nacionalidade: " + this.nacionalidade);
        System.out.println("Formação: " + this.formacao);
        System.out.println("Prémios: " + this.premios);
        System.out.println("Participações: " + this.participacoes);
        
        if (this.ocupado == true){
            System.out.println(this.nome + " encontra-se ocupado(a).");
        }else{
            System.out.println(this.nome + " encontra-se desocupado(a).");
        }
    }
    
    void designar(){
        if (this.ocupado == true){
            System.out.println("O Cenógrafo já está designado para outra peça.");
        } else{
            System.out.println("Para que peça quer designar o(a) Cenógrafo?");
            
            //Listar peças e abrir input
            System.out.println("Cenógrafo " + this.nome + " foi designado para a peça " /*+ peça*/);
        }   
    }
    
    void desocupar(){
        if (this.ocupado == false){
            System.out.println("O Cenógrafo já se encontra desocupado.");
        }else{
            System.out.println("Cenógrafo desocupado.");
            this.ocupado = false;
        }
    }
   
    
    
   
}
