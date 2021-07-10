package com.example.tokoberas.user;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.tokoberas.R;
import com.example.tokoberas.admin.homeadmin;
import com.ornach.nobobutton.NoboButton;

public class loginactivity extends AppCompatActivity {
  Button btnPindah;
  NoboButton btnlogin;
  EditText edtUserName, edtPassword;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_loginactivity);

    getSupportActionBar().hide();
    btnPindah = (Button) findViewById(R.id.btnPindah);
    btnlogin = (NoboButton) findViewById(R.id.loginBtn);
    btnPindah.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {

        Intent i= new Intent(loginactivity.this, registrasiactivity.class);
        startActivity(i);
        finish();
      }
    });
    btnlogin.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        Intent i = new Intent(loginactivity.this, homeadmin.class);
        startActivity(i);
        finish();

      }
    });
  }
}
