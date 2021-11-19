package android.example.fitnessapplication.activities;

import android.content.Intent;
import android.example.fitnessapplication.R;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import static android.example.fitnessapplication.activities.WelcomeActivity.fromWelcome;

public class SignUpActivity extends AppCompatActivity {

    private TextView signintv;
    private ImageButton backbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        signintv = findViewById(R.id.signintv);
        signintv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fromWelcome = false;
                Intent myInt = new Intent(SignUpActivity.this, SignInActivity.class);
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
        Intent myInt = new Intent(SignUpActivity.this, WelcomeActivity.class);
        startActivity(myInt);    }
}
