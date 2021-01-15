package br.com.caelum.contas;
public class Conta {
    //Atributos
    
    private String titular;
    private int numero;
    private String agencia;
    private double saldo;
    private Data data;
    
    //Métodos Principais
    
    public void saca(double valor){
        this.setSaldo(this.getSaldo() - valor);
    }
    
    public void deposita(double valor){
        this.setSaldo(this.getSaldo() + valor);
    }
    
    public double rendimentoMensal(){
        return this.getSaldo() * 0.1;
    }
    
    public String recuperaDadosParaImpressao(){
        String dados = "";
        dados = "Titular: " + this.getTitular();
        dados += "\nNúmero: " + this.getNumero();
        dados += "\nAgência: " + this.getAgencia();
        dados += "\nSaldo: " + this.getSaldo();
        dados += "\nCriação da conta: " + this.data.impressao();
        return dados;
    }
    //Métodos essenciais
    public Conta(){
    }
    
    public Conta(String titular){
        this.titular = titular;
    }
    
    public Conta(String titular, int numero, String agencia, double saldo, Data data) {
        this.titular = titular;
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = saldo;
        this.data = data;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if(saldo < 0)System.out.println("!!!Operção não realizada!!!");
        else this.saldo = saldo;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }
    
}
