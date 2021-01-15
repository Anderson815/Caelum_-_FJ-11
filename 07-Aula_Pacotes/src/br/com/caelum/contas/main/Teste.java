package br.com.caelum.contas.main;

//Para poder referenciar o banco diretamente
//Sem o Fully Qualified Name
import br.com.caelum.contas.Banco;

public class Teste {
    public static void main(String[] args) {
        
        //Repare que como eu não usei o import
        //precisei usar o Fully Qualified Name
        // Isto é o nome verdadeiro da classe
        //o caminho de pacotes (pacote1.pacote2...) mais o nome da classe
        
        /*
        br.com.caelum.contas.Data d = new br.com.caelum.contas.Data(20, 4, 2020);
        br.com.caelum.contas.Conta c1 = new br.com.caelum.contas.Conta("Hugo", 123, "45678-9", 50.0, d);
        
        c1.deposita(100.0);
        System.out.println("Saldo Atual: " + c1.getSaldo());
        System.out.println("Rendimento mensal: " + c1.rendimentoMensal());
        
        c1.saca(125.0);
        System.out.println("Saldo Atual: " + c1.getSaldo());
        System.out.println("Rendimento mensal: " + c1.rendimentoMensal());
        
        c1.saca(30.0);
        System.out.println("Saldo Atual: " + c1.getSaldo());
        System.out.println("Rendimento mensal: " + c1.rendimentoMensal());
        
        System.out.println(c1.recuperaDadosParaImpressao());
        
        br.com.caelum.contas.Conta c2 = new br.com.caelum.contas.Conta("Hugo", 123, "45678-9", 50.0, d);
        
        c2 = c1;
        if(c1 == c2)System.out.println("Mesmo objeto");
        else System.out.println("Objetos diferentes");
        
        if(c1.getTitular().equals(c2.getTitular())) System.out.println("Mesmo titular");
        else System.out.println("Titulares diferentes");
        
        System.out.println("===================");
       
        
        br.com.caelum.contas.Banco b = new br.com.caelum.contas.Banco();
        b.nome = "bradesco";
        */
        
        // Neste caso eu usei o import
        // logo não preciso usar o Fully Qualified Name
        /*
        Banco b = new Banco();
        b.nome = "Bradesco";
        
        System.out.println(b.nome);
        */
    }
}
