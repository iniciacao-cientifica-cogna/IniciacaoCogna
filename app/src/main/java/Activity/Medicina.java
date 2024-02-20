package Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
<<<<<<< HEAD
import android.view.View;
import android.widget.GridLayout;
=======
>>>>>>> f582493f484d2f9c59a87df8bba38d6f0c19215f
import android.widget.Spinner;

import com.example.cogna.R;

public class Medicina extends AppCompatActivity {

<<<<<<< HEAD
    //atributos para recebimentos dos valores selecionados pelos alunos
    Spinner pergunta_treinamento, pergunta_coleta, pergunta_analise, pergunta_apresentacao, pergunta_discussao, pergunta_redacao, pergunta_publicaçao;


=======
    Spinner activity_medicina_spinner;
>>>>>>> f582493f484d2f9c59a87df8bba38d6f0c19215f
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medicina);
<<<<<<< HEAD

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

=======
        activity_medicina_spinner = findViewById(R.id.activity_medicina_spinner);
>>>>>>> f582493f484d2f9c59a87df8bba38d6f0c19215f
    }
}