package br.com.etecia.myapp;

import android.os.Bundle;
import android.widget.LinearLayout;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ListaProdutosActivity extends AppCompatActivity {

    RecyclerView idListaProdutos;
    List<Produtos> lstProdutos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.lista_produtos_layout);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        //criando array q vai ter a lista de produtos
        lstProdutos = new ArrayList<>();
        lstProdutos.add(new Produtos("Pelucia Hello Kitty pequena", R.drawable.img1));
        lstProdutos.add(new Produtos("Pelucia Capivara de chapéu", R.drawable.img6));
        lstProdutos.add(new Produtos("Pelucia Keroppi Sanrio", R.drawable.img5));
        lstProdutos.add(new Produtos("Pelucia Pou", R.drawable.img7));
        lstProdutos.add(new Produtos("Pelucia Tartaruga", R.drawable.img11));
        lstProdutos.add(new Produtos("Pelucia Porquinho", R.drawable.img13));
        lstProdutos.add(new Produtos("Pelucia Morcego", R.drawable.img10));
        lstProdutos.add(new Produtos("Pelucia Galinha Pintadinha", R.drawable.img8));
        lstProdutos.add(new Produtos("Pelucia Sullivan", R.drawable.img9));
        lstProdutos.add(new Produtos("Pelucia Hello Kitty Grande", R.drawable.img2));
        lstProdutos.add(new Produtos("Pelucia Pompompurin", R.drawable.img4));

        idListaProdutos = findViewById(R.id.idListaProdutos);


        // tipo layout
        idListaProdutos.setLayoutManager(new GridLayoutManager(getApplicationContext(), 2));


        //instanciar o adaptador
        AdaptadorProduto adapter = new AdaptadorProduto(getApplicationContext(), lstProdutos);

        idListaProdutos.setAdapter(adapter);



    }
}