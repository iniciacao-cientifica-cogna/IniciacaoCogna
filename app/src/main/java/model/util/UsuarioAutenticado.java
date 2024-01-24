package model.util;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;


//classe para manter o usuario logado na aplicação após logado
public class UsuarioAutenticado {
    public static FirebaseUser usuariologado (){
        FirebaseAuth usuario = ConfiguracaoBD.firebaseautenticacao();
        return usuario.getCurrentUser();
    }
}
