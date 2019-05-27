package com.maison.agenda;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView texto = new TextView(this);
        setContentView(R.layout.activity_main);
    List<String> listaDeAlunos = Arrays.asList("Francisco","Roberto","Márcio","Maria","Ana");
        ListView listadealunos = findViewById(R.id.activity_main_lista_alunos);
        listadealunos.setAdapter(new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,listaDeAlunos));



//        Toast.makeText(this, "Maison Galvão", Toast.LENGTH_SHORT).show();
    }
}
