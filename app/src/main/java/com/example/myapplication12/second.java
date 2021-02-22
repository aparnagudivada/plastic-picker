package com.example.myapplication12;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.os.Bundle;

public class second extends AppCompatActivity {
    TextView text;
    TextView tv;
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        text = (TextView)findViewById(R.id.text);
        tv=(TextView)findViewById(R.id.textView);
        b1= (Button)findViewById(R.id.button6);
        Intent intent = getIntent();
        String str = intent.getStringExtra("message");
        text.setText(str);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(second.this,third.class);
                startActivity(intent);


            }
        });
    }




}
