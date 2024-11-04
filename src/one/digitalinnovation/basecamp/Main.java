package one.digitalinnovation.basecamp;

/**
 * Classe principal dos exercícios da Aula 1 de Métodos.
 */
public class Main{

    public static void main(String[] args) {

        //CALCULADORA
        System.out.println("Exercicio Calculadora");
        Calculadora.soma(3, 6);
        Calculadora.subtracao(9, 1.8);
        Calculadora.multiplicacao(7, 8);
        Calculadora.divisao(5, 2.5);

        //MENSAGEM
        System.out.println("Exercicio Mensagem");
        Mensagem.obterMensagem(9);
        Mensagem.obterMensagem(14);
        Mensagem.obterMensagem(19);
        Mensagem.obterMensagem(4);

        //PARCELAS
        System.out.println("Exercicio Emprestimo");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, 12);

    }
}

