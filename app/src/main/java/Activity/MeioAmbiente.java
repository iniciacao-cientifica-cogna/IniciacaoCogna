package Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;

import com.example.cogna.R;



public class MeioAmbiente extends AppCompatActivity {

<<<<<<< HEAD
    Spinner pergunta_levantamento_meioambiente, pergunta_stf_meioambiente, pergunta_revisao_meioambiente, pergunta_elaboracao_meioambiente, pergunta_analise_meioambiente, pergunta_dados_meioambiente, pergunta_revicao_meioambiente;
=======
    Spinner activity_meio_ambiente_levantamentoBibliografico_spinner,
            activity_meio_ambiente_STF_spinner,
            activity_meio_ambiente_revisaoBibliografica_spinner,
            activity_meio_ambiente_elaboracaoEscrita_spinner,
            activity_meio_ambiente_analiseDiscurso_spinner,
            activity_meio_ambiente_revisãoDados_spinner,
            activity_meio_ambiente_elaboracaoTextoFinal_spinner;
>>>>>>> d73b114f5ec37e4ecd71234b61e0535ff6c4a95f

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meio_ambiente);
        activity_meio_ambiente_levantamentoBibliografico_spinner = findViewById(R.id.activity_meio_ambiente_levantamentoBibliografico_spinner);
        activity_meio_ambiente_STF_spinner = findViewById(R.id.activity_meio_ambiente_STF_spinner);
        activity_meio_ambiente_revisaoBibliografica_spinner = findViewById(R.id.activity_meio_ambiente_revisaoBibliografica_spinner);
        activity_meio_ambiente_elaboracaoEscrita_spinner = findViewById(R.id.activity_meio_ambiente_elaboracaoEscrita_spinner);
        activity_meio_ambiente_analiseDiscurso_spinner = findViewById(R.id.activity_meio_ambiente_analiseDiscurso_spinner);
        activity_meio_ambiente_revisãoDados_spinner= findViewById(R.id.activity_meio_ambiente_revisãoDados_spinner);
        activity_meio_ambiente_elaboracaoTextoFinal_spinner= findViewById(R.id.activity_meio_ambiente_elaboracaoTextoFinal_spinner);
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