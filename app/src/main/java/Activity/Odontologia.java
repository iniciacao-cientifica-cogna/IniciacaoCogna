package Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Spinner;

import com.example.cogna.R;

public class Odontologia extends AppCompatActivity {

    Spinner activity_odotonlogia_spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_odontologia);
        activity_odotonlogia_spinner = findViewById(R.id.activity_odotonlogia_spinner);
    }
}