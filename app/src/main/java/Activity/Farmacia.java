package Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.cogna.R;
import com.google.firebase.auth.FirebaseAuth;

import model.util.ConfiguracaoBD;

public class Farmacia extends AppCompatActivity {

    Spinner pergunta_levantamento_farmacia, pergunta_tcle_farmacia, pergunta_revisao_farmacia, pergunta_atividades_farmacia, pergunta_eac_farmacia, pergunta_curso_farmacia, pergunta_analise_dados_farmacia, pergunta_elaboracao_farmacia;
    private FirebaseAuth auth;

    //private val db = FirebaseFirestore.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_farmacia);

        //autenticação no firebase
        auth = ConfiguracaoBD.firebaseautenticacao();
    }

    public void deslogar(View view){
        try {
            auth.signOut();
            finish();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void validar_campos(View view){

        pergunta_levantamento_farmacia = findViewById(R.id.pergunta_levantamento_farmacia);
        pergunta_tcle_farmacia = findViewById(R.id.pergunta_tcle_farmacia);
        pergunta_revisao_farmacia = findViewById(R.id.pergunta_revisao_farmacia);
        pergunta_atividades_farmacia = findViewById(R.id.pergunta_atividades_farmacia);
        pergunta_eac_farmacia = findViewById(R.id.pergunta_eac_farmacia);
        pergunta_curso_farmacia = findViewById(R.id.pergunta_curso_farmacia);
        pergunta_analise_dados_farmacia = findViewById(R.id.pergunta_analise_dados_farmacia);
        pergunta_elaboracao_farmacia = findViewById(R.id.pergunta_elaboracao_farmacia);
    }
}