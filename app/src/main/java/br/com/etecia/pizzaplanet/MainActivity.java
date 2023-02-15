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

    String Titulo[] = {"Pizza Toscana"};
    String Desc[] = {"Mais uma tradição da Itália, a Toscana da Rede Leve Pizza com muita calabresa ralada e bacon vai levar um sabor diferenciado para sua mesa. Experimente, é garantia de satisfação."};
    String Nota[] = {"0.5"};
    int ImagemPizza[] = {R.drawable.toscana};

    double rating[] = {0.5};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        idListaValores = findViewById(R.id.idListaValores);
        MyAdapter adapter = new MyAdapter();
        idListaValores.setAdapter(adapter);

    }

    public class MyAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return ImagemPizza.length;
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
            ImageView img;
            TextView t, st, n;

            View v = getLayoutInflater().inflate(R.layout.modelo_cardapio, null);

            img = v.findViewById(R.id.idImagemPizza);
            t = v.findViewById(R.id.idTitulo);
            st = v.findViewById(R.id.idDesc);
            n = v.findViewById(R.id.idNota);

            t.setText(Titulo[i]);
            st.setText(Desc[i]);
            n.setText(Nota[i]);
            img.setImageResource(ImagemPizza[i]);

            return v;
        }

    }
}