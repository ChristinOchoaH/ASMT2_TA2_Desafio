package com.example.asmt_ta2_desafio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.github.clans.fab.FloatingActionMenu;

public class MainActivity extends AppCompatActivity {

    FloatingActionMenu actionMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        actionMenu = (FloatingActionMenu)findViewById(R.id.fabPrincipal);
        actionMenu.setClosedOnTouchOutside(true);
    }

    public void clicCalendario(View view){

    }
}
