package br.com.caelum.contas.pessoas;

/**
 *
 * @author ander
 */
public class ControleDeBonificacao {
    private double totalDeBonificacao = 0;
    
    public void registra(Funcionario f){
        this.totalDeBonificacao += f.getBonificacao();
    }
    
    public double getTotalDeBonificacao(){
        return this.totalDeBonificacao;
    }
}
