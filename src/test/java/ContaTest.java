import me.cauadeveloper.learn_tdd.Conta;
import org.junit.jupiter.api.*;

public class ContaTest {

    private Conta conta;

    private static double  depositoInicial, saldoZerado, saqueValido, saqueInvalido;

    @BeforeAll
    public static void definirValoresPadrao(){

        saldoZerado = 0.00;
        depositoInicial = 100.00;
        saqueValido = 70.00;
        saqueInvalido = 110.00;

    }

    // Executa antes de cada método
    @BeforeEach
    public void inicializarConta(){
        conta =  new Conta();
        conta.ativar();
    }

    @Test
    @DisplayName("Deve Depositar Com Conta Ativa")
    public void deveDepositarComContaAtiva(){

        conta.depositar(depositoInicial);
        // Primeiro valor é o esperado o segundo é o obtido
        Assertions.assertEquals(depositoInicial, conta.getSaldo());

    }

    @Test
    @DisplayName("Não Deve Depositar Com Conta Inativa")
    public void naoDeveDepositarComContaInativa(){

        conta.inativar();

        Assertions.assertThrows(RuntimeException.class, () -> conta.depositar(depositoInicial));
        // Primeiro valor é o esperado o segundo é o obtido
        Assertions.assertEquals(saldoZerado, conta.getSaldo());

    }

    @Test
    @DisplayName("Deve Sacar Com Conta Ativa e Saldo Maior que o Valor de Saque")
    public void deveSacarComContaAtivaESaldoMaiorQueValorSaque(){

        conta.depositar(depositoInicial);
        conta.sacar(saqueValido);
        // Primeiro valor é o esperado o segundo é o obtido
        Assertions.assertEquals(depositoInicial - saqueValido, conta.getSaldo());

    }

    @Test
    @DisplayName("Não Deve Sacar Com Conta Ativa e Saldo Menor que o Valor de Saque")
    public void naoDeveSacarComContaAtivaESaldoMenorQueValorSaque(){

        conta.depositar(depositoInicial);
        Assertions.assertThrows(RuntimeException.class, () -> conta.sacar(saqueInvalido));

        // Primeiro valor é o esperado o segundo é o obtido
        Assertions.assertEquals(depositoInicial, conta.getSaldo());

    }

    @Test
    @DisplayName("Não Deve Sacar Com Conta Inativa")
    public void naoDeveSacarComContaInativa(){

        conta.depositar(depositoInicial);

        conta.inativar();
        Assertions.assertThrows(RuntimeException.class, () -> conta.sacar(saqueValido));

        // Primeiro valor é o esperado o segundo é o obtido
        Assertions.assertEquals(depositoInicial, conta.getSaldo());

    }

}
