public class Main {
    public static void main(String[] args) {
        double salarioPadrao = 2000;

        Gerente g = new Gerente("Gilberto Ramos", salarioPadrao);
        Estagiario e = new Estagiario("Lucas Coelho", salarioPadrao);

        System.out.println("\nGerente:");
        System.out.println(g);
        System.out.println("\nEstágiario:");
        System.out.println(e);
    }
}