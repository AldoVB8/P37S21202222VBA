package mx.edu.tesoem.isc.p37s21202222vba;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button suma, resta, division, multiplicacion;
    EditText txtnum1, txtnum2;
    TextView lblresult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        lblresult = findViewById(R.id.btnsuma);
        lblresult = findViewById(R.id.btnresta);
        lblresult = findViewById(R.id.btnmulti);
        lblresult = findViewById(R.id.btndivision);
        txtnum1 = findViewById(R.id.txtnum1);
        txtnum2 = findViewById(R.id.txtnum2);
        lblresult = findViewById(R.id.lblresult);

        suma = findViewById(R.id.btnsuma);
        suma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1 = Integer.parseInt(txtnum1.getText().toString());
                int num2 = Integer.parseInt(txtnum2.getText().toString());
                txtnum1.setText("");
                txtnum2.setText("");
                lblresult.setText(lblresult.getText().toString() + " " + String.valueOf(num1 + num2));
            }
        });

        resta = findViewById(R.id.btnresta);
        resta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1 = Integer.parseInt(txtnum1.getText().toString());
                int num2 = Integer.parseInt(txtnum2.getText().toString());
                txtnum1.setText("");
                txtnum2.setText("");
                lblresult.setText("Resultado");
                lblresult.setText(lblresult.getText().toString() + " " + String.valueOf(num1 - num2));


            }
        });

        multiplicacion = findViewById(R.id.btnmulti);
        multiplicacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1 = Integer.parseInt(txtnum1.getText().toString());
                int num2 = Integer.parseInt(txtnum2.getText().toString());
                txtnum1.setText("");
                txtnum2.setText("");
                lblresult.setText("Resultado");
                lblresult.setText(lblresult.getText().toString() + " " + String.valueOf(num1 * num2));

            }
        });

        division = findViewById(R.id.btndivision);
    }
        public void div (View view){
            int num1 = Integer.parseInt(txtnum1.getText().toString());
            int num2 = Integer.parseInt(txtnum2.getText().toString());
            txtnum1.setText("");
            txtnum2.setText("");
            lblresult.setText("Resultado");
            if (num2 == 0) {
                Toast.makeText(MainActivity.this, "No se puede dividir entre 0", Toast.LENGTH_SHORT).show();
            } else {
                lblresult.setText(lblresult.getText().toString() + " " + String.valueOf(num1 / num2));
            }
        }
    }
