package contabancaria;

public class Agencia {

    public static void main(String[] args){
        ContaBancaria minhaConta = new ContaBancaria("Adriano", 500);
        System.out.println("Titular: " + minhaConta.getTitular() + " Saldo: " + minhaConta.getSaldo());

        minhaConta.setTitular("Adriano Abreu");
        minhaConta.setSaldo(minhaConta.getSaldo() + 500);

        String titularConta = minhaConta.getTitular();
        double saldoFinal = minhaConta.getSaldo();

        System.out.println("Titular: " + minhaConta.getTitular() + " Saldo: " + minhaConta.getSaldo());

        ContaBancaria contaMinhaMae = new ContaBancaria("Penha");
        System.out.println("Titular: " + contaMinhaMae.getTitular() + " Saldo: " + contaMinhaMae.getSaldo());
    }
}
