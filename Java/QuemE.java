public class QuemE {
    public static void main(String[] args) {
        String[] alunos = { "FELIPE", "JOÃO", "MARCIA", "HANA", "MANU" };

        // for(int x = 0; x < alunos.length; x++) {
        // System.out.println(alunos[x]+ " é o aluno do indicie " + x);
        // }

        for (String aluno : alunos) {
            System.out.println("Nome do aluno: " + aluno);
        }
    }
}
