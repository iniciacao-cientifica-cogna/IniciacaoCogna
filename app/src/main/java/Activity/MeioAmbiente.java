package Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;

import com.example.cogna.R;



public class MeioAmbiente extends AppCompatActivity {

    Spinner pergunta_levantamento_meioambiente, pergunta_stf_meioambiente, pergunta_revisao_meioambiente, pergunta_elaboracao_meioambiente, pergunta_analise_meioambiente, pergunta_dados_meioambiente, pergunta_revicao_meioambiente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meio_ambiente);
    }
     public void validar_campos(View view){

         pergunta_levantamento_meioambiente = findViewById(R.id.pergunta_levantamento_meioambiente);
         pergunta_stf_meioambiente = findViewById(R.id.pergunta_stf_meioambiente);
         pergunta_revisao_meioambiente = findViewById(R.id.pergunta_revisao_meioambiente);
         pergunta_elaboracao_meioambiente = findViewById(R.id.pergunta_elaboracao_meioambiente);
         pergunta_analise_meioambiente = findViewById(R.id.pergunta_levantamento_meioambiente);
         pergunta_dados_meioambiente = findViewById(R.id.pergunta_dados_meioambiente);
         pergunta_revicao_meioambiente = findViewById(R.id.pergunta_revicao_meioambiente);
    }
}