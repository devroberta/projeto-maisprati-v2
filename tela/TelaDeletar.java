package tela;
/**
 * Classe que mostra a tela de interação com o usuário para deletar um cadastro
 * @author (Roberta de Siqueira) 
 * @version (2.0)
 */

import java.util.*;
import entities.*;
import util.*;

public class TelaDeletar
{
    public static void deletar(List <Pessoa> lista) {
        
        Scanner sc = new Scanner(System.in);
        
        LimpaTela.limpa();
        System.out.println("::: Deletar um Cadastro :::");
        //for para mostrar a lista completa
        for (int i=0; i<lista.size(); i++) {
            System.out.println();
            System.out.println("ID: "+ i +" >> "+ lista.get(i));
        }
        System.out.println();
        //solicitando o id correspondente ao cadastro a ser excluido
        System.out.print("Qual o ID deseja excluir? ");
        int id = sc.nextInt();
        try {
            Pessoa p = lista.get(id); //buscando o objeto referente ao id digitado pelo usuário
            lista.remove(p); //remove nome encontrado
            System.out.println();
            System.out.println(">>> LISTA ATUALIZADA <<<");
            //for para imprimir a lista atualizada após a exclusão
            for(Pessoa linha : lista){
                System.out.println("> " + linha);
            }
        }
        catch (Exception e) {
            System.out.println();
            System.out.println("??? Cadastro não encontrado");
        }
    }
}
