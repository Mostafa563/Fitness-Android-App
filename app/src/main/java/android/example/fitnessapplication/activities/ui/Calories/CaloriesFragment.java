package android.example.fitnessapplication.activities.ui.Calories;

import android.content.Intent;
import android.example.fitnessapplication.R;
import android.example.fitnessapplication.activities.CaloriesActivitiesActivity;
import android.example.fitnessapplication.activities.CaloriesDetailsActivity;
import android.example.fitnessapplication.activities.ProfileActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;


public class CaloriesFragment extends Fragment {

    private TextView detailsTV, ActivityTV;
    private CaloriesViewModel caloriesViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        caloriesViewModel =
                ViewModelProviders.of(this).get(CaloriesViewModel.class);
        View root = inflater.inflate(R.layout.fragment_calories, container, false);
        ProfileActivity.DrawerTitle = "Week1";
        ProfileActivity.titleTV.setText(ProfileActivity.DrawerTitle);

        ActivityTV = root.findViewById(R.id.ActivityTV);
        detailsTV = root.findViewById(R.id.detailsTV);

        ActivityTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(getActivity(), CaloriesActivitiesActivity.class);
                startActivity(myIntent);
            }
        });

        detailsTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(getActivity(), CaloriesDetailsActivity.class);
                startActivity(myIntent);
            }
        });
        return root;
    }
}