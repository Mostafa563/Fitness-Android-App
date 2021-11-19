package android.example.fitnessapplication.activities;

import android.content.Intent;
import android.example.fitnessapplication.R;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class WeekActivity extends AppCompatActivity {

    private Button day1_btn_normal, day1_btn_veg;
    private ImageButton backbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_week);

        day1_btn_normal = findViewById(R.id.day1_btn_normal);
        day1_btn_veg = findViewById(R.id.day1_btn_veg);
        day1_btn_normal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String title = "Day 1 (1680 Kcal)";
                String secTitle = "Normal Diet";
                Intent myInt = new Intent(WeekActivity.this, DayNormalVeganActivity.class);
                myInt.putExtra("title",title);
                myInt.putExtra("second title",secTitle);
                startActivity(myInt);
            }
        });
        day1_btn_veg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String title = "Day 1 (1200 Kcal)";
                String secTitle = "Vegetarian Diet";
                Intent myInt = new Intent(WeekActivity.this, DayNormalVeganActivity.class);
                myInt.putExtra("title",title);
                myInt.putExtra("second title",secTitle);
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
        super.onBackPressed();
    }
}
