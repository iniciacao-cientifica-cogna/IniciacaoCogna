package Activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.cogna.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthInvalidCredentialsException;
import com.google.firebase.auth.FirebaseAuthInvalidUserException;
import com.google.firebase.auth.FirebaseUser;

import model.Usuario;
import model.util.ConfiguracaoBD;

public class MainActivity extends AppCompatActivity {
    //criaçao de botão para redirecionar tela
    Button botaoCadastro;

    EditText campoEmail, campoSenha;
    Button botaoAcessar;
    private FirebaseAuth auth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //inicializa a conexão com o banco de dados (firebase)
        auth = ConfiguracaoBD.firebaseautenticacao();
        inicializarComponente();

        //redirecionamento de tela activity_main para activity_cadastro
        botaoCadastro=findViewById(R.id.TelaDeCadastro);
        botaoCadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            //método para trocar as telas
            public void onClick(View view) {
                Intent telaCadastro = new Intent(getApplicationContext(),Cadastro.class);
                startActivity(telaCadastro);
            }
        });
    }
    //método para validar o usuário
    public void validarAutenticacao(View view){
        String email = campoEmail.getText().toString();
        String senha = campoSenha.getText().toString();

        //validacao
        if(!email.isEmpty()){
            if(!senha.isEmpty()){

                Usuario usuario = new Usuario();

                usuario.setEmail(email);
                usuario.setSenha(senha);

                logar(usuario);

            }else{
                Toast.makeText(this, "Preencher a senha", Toast.LENGTH_SHORT).show();
            }
        }else{
            Toast.makeText(this, "Preencher o e-mail", Toast.LENGTH_SHORT).show();
        }
    }

    //logar usuário
    private void logar(Usuario usuario) {
        auth.signInWithEmailAndPassword(
                usuario.getEmail(), usuario.getSenha()
        ).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if(task.isSuccessful()){
                    abrirLogado();
                }else{
                    String excecao = "";
                    try {
                        throw task.getException();
                    }catch (FirebaseAuthInvalidUserException e){
                        excecao = "Usuário não cadastrado";
                    }catch (FirebaseAuthInvalidCredentialsException e){
                        excecao = "E-mail ou senha incorreto";
                    }catch (Exception e){
                        excecao = "Erro ao logar o usuario" + e.getMessage();
                        e.printStackTrace();;
                    }
                    Toast.makeText(MainActivity.this, excecao, Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
    //método para manter o usuário logado na aplicação
    private void abrirLogado() {
        Intent i = new Intent(MainActivity.this,Area.class);
        startActivity(i);
    }
    @Override
    protected void onStart(){
    super.onStart();
        FirebaseUser usuarioAuth = auth.getCurrentUser();
        if (usuarioAuth != null){
            abrirLogado();
        }
    }

    private void inicializarComponente(){
        campoEmail = findViewById(R.id.NomeDeUsuario);
        campoSenha = findViewById(R.id.Senha);
        botaoAcessar = findViewById(R.id.cadastrar);
    }
}