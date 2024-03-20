package Activity;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.example.cogna.R;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;

import java.util.ArrayList;
import java.util.List;

public class Relatorio extends AppCompatActivity {

   float rainfall[] = {98.8f, 123.8f, 161.6f, 24.2f, 52f, 58.2f, 35.4f, 13.8f, 78.4f, 203.4f, 240.2f, 159.7f};
   String monthName[] = {"Jan", "Feb", "Mar", "Abri", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relatorio);

       setupPieChart();

    }
   private void setupPieChart() {
       List<PieEntry> pieEntries = new ArrayList<>();
        for (int i = 0; i < rainfall.length; i++){
            pieEntries.add(new PieEntry(rainfall[i], monthName[i]));

        }
      PieDataSet dataSet = new PieDataSet(pieEntries,"Rainfall for vancover!!!");
        PieData data = new PieData(dataSet);

        PieChart chart = (PieChart) findViewById(R.id.chart);
        chart.setData(data);
        chart.invalidate();

    }

}
