package Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;

import com.example.cogna.R;

public class TIC extends AppCompatActivity {

    Spinner pergunta_reuniao_tic,
            pergunta_producao_tic,
            pergunta_elaboracao_tic,
            pergunta_apoio_tic,
            pergunta_criacao_tic,
            pergunta_gestao_tic,
            pergunta_edicao_tic,
            pergunta_ajustes_tic,
            pergunta_relatorio_tic,
            pergunta_coordenador_tic,
            pergunta_reunioes_tic,
            pergunta_avaliacao_tic,
            pergunta_final_tic;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tic);

    }

    public void validar_campos(View view){
        pergunta_reuniao_tic = findViewById(R.id.pergunta_reuniao_tic);
                pergunta_producao_tic = findViewById(R.id.pergunta_producao_tic);
                pergunta_elaboracao_tic = findViewById(R.id.pergunta_elaboracao_tic);
                pergunta_apoio_tic = findViewById(R.id.pergunta_apoio_tic);
                pergunta_criacao_tic = findViewById(R.id.pergunta_criacao_tic);
                pergunta_gestao_tic = findViewById(R.id.pergunta_gestao_tic);
                pergunta_edicao_tic = findViewById(R.id.pergunta_edicao_tic);
                pergunta_ajustes_tic = findViewById(R.id.pergunta_ajustes_tic);
                pergunta_relatorio_tic = findViewById(R.id.pergunta_relatorio_tic);
                pergunta_coordenador_tic = findViewById(R.id.pergunta_coordenador_tic);
                pergunta_reunioes_tic = findViewById(R.id.pergunta_reunioes_tic);
                pergunta_avaliacao_tic = findViewById(R.id.pergunta_avaliacao_tic);
                pergunta_final_tic = findViewById(R.id.pergunta_final_tic);
    }
}