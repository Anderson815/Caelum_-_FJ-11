package br.com.caelum.contas.main;

import br.com.caelum.contas.Banco;
import br.com.caelum.contas.Conta;

//Interresante que essa é uma importação de outra aplicação
import calculadora.Calculadora;
import calculadora.Matematica;

public class Teste {
    public static void main(String[] args) {
        
        //Calculadora.main(args);
        
        br.com.caelum.contas.Data nascimento = new br.com.caelum.contas.Data(15, 6, 2000);
        Conta c = new Conta("Anderson", 1, "0001", 999999.99, nascimento);
        
        Banco b = new Banco();
        b.nome = "Bradesco";
        
        System.out.println(c.recuperaDadosParaImpressao());
        System.out.println("-----------------");
        System.out.println(b.nome);
        
        
        
    }
}
