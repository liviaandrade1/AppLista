package br.com.etecia.myapp;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
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
        lstProdutos.add(new Produtos("Hello Kitty pequena", R.drawable.img1));
        lstProdutos.add(new Produtos("Capivara de chapéu", R.drawable.img6));
        lstProdutos.add(new Produtos("Sapinho Sanrio", R.drawable.img5));
        lstProdutos.add(new Produtos("Pou", R.drawable.img7));
        lstProdutos.add(new Produtos("Tartaruga", R.drawable.img11));
        lstProdutos.add(new Produtos("Porquinho", R.drawable.img13));
        lstProdutos.add(new Produtos("Morcego", R.drawable.img10));
        lstProdutos.add(new Produtos("Hello Kitty pequena", R.drawable.img1));
        lstProdutos.add(new Produtos("Galinha Pintadinha", R.drawable.img1));
        idListaProdutos = findViewById(R.id.idListaProdutos);
    }
}