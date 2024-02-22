package Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.ThemedSpinnerAdapter;

import com.example.cogna.R;

public class Direito extends AppCompatActivity {
    Spinner pergunta_divulgacao_direito, pergunta_encontro_direito, pergunta_vinculacao_direito, pergunta_levantamento_direito, pergunta_periodicos_direito, pergunta_producao_direito, pergunta_participacao_direito, pergunta_relatoriafinal_direito;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_direito);
    }

    public void validar_campos(View view){

        pergunta_divulgacao_direito = findViewById(R.id.pergunta_divulgacao_direito);
        pergunta_encontro_direito = findViewById(R.id.pergunta_encontro_direito);
        pergunta_vinculacao_direito = findViewById(R.id.pergunta_vinculacao_direito);
        pergunta_levantamento_direito = findViewById(R.id.pergunta_levantamento_direito);
        pergunta_periodicos_direito = findViewById(R.id.pergunta_periodicos_direito);
        pergunta_producao_direito = findViewById(R.id.pergunta_producao_direito);
        pergunta_participacao_direito = findViewById(R.id.pergunta_participacao_direito);
        pergunta_relatoriafinal_direito = findViewById(R.id.pergunta_relatoriafinal_direito);

    }
}