/**
 * Classe Principal que inicializa o programa
 * @author (Roberta de Siqueira) 
 * @version (2.0)
 */
import java.util.*;
import entities.*;
import tela.*;
import util.*;
import java.text.*;

public class Main
{
    public static void main (String[] args) throws ParseException {

        Scanner sc = new Scanner(System.in);

        List<Pessoa> lista = new ArrayList<>();
        Pessoa pessoa = new Pessoa();
        Aluno aluno = new Aluno();

        char opcao=' ';
        while (opcao!='5') {
            MenuPrincipal.menuPrincipal(); //Mostra o Menu Principal do Programa
            System.out.print("Digite: ");
            opcao = sc.next().charAt(0); //recebe a opção do menu
            if (opcao=='1') {
                char resp = 's';
                while (resp=='s' || resp=='S') {
                    TelaCadastro.cadastrar(lista);//Chama tela interativa para o cadastro
                    System.out.println();
                    System.out.println("Deseja fazer um cadastro s/n?");
                    resp = sc.next().charAt(0);
                }
            }
            else if (opcao=='2') {
                char resp = ' ';
                while (resp != 'x' && resp!='X') {
                    TelaListar.listarCadastros(lista);//Chama tela para mostrar toda a lista
                    System.out.println();
                    System.out.println("Aperte 'x' para sair e voltar ao Menu Principal");
                    resp = sc.next().charAt(0);
                }
                
            }
            else if (opcao=='3') {
                char resp=' ';
                while (resp != 'x' && resp!='X') {
                    char continuar = 's';
                    while (continuar=='s' || continuar=='S') {
                        TelaAtualizar.atualizar(lista); //Chama tela interativa para atualizar um cadastro
                        System.out.println();
                        System.out.println("Digite 's' para CONTINUAR ou 'n' para SAIR: ");
                        continuar = sc.next().charAt(0);
                    }
                    System.out.println();
                    System.out.println("Aperte 'x' para sair e voltar ao Menu Principal");
                    resp = sc.next().charAt(0);
                }
            }
            else if (opcao=='4') {
                char resp=' ';
                while (resp != 'x' && resp!='X') {
                    char continuar = 's';
                    while (continuar=='s' || continuar=='S') {
                        TelaDeletar.deletar(lista); //Chama tela interativa para excluir um cadastro
                        System.out.println();
                        System.out.println("Digite 's' para CONTINUAR ou 'n' para SAIR: ");
                        continuar = sc.next().charAt(0);
                    }
                    System.out.println();
                    System.out.println("Aperte 'x' para sair e voltar ao Menu Principal");
                    resp = sc.next().charAt(0);
                }
            }
            else if (opcao=='5') {
                System.out.println("FECHANDO SISTEMA...");
            }
            else {
                System.out.println("#ALERTA: Digite apenas opções válidas");
            }
            LimpaTela.limpa();
        }
        sc.close();
    }
}