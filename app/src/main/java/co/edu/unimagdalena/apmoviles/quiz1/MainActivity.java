package co.edu.unimagdalena.apmoviles.quiz1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Carro> carros= new ArrayList<Carro>();
    Button agregar;
    EditText placa, marca, modelo;
    ListView lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carro);
        placa = findViewById(R.id.edtplaca);
        marca = findViewById(R.id.edtmarca);
        modelo = findViewById(R.id.edtmodelo);
        agregar = findViewById(R.id.btnagregar);
        lista = findViewById(R.id.lstcarros);
        final AdaptadorCarros adaptadorcarros = new AdaptadorCarros(this,carros);
        agregar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Carro p = new Carro(placa.getText().toString(), marca.getText().toString(), modelo.getText().toString());
                carros.add(p);
                Toast.makeText(getApplicationContext(),"Carro agregado", Toast.LENGTH_LONG).show();
           /*     String cadena = "";
                for(int i=0;i<paises.size();i++){
                    Pais pa = paises.get(i);
                    cadena = cadena + pa.getNombre()+ ",";
                }
*/                 lista.setAdapter(adaptadorcarros);
                //     Toast.makeText(getApplicationContext(),cadena, Toast.LENGTH_LONG).show();

            }
        });
    }
}