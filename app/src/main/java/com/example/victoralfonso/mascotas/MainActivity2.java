package com.example.victoralfonso.mascotas;

import android.os.Bundle;

import java.util.ArrayList;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity2 extends AppCompatActivity {

    RecyclerView miRecyclerview;
    ArrayList<Mascota> mascotas;
    Toolbar actionbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        actionbar=findViewById(R.id.miActionBar);
        setSupportActionBar(actionbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        miRecyclerview=findViewById(R.id.miRecyclerView);

        LinearLayoutManager llm=new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        miRecyclerview.setLayoutManager(llm);

        inicializarMascotas();
        inicializarAdaptadorMascota();
    }

    public void inicializarMascotas(){
        mascotas=new ArrayList<Mascota>();
        mascotas.add(new Mascota("Pascual", R.drawable.weimaraner, 8));
        mascotas.add(new Mascota("Romulo", R.drawable.rottweiler, 7));
        mascotas.add(new Mascota("Princesa", R.drawable.bulldog, 5));
        mascotas.add(new Mascota("Alaska", R.drawable.blackdog, 4));
        mascotas.add(new Mascota("Vainilla", R.drawable.labrador, 2));
    }

    public void inicializarAdaptadorMascota(){
        MascotaAdaptador adaptador=new MascotaAdaptador(mascotas, this);
        miRecyclerview.setAdapter(adaptador);
    }
}