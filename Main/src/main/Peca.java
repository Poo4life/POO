package main;
public class Peca {
    String nome;
    int dia;
    String mes;
    int ano;
    String local;
    
    void status(){
        System.out.println("Peça: " + this.nome);
        System.out.println("Data da apresentação: " + this.dia + this.mes + this.ano);
        System.out.println("Local: " + this.local);
        System.out.println("Elenco: " );
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }
    
}
    
 

