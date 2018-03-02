package cursoandroid.cardoso.thiago.com.organizze.config;

import com.google.firebase.auth.FirebaseAuth;

/**
 * Created by tcardoso on 02/03/2018.
 */

public class ConfiguracaoFirebase {

    private static FirebaseAuth autenticacao;

    //retorna a instancia do FirebaseAuth
    public static FirebaseAuth getFirebaseAutenticacao(){

        if(autenticacao == null) {
            autenticacao = FirebaseAuth.getInstance();
        }
        return autenticacao;
    }
}


