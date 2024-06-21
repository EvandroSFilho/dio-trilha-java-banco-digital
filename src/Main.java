public class Main {
    public static void main(String[] args) {
      Cliente evandro = new Cliente();
      evandro.setNome("Evandro");

        Conta cc = new ContaCorrente(evandro);
        Conta cp = new ContaPoupanca(evandro);

        cc.depositar(150);
        cc.transferir(100, cp);

        cc.imprimirExtrato();
        cp.imprimirInfosComuns();
    }
}
