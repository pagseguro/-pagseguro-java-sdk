package integration.Modulos;

import br.com.uol.pagseguro.api.PagSeguro;
import br.com.uol.pagseguro.api.PagSeguroEnv;
import br.com.uol.pagseguro.api.credential.Credential;
import br.com.uol.pagseguro.api.session.CreatedSession;
import cucumber.api.java.pt.Quando;

public class Session {

    //	Cenario: Criar sessao
    //	Dado que esteja autenticado na api do pagseguro
    //	Quando crio uma sessao
    //	Entao e retornado o codigo da sessao

    private static final String SELLER_EMAIL_SESSION = "INFORMAR EMAIL SESSION";
    private static final String SELLER_TOKEN_SESSION = "INFORMAR SENHA SESSION";

    @Quando("^crio uma sessao$")
    public void crio_uma_sessao() {
        final PagSeguro pagSeguro = PagSeguro.instance(Credential.sellerCredential(SELLER_EMAIL_SESSION, SELLER_TOKEN_SESSION), PagSeguroEnv.SANDBOX);
        CreatedSession createdSession = pagSeguro.sessions().create();
        System.out.println(createdSession);
    }
}
