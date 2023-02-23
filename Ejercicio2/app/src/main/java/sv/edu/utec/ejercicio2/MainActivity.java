package sv.edu.utec.ejercicio2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView resultado;
    EditText pes,alt;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pes =findViewById(R.id.edtPeso);
        alt =findViewById(R.id.edtEstatura);
        resultado = findViewById(R.id.tvResultado);
    }

    public void calcular(View view) {
        double imc = 0;
        imc = Double.parseDouble(pes.getText().toString())/(Double.parseDouble(alt.getText().toString())*Double.parseDouble(alt.getText().toString()));
        System.out.println(imc);
        if (imc < 10.5){
            resultado.setText("Su peso ingresado: "+pes.getText().toString()+ "\nSu altura ingresado:"+alt.getText().toString()+"\nEstado: Críticamente Bajo de Peso");
        }else if (imc < 15.9){
            resultado.setText("Su peso ingresado: "+pes.getText().toString()+ "\nSu altura ingresado:"+alt.getText().toString()+"\nEstado: Severamente Bajo de Peso");
        }else if (imc < 18.5){
            resultado.setText("Su peso ingresado: "+pes.getText().toString()+ "\nSu altura ingresado:"+alt.getText().toString()+"\nEstado: SobrePeso");
        }else if (imc < 25){
            resultado.setText("Su peso ingresado: "+pes.getText().toString()+ "\nSu altura ingresado:"+alt.getText().toString()+"\nEstado: Normal (Peso Saludable)");
        }else if (imc < 30){
            resultado.setText("Su peso ingresado: "+pes.getText().toString()+ "\nSu altura ingresado:"+alt.getText().toString()+"\nSobrepeso");
        }else if (imc < 35){
            resultado.setText("Su peso ingresado: "+pes.getText().toString()+ "\nSu altura ingresado:"+alt.getText().toString()+"\nEstado: Obesidad Clase 1 - Moderadamente Obeso");
        }else if (imc < 40){
            resultado.setText("Su peso ingresado: "+pes.getText().toString()+ "\nSu altura ingresado:"+alt.getText().toString()+"\nEstado: Obesidad Clase 2 - Severamente Obeso");
        }else if (imc > 50){
            resultado.setText("Su peso ingresado: "+pes.getText().toString()+ "\nSu altura ingresado:"+alt.getText().toString()+"\nEstado: Obesidad Clase 3 - Criticamente Obeso");
        }else{
            resultado.setText("Valores ingresados incorrectamente, Vuelva a ingresarlos por favor");
        }


    }
}