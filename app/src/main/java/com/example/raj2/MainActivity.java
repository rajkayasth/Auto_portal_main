package com.example.raj2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.raj2.Fregments.SellCarFragment;
import com.example.raj2.Fregments.SettingsFragmnet;
import com.example.raj2.Fregments.HomeFregment;
import com.example.raj2.Fregments.sell;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    BottomNavigationView bottomAppBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomAppBar = findViewById(R.id.bottomNavigation);

        //home fragment defualt
        try {
            HomeFregment homeFragment = new HomeFregment();
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction().replace(R.id.replaceFragment, homeFragment);
            ft.commit();
        } catch (Exception e) {
            Toast.makeText(MainActivity.this, e.getMessage(), Toast.LENGTH_SHORT).show();
        }

        bottomAppBar.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull  MenuItem menuitem) {
                Fragment fragment = null;
                switch (menuitem.getItemId())
                {
                    case R.id.navigation_home:
                        fragment = new HomeFregment();
                        menuitem.setIcon(R.drawable.ic_home);
                        break;

                    case R.id.navigation_sellcar:
                        fragment = new sell();
                        menuitem.setIcon(R.drawable.ic_sell_car);
                        break;

                    case R.id.navigation_settings:
                        fragment = new SettingsFragmnet();
                        menuitem.setIcon(R.drawable.ic_settings);
                        break;
                }
                getSupportFragmentManager().beginTransaction().replace(R.id.replaceFragment,fragment).commit();
                return true;
            }
        });


    }
}