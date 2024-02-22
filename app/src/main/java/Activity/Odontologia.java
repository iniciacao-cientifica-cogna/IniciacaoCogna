package Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;

import com.example.cogna.R;

public class Odontologia extends AppCompatActivity {

    Spinner pergunta_treinamento_odontologia,
            pergunta_recrutamento_odontologia,
            pergunta_coleta_odontologia,
            pergunta_analise_odontologia,
            pergunta_divulgacao_odontologia;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_odontologia);
    }
    public void validar_campos(View view){
        pergunta_treinamento_odontologia = findViewById(R.id.pergunta_treinamento_odontologia);
        pergunta_recrutamento_odontologia= findViewById(R.id.pergunta_recrutamento_odontologia);
        pergunta_coleta_odontologia = findViewById(R.id.pergunta_coleta_odontologia);
        pergunta_analise_odontologia = findViewById(R.id.pergunta_analise_odontologia);
        pergunta_divulgacao_odontologia = findViewById(R.id.pergunta_divulgacao_odontologia);
    }
}