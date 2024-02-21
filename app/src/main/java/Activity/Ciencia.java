package Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Spinner;

import com.example.cogna.R;

public class Ciencia extends AppCompatActivity {


    Spinner activity_ciencia_spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ciencia);
        activity_ciencia_spinner = findViewById(R.id.activity_ciencia_spinner);
    }
}