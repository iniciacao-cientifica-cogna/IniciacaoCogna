package Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Spinner;

import com.example.cogna.R;

public class TIC extends AppCompatActivity {

    Spinner activity_tic_spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tic);
        activity_tic_spinner = findViewById(R.id.activity_tic_spinner);
    }
}