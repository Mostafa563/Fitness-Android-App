package android.example.fitnessapplication.activities;

import android.content.Intent;
import android.example.fitnessapplication.R;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class WelcomeProfileActivity extends AppCompatActivity {

    private Button dietbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_profile);

        dietbtn = findViewById(R.id.dietbtn);
        dietbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myInt = new Intent(WelcomeProfileActivity.this, EditProfileActivity.class);
                startActivity(myInt);
            }
        });
    }
}
