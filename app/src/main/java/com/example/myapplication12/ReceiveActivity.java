package com.example.myapplication12;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


import android.os.Bundle;

public class ReceiveActivity extends AppCompatActivity {
    Button but;
    TextView tv;
    EditText weight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receive);
        weight=(EditText)findViewById(R.id.et_weight);
        tv=(TextView)findViewById(R.id.textView);
        but = (Button)findViewById(R.id.bt_submit);
        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(ReceiveActivity.this,second.class);
                int m = Integer.valueOf(weight.getText().toString());
                int p=m*30;
                String l=Integer.toString(p);
                intent.putExtra("message", l);

                startActivity(intent);

            }
        });
    }




}
