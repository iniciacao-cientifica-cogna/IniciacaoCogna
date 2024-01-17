package Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.cogna.R;

public class MainActivity extends AppCompatActivity {
    //criaçao de botão para redirecionar tela
    Button botaoCadastro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //redirecionamento de tela activity_main para activity_cadastro
        botaoCadastro=findViewById(R.id.TelaDeCadastro);
        botaoCadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            //método para trocar as telas
            public void onClick(View v) {
                Intent telaCadastro = new Intent(getApplicationContext(),Cadastro.class);
                startActivity(telaCadastro);
            }
        });
    }
}