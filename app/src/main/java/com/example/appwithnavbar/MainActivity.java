package com.example.appwithnavbar;

import android.content.Intent;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.navigation.NavigationView;

import java.io.IOException;
import java.io.InputStream;

public class MainActivity extends AppCompatActivity {
    NavigationView nav;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        nav=findViewById(R.id.nav);


        nav.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id= item.getItemId();
                if (id==R.id.home){
                    Intent i1=new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(i1);
                }
                if (id==R.id.About){
                    Intent i2=new Intent(getApplicationContext(), About.class);
                    startActivity(i2);
                }
                if (id==R.id.Contact){
                    Intent i3=new Intent(getApplicationContext(),Contact.class);
                    startActivity(i3);
                }
                if (id==R.id.Setting){
                    Intent i4=new Intent(getApplicationContext(),Setting.class);
                    startActivity(i4);
                }

                return false;
            }
        });

        final DrawerLayout drawerLayout=findViewById(R.id.main);
        findViewById(R.id.nav).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawerLayout.openDrawer(GravityCompat.START);

            }
        });

        ImageView imageView=findViewById(R.id.menu1);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                drawerLayout.openDrawer(GravityCompat.START);
            }
        });

    }
}