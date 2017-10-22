package com.example.anshul.cheficiousn;

import android.content.Intent;
import android.*;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

import static com.example.anshul.cheficiousn.R.layout.activity_veg;

public class veg extends AppCompatActivity {

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_veg);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


    }

    @Override
    public void onBackPressed() {

       Intent i=new Intent(getBaseContext(),MainActivity.class);
        startActivity(i);
        finish();
    }

    public void home(View view) {
        Intent i = new Intent(getBaseContext(), MainActivity.class);
        startActivity(i);
    }

    public void v1(View view) {
        Intent i = new Intent(getBaseContext(), Display.class);
        i.putExtra("source", "Act1");
        startActivity(i);

    }

    public void v2(View view) {
        Intent i = new Intent(getBaseContext(), Display.class);
        i.putExtra("source", "Act2");
        startActivity(i);

    }

    public void v3(View view) {
        Intent i = new Intent(getBaseContext(), Display.class);
        i.putExtra("source", "Act3");
        startActivity(i);

    }

    public void v4(View view) {
        Intent i = new Intent(getBaseContext(), Display.class);
        i.putExtra("source", "Act4");
        startActivity(i);

    }

    public void v5(View view) {
        Intent i = new Intent(getBaseContext(), Display.class);
        i.putExtra("source", "Act5");
        startActivity(i);

    }

    public void v6(View view) {
        Intent i = new Intent(getBaseContext(), Display.class);
        i.putExtra("source", "Act6");
        startActivity(i);

    }

    public void v7(View view) {
        Intent i = new Intent(getBaseContext(), Display.class);
        i.putExtra("source", "Act7");
        startActivity(i);

    }

    public void v8(View view) {
        Intent i = new Intent(getBaseContext(), Display.class);
        i.putExtra("source", "Act8");
        startActivity(i);

    }

    public void v9(View view) {
        Intent i = new Intent(getBaseContext(), Display.class);
        i.putExtra("source", "Act9");
        startActivity(i);

    }

    public void v10(View view) {
        Intent i = new Intent(getBaseContext(), Display.class);
        i.putExtra("source", "Act10");
        startActivity(i);

    }

    public void v11(View view) {
        Intent i = new Intent(getBaseContext(), Display.class);
        i.putExtra("source", "Act11");
        startActivity(i);

    }

    public void v12(View view) {
        Intent i = new Intent(getBaseContext(), Display.class);
        i.putExtra("source", "Act12");
        startActivity(i);

    }


}
