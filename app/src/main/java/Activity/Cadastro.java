package Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.cogna.R;
import com.google.android.gms.common.server.converter.StringToIntConverter;
import com.google.firebase.auth.FirebaseAuth;

import model.Usuario;

public class Cadastro extends AppCompatActivity {
    //objeto usuário
    Usuario usuario;
    //objeto autenticacao
    FirebaseAuth autenticacao;

    EditText campoNome, campoEmail, campoSenha, campoConfirmaSenha;
    Button botaoCadastro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);
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
                if(!confirmaSenha.isEmpty()){
                    if(confirmaSenha != senha){
                        if(!email.isEmpty()){

                        Usuario usuario = new Usuario();

                        usuario.setNome(nome);
                        usuario.setSenha(senha);
                        usuario.setEmail(email);

                        //cadastro do usuario
                        cadastrarUsuario();

                        }else {
                            Toast.makeText(this, "Preencha o e-mail", Toast.LENGTH_SHORT).show();
                             }
                    }else{
                        Toast.makeText(this, "Senhas não são iguais", Toast.LENGTH_SHORT).show();
                    }
                }else {
                    Toast.makeText(this, "Preencha a senha", Toast.LENGTH_SHORT).show();
                }
            }else{
                Toast.makeText(this, "Preencha a senha", Toast.LENGTH_SHORT).show();
                }
        }else{
            Toast.makeText(this, "Preencha o nome", Toast.LENGTH_SHORT).show();
            }
    }

    private void cadastrarUsuario() {
    }
}