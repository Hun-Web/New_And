package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    ArrayList<User> items = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MainListAdapter adapter = new MainListAdapter(items);
        recyclerView = findViewById(R.id.list);
        recyclerView.setAdapter(adapter);


        User user = new User("hun", "hello", "12:34", R.drawable.ic_launcher_foreground);
        items.add(new User("hun", "hello", "12:34", R.drawable.ic_launcher_foreground));
        items.add(new User("hun1", "hello1234", "12:34", R.drawable.ic_launcher_foreground));
        items.add(new User("hun2", "hello5678", "12:34", R.drawable.ic_launcher_foreground));
        items.add(new User("hun3", "hello4242", "12:34", R.drawable.ic_launcher_foreground));

    }
}