package br.com.anderson.interface_alarme.principal;

import br.com.anderson.interface_alarme.tecnologiamoderna.Televisao;
import br.com.anderson.interface_alarme.tecnologiamoderna.Smartphone;
import br.com.anderson.interface_alarme.tecnologiamoderna.Notebook;
import br.com.anderson.interface_alarme.antiga.Radio;

public class Principal {

    public static void main(String[] args) {
        Televisao t = new Televisao();
        
        t.status();
        
        t.ligar();
        
        t.status();
        
        t.aumentarVolume();
        t.aumentarVolume();
        
        t.avancarCanal();
        t.avancarCanal();
        t.avancarCanal();
        t.avancarCanal();
        t.avancarCanal();
        
        t.status();
        
        Smartphone s = new Smartphone();
    
        s.status();
        
        s.ligar();
        
        s.status();
        
        //s.aumentarBrilho();
        
        s.diminuirBrilho();
        s.diminuirBrilho();
        s.diminuirBrilho();
        s.diminuirBrilho();
        s.diminuirBrilho();
        
        s.diminuirVolume();
        s.diminuirVolume();
        s.diminuirVolume();
        s.diminuirVolume();
        s.diminuirVolume();
        s.diminuirVolume();
        
        s.conectar();
        
        s.status();
        
        Notebook n = new Notebook();
        
        n.status();
        
        n.ligar();
        
        n.diminuirBrilho();
        n.diminuirBrilho();
        
        n.diminuirVolume();
        n.diminuirVolume();
        n.diminuirVolume();
        n.diminuirVolume();
        
        n.status();
        
        Radio r = new Radio();
        
        r.status();
        
        r.ligar();
        
        r.avancarFrequencia();
        r.avancarFrequencia();
        
        r.aumentarVolume();
        
        r.status();
        
        
        Alarme as = s;
        Alarme ar = r;
        
        Alarme aradio = new Radio();
        
        TesteAlarme te = new TesteAlarme();
        
        te.passarAlarme(ar, 10);
        te.passarAlarme(as, 20);
        
        
    }
}
