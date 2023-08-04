package com.joseph.ec3joseph;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;


import com.joseph.ec3joseph.databinding.ActivityLoginBinding;

public class LoginActivity extends AppCompatActivity {

private ActivityLoginBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityLoginBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.btnLogin.setOnClickListener(v -> {
            String email = binding.tilEmail.getEditText().getText().toString();
            String password = binding.password.getEditText().getText().toString();


            if (email.equals("ejemploe@idat.com.pe") && password.equals("Peru123")) {
                Intent intent = new Intent(this, PrincipalActivity.class);
                startActivity(intent);
                finish();
            } else {
                // Aquí puedes mostrar un mensaje de error o realizar cualquier otra acción en caso de credenciales incorrectas.
            }
        });


    }
}