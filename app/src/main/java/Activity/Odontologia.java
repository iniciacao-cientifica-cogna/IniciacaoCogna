package Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;

import com.example.cogna.R;


public class Odontologia extends AppCompatActivity {

    Spinner pergunta_treinamento,pergunta_recrutamento, pergunta_coleta, pergunta_analise, pergunta_divulgacao;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_odontologia);
    }

    public void validar_campos(View view){

        pergunta_treinamento = findViewById(R.id.pergunta_treinamento);
        pergunta_recrutamento = findViewById(R.id.pergunta_recrutamento);
        pergunta_coleta = findViewById(R.id.pergunta_coleta);
        pergunta_analise = findViewById(R.id.pergunta_analise);
        pergunta_divulgacao = findViewById(R.id.pergunta_divulgacao);
    }
}