import me.cauadeveloper.learn_tdd.Conta;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ContaTest {

    @Test
    @DisplayName("Deve Depositar Com Conta Ativa")
    public void deveDepositarComContaAtiva(){

        Conta conta =  new Conta();
        conta.ativar();
        conta.depositar(100.00);

        // Primeiro valor é o esperado o segundo é o obtido
        Assertions.assertEquals(100.00, conta.getSaldo());

    }

    @Test
    @DisplayName("Não Deve Depositar Com Conta Inativa")
    public void naoDeveDepositarComContaInativa(){

        Conta conta =  new Conta();
        conta.inativar();
        conta.depositar(100.00);

        // Primeiro valor é o esperado o segundo é o obtido
        Assertions.assertEquals(0.00, conta.getSaldo());

    }

    @Test
    @DisplayName("Deve Sacar Com Conta Ativa e Saldo Maior que o Valor de Saque")
    public void deveSacarComContaAtivaESaldoMaiorQueValorSaque(){

        Conta conta =  new Conta();
        conta.ativar();
        conta.depositar(100.00);
        conta.sacar(70.00);

        // Primeiro valor é o esperado o segundo é o obtido
        Assertions.assertEquals(30.00, conta.getSaldo());

    }

    @Test
    @DisplayName("Não Deve Sacar Com Conta Ativa e Saldo Menor que o Valor de Saque")
    public void naoDeveSacarComContaAtivaESaldoMenorQueValorSaque(){

        Conta conta =  new Conta();
        conta.ativar();
        conta.depositar(100.00);
        conta.sacar(110.00);

        // Primeiro valor é o esperado o segundo é o obtido
        Assertions.assertEquals(100.00, conta.getSaldo());

    }

    @Test
    @DisplayName("Não Deve Sacar Com Conta Inativa")
    public void naoDeveSacarComContaInativa(){

        Conta conta =  new Conta();

        conta.ativar();
        conta.depositar(100.00);

        conta.inativar();
        conta.sacar(70.00);

        // Primeiro valor é o esperado o segundo é o obtido
        Assertions.assertEquals(100.00, conta.getSaldo());

    }

}
