package android.example.fitnessapplication.activities;

import android.content.Intent;
import android.example.fitnessapplication.R;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import static android.example.fitnessapplication.activities.WelcomeActivity.fromWelcome;

public class SignInActivity extends AppCompatActivity {

    private TextView forgetPassTV;
    private TextView signupTV;
    private ImageButton backbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        forgetPassTV = findViewById(R.id.forgetPassTV);
        forgetPassTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myInt = new Intent(SignInActivity.this, ForgetPasswordActivity.class);
                startActivity(myInt);
            }
        });

        signupTV = findViewById(R.id.signupTV);
        signupTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myInt = new Intent(SignInActivity.this, SignUpActivity.class);
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
    }

    @Override
    public void onBackPressed() {
//        super.onBackPressed();
        if (fromWelcome) {
            Intent myInt = new Intent(SignInActivity.this, WelcomeActivity.class);
            startActivity(myInt);
        } else {
            Intent myInt = new Intent(SignInActivity.this, SignUpActivity.class);
            startActivity(myInt);
        }
    }
}
