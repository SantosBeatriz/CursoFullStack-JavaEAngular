import java.util.Scanner;

public class Media {
    public Media() {
    }

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe sua primeira nota: ");
        float primeiraNota = ler.nextFloat();
        System.out.println("Informe sua segunda nota: ");
        float segundaNota = ler.nextFloat();
        float mediaFinal = (primeiraNota + segundaNota) / 2.0F;
        if ((double) mediaFinal < 3.5) {
            System.out.println("Reprovado e sua média final é: " + mediaFinal);
        } else if (mediaFinal >= 6.0F) {
            System.out.println("Aprovado e sua média final é: " + mediaFinal);
        } else {
            System.out.println("Recuperação e sua média final é: " + mediaFinal);
        }

    }
}