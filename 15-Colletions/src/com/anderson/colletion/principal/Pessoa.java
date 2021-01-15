package com.anderson.colletion.principal;

import java.util.GregorianCalendar;

/**
 *
 * @author ander
 */
public class Pessoa implements Comparable<Pessoa>{
    private String nome;
    private float altura;
    private float peso;
    private boolean maior_idade;
    private int idade;
    
    public Pessoa(String n, float a, float p, boolean mi, int i){
        this.nome = n;
        this.altura = a;
        this.peso = p;
        this.maior_idade = mi;
        this.idade = i;
    }
    
    
    @Override
    public String toString(){
        String r = "-----PESSOA-----\nNome: " + this.nome + "\nAltura: " + this.altura + "\nPeso: " + this.peso + "\nIdade: " + this.idade + "\nMaior de Idade: " + this.maior_idade + "\n----------------";
        return r;
    }
    
    public void setNome(String n){
        this.nome = n;
    }
    
    @Override
    public int compareTo(Pessoa outra){
        if(this.peso < outra.peso){
            return -1;
        }
        
        if(this.peso > outra.peso){
            return 1;
        }
        
        return 0;
    }
}
