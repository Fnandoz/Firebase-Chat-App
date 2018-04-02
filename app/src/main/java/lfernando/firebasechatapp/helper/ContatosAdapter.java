package lfernando.firebasechatapp.helper;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

import lfernando.firebasechatapp.R;
import lfernando.firebasechatapp.model.Contato;

/**
 * Created by fernando on 01/03/2018.
 */

public class ContatosAdapter extends BaseAdapter {

    private List<Contato> contatoList;
    private Activity activity;

    public ContatosAdapter(List<Contato> contatoList, Activity activity) {
        this.contatoList = contatoList;
        this.activity = activity;
    }

    @Override
    public int getCount() {
        return contatoList.size();
    }

    @Override
    public Object getItem(int position) {
        return contatoList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = activity.getLayoutInflater().inflate(R.layout.single_contato, parent, false);
        Contato contato = contatoList.get(position);
        TextView nomeTV = view.findViewById(R.id.nomeListaContatos);
        nomeTV.setText(contato.getNome());

        return view;
    }
}
