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
import com.google.android.gms.common.server.converter.StringToIntConverter;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthInvalidCredentialsException;
import com.google.firebase.auth.FirebaseAuthUserCollisionException;
import com.google.firebase.auth.FirebaseAuthWeakPasswordException;

import model.Usuario;
import model.util.ConfiguracaoBD;

public class Cadastro extends AppCompatActivity {
    //objeto usuário
    Usuario usuario;
    //objeto autenticacao
    FirebaseAuth autenticacao;

    //variaveis globais para receber os dados do cadastro do usuario
    EditText campoNome, campoEmail, campoSenha, campoConfirmaSenha;
    Button botaoCadastro;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);
        FirebaseApp.initializeApp(this);
    inicializar();
    }
        //método para inicializar os componentes
    private void inicializar(){
        campoNome = findViewById(R.id.CadastroDeUsuario);
        campoSenha = findViewById(R.id.CadastroSenha);
        campoConfirmaSenha = findViewById(R.id.ConfirmaSenha);
        campoEmail = findViewById(R.id.CadastroDeEmail);
        botaoCadastro = findViewById(R.id.cadastrar);
    }
    public void validarCampos(View view){
        String nome = campoNome.getText().toString();
        String senha = campoSenha.getText().toString();
        String confirmaSenha = campoConfirmaSenha.getText().toString();
        String email = campoEmail.getText().toString();

        //validacao
        if (!nome.isEmpty()){
            if(!senha.isEmpty()){
                if(!confirmaSenha.isEmpty() && confirmaSenha.equals(senha)){
                    if(!email.isEmpty()){

                        usuario = new Usuario();

                        usuario.setNome(nome);
                        usuario.setSenha(senha);
                        usuario.setEmail(email);

                        //cadastro do usuario
                        cadastrarUsuario();

                    }else {
                        Toast.makeText(this, "Preencha o e-mail", Toast.LENGTH_SHORT).show();
                    }
                }else {
                    Toast.makeText(this, "Senhas não conferem", Toast.LENGTH_SHORT).show();
                }
            }else{
                Toast.makeText(this, "Preencha a senha", Toast.LENGTH_SHORT).show();
                }
        }else{
            Toast.makeText(this, "Preencha o nome", Toast.LENGTH_SHORT).show();
            }
    }
    //redirecionamento para a tela principal
    private void telaInicial(View view){
        Intent i = new Intent(Cadastro.this,MainActivity.class);
        startActivity(i);
    }
    private void cadastrarUsuario() {
        autenticacao = ConfiguracaoBD.firebaseautenticacao();
        autenticacao.createUserWithEmailAndPassword(
                usuario.getEmail(), usuario.getSenha()
        ).addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if(task.isSuccessful()){
                    Toast.makeText(Cadastro.this, "Sucesso ao cadastrar o usuario", Toast.LENGTH_SHORT).show();
                }else{
                      String excecao = "";
                      try {
                          throw task.getException();
                      }catch (FirebaseAuthWeakPasswordException e){
                          excecao = "Digite uma senha mais forte";
                      }catch (FirebaseAuthInvalidCredentialsException e){
                          excecao = "Digite um e-mail válido";
                      }catch (FirebaseAuthUserCollisionException e){
                          excecao = "Esta conta já exixte";
                      } catch (Exception e){
                          excecao = "Erro ao cadastrar usuario"+ e.getMessage();
                          e.printStackTrace();
                      }
                    Toast.makeText(Cadastro.this, excecao, Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}