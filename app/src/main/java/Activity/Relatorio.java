package Activity;
import android.graphics.Color;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import java.util.ArrayList;
import com.example.cogna.R;



public class Relatorio extends AppCompatActivity {

   float rainfall[] = {98.8f, 123.8f, 161.6f, 24.2f, 52f, 58.2f, 35.4f, 13.8f, 78.4f, 203.4f, 240.2f, 159.7f};
   String monthName[] = {"Jan", "Feb", "Mar", "Abri", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relatorio);




        PieChart pieChart = findViewById(R.id.pie_chart);


        // Valor inicial do relatório
        float valorAtual = 0f;
        // Valor máximo do relatório
        float total = 12f;

        // Lista de entradas para o gráfico
        ArrayList<PieEntry> entries = new ArrayList<>();
        // Adiciona uma entrada para o "contador"
        entries.add(new PieEntry(total, "Contador"));
        // Adiciona uma entrada para o "relatório"
        entries.add(new PieEntry(valorAtual, "Relatório"));

        // Cria um conjunto de dados para o gráfico
        PieDataSet dataSet = new PieDataSet(entries, "Contador e Relatório");
        // Define as cores para o conjunto de dados
        dataSet.setColors(Color.LTGRAY, Color.BLUE);
        // Define o tamanho do texto dos valores
        dataSet.setValueTextSize(12f);

        // Cria os dados do gráfico
        PieData pieData = new PieData(dataSet);
        // Define os dados para o gráfico
        pieChart.setData(pieData);
        // Atualiza o gráfico
        pieChart.invalidate(); // refresh
    }

}
