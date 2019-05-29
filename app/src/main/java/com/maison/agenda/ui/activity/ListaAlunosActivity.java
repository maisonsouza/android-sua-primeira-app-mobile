package com.maison.agenda.ui.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.maison.agenda.R;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListaAlunosActivity extends AppCompatActivity {

    private static final CharSequence TITULO = "Lista de Alunos";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_de_alunos);
        setTitle(TITULO);
        List<String> alunos = new ArrayList<>(Arrays.asList("Alex","José","Rodrigo","Ana","Maria","Fonseca"));
        ListView listaDeAlunos = findViewById(R.id.activity_lista_alunos_listview);
        listaDeAlunos.setAdapter(new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,alunos));


    }
}
