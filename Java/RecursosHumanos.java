
import java.util.Random;
import java.util.Scanner;

public class RecursosHumanos {

    public static void main(String[] args) {

        String[] nomesCandidatos = null;
        double[] salariosPretendidos = null;
        int escolha = 0;

        Scanner ler = new Scanner(System.in);

        while (escolha != 4) {
            System.out.println("Bem-vindo ao Hr da empresa Hellfire!");
            System.out.println(
                    "1 - Cadastrar candidatos\n2 - Lista de candidatos selecionados\n3 - Ligar para os selecionados\n4 - Sair");
            escolha = ler.nextInt();

            switch (escolha) {
                case 1: {
                    boolean sair1 = false;

                    while (!sair1) {
                        System.out.println("Informe quantos candidatos serão cadastrados: ");
                        int countCandidatos = ler.nextInt();

                        if (countCandidatos > 0) {
                            nomesCandidatos = new String[countCandidatos];
                            salariosPretendidos = new double[countCandidatos];

                            for (int i = 0; i < nomesCandidatos.length; i++) {
                                System.out.println("Informe o nome: ");
                                nomesCandidatos[i] = ler.next();

                                System.out.println("Informe o salario pretendido: ");
                                salariosPretendidos[i] = ler.nextDouble();
                            }

                            System.out.println("Deseja sair? (s/n) ");
                            String resp1 = ler.next();

                            if (resp1.equals("s")) {
                                sair1 = true;
                            } else {
                                sair1 = false;
                            }
                        } else {
                            System.out.println("Informe uma quantidade válida!");
                        }
                    }

                }
                    break;

                case 2: {
                    boolean sair2 = false;

                    while (!sair2) {
                        System.out.println("Lista de candidatos selecionados: ");
                        int count = 0;
                        for (int a = 0; a < nomesCandidatos.length; a++) {
                            if (salariosPretendidos[a] <= 2000) {
                                System.out.println("O candidato " + nomesCandidatos[a] + " foi selecionado.");
                                count += 1;
                                if (count == 5) {
                                    break;
                                }
                            }
                        }
                        System.out.println("Deseja sair? (s/n) ");
                        String resp2 = ler.next();

                        if (resp2.equals("s")) {
                            sair2 = true;
                        } else {
                            sair2 = false;
                        }
                    }
                }
                    break;

                case 3: {
                    boolean sair3 = false;
                    int countLigacao = 1;

                    while (!sair3) {
                        System.out.println("Informe qual o nome do candidato gostaria de ligar: ");
                        String nome = ler.next();
                        boolean encontra = false;

                        for (int x = 0; x < nomesCandidatos.length; x++) {
                            if (nome.equals(nomesCandidatos[x])) {
                                encontra = true;

                                Random geradorAleatorio = new Random();
                                int numeroAleatorio = geradorAleatorio.nextInt(2);
                                String resposta = (numeroAleatorio == 0) ? "atendeu." : "não atendeu.";

                                if (resposta.equals("atendeu.")) {
                                    System.out.println("Conseguimos contato com o candidato " + nome + ": " + resposta
                                            + "\nApós " + countLigacao + " tentativas.");
                                } else {
                                    System.out.println("Não conseguimos contato com o candidato " + nome + ": "
                                            + resposta + "\nApós " + countLigacao + " tentativas.");
                                    countLigacao += 1;

                                    if (countLigacao == 3) {
                                        System.out
                                                .println("O candidato não retornou nenhuma das três ligações feitas.");
                                        break;
                                    }
                                }
                                break;
                            }
                        }

                        if (!encontra) {
                            System.out.println("Candidato não se encontra na base de dados.");
                        }

                        System.out.println("Deseja sair? (s/n) ");
                        String resp3 = ler.next();

                        if (resp3.equals("s")) {
                            sair3 = true;
                        } else {
                            sair3 = false;
                        }
                    }
                }
                    break;
            }
        }
    }
}
