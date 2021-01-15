package com.anderson.colletion.banco.funcionarios;

import java.util.List;
import java.util.Scanner;

public class SistemaInterno {
    public void deletar(List<Pessoa> l){
        Scanner leitor = new Scanner(System.in);
        int cod = 0;
        
        System.out.println("delete um registro: ");
        cod = leitor.nextInt();
        
        l.remove(cod);
    }
}
