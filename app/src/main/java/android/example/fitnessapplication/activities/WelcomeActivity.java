package android.example.fitnessapplication.activities;

import android.content.Intent;
import android.example.fitnessapplication.R;
import android.example.fitnessapplication.adapters.WelcomeSliderAdapter;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.smarteist.autoimageslider.IndicatorAnimations;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

public class WelcomeActivity extends AppCompatActivity {

    public static TextView tv_welcome;
    public static String msg_welcome;
    public static boolean fromWelcome = true;
    public static boolean isExited = false;

    private Button signupbtn;
    private Button signinbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        //Slider Code
        SliderView sliderView = findViewById(R.id.imageSlider);
        WelcomeSliderAdapter adapter = new WelcomeSliderAdapter(this);
        sliderView.setSliderAdapter(adapter);
        sliderView.setIndicatorAnimation(IndicatorAnimations.SCALE); //set indicator animation by using SliderLayout.IndicatorAnimations. :WORM or THIN_WORM or COLOR or DROP or FILL or NONE or SCALE or SCALE_DOWN or SLIDE and SWAP!!
        sliderView.setSliderTransformAnimation(SliderAnimations.SIMPLETRANSFORMATION);
        sliderView.setAutoCycleDirection(SliderView.AUTO_CYCLE_DIRECTION_RIGHT);
        /*sliderView.setIndicatorSelectedColor(Color.WHITE);
        sliderView.setIndicatorUnselectedColor(Color.GRAY);*/
        sliderView.setScrollTimeInSec(4); //set scroll delay in seconds :
        sliderView.startAutoCycle();

        tv_welcome = findViewById(R.id.tv_welcome);
//        tv_welcome.setText(msg_welcome);

        signupbtn = findViewById(R.id.signupbtn);
        signupbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fromWelcome = false;
                Intent myInt = new Intent(WelcomeActivity.this, SignUpActivity.class);
                startActivity(myInt);
                finish();
            }
        });

        signinbtn = findViewById(R.id.signinbtn);
        signinbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fromWelcome = true;
                Intent myInt = new Intent(WelcomeActivity.this, SignInActivity.class);
                startActivity(myInt);
                finish();
            }
        });

    }

    @Override
    public void onBackPressed() {
        if (isExited)
            finishAffinity();
        else
            Toast.makeText(this, "Back Again to Exit", Toast.LENGTH_SHORT).show();
        isExited = true;

    }
}
