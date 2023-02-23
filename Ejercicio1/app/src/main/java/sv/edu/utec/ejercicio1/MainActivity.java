package sv.edu.utec.ejercicio1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //OBTENEMOS LOS OBJETOS INGRESADOS
    private EditText usuario,contra;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        usuario = findViewById(R.id.edtUsuario);
        contra = findViewById(R.id.edtPassword);
    }


    public void validarLogin(View view){

        //validamos contra una cadena de texto
        System.out.println(usuario.getText()+"  "+contra.getText());
        if (usuario.getText().toString().equals("") || contra.getText().toString().equals("")){
            Toast toastP = new Toast(getApplicationContext());
            LayoutInflater inflater = getLayoutInflater();
            View layout = inflater.inflate(R.layout.toast_layout,findViewById(R.id.lytMensaje));


            TextView txtMensaje=(TextView) layout.findViewById(R.id.textView3);
            txtMensaje.setText("Ingrese los datos por favor");

            toastP.setDuration(Toast.LENGTH_LONG);
            toastP.setView(layout);
            toastP.show();
        }else{
            if (usuario.getText().toString().equals("parcialETps1") && contra.getText().toString().equals("p4rC14l#tp$")){
                Intent intento=new Intent(this,Dashboard.class);
                startActivity(intento);
            }else{
                Toast toastP = new Toast(getApplicationContext());
                LayoutInflater inflater = getLayoutInflater();
                View layout = inflater.inflate(R.layout.toast_layout,findViewById(R.id.lytMensaje));


                TextView txtMensaje=(TextView) layout.findViewById(R.id.textView3);
                txtMensaje.setText("contraseña y usuario no son correctos");

                toastP.setDuration(Toast.LENGTH_LONG);
                toastP.setView(layout);
                toastP.show();
            }
        }


    }
}