package Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Spinner;

import com.example.cogna.R;

public class MeioAmbiente extends AppCompatActivity {

    Spinner activity_meio_ambiente_spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meio_ambiente);
        activity_meio_ambiente_spinner = findViewById(R.id.activity_meio_ambiente_spinner);
    }
}