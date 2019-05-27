package com.maison.agenda;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List<String> alunos = new ArrayList<>(Arrays.asList("Alex","José","Rodrigo","Ana","Maria","Fonseca"));
        ListView listaDeAlunos = findViewById(R.id.activity_main_lista_alunos);
        listaDeAlunos.setAdapter(new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,alunos));


    }
}
