package Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Spinner;

import com.example.cogna.R;

public class Agronomia extends AppCompatActivity {

    Spinner activity_agronomia_spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agronomia);
        activity_agronomia_spinner = findViewById(R.id.activity_agronomia_spinner);
    }
}