package cl.eme.listexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.List;

public class MainActivity extends AppCompatActivity implements DessertFitAdapter.OnItemClickListener {

    private static final String TAG = "MainActivity";
    
    // Declarando una instancia de clase del tipo recyclerview
    private RecyclerView recyclerView;
    private DessertFitAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // inicializar el recyclerview
        recyclerView = findViewById(R.id.recyclerView);


        adapter = new DessertFitAdapter(this, DessertFit.getDesserts(), this);

        recyclerView.setAdapter(adapter);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(RecyclerView.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);
        //recyclerView.setLayoutManager(new GridLayoutManager(this, 2, RecyclerView.VERTICAL, false));

        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                recyclerView.setLayoutManager(linearLayoutManager);
            }
        });
    }
    

    @Override
    public void onClick(DessertFit dessert) {
        Log.d(TAG, "onClick: " + dessert);

        Intent detail = new Intent(getApplicationContext(), DetailActivity.class);
        detail.putExtra("NAME", dessert.getNombre());
        detail.putExtra("ID", dessert.getId());

        startActivity(detail);
    }


    public void updateData(List<DessertFit> dessertFitList) {
        adapter.update(dessertFitList);
    }
}