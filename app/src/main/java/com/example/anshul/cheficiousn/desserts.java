package com.example.anshul.cheficiousn;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class desserts extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desserts);
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
    public void d1(View view)
    {
        Intent i=new Intent(getBaseContext(),Display.class);
        i.putExtra("source","Act13");
        startActivity(i);

    }
    public void d2(View view)
    {
        Intent i=new Intent(getBaseContext(),Display.class);
        i.putExtra("source","Act14");
        startActivity(i);

    } public void d3(View view)
    {
        Intent i=new Intent(getBaseContext(),Display.class);
        i.putExtra("source","Act15");
        startActivity(i);

    } public void d4(View view)
    {
        Intent i=new Intent(getBaseContext(),Display.class);
        i.putExtra("source","Act16");
        startActivity(i);

    } public void d5(View view)
    {
        Intent i=new Intent(getBaseContext(),Display.class);
        i.putExtra("source","Act17");
        startActivity(i);

    } public void d6(View view)
    {
        Intent i=new Intent(getBaseContext(),Display.class);
        i.putExtra("source","Act18");
        startActivity(i);

    } public void d7(View view)
    {
        Intent i=new Intent(getBaseContext(),Display.class);
        i.putExtra("source","Act19");
        startActivity(i);

    } public void d8(View view)
    {
        Intent i=new Intent(getBaseContext(),Display.class);
        i.putExtra("source","Act20");
        startActivity(i);

    }
    public void d9(View view)
    {
        Intent i=new Intent(getBaseContext(),Display.class);
        i.putExtra("source","Act21");
        startActivity(i);

    }public void d10(View view)
    {
        Intent i=new Intent(getBaseContext(),Display.class);
        i.putExtra("source","Act22");
        startActivity(i);

    }public void d11(View view)
    {
        Intent i=new Intent(getBaseContext(),Display.class);
        i.putExtra("source","Act23");
        startActivity(i);

    }public void d12(View view)
    {
        Intent i=new Intent(getBaseContext(),Display.class);
        i.putExtra("source","Act24");
        startActivity(i);

    }

        }

