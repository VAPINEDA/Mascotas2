package com.example.victoralfonso.mascotas;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import java.util.ArrayList;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    Toolbar actionbar;
    RecyclerView miRecylcerView;
    ArrayList<Mascota> mascotas;
    ImageButton actionButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        actionbar=findViewById(R.id.miActionBar);
        setSupportActionBar(actionbar);

        actionButton=findViewById(R.id.ibactionbutton);

        LinearLayoutManager llm=new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        miRecylcerView=findViewById(R.id.rvMascota);
        miRecylcerView.setLayoutManager(llm);

        inicializarMascotas();
        inicializarAdpatadorMascota();

        actionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this, MainActivity2.class);
                startActivity(i);

            }
        });

    }

    public void inicializarMascotas(){
        mascotas=new ArrayList<Mascota>();
        mascotas.add(new Mascota("Pascual", R.drawable.weimaraner, 3));
        mascotas.add(new Mascota("Romulo", R.drawable.rottweiler, 3));
        mascotas.add(new Mascota("Princesa", R.drawable.bulldog, 3));
        mascotas.add(new Mascota("Alaska", R.drawable.blackdog, 3));
        mascotas.add(new Mascota("Vainilla", R.drawable.labrador, 3));
        mascotas.add(new Mascota("Berlin", R.drawable.litlledog, 3));
    }

    public void inicializarAdpatadorMascota(){
        MascotaAdaptador adaptador=new MascotaAdaptador(mascotas, this);
        miRecylcerView.setAdapter(adaptador);
    }
}