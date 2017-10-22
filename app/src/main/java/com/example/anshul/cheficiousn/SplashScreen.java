package com.example.anshul.cheficiousn;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.Window;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
     Thread myThread= new Thread(){
         @Override
         public void run(){
             try{
                 sleep(500);
                 Intent intent =new Intent(getBaseContext(),MainActivity.class);
                 startActivity(intent);
                 finish();
             } catch (InterruptedException e){
                 e.printStackTrace();
             }
         }
     };
        myThread.start();
    }
    protected void onPause(){
        super.onPause();
        finish();
    }

}
