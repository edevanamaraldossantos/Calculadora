package br.com.grupointegrado.edevan.excalculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText tnumero1;
    private EditText tnumero2;
    private EditText tresultado;
    private Button soma;
    private Button subtracao;
    private Button nmultiplicar;
    private Button dividir;
    private Button mostrar;
    private Button limpar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tnumero1 = (EditText) findViewById(R.id.numero1);
        tnumero2 = (EditText) findViewById(R.id.numero2);
        tresultado = (EditText) findViewById(R.id.resultado);

    }

    public void somar(View v){
        Double numero1 = Double.parseDouble(tnumero1.getText().toString());
        Double numero2 = Double.parseDouble(tnumero2.getText().toString());
        Double resultado = numero1 + numero2;
        tresultado.setText(resultado.toString());
    }

    public void subtrair(View v){
        Double numero1 = Double.parseDouble(tnumero1.getText().toString());
        Double numero2 = Double.parseDouble(tnumero2.getText().toString());
        Double resultado = numero1 - numero2;
        tresultado.setText(resultado.toString());
    }

    public void multiplicar(View v){
        Double numero1 =Double.parseDouble(tnumero1.getText().toString());
        Double numero2 =Double.parseDouble(tnumero2.getText().toString());
        Double resultado = numero1 * numero2;
        tresultado.setText(resultado.toString());
    }

    public void dividir(View v){
        Double numero1 =Double.parseDouble(tnumero1.getText().toString());
        Double numero2 =Double.parseDouble(tnumero2.getText().toString());
        Double resultado = numero1/numero2;
        tresultado.setText(resultado.toString());
    }

    public void limpar(View v){
         tnumero1.setText("");
         tnumero2.setText("");
         tresultado.setText("");
    }


}
