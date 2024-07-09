package me.cauadeveloper.learn_tdd;

public class TestConta {

    public static void main(String[] args) {

        Conta conta = new Conta();

        //Depositar com conta Ativa
        conta.ativar();
        conta.depositar(100.00);
        System.out.println("Deposito com conta ativa:");
        System.out.println("Saldo: " + conta.getSaldo());

        //Depositar com a conta inativa
        conta = new Conta();
        conta.inativar();
        System.out.println("Não deve depositar, conta inativa:");
        conta.depositar(100.00);
        System.out.println("Saldo: " + conta.getSaldo());


    }

}
