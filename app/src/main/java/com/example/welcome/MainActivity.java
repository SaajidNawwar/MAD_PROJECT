package com.example.welcome;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button signup =(Button)findViewById(R.id.buttonup);
        Button signin =(Button)findViewById(R.id.button2in);

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent packageContent = null;
                Intent intent= new Intent(MainActivity.this,Signup.class);
                startActivity(intent);
            }
        });

         signin.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent packageContent = null;
                        Intent intent1= new Intent(MainActivity.this,SignIn.class);
                        startActivity(intent1);
                    }
                });


    }
}