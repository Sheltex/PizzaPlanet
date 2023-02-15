package br.com.etecia.pizzaplanet;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RatingBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ListView idListaValores;

    String idTitulo [] = {"Pizza Toscana"};
    String idDesc[] = {"Mais uma tradição da Itália, a Toscana da Rede Leve Pizza com muita calabresa ralada e bacon vai levar um sabor diferenciado para sua mesa. Experimente, é garantia de satisfação."};
    String idNota[] = {"0.5"};
    int idImagemPizza [] = {R.drawable.toscana};

    double rating[] = {0.5};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

            idListaValores = findViewById(R.id.idListaValores);
            MyAdapter adapter=new MyAdapter();
            idListaValores.setAdapter(adapter);

    }
    public class MyAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return idImagemPizza.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            return null;
        }

       ImageView img;
        TextView t, st, n;

        View v = getLayoutInflater().inflate(R.layout.modelo_cardapio, null);
        img = v.fi



    }
}