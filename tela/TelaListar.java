package tela;
/**
 * Classe que cria a tela de interação com o usuário para mostrar os objetos gravados
 * @author (Roberta de Siqueira) 
 * @version (2.0)
 */

import java.util.*;
import entities.*;
import util.LimpaTela;

public class TelaListar {
    
    List<Pessoa> lista = new ArrayList<>(); 
    
    public static void listarCadastros(List<Pessoa> lista) {
        LimpaTela.limpa();
        System.out.println("::: Lista de Todos os Cadastros :::");
        System.out.println();
        //for que mostra toda a lista cadastrada na memória
        for(Pessoa linha : lista){
            System.out.println("> " + linha);
            System.out.println();
        }
    }
}
