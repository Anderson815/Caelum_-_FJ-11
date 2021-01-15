package br.com.anderson.interface_alarme.principal;

import br.com.anderson.interface_alarme.antiga.Radio;
import java.util.List;

public class TesteAlarme {
    public void passarAlarme(Alarme<Radio> a, int tempo){
        System.out.println("OK ISSO É UM ALARME");
        System.out.println(a.programar(tempo));
    }
    
    public void testando(List<Radio> a){
        System.out.println("ISSO DEU CERTO");
    }
}
