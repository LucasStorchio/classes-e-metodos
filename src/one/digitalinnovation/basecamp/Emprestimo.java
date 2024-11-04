package one.digitalinnovation.basecamp;

/**
 * Classe de exemplo para o exercício da Aula 1 de Métodos.
 */
public class Emprestimo{

    public static int getDuasParcelas() {
        return 2;
    }

    public static int getTresParcelas() {
        return 3;
    }

    public static double getTaxasDuasParcelas() {
        return 0.3;
    }

    public static double getTaxasTresParcelas() {
        return 0.45;
    }

    public static void calcular(double valor, int parcelas) {

        if (parcelas == 2) {

            double valorFinal = valor + (valor * getTaxasDuasParcelas());
            double valorParcelado = valorFinal / 2;

            System.out.println("Seu empréstimo no valor de R$: " + valor + ", com taxas a " + getTaxasDuasParcelas() + "%, tera um valor final de R$ " + valorFinal + " e sua parcela em 2x será de " + valorParcelado);
        } else if (parcelas == 3){

            double valorFinal = valor + (valor * getTaxasTresParcelas());
            double valorParcelado = valorFinal / 3;

            System.out.println("Seu empréstimo no valor de R$: " + valor + ", com taxas a " + getTaxasTresParcelas() + "%, tera um valor final de R$ " + valorFinal + " e sua parcela em 2x será de " + valorParcelado);
        } else {
            System.out.println("Quantidade de parcelas não aceita");
        }

    }

}