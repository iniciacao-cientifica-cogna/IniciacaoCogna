package Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

import com.example.cogna.R;
import com.google.firebase.auth.FirebaseAuth;

import model.util.ConfiguracaoBD;

public class Farmacia extends AppCompatActivity {

    private FirebaseAuth auth;

    //private val db = FirebaseFirestore.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_farmacia);

        //autenticação no firebase
        auth = ConfiguracaoBD.firebaseautenticacao();

        //validação do campo checkbox
        CheckBox checkBox = findViewById(R.id.como_previsto);
        CheckBox checkBox1 = findViewById(R.id.adiantado);
        CheckBox checkBox2 = findViewById(R.id.atrasado);
        CheckBox checkBox3 = findViewById(R.id.nao_iniciado);
        CheckBox checkBox4 = findViewById(R.id.concluido);
    }

    public void onCheckboxClicked(View view){
        boolean checked = ((CheckBox) view).isChecked();

        int itemID = view.getId();

        if(itemID == R.id.como_previsto) {
            Toast.makeText(this, "Como previsto", Toast.LENGTH_SHORT).show();
        } else if (itemID == R.id.adiantado ) {
            Toast.makeText(this, "Adiantado", Toast.LENGTH_SHORT).show();
        } else if (itemID == R.id.atrasado) {
            Toast.makeText(this, "Atrasado", Toast.LENGTH_SHORT).show();
        } else if (itemID == R.id.nao_iniciado) {
            Toast.makeText(this, "Não iniciado", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this, "Concluido", Toast.LENGTH_SHORT).show();
        }
    }
    public void deslogar(View view){
        try {
            auth.signOut();
            finish();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}