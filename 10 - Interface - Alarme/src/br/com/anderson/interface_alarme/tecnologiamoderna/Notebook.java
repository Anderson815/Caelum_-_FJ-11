package br.com.anderson.interface_alarme.tecnologiamoderna;

public class Notebook {
    //Atributos
    private int volume;
    private int brilho;
    private boolean ligado;
    private boolean conectado;

    // Métodos Principais
    public void aumentarBrilho(){
        if(this.getBrilho() < 100) this.setBrilho(this.getBrilho() + 5);
        else System.out.println("Seu Smartphone não suporta brilho acima de 100%");
    }
    
    public void diminuirBrilho(){
        if(this.getBrilho() > 0) this.setBrilho(this.getBrilho() - 5);
        else System.out.println("Não tem como o brilho ser menor que 0%");
    }
    
    public void aumentarVolume(){
        if(this.getVolume() < 100) this.setVolume(this.getVolume() + 5);
        else System.out.println("Seu Smatphone não suporta volume acima de 100%");
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
    
    public void conectar(){
        this.setConectado(true);
    }
    
    public void desconctar(){
        this.setConectado(false);
    }
    
    public void status(){
        System.out.println("----- Status Notebook -----");
        System.out.println("Ligado: " + this.isLigado());
        if(this.isLigado()){
            System.out.println("Conectado: " + this.isConectado());
            System.out.println("Brilho: " + this.getBrilho());
            System.out.println("Volume: " + this.getVolume());
        }
    }
    
    //Métodos especiais
    
    public Notebook() {
        this.ligado = false;
        this.conectado = false;
        this.volume = 100;
        this.brilho = 100;
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

    public int getBrilho() {
        return brilho;
    }

    public void setBrilho(int brilho) {
        this.brilho = brilho;
    }

    public boolean isConectado() {
        return conectado;
    }

    public void setConectado(boolean conectado) {
        this.conectado = conectado;
    }
        
}
