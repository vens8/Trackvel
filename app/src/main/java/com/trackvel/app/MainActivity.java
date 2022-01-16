package com.trackvel.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.mv19.first.ui.login.LoginActivityAdmin;
import com.mv19.first.ui.login.LoginStudent;
import com.mv19.first.ui.login.LoginSupervisor;

public class MainActivity extends AppCompatActivity {

    private Button loginAdmin;
    private Button loginStudent;
    private Button loginSupervisor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loginAdmin = findViewById(R.id.loginAdmin);
        loginStudent = findViewById(R.id.loginStudent);
        loginSupervisor = findViewById(R.id.loginSupervisor);

    }




    public void onLoginAdmin(View view){
        Toast.makeText(this, "Logging in as Admin", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, LoginActivityAdmin.class);
        startActivity(intent);
    }

    public void onLoginStudent(View view){
        Toast.makeText(this, "Logging in as Student", Toast.LENGTH_SHORT).show();
        Intent intent1 = new Intent(this, LoginStudent.class);
        startActivity(intent1);
    }

    public void onLoginSupervisor(View view){
        Toast.makeText(this, "Logging in as Supervisor", Toast.LENGTH_SHORT).show();
        Intent intent2 = new Intent(this, LoginSupervisor.class);
        startActivity(intent2);
    }


}
