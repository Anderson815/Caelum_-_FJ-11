package br.com.caelum.contas.pessoas;

/**
 *
 * @author ander
 */
public class Gerente extends Funcionario{
    
    // Atributos
    private int senha;
    private int numeroDeFuncionariosGerenciados;
    
    // Métodos
    
    /**
     * verifica se é autentico
     * @param senha 
     * @return se está autentico ou não para usar o sistema interno
     */
    public boolean autentica(int senha){
        if(this.senha == senha){
            System.out.println("Acesso Permitido");
            return true;
        }else{
            System.out.println("Acessso Negado");
            return false;
        }
        
    }
    
    @Override
    public double getBonificacao(){
        return this.salario * 0.15;
    }
    
    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public int getNumeroDeFuncionariosGerenciados() {
        return numeroDeFuncionariosGerenciados;
    }

    public void setNumeroDeFuncionariosGerenciados(int numeroDeFuncionariosGerenciados) {
        this.numeroDeFuncionariosGerenciados = numeroDeFuncionariosGerenciados;
    }
    
    
}
