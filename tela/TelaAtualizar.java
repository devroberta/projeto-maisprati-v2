package tela;
/**
 * Classe que mostra a tela de interação com o usuário para atualizar os dados
 * @author (Roberta de Siqueira) 
 * @version (2.0)
 */

import java.util.*;
import entities.*;
import util.*;
import java.text.*;

public class TelaAtualizar {
    public static void atualizar(List<Pessoa> lista) {
        
        Scanner sc = new Scanner(System.in);
        
        LimpaTela.limpa();
        System.out.println("::: Atualizar um Cadastro :::");
        //for que mostra a lista completa associando a variavel 'i' ao registro a ser selecionado 
        for (int i=0; i<lista.size(); i++) {
            System.out.println("# "+ i +" ::: "+ lista.get(i));
            System.out.println();
        }
        System.out.println();
        System.out.print("Digite o Código do Cadastro: ");
        int id= sc.nextInt();//recebendo o id do objeto
        System.out.println(id);
        //buscando o id digitado na lista
        if (lista.contains(lista.get(id))) {
            System.out.println("Cadastro Selecionado: > " + lista.get(id));//mostra o objeto selecionado
            Pessoa p = lista.get(id);//passa o objeto selecionado para a variável auxiliar 'p' 
            System.out.println();
            System.out.println("Digite: 1-NOME | 2-TELEFONE | 3 - DATA DE NASC. | 4 - NOTA FINAL");
            System.out.print("Qual dados quer alterar? ");
            int num = sc.nextInt();
            String dadoAtual;
            //try para tratamento de exceções
            try {
                //if para selecionar o parametro a ser alterado
                if (num == 1){
                    System.out.print("Digite o Nome Correto: ");
                    sc.nextLine();
                    dadoAtual = sc.nextLine();
                    p.setNome(dadoAtual);
                    p.ultimaAlteracao();
                }
                else if (num == 2){
                    System.out.print("Digite o TELEFONE Correto: ");
                    dadoAtual = sc.next();
                    p.setTelefone(dadoAtual);
                    p.ultimaAlteracao();
                }
                else if (num == 3){
                    System.out.print("Digite a DATA NASC Correta (dd/MM/yyyy): ");
                    Date dataAtual = ConversaoDados.converteStringData(sc.next());
                    p.setDataNasc(dataAtual);
                    p.ultimaAlteracao();
                } 
                else if (num == 4){
                    System.out.print("Digite a NOTA FINAL (00,0): ");
                    Double notaAtual = sc.nextDouble();
                    //if para saber se o objeto está instanciado como Aluno ou Pessoa
                    if (p instanceof Aluno) {
                        Aluno novo = (Aluno)p;
                        novo.setNotaFinal(notaAtual);
                        p = (Aluno) novo;
                        p.ultimaAlteracao();
                    }
                    else {
                        Pessoa novo = new Aluno(p.getNome(), p.getTelefone(), p.getDataNasc(), notaAtual);
                        lista.set(id, novo);
                        novo.ultimaAlteracao();
                    }
                }
                else {
                    System.out.println("Parametro não encontado");
                }
            }
            catch (ParseException e){
                System.out.println("ERRO: Formato da Data Inválida. Altere novamente.");
            }
            catch (RuntimeException e){
                System.out.println("ERRO: Nota inválida");
            }
        }
        else {
            System.out.println("Código "+id+" não encontrado");
        }
        System.out.println();
        System.out.println(">>> CADASTRO ATUALIZADO <<<");
        System.out.println("> " + id +" - "+ lista.get(id));//mostra o objeto atualizad
    }
}
