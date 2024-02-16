package Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Spinner;

import com.example.cogna.R;

public class Medicina extends AppCompatActivity {

    Spinner activity_medicina_spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medicina);
        activity_medicina_spinner = findViewById(R.id.activity_medicina_spinner);
    }
}