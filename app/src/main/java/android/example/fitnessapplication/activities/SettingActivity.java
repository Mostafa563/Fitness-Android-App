package android.example.fitnessapplication.activities;

import android.example.fitnessapplication.R;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SettingActivity extends AppCompatActivity {

    private LinearLayout ll1,ll2,ll3,ll4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);

        ll1 = findViewById(R.id.linearLayout1);
        ll2 = findViewById(R.id.linearLayout2);
        ll3 = findViewById(R.id.linearLayout3);
        ll4 = findViewById(R.id.linearLayout4);

        ll1.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                Toast.makeText(SettingActivity.this, "Account", Toast.LENGTH_SHORT).show();
                return false;
            }
        });
        ll2.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                Toast.makeText(SettingActivity.this, "Security", Toast.LENGTH_SHORT).show();
                return false;
            }
        });
        ll3.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                Toast.makeText(SettingActivity.this, "Help", Toast.LENGTH_SHORT).show();
                return false;
            }
        });
        ll4.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                Toast.makeText(SettingActivity.this, "About", Toast.LENGTH_SHORT).show();
                return false;
            }
        });
        findViewById(R.id.backbtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }
}
