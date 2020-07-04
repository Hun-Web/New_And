package com.example.login_practice1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final EditText editText = findViewById(R.id.InputId);
        final EditText editText1 = findViewById(R.id.InputPassword);
        final TextView text = findViewById(R.id.Check);
        Button button = findViewById(R.id.Button_login);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ID  = "DGU";
                String PW = "1234";
                String a = editText.getText().toString();
                String b = editText1.getText().toString();

                if(a.equals(ID) && b.equals(PW)) {
                    text.setText("성공");
                }
                else
                    text.setText("실패");

                            }
        });



    }
}
