package com.maison.agenda.ui.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.maison.agenda.R;

public class FormularioAlunoActivity extends AppCompatActivity {

    private static final CharSequence TITULO = "Formulário de Alunos";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario_aluno);
        setTitle(TITULO);
    }
}
