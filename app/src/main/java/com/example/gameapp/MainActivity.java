package com.example.gameapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerViewGame;
    private ArrayList<GameModel> gameList;
    private GameAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initiate();
    }

    private void initiate() {
        recyclerViewGame = findViewById(R.id.recyclerView);
        gameList = new ArrayList<>();
        gameList.add(new GameModel("Horizon Chase", R.drawable.card1));
        gameList.add(new GameModel("PUBG", R.drawable.card2));
        gameList.add(new GameModel("Head Ball 2", R.drawable.card3));

        gameList.add(new GameModel("Fifa 2022", R.drawable.card5));
        gameList.add(new GameModel("Fortnite", R.drawable.card6));
        gameList.add(new GameModel("Hooked on You", R.drawable.card4));
        adapter = new GameAdapter(this, gameList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        recyclerViewGame.setLayoutManager(layoutManager);
        recyclerViewGame.setAdapter(adapter);
        adapter.setItemClickListener((view, position) -> {
            Toast.makeText(this, gameList.get(position).getName()+" selected!", Toast.LENGTH_SHORT).show();
        });

    }
}