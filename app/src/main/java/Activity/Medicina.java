package Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;

import com.example.cogna.R;

public class Medicina extends AppCompatActivity {

    Spinner pergunta_treinamento_medicina,
            pergunta_coleta_medicina,
            pergunta_analise_medicina,
            pergunta_apresentacao_medicina,
            pergunta_discussao_medicina,
            pergunta_redacao_medicina,
            pergunta_publicacao_medicina;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medicina);

    }

    public void validar_campos(View view){
        pergunta_treinamento_medicina = findViewById(R.id.pergunta_treinamento_medicina);
        pergunta_coleta_medicina = findViewById(R.id.pergunta_coleta_medicina);
        pergunta_analise_medicina = findViewById(R.id.pergunta_analise_medicina);
        pergunta_apresentacao_medicina = findViewById(R.id.pergunta_apresentacao_medicina);
        pergunta_discussao_medicina = findViewById(R.id.pergunta_discussao_medicina);
        pergunta_redacao_medicina = findViewById(R.id.pergunta_redacao_medicina);
        pergunta_publicacao_medicina = findViewById(R.id.pergunta_publicacao_medicina);
    }
}