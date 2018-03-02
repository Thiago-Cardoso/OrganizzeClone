package cursoandroid.cardoso.thiago.com.organizze.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.google.firebase.auth.FirebaseAuth;
import com.heinrichreimersoftware.materialintro.app.IntroActivity;
import com.heinrichreimersoftware.materialintro.slide.FragmentSlide;
import com.heinrichreimersoftware.materialintro.slide.SimpleSlide;

import cursoandroid.cardoso.thiago.com.organizze.R;
import cursoandroid.cardoso.thiago.com.organizze.activity.CadastroActivity;
import cursoandroid.cardoso.thiago.com.organizze.activity.LoginActivity;
import cursoandroid.cardoso.thiago.com.organizze.config.ConfiguracaoFirebase;

public class MainActivity extends IntroActivity {

    private FirebaseAuth autenticacao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // setContentView(R.layout.activity_main);

        //retiro os buttons voltar e avançar
        setButtonBackVisible(false);
        setButtonNextVisible(false);

        //adiciono o fragment no slide
        addSlide(new FragmentSlide.Builder()
                .background(android.R.color.white)
                .fragment(R.layout.intro_1)
                .build()
        );

        addSlide(new FragmentSlide.Builder()
                .background(android.R.color.white)
                .fragment(R.layout.intro_2)
                .build()
        );

        addSlide(new FragmentSlide.Builder()
                .background(android.R.color.white)
                .fragment(R.layout.intro_3)
                .build()
        );

        addSlide(new FragmentSlide.Builder()
                .background(android.R.color.white)
                .fragment(R.layout.intro_4)
                .build()
        );

        addSlide(new FragmentSlide.Builder()
                .background(android.R.color.white)
                .fragment(R.layout.intro_cadastro)
                .build()
        );

    }

    @Override
    protected void onStart() {
        super.onStart();
        verificarUsuarioLogado();
    }

    public void btEntrar(View view) {
        //inicia a activity Login
        startActivity(new Intent(this, LoginActivity.class));
    }

    public void btCadastrar(View view) {

        //inicia a activity Cadastro
        startActivity(new Intent(this, CadastroActivity.class));
    }

    public void verificarUsuarioLogado(){

        autenticacao = ConfiguracaoFirebase.getFirebaseAutenticacao();
        //desloga o usuario
       // autenticacao.signOut();
        //verifica se o usuario atual esta logado
        if(autenticacao.getCurrentUser() != null){

            abrirTelaPrincipal();
        }
    }


    public void abrirTelaPrincipal(){

        startActivity(new Intent(this,PrincipalActivity.class));
    }
}
