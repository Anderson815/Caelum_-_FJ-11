package com.anderson.colletion.banco;

import java.util.List;
import java.util.ArrayList;
import com.anderson.colletion.banco.funcionarios.Pessoa;
import com.anderson.colletion.banco.funcionarios.SistemaInterno;

public class principal {
    public static void main(String[] args) {
        List<Pessoa> lista = new ArrayList();
        SistemaInterno si = new SistemaInterno();

        Pessoa p1 = new Pessoa("Anderson", 58.8f);
        Pessoa p2 = new Pessoa("Bruna", 55.5f);
        Pessoa p3 = new Pessoa("Carlos", 75.3f);
        
        lista.add(p1);
        lista.add(p2);
        lista.add(p3);

        for(int contador = 0; contador < lista.size(); contador++){
            System.out.println("--------Pessoa------");
            System.out.println("Nome: " + lista.get(contador).getNome());
            System.out.println("Peso: " + lista.get(contador).getPeso());
        }
        
        si.deletar(lista);
        
        for(int contador = 0; contador < lista.size(); contador++){
            System.out.println("--------Pessoa------");
            System.out.println("Nome: " + lista.get(contador).getNome());
            System.out.println("Peso: " + lista.get(contador).getPeso());
        }
    }    
}
