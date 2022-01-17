package entities;
/**
 * Classe para cadastrar um Aluno com herança da Classe Pessoa.
 * @author (Roberta de Siqueira) 
 * @version (2.0)
 */

import java.util.*;

public class Aluno extends Pessoa
{
    private Double notaFinal;
    
    public Aluno(){
        super();
    }
    
    public Aluno(String name, String telefone, Date dataNasc, Double notaFinal) {
        super(name, telefone, dataNasc);
        this.notaFinal = notaFinal;
    }
    
    public Double setNotaFinal(){
        return notaFinal;
    }
    
    public void setNotaFinal(Double notaFinal) {
        this.notaFinal = notaFinal;
    }
    
    @Override
    public String toString(){
        if (getUltimaAlteracao() == null){
            return super.toString() 
                    +" | Nota Final: "+ String.format("%.1f",notaFinal);
        }
        else {
            return super.toString()
                    +" | Nota Final: "+ String.format("%.1f",notaFinal);
            }
    }     
}
