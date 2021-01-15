package br.com.anderson.interface_alarme.tecnologiamoderna;

public class Televisao {
    // Atributos
    private int canal;
    private int volume;
    private boolean ligado;
    
    //Métodos principais
    public void avancarCanal(){
        if(this.getCanal() < 30) this.setCanal(this.getCanal() + 1);
        else System.out.println("Sua televisão não suporta mais de 30 canais");
    }
    
    public void voltarCanal(){
        if(this.getCanal() > 1) this.setCanal(this.getCanal() - 1);
        else System.out.println("Não existe canais abaixo de 1");
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
        System.out.println("----- Status TV -----");
        System.out.println("Ligado: " + this.isLigado());
        if(this.isLigado()){
            System.out.println("Canal: " + this.getCanal());
            System.out.println("Volume: " + this.getVolume());
        }
    }
    
    // Métodos especiais
    public Televisao() {
        this.canal = 15;
        this.volume = 25;
        this.ligado = false;
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
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
