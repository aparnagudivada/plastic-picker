package com.example.myapplication12;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import android.os.Bundle;
import android.os.Bundle;
import android.widget.ImageButton;

public class HomeActivity extends AppCompatActivity {
    ImageButton Bton1;
    ImageButton Bton2;
    ImageButton Bton3;
    ImageButton Bton4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Bton1 = (ImageButton) findViewById(R.id.button2);
        Bton2 = (ImageButton) findViewById(R.id.button4);
        Bton3= (ImageButton) findViewById(R.id.button3);
        Bton4= (ImageButton) findViewById(R.id.button5);
        Bton1.setOnClickListener(new View.OnClickListener() {
                                     @Override
                                     public void onClick(View view) {
                                         Intent HomePage = new Intent(HomeActivity.this, composeActivity.class);
                                         startActivity(HomePage);

                                     }
                                 }
            );
            Bton2.setOnClickListener(new View.OnClickListener() {
                                         @Override
                                         public void onClick(View view) {
                                             Intent HomePage = new Intent(HomeActivity.this, composeActivity.class);
                                             startActivity(HomePage);

                                         }
                                     });
                Bton3.setOnClickListener(new View.OnClickListener() {
                                             @Override
                                             public void onClick(View view) {
                                                 Intent HomePage = new Intent(HomeActivity.this, VizActivity.class);
                                                 startActivity(HomePage);

                                             }
                                         });
                    Bton4.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Intent HomePage = new Intent(HomeActivity.this, composeActivity.class);
                            startActivity(HomePage);

                        }
        });
    }



}