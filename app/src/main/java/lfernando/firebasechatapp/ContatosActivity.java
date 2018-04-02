package lfernando.firebasechatapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import lfernando.firebasechatapp.helper.ContatosAdapter;
import lfernando.firebasechatapp.model.Contato;

public class ContatosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contatos);

        final List<Contato> contatos = new ArrayList<>();

        ContatosAdapter adapter = new ContatosAdapter(contatos, this);

        ListView listView = findViewById(R.id.contatosListView);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Contato contato = contatos.get(position);
                Toast.makeText(ContatosActivity.this, "Contato "+contato.getNome(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
