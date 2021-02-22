package com.example.myapplication12;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import android.os.Bundle;
import android.os.Bundle;

public class composeActivity extends AppCompatActivity {
    ImageButton Bton;
    ImageButton Bton2;
    ImageButton Bton3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compose);
        Bton = (ImageButton) findViewById(R.id.button2);
        Bton2 = (ImageButton) findViewById(R.id.button4);
        Bton3= (ImageButton) findViewById(R.id.button3);

        Bton.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        Intent Page = new Intent(composeActivity.this, ReceiveActivity.class);
                                        startActivity(Page);


                                    }
                                }
        );
        Bton2.setOnClickListener(new View.OnClickListener() {
                                     @Override
                                     public void onClick(View view) {
                                         Intent Page = new Intent(composeActivity.this, ReceiveActivity.class);
                                         startActivity(Page);


                                     }
                                 }
        );
        Bton3.setOnClickListener(new View.OnClickListener() {
                                     @Override
                                     public void onClick(View view) {
                                         Intent Page = new Intent(composeActivity.this, ReceiveActivity.class);
                                         startActivity(Page);


                                     }
                                 }
        );
    }
}

