package com.example.reto111;

import static com.example.reto111.R.menu.menu1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btnproductos, btnservicios, btnsucursales;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_festejos);

        setContentView(R.layout.activity_main);

        btnproductos = (Button) findViewById(R.id.btnproductos);
        btnservicios = (Button) findViewById(R.id.btnservicios);
        btnsucursales = (Button) findViewById(R.id.btnsucursales);

        btnproductos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "BTN PRODUCTO SELECCIONADO se implementara en reto 2", Toast.LENGTH_SHORT).show();
            }
        });
        btnservicios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "BTN SERVICIOS SELECCIONADO se implementara en reto 2", Toast.LENGTH_SHORT).show();
            }
        });
        btnsucursales.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "BTN SUCURSALES SELECCIONADO se implementara en reto 2", Toast.LENGTH_SHORT).show();
            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu1,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.productos:
                Toast.makeText(getApplicationContext(), "PRODUCTO SELECCIONADO se implementara en reto 2", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.servicios:
                Toast.makeText(getApplicationContext(), "SERVICIO SELECCIONADO se implementara en reto 2", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.sucursales:
                Toast.makeText(getApplicationContext(), "SUCURSAL SELECCIONADA se implementara en reto 2", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);

        }

    }
}