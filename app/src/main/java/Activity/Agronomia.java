package Activity;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.cogna.R;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.material.datepicker.MaterialDatePicker;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.core.Tag;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.auth.User;

import org.checkerframework.checker.units.qual.A;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Agronomia extends AppCompatActivity {
    //caminho para a coleção de dados Agronomia
    FirebaseFirestore db = FirebaseFirestore.getInstance();
    CollectionReference collectionRef = db.collection("Agronomia");
    Spinner pergunta_reuniao_agronomia,
            pergunta_capacitacao_agronomia,
            pergunta_primeiro_agronomia,
            pergunta_discussao_agronomia,
            pergunta_coleta_agronomia,
            pergunta_relatorio_agronomia,
            pergunta_relatorio_final_agronomia,
            pergunta_relatoriafinal_agronomia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agronomia);

        pergunta_reuniao_agronomia = findViewById(R.id.pergunta_reuniao_agronomia);
        pergunta_capacitacao_agronomia = findViewById(R.id.pergunta_capacitacao_agronomia);
        pergunta_primeiro_agronomia = findViewById(R.id.pergunta_primeiro_agronomia);
        pergunta_discussao_agronomia = findViewById(R.id.pergunta_discussao_agronomia);
        pergunta_coleta_agronomia = findViewById(R.id.pergunta_coleta_agronomia);
        pergunta_relatorio_agronomia = findViewById(R.id.pergunta_relatorio_agronomia);
        pergunta_relatorio_final_agronomia = findViewById(R.id.pergunta_relatorio_final_agronomia);
        pergunta_relatoriafinal_agronomia = findViewById(R.id.pergunta_relatoriafinal_agronomia);

        //obtem o valor selecionado no spinner
        pergunta_reuniao_agronomia.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String selectedItem = parent.getItemAtPosition(position).toString();
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
        //obtem o valor selecionado no spinner
        pergunta_capacitacao_agronomia.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
               String selectedItem = parent.getItemAtPosition(position).toString();
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
        //obtem o valor selecionado no spinner
        pergunta_primeiro_agronomia.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String selectedItem = parent.getItemAtPosition(position).toString();
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
        //obtem o valor selecionado no spinner
        pergunta_discussao_agronomia.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String selectedItem = parent.getItemAtPosition(position).toString();
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
        //obtem o valor selecionado no spinner
        pergunta_coleta_agronomia.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String selectedItem = parent.getItemAtPosition(position).toString();
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
        //obtem o valor selecionado no spinner
        pergunta_relatorio_agronomia.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String selectedItem = parent.getItemAtPosition(position).toString();
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
        //obtem o valor selecionado no spinner
        pergunta_relatorio_final_agronomia.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String selectedItem = parent.getItemAtPosition(position).toString();
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
        //obtem o valor selecionado no spinner
        pergunta_relatoriafinal_agronomia.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String selectedItem = parent.getItemAtPosition(position).toString();
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
    }

    //recebe os valores dos spinners e envia para o Firebase
    public void submeterDadosAgronomia(View view) {

        //coleta os valores selecionados de cada spinner
        String reuniao_agronomia_valor = pergunta_reuniao_agronomia.getSelectedItem().toString();
        String capacitacao_agronomia_valor = pergunta_capacitacao_agronomia.getSelectedItem().toString();
        String primeiro_agronomia_valor = pergunta_primeiro_agronomia.getSelectedItem().toString();
        String discussao_agronomia_valor = pergunta_discussao_agronomia.getSelectedItem().toString();
        String coleta_agronomia_valor = pergunta_coleta_agronomia.getSelectedItem().toString();
        String relatorio_agronomia_valor = pergunta_relatorio_agronomia.getSelectedItem().toString();
        String relatorio_final_agronomia_valor = pergunta_relatorio_final_agronomia.getSelectedItem().toString();
        String relatoriofinal_agronomia_valor = pergunta_relatoriafinal_agronomia.getSelectedItem().toString();

        AgronomiaPergunta agronomiaPergunta = new AgronomiaPergunta(reuniao_agronomia_valor, capacitacao_agronomia_valor, primeiro_agronomia_valor, discussao_agronomia_valor, coleta_agronomia_valor, relatorio_agronomia_valor, relatorio_final_agronomia_valor, relatoriofinal_agronomia_valor);

        //envia os dados para a coleção
        collectionRef.add(agronomiaPergunta.getRelatorioAgronomico())
                .addOnSuccessListener(documentReference -> Toast.makeText(Agronomia.this, "Dados salvos com sucesso!", Toast.LENGTH_SHORT).show());

        //redirecionamento para a tela das areas
        Intent telaArea = new Intent(getApplicationContext(), Area.class);
        startActivity(telaArea);
    }
}