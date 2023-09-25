import java.util.Scanner;

class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(String info) {
        super(info);
    }
}

public class DesafioControleFluxo {
    public static void contar(int primeiroNumero, int segundoNumero) throws ParametrosInvalidosException {
        if (primeiroNumero > segundoNumero) {
            throw new ParametrosInvalidosException("O primeiro numero deve ser menor que o segundo numero!");

        } else {
            int repeticao = segundoNumero - primeiroNumero;

            for (int x = 1; x <= repeticao; x++) {
                System.out.println(x);
            }
        }

    }

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        try {
            System.out.println("Informe o primeiro numero: ");
            int primeiro = ler.nextInt();
            System.out.println("Informe o segundo numero: ");
            int segundo = ler.nextInt();

            contar(primeiro, segundo);
        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        }

    }

}