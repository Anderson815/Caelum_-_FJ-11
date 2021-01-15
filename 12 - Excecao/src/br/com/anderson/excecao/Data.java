package br.com.anderson.excecao;

import java.util.Date;

public class Data {
    //Atributos
    private int dia, mes, ano;
    
    //Métodos principais
    public String impressao(){
        return this.getDia() + "/" + this.getMes() + "/" + this.getAno();
    }
    
    //Métódos especiais
    public Data(){
        Date d = new Date();
        this.setDia(d.getDate());
        this.setMes(d.getMonth() + 1);
        this.setAno(d.getYear() + 1900);
    }

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    
    
    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    
}
