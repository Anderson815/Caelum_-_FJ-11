package br.com.anderson.interface_alarme.antiga;

import br.com.anderson.interface_alarme.principal.Alarme;

public class Radio implements Alarme{
    private float frequencia;
    private int volume;
    private boolean ligado;
    
    @Override
    public String programar(int tempo){
        return ("Foi programado para tocar a " + tempo + " minutos: Radio");
    }
    
    //Métodos principais
    public void avancarFrequencia(){
        this.setFrequencia(this.getFrequencia() + 1.2f);
    }
    
    public void voltarFrequencia(){
        if(this.getFrequencia() > 1.3) this.setFrequencia(this.getFrequencia() - 1.3f);
        else System.out.println("Não existe frequência abaixo de 1");
    }
    
    public void aumentarVolume(){
        if(this.getVolume() < 50) this.setVolume(this.getVolume() + 5);
        else System.out.println("Sua televisão não suporta volume acima de 50");
    }
    
    public void diminuirVolume(){
        if(this.getVolume() > 0) this.setVolume(this.getVolume() -5);
        else System.out.println("Não tem como o volume ser menor que 0");
    }
    
    public void ligar(){
        this.setLigado(true);
    }
    
    public void desligar(){
        this.setLigado(false);
    }
    
    public void status(){
        System.out.println("----- Status Radio -----");
        System.out.println("Ligado: " + this.isLigado());
        if(this.isLigado()){
            System.out.println("Frequência: " + this.getFrequencia());
            System.out.println("Volume: " + this.getVolume());
        }
    }
    
    // Métodos especiais
    public Radio() {
        this.frequencia = 104.5f;
        this.volume = 25;
        this.ligado = false;
    }

    public float getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(float frequencia) {
        this.frequencia = frequencia;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }    
}
