package com.example.rohaan.g2go_login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;



public class DashActivity extends AppCompatActivity {

    private Button logoutButton;
    private FirebaseAuth firebaseAuth;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dash);
        setupUIViews();

        firebaseAuth = FirebaseAuth.getInstance();


        logoutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                firebaseAuth.signOut();
                Toast.makeText(DashActivity.this, "Logout Succesful", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(DashActivity.this, LoginActivity.class));
            }
        });

    }

    private void setupUIViews()
    {
        logoutButton = (Button)findViewById(R.id.btnlogout);

    }

}

