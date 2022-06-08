import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.runners.Parameterized;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TesteEmail {
    Pessoa pessoa;

    @Before
    public void inicializar(){

        pessoa = new Pessoa();

    }

    @Test
    public void testar_email_com_arroba(){

        String email = "email_teste@dominio.com.br";

        assertTrue(pessoa.emailValid(email));
    }

    @Test
    public void testar_email_sem_arroba(){

        String email = "email_testedominio.com.br";

        assertFalse(pessoa.emailValid(email));

    }

    @Test
    public void testar_email_mais_50_caracteres(){

        String email = "email_teste_muito_longo_nao_deve_ser_valido@dominio.com.br";

        Assertions.assertEquals(pessoa.emailValid(email), false);

    }
}
