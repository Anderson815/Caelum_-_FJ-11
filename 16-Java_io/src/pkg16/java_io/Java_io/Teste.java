package pkg16.java_io.Java_io;

import java.io.InputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;

import java.io.OutputStream;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.BufferedWriter;

import java.io.IOException;

import java.util.Scanner;
import java.io.PrintStream;
import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;

import java.io.File;

public class Teste {
    public static void main(String[] args) {        
        try{
            //Lendo um arquivo de texto
            InputStream is = new FileInputStream("C:\\Users\\ander\\OneDrive\\Área de Trabalho\\teste.txt"); // lê o arquivo devolvendo byte no método read
            InputStreamReader isr = new InputStreamReader(is); // trasforma o byte em unico de acordo com o encoding utilizado
            BufferedReader br = new BufferedReader(isr); // o char com base no unicode vira String através do método readLine
                        
            //encodings são as tabela de caracteres, um exemplo é o UTF-8
            
            String texto = br.readLine();

            while(texto != null){
                System.out.println(texto);
                texto = br.readLine();
            }
            
            br.close();
            
            //teste de ecoding para   o mandarim usando o mesmo arquivo acima
            
            System.out.println("");
            
            InputStream is_teste_e = new FileInputStream("C:\\Users\\ander\\OneDrive\\Área de Trabalho\\teste.txt");
            InputStreamReader isr_teste_e = new InputStreamReader(is_teste_e, "utf-16");
            BufferedReader br_teste_e = new BufferedReader(isr_teste_e); 
            String teste_texto = br_teste_e.readLine();
            
            while(teste_texto != null){
                System.out.println(teste_texto);
                teste_texto = br_teste_e.readLine();
            }
            
            br_teste_e.close();
            
            // teste da leitura diretamente do teclado
            
            /*
            InputStream is_teclado = System.in;
            InputStreamReader isr_teclado = new InputStreamReader(is_teclado, "utf-8");
            BufferedReader br_teclado = new BufferedReader(isr_teclado);
            String teste_teclado = br_teclado.readLine();
            
            while(teste_teclado != null){
                System.out.println(teste_teclado);
                teste_teclado = br_teclado.readLine();
            }
            */
            
            //Escrevendo um arquivo
            
            OutputStream os = new FileOutputStream("C:\\Users\\ander\\OneDrive\\Área de Trabalho\\escrevendo um arquivo no JAVA.txt");
            OutputStreamWriter osw = new OutputStreamWriter(os);
            BufferedWriter bw = new BufferedWriter(osw);
            
            bw.write("Esse é um novo arquivo");
            bw.newLine();
            bw.write("Eu sou FODA");
            bw.newLine();
            bw.write("Como recompesa mais tarde irei jogar CRASH BANDICOOT");
            
            bw.close();
            
        }catch(IOException e){
            System.out.println("Não deu certo");
        }
        
        try{
            System.out.println("-------------------------------");
            
            Scanner leitor = new Scanner(System.in, "UTF-8");
            System.out.println("Escreva o seu texto:");
            String texto = leitor.nextLine();
            System.out.println(texto);
            
            File a = new File("C:\\Users\\ander\\OneDrive\\Área de Trabalho\\escrevendo.txt");
            PrintStream escritor = new PrintStream(a, "UTF8");
            
            System.out.println(texto);
            escritor.println(texto);
            escritor.print("Por Anderson");
            escritor.close();
            //PrintStream escritor = new PrintStream();
        }catch(FileNotFoundException e){
            System.out.println("Arquivo não encontrado");
        }catch(UnsupportedEncodingException e){
            System.out.println("Ecoding inválido");
        }
        
        try{
            System.out.println("---------------------------");
            File arquivo = new File("C:\\Users\\ander\\OneDrive\\Área de Trabalho\\escrevendo um arquivo no JAVA.txt");
            Scanner l = new Scanner(arquivo, "UTF-8");
            while(l.hasNextLine()){
                System.out.println(l.nextLine());
            }
        }catch(FileNotFoundException e){
            System.out.println("Arquivo não encontrado");
        }
    }
}
