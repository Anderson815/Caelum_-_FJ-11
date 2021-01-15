package com.anderson.colletion.banco.funcionarios;
public class Pessoa {
    private String nome;
    private float peso;
    
    public Pessoa(String n, float p){
        this.nome = n;
        this.peso = p;
    }
    
    private void status(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Peso: " + this.peso);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

}
