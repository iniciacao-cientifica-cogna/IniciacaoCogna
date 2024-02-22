package Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;

import com.example.cogna.R;

public class Ciencia extends AppCompatActivity {

    Spinner pergunta_levantamento_ciencia,
            pergunta_capacitacao_ciencia,
            pergunta_divulgacao_ciencia,
            pergunta_selecao_ciencia,
            pergunta_coleta_ciencia,
            pergunta_tabulacao_ciencia,
            pergunta_analise_ciencia,
            pergunta_redacao_ciencia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ciencia);

    }
    public void validar_campos(View view){

        pergunta_levantamento_ciencia = findViewById(R.id.pergunta_levantamento_ciencia);
        pergunta_capacitacao_ciencia = findViewById(R.id.pergunta_capacitacao_ciencia);
        pergunta_divulgacao_ciencia = findViewById(R.id.pergunta_divulgacao_ciencia);
        pergunta_selecao_ciencia = findViewById(R.id.pergunta_selecao_ciencia);
        pergunta_coleta_ciencia = findViewById(R.id.pergunta_coleta_ciencia);
        pergunta_tabulacao_ciencia = findViewById(R.id.pergunta_tabulacao_ciencia);
        pergunta_analise_ciencia = findViewById(R.id.pergunta_analise_ciencia);
        pergunta_redacao_ciencia = findViewById(R.id.pergunta_redacao_ciencia);
    }
}