package com.example.myapplication12;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class VizActivity extends AppCompatActivity {
    ImageButton Bton1;
    ImageButton Bton2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viz);
        Bton1 = (ImageButton) findViewById(R.id.button2);
        Bton2 = (ImageButton) findViewById(R.id.button4);
        Bton1.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        Intent Page = new Intent(VizActivity.this, ReceiveActivity.class);
                                        startActivity(Page);


                                    }
                                }
        );
        Bton2.setOnClickListener(new View.OnClickListener() {
                                     @Override
                                     public void onClick(View view) {
                                         Intent Page = new Intent(VizActivity.this, ReceiveActivity.class);
                                         startActivity(Page);


                                     }
                                 }
        );
    }
}
