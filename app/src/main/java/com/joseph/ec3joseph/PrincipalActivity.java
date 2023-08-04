package com.joseph.ec3joseph;


import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


import com.google.android.material.snackbar.Snackbar;
import com.joseph.ec3joseph.databinding.ActivityPrincipalBinding;
import com.joseph.ec3joseph.fragments.HomeFragment;

import java.util.Random;

public class PrincipalActivity extends AppCompatActivity {

    private ActivityPrincipalBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityPrincipalBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setSupportActionBar(binding.pescado);
        addHomeFragment();

    }


    private void addHomeFragment(){
        getSupportFragmentManager().beginTransaction().add(binding.fcvMain.getId(), new HomeFragment()).commit();


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.papu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.search){
            Snackbar.make(binding.getRoot(),"Search",Snackbar.LENGTH_SHORT).show();
            return true;
        } else if(item.getItemId() == R.id.settings){
            Snackbar.make(binding.getRoot(),"Settings",Snackbar.LENGTH_SHORT).show();
            return true;
        } else{
            return false;
        }
    }
}


