package cursoandroid.cardoso.thiago.com.organizze.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.heinrichreimersoftware.materialintro.app.IntroActivity;
import com.heinrichreimersoftware.materialintro.slide.FragmentSlide;
import com.heinrichreimersoftware.materialintro.slide.SimpleSlide;

import cursoandroid.cardoso.thiago.com.organizze.R;
import cursoandroid.cardoso.thiago.com.organizze.activity.CadastroActivity;
import cursoandroid.cardoso.thiago.com.organizze.activity.LoginActivity;

public class MainActivity extends IntroActivity {

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

    public void btEntrar(View view) {
        //inicia a activity Login
        startActivity(new Intent(this, LoginActivity.class));
    }

    public void btCadastrar(View view) {

        //inicia a activity Cadastro
        startActivity(new Intent(this, CadastroActivity.class));
    }
}
