import java.util.Scanner;

public class Telefonia {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Bem vindo a operadora LigueMais!");
        System.out
                .println("Na operadora LigueMais, temos 3 pacotes para assinatura:\nO basico com 100 minutos de ligação"
                        + "\nO midia com 100 minutos de ligação + WhatsApp e Instagram gratuitos\nO turbo com 100 minutos de ligação + WhatsApp e Instagram + 5Gb de Youtube");
        System.out.println("\n1 - Basico\n2 - Midia\n3 - Turbo");
        System.out.println("Esolha seu plano: ");
        int plano = ler.nextInt();

        switch (plano) {
            case 1: {
                System.out
                        .println("Você escolheu o plano basico: 100 minutos de ligação\nValor do plano: R$ 30.00/mês");
                break;
            }

            case 2: {
                System.out.println(
                        "Você escolheu o plano midia: 100 minutos de ligação + WhatsApp e Instagram gratuitos\nValor do plano: R$ 50.00/mês");
                break;
            }

            case 3: {
                System.out.println(
                        "Você escolheu o plano midia: 100 minutos de ligação + WhatsApp e Instagram gratuitos + 5Gb de Youtube\nValor do plano: R$ 70.00/mês");
                break;
            }

            default: {
                System.out.println("Plano escolhido não exixte em nosso sistema!");
            }
        }
    }
}
