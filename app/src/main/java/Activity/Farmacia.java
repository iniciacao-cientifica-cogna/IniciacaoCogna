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