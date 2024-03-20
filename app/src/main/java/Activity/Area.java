package Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.cogna.R;

public class Area extends AppCompatActivity {

     @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_area);
    }
    public void farmacia(View view){
        Intent TelaFarmacia = new Intent(getApplicationContext(), Farmacia.class);
        startActivity(TelaFarmacia);
    }

    public void medico(View view){
         Intent Telamedicina = new Intent(getApplicationContext(), Medicina.class);
         startActivity(Telamedicina);
    }
    public void ciencia(View view){
        Intent TelaCiencia = new Intent(getApplicationContext(), Ciencia.class);
        startActivity(TelaCiencia);
    }
    public void tic(View view){
        Intent TelaTIC = new Intent(getApplicationContext(), TIC.class);
        startActivity(TelaTIC);
    }
    public void meio(View view){
        Intent TelaMeio = new Intent(getApplicationContext(), MeioAmbiente.class);
        startActivity(TelaMeio);
    }
    public void odontologia(View view){
        Intent Telaodontologia = new Intent(getApplicationContext(), Odontologia.class);
        startActivity(Telaodontologia);
    }
    public void direito(View view){
        Intent TelaoDireito = new Intent(getApplicationContext(), Direito.class);
        startActivity(TelaoDireito);
    }
    public void agronomia(View view){
        Intent TelaAgronomia = new Intent(getApplicationContext(), Agronomia.class);
        startActivity(TelaAgronomia);
    }
    public void relatorio(View view){
        Intent TelaRelatorio = new Intent(getApplicationContext(), Relatorio.class);
        startActivity(TelaRelatorio);
    }
}