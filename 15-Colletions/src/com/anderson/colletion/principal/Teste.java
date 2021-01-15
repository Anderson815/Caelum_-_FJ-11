package com.anderson.colletion.principal;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

import java.util.Set;
import java.util.HashSet;

import java.util.Map;
import java.util.HashMap;

/**
 *
 * @author ander
 */
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {               
        System.out.println("========================= LISTAS =========================");
        int[] teste_int = new int[4];
        
        teste_int[0] = 10;
        teste_int[1] = 20;
        teste_int[2] = 30;
        teste_int[3] = 40;
        
        float[] teste_float = new float[4];
        
        teste_float[0] = 1.5f;
        teste_float[1] = 3f;
        teste_float[2] = 4.5f;
        teste_float[3] = 6.59f;
        
        boolean[] teste_boolean = new boolean[4];
        
        teste_boolean[0] = true; 
        teste_boolean[1] = false;
        teste_boolean[2] = true;
        teste_boolean[3] = false;
        
        String[] teste_String = new String[4];
        
        teste_String[0] = "aaa";
        teste_String[1] = "bbb";
        teste_String[2] = "ccc";
        teste_String[3] = "ddd"; 
        
        //Teste
        Object[] teste_Object = new Object[4];
        
        teste_Object[0] = 1;
        teste_Object[1] = 89.8f;
        teste_Object[2] = false;
        teste_Object[3] = "Anderson";
        
        System.out.println("Tamanho do objeto Array do tipo Object (ANTES de excluir o conteúdo do Indice 2): " + teste_Object.length);
        for(int contador  = 0; contador < teste_Object.length; contador++){
            System.out.println("    Indice " + contador + ": " + teste_Object[contador]);
        }
        
        teste_Object[2] = null;
        
        System.out.println("\nTamanho do objeto Array dot tipo Object (DEPOIS de excluir o conteúdo do Indice 2): " + teste_Object.length);
        for(int contador  = 0; contador < teste_Object.length; contador++){
            System.out.println("    Indice " + contador + ": " + teste_Object[contador]);
        }        
        
        
        
        System.out.println("\n=================================================");
        
        List v = new ArrayList();
        v.add(1);
        v.add(89.8f);
        v.add(false);
        v.add("Anderson");
        
        System.out.println("Tamanho do ArrayList (ANTES de excluir o conteúdo 2): " + v.size());
        for(int contador = 0; contador < v.size(); contador++){
            System.out.println("    Indice " + contador + ": " + v.get(contador));
        }
        
        v.remove(2);

        System.out.println("\nTamanho do ArrayList (DEPOIS de excluir o conteúdo do Indice 2): " + v.size());
        for(int contador = 0; contador < v.size(); contador++){
            System.out.println("    Indice " + contador + ": " + v.get(contador));
        }
        
        v.set(2, "Bruna");

        System.out.println("\nTamanho do ArrayList (DEPOIS de alterar o conteúdo do Indice 2): " + v.size());
        for(int contador = 0; contador < v.size(); contador++){
            System.out.println("    Indice " + contador + ": " + v.get(contador));
        }
        
        System.out.println("\n=================================================");
        
        String s = new String("Sorocaba");
        Integer i = new Integer(1);
        Float f = new Float(18.89f);
        Boolean b = new Boolean(false);
        Pessoa p = new Pessoa("Anderson", 1.68f, 58f, true, 20);
              
        List<Pessoa> al = new ArrayList<>();
        
        al.add(p);
        
        System.out.println("Tamanho do List AL: " + al.size());
        for(int contador = 0; contador < al.size(); contador++){            
            if(al.get(contador) instanceof Pessoa){
                Pessoa pe = (Pessoa) al.get(contador);
                System.out.println(pe.toString());
                pe.setNome("Bruno");
                System.out.println(pe.toString());
            }else System.out.println("NÃO É UMA PESSOA");
        }
        
        System.out.println("========================================================");
        System.out.println("Método sort da classe Colletion para tipos 'primitivos'\n");
        List<String> al_1 = new ArrayList();
        
        al_1.add("Belmiro");
        al_1.add("Maria Eunice");
        al_1.add("Ederson");
        al_1.add("Edineia");
        al_1.add("Anderson");
        
        System.out.print("List AL_1 ANTES de usar o sort da classe Collections: ");
        System.out.println(al_1);
        
        System.out.println("O menor valor é " + Collections.min(al_1));
        System.out.println("O maior valor é " + Collections.max(al_1));
        System.out.println("Posição 4: " + al_1.get(4)); 
        
        //O SORT ordena de forma crescente
        //Repare que o sort ele MUDA as posições reais dos componentes do LIST
        Collections.sort(al_1);
        
        System.out.print("\nList AL_1 DEPOIS de usar o sort da classe Collections: ");
        System.out.println(al_1);
        
        System.out.println("posição 4: " + al_1.get(4));
        
        Collections.reverse(al_1);
        System.out.println("Depois de usar o método reverse: " + al_1);
        
        System.out.println("\n========================================================");
        System.out.println("Método sort da classe Colletion para novos objetos criados\n");
        
        List<Pessoa> al_2 = new ArrayList<>();
        Pessoa p1 = new Pessoa("João", 1.75f, 85.5f, true, 19);
        Pessoa p2 = new Pessoa("Fernanda", 1.65f, 65.7f, false, 16);
        Pessoa p3 = new Pessoa("Marcos", 1.77f, 82.3f, true, 21);
        
        al_2.add(p1);
        al_2.add(p2);
        al_2.add(p3);
        
        System.out.println("List AL_2 ANTES de usar o sort da classe Collections: ");
        System.out.println(al_2);
        
        System.out.println("\nO menor valor é: \n" + Collections.min(al_2));
        System.out.println("\nO maior valor é: \n" + Collections.max(al_2));
        
        
        System.out.println("\nPosição 2: \n" + al_2.get(2));
        
        //al_2.
        
        // A comparação aqui é feita através do método compareTo da interface Comparable que está sendo implementada na classe Pessoa
        Collections.sort(al_2);
        
        System.out.println("\nList AL_2 DEPOIS de usar o sort da classe Collections: ");
        System.out.println(al_2);  
        
        System.out.println("\nPosição 2: \n" + al_2.get(2));
        Collections.reverse(al_2);
        System.out.println("\nDepois de usar o método reverse: \n" + al_2);
        
        System.out.println("\n========================= SETS =========================");
        System.out.println("AQUI ESTOU USANDO A INTERFACE SET QUE SERVE PARA NÃO DUPLICAR COMPONENTES");
        
        Set<String> set = new HashSet<>();
        
        System.out.println("\nAqui eu coloquei os componentes de modo unico");
        
        set.add("Anderson");
        set.add("Matheus");
        set.add("Igor");
        set.add("Rafael");
        
        System.out.println(set.toString());//Repare que não é guardo na ordem de inserção dos objetos
        
        System.out.println("\nTentei duplicar os componentes Anderson e Rafael");
        
        set.add("Anderson"); // A interface set não permite que os elementos sjam duplicados
        set.add("Rafael"); // A interface set não permite que os elemntos sejam duplicados
        
        System.out.println(set.toString());
        
        System.out.println("\nPercorrendo o SET");
        
        //O SET, diferente do LIST, ele não usa indices, por isso é utilizado for-each
        for(String nome: set){
            System.out.println(nome);
        }
        
        System.out.println("\n========================= MAPAS =========================");
        
        String azul = "azul";
        String vermelho = "vermelho";
        String verde = "verde";
        String branco = "branco";
        String preto = "preto";
        
        List<String> cor = new ArrayList<>();
        List<String> ncor = new ArrayList<>();
        
        cor.add(azul);
        cor.add(vermelho);
        cor.add(verde);
        
        ncor.add(branco);
        ncor.add(preto);
        
        // o primeiro tipo do generics é o key e o segundo é o value ou seja chave e valor
        Map<String , List<String>> visao = new HashMap<>();
        
        
        // o key serve como um "index" para aponta para o objeto valor, essa key tem que ser pensada como critério ou palavra-chave
        // um key é associada a apenas uma referência criando uma espécie de Array [K]visao = V
        // você pode criar um array, um list ou, até mesmo, um set, para associar um indice a uma coleção
        
                //key(indice), value(conteudo)
        visao.put("colorido", cor); //no interface Map visao (que utiliza a implementação HashMap), está ocorrendo uma associação em que key "colorido" vira o indice que aponta para a list cor
        visao.put("ncolorido", ncor);
        
        Pessoa pessoa = new Pessoa("AAA", 1.70f, 58.5f, true, 26);
        String t = "t";
        visao.put(t, pessoa);
        
        //String cor =  visao.get("colorido");
        //String ncor = visao.get("ncolorido");
        
        System.out.println("\nAs cores são: " + visao.get("colorido"));//sMap.get(k) é o mestmo que List.get(int i), porém utilizando o key gerado
        System.out.println("Os que não tem cor são: ");
        
        
    }
}
