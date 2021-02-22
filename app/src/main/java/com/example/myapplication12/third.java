package com.example.myapplication12;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class third extends AppCompatActivity {
    EditText tv1;
    EditText tv2;
    Button b1;
    Button b2;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        String message;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        ActivityCompat.requestPermissions(third.this, new String[]{Manifest.permission.SEND_SMS, Manifest.permission.READ_SMS}, PackageManager.PERMISSION_GRANTED);

        tv1 = findViewById(R.id.edittext1);
        tv2 = findViewById(R.id.edittext2);
        b1 = findViewById(R.id.button_login);
        b2=findViewById(R.id.button);
        b1.setOnClickListener(new View.OnClickListener() {
                                  @Override
                                  public void onClick(View view) {
                                      String m1 = tv1.getText().toString();
                                      String m2 = tv2.getText().toString();
                                     String pno = "+919182573357";
                                      String message = "you recieved an order address from" + m1+ " " + m2;
                                     SmsManager smsManager = SmsManager.getDefault();

                                      smsManager.sendTextMessage(pno, null, message, null, null);
                                      Toast.makeText(third.this, "ORDER CONFIRMED", Toast.LENGTH_SHORT).show();



                                  }
                              }
        );
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent imp=new Intent(third.this,four.class);
                startActivity(imp);

            }
        });


    }}
