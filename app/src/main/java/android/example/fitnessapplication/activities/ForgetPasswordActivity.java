package android.example.fitnessapplication.activities;

import android.content.Intent;
import android.example.fitnessapplication.R;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ForgetPasswordActivity extends AppCompatActivity {

    private TextView signupTV;
    private ImageButton backbtn;

//    this will be removed
    private TextView goToNextAct;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forget_password);

        signupTV = findViewById(R.id.signupTV);
        signupTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myInt = new Intent(ForgetPasswordActivity.this, SignUpActivity.class);
                startActivity(myInt);
            }
        });

        backbtn = findViewById(R.id.backbtn);
        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        //$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
        //this will be removed
        goToNextAct = findViewById(R.id.goToNextAct);
        goToNextAct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myInt = new Intent(ForgetPasswordActivity.this, WelcomeProfileActivity.class);
                startActivity(myInt);
            }
        });
        //$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
    }

    @Override
    public void onBackPressed() {
//        super.onBackPressed();
        Intent myInt = new Intent(ForgetPasswordActivity.this, SignInActivity.class);
        startActivity(myInt);
    }
}
