package model.util;

import com.google.firebase.auth.FirebaseAuth;

//classe para cpnfiguração do firebase
public class ConfiguracaoBD {
    //atributo
    private static FirebaseAuth auth;
    //metodo static para autenticacao
    public static FirebaseAuth firebaseautenticacao(){

        //verifica se existe uma instancia no firebase válida
        if(auth == null){
            auth =FirebaseAuth.getInstance();
        }
        return auth;
    }
}
