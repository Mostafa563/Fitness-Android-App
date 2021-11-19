package android.example.fitnessapplication.activities;

import android.example.fitnessapplication.R;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DayNormalVeganActivity extends AppCompatActivity {

    private TextView day_title, day_sec_title;
    private ImageButton backbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day_normal_vegan);

        day_title = findViewById(R.id.day_title);
        day_sec_title = findViewById(R.id.day_sec_title);

        day_title.setText(getIntent().getStringExtra("title"));
        day_sec_title.setText(getIntent().getStringExtra("second title"));

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
        super.onBackPressed();
    }
}
