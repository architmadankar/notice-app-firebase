package com.mit.notes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
<<<<<<< Updated upstream
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText mloginemail,mloginpassword;
    private RelativeLayout mlogin,mgotosignup;
    private TextView mgotoforgotpassword;



=======

public class MainActivity extends AppCompatActivity {
    Button loginbutton;
>>>>>>> Stashed changes
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

<<<<<<< Updated upstream
        getSupportActionBar().hide();
        mloginemail=findViewById(R.id.Loginemail);
        mloginpassword=findViewById(R.id.Loginpassword);
        mlogin=findViewById(R.id.Login);
        mgotoforgotpassword=findViewById(R.id.gotoforgotpassword);
        mgotosignup=findViewById(R.id.gotosignup);


        mgotosignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent( MainActivity.this,signup.class));
            }
        });

        mgotoforgotpassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent( MainActivity.this,forgotpassword.class));
            }
        });

        mlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            String mail=mloginemail.getText().toString().trim();
            String password=mloginpassword.getText().toString().trim();

            if (mail.isEmpty() || password.isEmpty()){
                Toast.makeText(getApplicationContext(),"Mail and password cant be empty",Toast.LENGTH_SHORT).show();


            }
            else{
                //login the user
            }
=======
        loginbutton = findViewById(R.id.loginbtn);

        loginbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){

                Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(intent);

>>>>>>> Stashed changes
            }
        });
    }
}