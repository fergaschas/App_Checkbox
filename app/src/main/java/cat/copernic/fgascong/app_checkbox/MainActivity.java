package cat.copernic.fgascong.app_checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText edt_firstValue, edt_secondValue;
    private CheckBox check_sumar, check_restar;
    private TextView tv_resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edt_firstValue = findViewById(R.id.edt_value1);
        edt_secondValue = findViewById(R.id.edt_value2);

        check_sumar = findViewById(R.id.check_sumar);
        check_restar = findViewById(R.id.check_restar);

        tv_resultado = findViewById(R.id.txt_resultado);
    }

    public void calcular(View view){
        try {


            int value1 = Integer.parseInt(edt_firstValue.getText().toString());
            int value2 = Integer.parseInt(edt_secondValue.getText().toString());

            String resultado = "";

            if (check_sumar.isChecked()) {
                int suma = value1 + value2;
                resultado += "La suma es: " + suma + "\n";
            }
            if (check_restar.isChecked()) {
                int resta = value1 - value2;
                resultado += "La resta es: " + resta;
            }

            tv_resultado.setText(resultado);
        }catch(Exception e){
            Toast.makeText(this,"Faltan valores a rellenar",Toast.LENGTH_SHORT).show();
        }
    }
}