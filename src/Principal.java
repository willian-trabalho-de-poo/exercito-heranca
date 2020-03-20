public class Principal {
    public static void main(String[] args) {
        final Entrada in = new Entrada();
        final Piloto piloto = in.leiaPiloto("\nPiloto\n");
        final Motorista motorista = in.leiaMotorista("\nMotorista\n");
        final Capitao capitao = in.leiaCapitao("\nCapitao\n");
        System.out.printf(
            "\n----------------------------\n" +
            "Dados" +
            "\n----------------------------\n" +
            "\nPiloto\n" +
            "%s" +
            "----------------------------\n" +
            "\nMotorista\n" +
            "%s" +
            "----------------------------\n" +
            "\nCapitao\n" +
            "%s" +
            "----------------------------\n",
            piloto,
            motorista,
            capitao
        );
        System.exit(0);
    }
}
