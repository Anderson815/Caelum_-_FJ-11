package pkg16.pkg1.java_io.utf8;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Java_ioUTF8 {
    public static void main(String[] args) {
        //try{
        //File arquivo = new File("C:\\Users\\ander\\OneDrive\\Área de Trabalho\\l.txt");
        Scanner leitor = new Scanner(System.in, "UTF8");
        
        String texto = null;
               
        System.out.println("Escreva um texto:");
        texto = leitor.nextLine();
        System.out.println("Texto escrito foi: ");
        System.out.println(texto);
        //}catch(FileNotFoundException nencontrado){
        //    System.out.println("Arquivo não encontrado");
        //}
    } 
    
}
