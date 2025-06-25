public class Aluno {
    String nome;
    int matricula;
    double nota1;
    double nota2;
    double nota3;

    double calcularMedia(){
        return (nota1 + nota2 + nota3) / 3;
    }
    String verificarAprovacao(){
        return this.calcularMedia() >= 7? "Aprovado": "Reprovado";
    }

    String exibirDados(){
        return "Nome: " + this.nome + "\nMatricula: " + this.matricula + "\nMédia: " + String.format("%.2f",calcularMedia()) + "\nSituação do aluno(a): " + verificarAprovacao() ;
    }
}
