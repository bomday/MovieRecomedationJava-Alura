import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;
        double mediaTotal = 0;
        int totalDeNotas = 0;

        while (nota != -1) {
            System.out.println("Diga sua avaliação para o filme ou -1 para encerrar:");
            nota = leitura.nextDouble();

            if (nota != -1) {
                mediaAvaliacao += nota;
                totalDeNotas++;
            }
        }

        if (totalDeNotas == 0) {
            System.out.println("Média de avaliações: " + mediaTotal);
        } else {
            mediaTotal = mediaAvaliacao/totalDeNotas;
            System.out.println("Média de avaliações: " + mediaTotal);
        }
    }
}
