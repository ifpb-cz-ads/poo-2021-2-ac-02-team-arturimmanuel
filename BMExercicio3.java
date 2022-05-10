public class BMExercicio3 {
    public static void main (String[] args) {
        double produto1 = 2.95;
        double produto2 = 3.50;

        System.out.println("O primeiro produto custa " + produto1 + " e o segundo produto custa " + produto2);

        double total = produto1 + produto2;

        System.out.println("O total é " + total);

        final double taxaCalculada = 8.25 / 100;

        System.out.println("Taxa calculada: " + taxaCalculada);

        produto1 += produto1 * taxaCalculada;
        produto2 += produto2 * taxaCalculada;

        double novoCusto = produto1 + produto2;

        boolean muitoCaro = novoCusto > 10 ? true : false;

        System.out.println(muitoCaro);
        
    }
}