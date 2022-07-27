package com.example.organizze.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.organizze.R;
import com.example.organizze.helper.DateCustom;
import com.example.organizze.model.Movimentacao;
import com.google.android.material.textfield.TextInputEditText;

public class DespesasActivity extends AppCompatActivity {

    private TextInputEditText campoData, campoCategoria, campoDescricao;
    private EditText campoValor;
    private Movimentacao movimentacao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_despesas);

        campoData = findViewById(R.id.editData);
        campoCategoria = findViewById(R.id.editCategoria);
        campoDescricao = findViewById(R.id.editDescricao);
        campoValor = findViewById(R.id.editValor);

        /* Preenche o campo da data com data atual*/
        campoData.setText( DateCustom.dataAtual() );
    }

    public void salvarDespesa(View view){
        movimentacao = new Movimentacao();
        String data = campoData.getText().toString();
        movimentacao.setValor( Double.parseDouble( campoValor.getText().toString() ) );
        movimentacao.setCategoria( campoCategoria.getText().toString() );
        movimentacao.setDescricao( campoDescricao.getText().toString() );
        movimentacao.setData( data );
        movimentacao.setTipo( "D" );

        movimentacao.salvar( data );
    }
}