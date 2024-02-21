package Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;

import com.example.cogna.R;

public class Agronomia extends AppCompatActivity {

<<<<<<< HEAD
    Spinner pergunta_reuniao_agronomia, pergunta_capacitacao_ciencia, pergunta_primeiro_agronomia, pergunta_discussao_agronomia, pergunta_coleta_agronomia, pergunta_relatorio_agronomia, pergunta_relatorio_final_agronomia, pergunta_relatoriafinal_agronomia;


=======
    Spinner activity_agronomia_spinner;
>>>>>>> d73b114f5ec37e4ecd71234b61e0535ff6c4a95f
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agronomia);
        activity_agronomia_spinner = findViewById(R.id.activity_agronomia_spinner);
    }

    public void validar_campos(View view){
        pergunta_reuniao_agronomia = findViewById(R.id.pergunta_reuniao_agronomia);
        pergunta_capacitacao_ciencia = findViewById(R.id.pergunta_capacitacao_ciencia);
        pergunta_primeiro_agronomia = findViewById(R.id.pergunta_primeiro_agronomia);
        pergunta_discussao_agronomia = findViewById(R.id.pergunta_discussao_agronomia);
        pergunta_coleta_agronomia = findViewById(R.id.pergunta_coleta_agronomia);
        pergunta_relatorio_agronomia = findViewById(R.id.pergunta_relatorio_agronomia);
        pergunta_relatorio_final_agronomia = findViewById(R.id.pergunta_relatorio_final_agronomia);
        pergunta_relatoriafinal_agronomia = findViewById(R.id.pergunta_relatoriafinal_agronomia);

    }
}