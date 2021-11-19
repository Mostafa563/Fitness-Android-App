package android.example.fitnessapplication.activities;

import android.content.Intent;
import android.example.fitnessapplication.R;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Thread myTh = new Thread(){
            @Override
            public void run() {
                try {
                    sleep(1000);
                    Intent myIntent = new Intent(getApplicationContext(), WelcomeActivity.class);
                    startActivity(myIntent);
                    finish();


                }catch (InterruptedException e){
                    e.printStackTrace();
                }


            }
        };

        myTh.start();
    }
}
