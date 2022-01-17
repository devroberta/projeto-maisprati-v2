package tela;
/**
 * Classe responsável pela interação com o usuário para receber os dados que serão cadastrados
 * @author (Roberta de Siqueira) 
 * @version (2.0)
 */

import java.util.*;
import entities.*;
import util.*;
import java.text.*;

public class TelaCadastro
{
   public static void cadastrar(List<Pessoa> lista) {
       
        Scanner sc = new Scanner(System.in);
       
        try {
            LimpaTela.limpa();
            System.out.println("::: Cadastrar Pessoa ou Aluno :::");
            //Solicitação dos dados que serão enviados para a lista
            System.out.println("NOME:");
            System.out.print(">>> ");
            String nome = sc.nextLine();

            System.out.println("TELEFONE: (00)00000.0000");
            System.out.print(">>> ");
            String telefone = sc.next();

            System.out.println("DATA NASCIMENTO: dd/MM/yyyy");
            System.out.print(">>> ");
            String data = sc.next();
            Date dataNasc = ConversaoDados.converteStringData(data);

            System.out.print("Deseja cadastrar a Nota Final s/n? ");
            char possuiNota = 'n';
            possuiNota = sc.next().charAt(0);
            if (possuiNota =='s' || possuiNota=='S') {
                System.out.print("(00,0) >>> ");
                Double nota = sc.nextDouble();
                lista.add(new Aluno(nome, telefone, dataNasc, nota));
            }
            else {
                lista.add(new Pessoa(nome, telefone, dataNasc));
            }
            System.out.println();
            System.out.println("Cadastrado com sucesso!!!");
        }
        catch (ParseException e) {
            System.out.println("ERRO: Formato da Data Inválida. Cadastre novamente.");
        }
        catch (InputMismatchException e) {
            System.out.println("ERRO: Nota Inválida. Cadastre novamente.");
        }
   }
}
