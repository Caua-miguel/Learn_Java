package me.cauadeveloper.learn_tdd;

public class TestaContaComComparacao {

    public static void main(String[] args) {

        Conta conta = new Conta();

        //Depositar com conta Ativa
        conta.ativar();
        conta.depositar(100.00);
        System.out.println("Deposito com conta ativa:");

        if(conta.getSaldo() == 100.00){
            System.out.println("funcionou");
        }else{
            System.out.println("falhou!");
        }

        //Depositar com a conta inativa
        conta = new Conta();
        conta.inativar();
        System.out.println("Não deve depositar, conta inativa:");
        conta.depositar(100.00);

        if(conta.getSaldo() == 0.00){
            System.out.println("funcionou");
        }else{
            System.out.println("falhou!");
        }

    }

}
