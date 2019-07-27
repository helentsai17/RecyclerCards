package com.example.recyclercards;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recycler;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<ExampleItem> exampleItems = new ArrayList<>();
        exampleItems.add(new ExampleItem(R.drawable.oner,"Clicked to vocation"));
        exampleItems.add(new ExampleItem(R.drawable.twor,"Click to Italy"));
        exampleItems.add(new ExampleItem(R.drawable.threer,"Click to New York"));
        exampleItems.add(new ExampleItem(R.drawable.fourr,"Click to Nepal"));
        exampleItems.add(new ExampleItem(R.drawable.sixr,"Click to Taste"));
        exampleItems.add(new ExampleItem(R.drawable.fiver,"Click to Italy"));

        recycler = findViewById(R.id.recyclerView);
        layoutManager = new LinearLayoutManager(this);
        adapter = new ExampleAdapter(exampleItems);
        recycler.setLayoutManager(layoutManager);
        recycler.setAdapter(adapter);
    }
}
