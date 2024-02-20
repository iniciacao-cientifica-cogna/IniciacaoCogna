package Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.GridLayout;
import android.widget.Spinner;

import com.example.cogna.R;

public class Medicina extends AppCompatActivity {

    //atributos para recebimentos dos valores selecionados pelos alunos
    Spinner pergunta_treinamento, pergunta_coleta, pergunta_analise, pergunta_apresentacao, pergunta_discussao, pergunta_redacao, pergunta_publicaçao;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medicina);

        //recebimento dos valores selecionados pelos alunos
        pergunta_treinamento = findViewById(R.id.pergunta_treinamento);
        pergunta_coleta = findViewById(R.id.pergunta_coleta);
        pergunta_analise = findViewById(R.id.pergunta_analise);
        pergunta_apresentacao = findViewById(R.id.pergunta_apresentacao);
        pergunta_discussao = findViewById(R.id.pergunta_discussao);
        pergunta_redacao = findViewById(R.id.pergunta_redacao);
        pergunta_publicaçao = findViewById(R.id.pergunta_publicacao);

    }
    public void validar_campos(View view){

    }
}