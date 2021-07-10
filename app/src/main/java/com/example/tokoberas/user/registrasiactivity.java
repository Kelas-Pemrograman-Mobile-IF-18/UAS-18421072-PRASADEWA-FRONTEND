package com.example.tokoberas.user;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.tokoberas.R;
import com.ornach.nobobutton.NoboButton;

public class registrasiactivity extends AppCompatActivity {
  NoboButton btnRegistrasi;
  Button btnBackLogin;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_registrasiactivity);
    getSupportActionBar().hide();

    btnRegistrasi = (NoboButton) findViewById(R.id.btnRegistrasi);
    btnBackLogin = (Button) findViewById(R.id.btnBackLogin);

    btnBackLogin.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        Intent i = new Intent(registrasiactivity.this, loginactivity.class);
        startActivity(i);
        finish();
      }
    });

    btnRegistrasi.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        Intent i = new Intent(registrasiactivity.this, loginactivity.class);
        startActivity(i);
        finish();
      }
    });
  }
}
