import java.util.Scanner;
public class ExerciseMedia {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite a quantidade de alunos: ");
        int quantidadeAlunos = input.nextInt();
        for (int i = 0; i < quantidadeAlunos; i++) {
            System.out.print("Digite o nome do aluno: ");
            String nome = input.next();
            double somaNotas = 0;
            for (int j = 0; j < 4; j++) {
                System.out.print("Digite a nota " + (j + 1) + ": ");
                double nota = input.nextDouble();
                somaNotas += nota;
            }
            double media = somaNotas / 4;
            mostraResultado(nome, media);
        }
    }

    public static void mostraResultado(String nome, double media) {
        if (media >= 7.0) {
            System.out.println("Parabéns, " + nome + ", você foi aprovado. Sua media foi de " +media);
        } else if (media >= 4.0 && media < 7.0) {
            System.out.println(nome + ", apresente-se para a prova final.Sua media foi de " +media);
        } else {
            System.out.println(nome + ", infelizmente você não atingiu a média mínima.Sua media foi de " +media);
        }
    }
}
