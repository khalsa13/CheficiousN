package com.example.anshul.cheficiousn;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class NonVeg extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_non_veg);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }
    public void onBackPressed() {

            Intent i=new Intent(getBaseContext(),MainActivity.class);
            startActivity(i);
            finish();

    }
    public void home(View view)
    {
        Intent i=new Intent(getBaseContext(),MainActivity.class);
        startActivity(i);
        finish();
    }
    public void nv1(View view)
    {
        Intent i=new Intent(getBaseContext(),Display.class);
        i.putExtra("source","Act37");
        startActivity(i);

    }
    public void nv2(View view)
    {
        Intent i=new Intent(getBaseContext(),Display.class);
        i.putExtra("source","Act38");
        startActivity(i);

    } public void nv3(View view)
    {
        Intent i=new Intent(getBaseContext(),Display.class);
        i.putExtra("source","Act39");
        startActivity(i);

    } public void nv4(View view)
    {
        Intent i=new Intent(getBaseContext(),Display.class);
        i.putExtra("source","Act40");
        startActivity(i);

    } public void nv5(View view)
    {
        Intent i=new Intent(getBaseContext(),Display.class);
        i.putExtra("source","Act41");
        startActivity(i);

    } public void nv6(View view)
    {
        Intent i=new Intent(getBaseContext(),Display.class);
        i.putExtra("source","Act42");
        startActivity(i);

    } public void nv7(View view)
    {
        Intent i=new Intent(getBaseContext(),Display.class);
        i.putExtra("source","Act43");
        startActivity(i);

    } public void nv8(View view)
    {
        Intent i=new Intent(getBaseContext(),Display.class);
        i.putExtra("source","Act44");
        startActivity(i);

    }
    public void nv9(View view)
    {
        Intent i=new Intent(getBaseContext(),Display.class);
        i.putExtra("source","Act45");
        startActivity(i);

    }public void nv10(View view)
    {
        Intent i=new Intent(getBaseContext(),Display.class);
        i.putExtra("source","Act46");
        startActivity(i);

    }public void nv11(View view)
    {
        Intent i=new Intent(getBaseContext(),Display.class);
        i.putExtra("source","Act47");
        startActivity(i);

    }public void nv12(View view)
    {
        Intent i=new Intent(getBaseContext(),Display.class);
        i.putExtra("source","Act48");
        startActivity(i);

    }
}


