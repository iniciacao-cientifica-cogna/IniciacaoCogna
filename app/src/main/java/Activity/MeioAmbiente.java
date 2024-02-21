package Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Spinner;

import com.example.cogna.R;



public class MeioAmbiente extends AppCompatActivity {

    Spinner activity_meio_ambiente_levantamentoBibliografico_spinner,
            activity_meio_ambiente_STF_spinner,
            activity_meio_ambiente_revisaoBibliografica_spinner,
            activity_meio_ambiente_elaboracaoEscrita_spinner,
            activity_meio_ambiente_analiseDiscurso_spinner,
            activity_meio_ambiente_revisãoDados_spinner,
            activity_meio_ambiente_elaboracaoTextoFinal_spinner;

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
}