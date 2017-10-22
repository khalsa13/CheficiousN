package com.example.anshul.cheficiousn;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class drinks extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drinks);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


            }
    public void onBackPressed() {
        Intent i=new Intent(getBaseContext(),MainActivity.class);
        startActivity(i);
        finish();
    }
    public void home(View v)
    {
        Intent i=new Intent(getBaseContext(),MainActivity.class);
        startActivity(i);
        finish();
    }
    public void dr1(View view)
    {
        Intent i=new Intent(getBaseContext(),Display.class);
        i.putExtra("source","Act25");
        startActivity(i);

    }
    public void dr2(View view)
    {
        Intent i=new Intent(getBaseContext(),Display.class);
        i.putExtra("source","Act26");
        startActivity(i);

    } public void dr3(View view)
    {
        Intent i=new Intent(getBaseContext(),Display.class);
        i.putExtra("source","Act27");
        startActivity(i);

    } public void dr4(View view)
    {
        Intent i=new Intent(getBaseContext(),Display.class);
        i.putExtra("source","Act28");
        startActivity(i);

    } public void dr5(View view)
    {
        Intent i=new Intent(getBaseContext(),Display.class);
        i.putExtra("source","Act29");
        startActivity(i);

    } public void dr6(View view)
    {
        Intent i=new Intent(getBaseContext(),Display.class);
        i.putExtra("source","Act30");
        startActivity(i);

    } public void dr7(View view)
    {
        Intent i=new Intent(getBaseContext(),Display.class);
        i.putExtra("source","Act31");
        startActivity(i);

    } public void dr8(View view)
    {
        Intent i=new Intent(getBaseContext(),Display.class);
        i.putExtra("source","Act32");
        startActivity(i);

    }
    public void dr9(View view)
    {
        Intent i=new Intent(getBaseContext(),Display.class);
        i.putExtra("source","Act33");
        startActivity(i);

    }public void dr10(View view)
    {
        Intent i=new Intent(getBaseContext(),Display.class);
        i.putExtra("source","Act34");
        startActivity(i);

    }public void dr11(View view)
    {
        Intent i=new Intent(getBaseContext(),Display.class);
        i.putExtra("source","Act35");
        startActivity(i);

    }public void dr12(View view)
    {
        Intent i=new Intent(getBaseContext(),Display.class);
        i.putExtra("source","Act36");
        startActivity(i);

    }

        }

