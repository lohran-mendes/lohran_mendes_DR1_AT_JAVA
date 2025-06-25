public class Main {
    public static void main(String[] args) {
        Aluno a = new Aluno();
        a.nome = "Lohran Mendes";
        a.matricula = 123456;
        a.nota1 = 8;
        a.nota2 = 9;
        a.nota3 = 7.5;
        System.out.println("\nAluno 1:");
        System.out.println(a.exibirDados());


        Aluno b = new Aluno();
        b.nome = "Maria Eduarda";
        b.matricula = 654321;
        b.nota1 = 8;
        b.nota2 = 3;
        b.nota3 = 6.5;
        System.out.println("\nAluno 2:");
        System.out.println(b.exibirDados());
    }
}