package br.com.anderson.excecao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class TesteErro {
    
    public static void main(String[] args){
        Object[][] obj = new Object[8][5];
        System.out.println("Quantidade de linhas " + obj.length);
        System.out.println("Quantidade de colunas " + obj[0].length);
        
        obj[0][0] = "a";
        obj[0][1] = "b";
        obj[0][2] = "c";
        obj[0][3] = "d";
        obj[0][4] = "e";
        
        obj[1][0] = "F";
        obj[1][1] = "G";
        obj[1][2] = "H";
        obj[1][3] = "I";
        obj[1][4] = "J";        
        
        obj[2][0] = "k";
        obj[2][1] = "l";
        obj[2][2] = "m";
        obj[2][3] = "n";
        obj[2][4] = "o";
        
        Object[][] matriz = obj;
        
        System.out.println("TESTE");
        for(Object conteudo: obj[0]){
            System.out.println(conteudo);
        }
        // conteudo real
        try{
            Conta c = new Conta();
            c.setSaldo(100);
            c.saca(300.00f);
        }catch(NullPointerException e){
            System.out.println("Deu pau");
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
    
    /*
    public static void main(String[] args){
        int n = 0;
        Scanner leitor = new Scanner(System.in);
        
        try{
            System.out.println("Digite um valor inteiro");
            n = leitor.nextInt();

            testeTipo(n);
        }catch(java.util.InputMismatchException a){
            System.out.println("você não digitou um valor inteiro");
            System.out.println("Erro: " + a.getMessage());
            System.out.println("Descrição do Erro: ");
            a.printStackTrace();
        }
        
        System.out.println("Fim do programa");
    }
    
    static void testeTipo(int n){
        n *= 2;
        System.out.println("O dobro do valor é " + n);
    }
    */
    
    /*
    public static void main(String[] args){
        System.out.println("Digite um número decimal: ");
        try{
            double n = lerNumero();
        }catch(Exception e){
            
        }
        System.out.println("O valor que você digitou foi " + n);
    }
    
    static double lerNumero() throws Exception{
        Scanner leitor = new Scanner(System.in);
        double numero = leitor.nextDouble();
        return numero;
    }
    */
    
    /*
    public static void main(String[] args) {
        System.out.println("Início do Main");
        try{
            TesteErro.metodo1();
        }catch(NullPointerException ex){
            System.out.println("Erro: " + ex.toString());
        }
        System.out.println("Fim do Main");
    }
    
    static void metodo1(){
        System.out.println("Início do Método1");
        TesteErro.metodo2();
        System.out.println("Fim do Método1");
    }
    
    static void metodo2(){
        System.out.println("Inicio do Método2");
        Conta conta = new Conta();
        
        for(int i = 0; i <= 15; i++){
            conta.deposita(i + 1000);
            System.out.println(conta.getSaldo());
            if(i == 5) conta = null;
        }
        System.out.println("Fim do Método2");
    }
    */
    
    /* Segundo caso
    public static void main(String[] args) {
        try{
            int i = 987654321;
            i /= 0;
            System.out.println("Isso não será impresso");
        }catch(ArithmeticException a){
            System.out.println("Não podemo dividir o número por zero, pois da esse erro: " + a);
        }
    }
    */
    
    /* Terceiro caso
    public static void main(String[] args){
        try{
            metodo();
        }catch(java.io.FileNotFoundException v){
            System.out.println("Arquivo não encontrado");
        }
    }
    
    static void metodo() throws java.io.FileNotFoundException{
        System.out.println("Inicio METODO");
        metodo2();
    }
    
    static void metodo2() throws java.io.FileNotFoundException{
        new java.io.FileInputStream("arquivo.txt");
    }
    */
}
