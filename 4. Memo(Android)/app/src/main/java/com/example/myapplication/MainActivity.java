package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    MemoAdapter mAdapter;
    ArrayList<String> items = new ArrayList<>();

    Button button;
    EditText editText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.memo);

        recyclerView = findViewById(R.id.recy);
        mAdapter = new MemoAdapter(items);
        items.add("asd");
        items.add("asd");
        items.add("asd");
        recyclerView.setAdapter(mAdapter);

        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String string = editText.getText().toString();

                items.add(string);
                mAdapter.notifyDataSetChanged();
                
                editText.setText("");


            }
        });

    }

}